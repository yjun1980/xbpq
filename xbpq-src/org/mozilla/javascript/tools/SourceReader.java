/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.commonjs.module.provider.ParsedContentType;

public class SourceReader {
    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object readFileOrUrl(String var0, boolean var1_4, String var2_5) {
        block25: {
            block27: {
                block23: {
                    block26: {
                        block24: {
                            var9_6 = SourceReader.toUrl((String)var0);
                            var6_7 = null;
                            var7_8 = null;
                            if (var9_6 != null) ** GOTO lbl18
                            var5_9 = var6_7;
                            try {
                                var5_9 = var6_7;
                                var8_10 = new File((String)var0);
                                var5_9 = var6_7;
                                var3_11 = (int)var8_10.length();
                                var5_9 = var6_7;
                                var5_9 = var6_7;
                                var7_8 = new FileInputStream((File)var8_10);
                                var0 = null;
                                var6_7 = var7_8;
                                var7_8 = null;
                                break block23;
lbl18:
                                // 1 sources

                                var5_9 = var6_7;
                                var8_10 = var9_6.openConnection();
                                var5_9 = var6_7;
                                var6_7 = var8_10.getInputStream();
                                if (!var1_4) break block24;
                            }
                            catch (Throwable var0_2) {
                                // empty catch block
                                break block25;
                            }
                            try {
                                var5_9 = new ParsedContentType(var8_10.getContentType());
                                var0 = var5_9.getContentType();
                                var5_9 = var5_9.getEncoding();
                                break block26;
                            }
                            catch (Throwable var0_1) {
                                var5_9 = var6_7;
                                break block25;
                            }
                        }
                        var0 = null;
                        var5_9 = var7_8;
                    }
                    var3_11 = var4_12 = var8_10.getContentLength();
                    if (var4_12 > 0x100000) {
                        var3_11 = -1;
                    }
                    var7_8 = var0;
                    var0 = var5_9;
                }
                var4_12 = var3_11;
                if (var3_11 <= 0) {
                    var4_12 = 4096;
                }
                var5_9 = var6_7;
                {
                    var8_10 = Kit.readStream((InputStream)var6_7, var4_12);
                    if (var6_7 == null) break block27;
                }
                var6_7.close();
            }
            if (!var1_4) {
                return var8_10;
            }
            if (var0 == null) {
                if (((Object)var8_10).length > 3 && var8_10[0] == -1 && var8_10[1] == -2 && var8_10[2] == false && var8_10[3] == false) {
                    var0 = "UTF-32LE";
                } else if (((Object)var8_10).length > 3 && var8_10[0] == false && var8_10[1] == false && var8_10[2] == -2 && var8_10[3] == -1) {
                    var0 = "UTF-32BE";
                } else if (((Object)var8_10).length > 2 && var8_10[0] == -17 && var8_10[1] == -69 && var8_10[2] == -65) {
                    while (true) {
                        var0 = "UTF-8";
                        break;
                    }
                } else if (((Object)var8_10).length > 1 && var8_10[0] == -1 && var8_10[1] == -2) {
                    var0 = "UTF-16LE";
                } else if (((Object)var8_10).length > 1 && var8_10[0] == -2 && var8_10[1] == -1) {
                    var0 = "UTF-16BE";
                } else {
                    var0 = var2_5;
                    if (var2_5 == null) {
                        if (var9_6 == null) {
                            var0 = System.getProperty("file.encoding");
                        } else {
                            if (var7_8 != null && var7_8.startsWith("application/")) ** continue;
                            var0 = "US-ASCII";
                        }
                    }
                }
            }
            if ((var0 = new String((byte[])var8_10, (String)var0)).length() <= 0) return var0;
            if (var0.charAt(0) != '\ufeff') return var0;
            return var0.substring(1);
        }
        if (var5_9 == null) throw var0_3;
        var5_9.close();
        throw var0_3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static URL toUrl(String object) {
        if (((String)object).indexOf(58) < 2) return null;
        try {
            return new URL((String)object);
        }
        catch (MalformedURLException malformedURLException) {
            return null;
        }
    }
}

