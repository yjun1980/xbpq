/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.c1;

import com.github.catvod.spider.merge.c1.b;
import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.d1.a;
import com.github.catvod.spider.merge.e1.e;
import com.github.catvod.spider.merge.e1.h;
import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.e1.w;
import com.github.catvod.spider.merge.f1.F;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;

public final class c {
    private static final Pattern a;
    public static final Charset b;
    static final String c;

    static {
        Charset charset;
        a = Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");
        b = charset = Charset.forName("UTF-8");
        c = charset.name();
        "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    }

    private static b a(ByteBuffer byteBuffer) {
        ((Buffer)byteBuffer).mark();
        byte[] byArray = new byte[4];
        if (byteBuffer.remaining() >= 4) {
            byteBuffer.get(byArray);
            ((Buffer)byteBuffer).rewind();
        }
        if (byArray[0] == 0 && byArray[1] == 0 && byArray[2] == -2 && byArray[3] == -1 || byArray[0] == -1 && byArray[1] == -2 && byArray[2] == 0 && byArray[3] == 0) {
            return new b("UTF-32", false);
        }
        if (byArray[0] == -2 && byArray[1] == -1 || byArray[0] == -1 && byArray[1] == -2) {
            return new b("UTF-16", false);
        }
        if (byArray[0] == -17 && byArray[1] == -69 && byArray[2] == -65) {
            return new b("UTF-8", true);
        }
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static h b(InputStream var0, String var1_5) {
        block29: {
            block32: {
                block31: {
                    var11_6 = F.b();
                    if (var0 == null) {
                        return new h((String)var1_5);
                    }
                    var4_7 = false;
                    var10_8 = com.github.catvod.spider.merge.d1.a.a((InputStream)var0, 0);
                    try {
                        var10_8.mark(32768);
                        var0 = com.github.catvod.spider.merge.d1.a.a(var10_8, 5119);
                        Objects.requireNonNull(var0);
                        var7_9 = new byte[5119];
                        var6_10 = new ByteArrayOutputStream(5119);
                        var2_11 = 5119;
lbl14:
                        // 2 sources

                        while (true) {
                            block36: {
                                block35: {
                                    block33: {
                                        block34: {
                                            var3_12 = var0.read((byte[])var7_9, 0, Math.min(var2_11, 5119));
                                            if (var3_12 != -1) {
                                                if (var3_12 < var2_11) break block29;
                                                var6_10.write((byte[])var7_9, 0, var2_11);
                                            }
                                            var6_10 = ByteBuffer.wrap(var6_10.toByteArray());
                                            var2_11 = var10_8.read() == -1 ? 1 : 0;
                                            var10_8.reset();
                                            var12_13 = com.github.catvod.spider.merge.c1.c.a((ByteBuffer)var6_10);
                                            var0 = var12_13 != null ? com.github.catvod.spider.merge.c1.b.a(var12_13) : "GBK";
                                            if (var0 != null) break block33;
                                            try {
                                                var6_10 = com.github.catvod.spider.merge.c1.c.b.decode((ByteBuffer)var6_10);
                                                if (var6_10.hasArray()) {
                                                    var7_9 = new CharArrayReader;
                                                    var7_9(var6_10.array(), var6_10.arrayOffset(), var6_10.limit());
                                                    var8_14 = var11_6.e((Reader)var7_9, (String)var1_5);
                                                } else {
                                                    var8_14 = var11_6.f(var6_10.toString(), (String)var1_5);
                                                }
                                            }
                                            catch (com.github.catvod.spider.merge.b1.b var0_1) {
                                                throw (IOException)var0_1.getCause();
                                            }
                                            var9_15 = var8_14.m0("meta[http-equiv=content-type], meta[charset]").iterator();
                                            var7_9 = null;
                                            do {
                                                var5_16 = var9_15.hasNext();
                                                var6_10 = var7_9;
                                                if (!var5_16) break;
                                                var13_17 = (m)var9_15.next();
                                                if (var13_17.n("http-equiv")) {
                                                    var6_10 = var13_17.c("content");
                                                    var7_9 = var6_10 != null && (var6_10 = com.github.catvod.spider.merge.c1.c.a.matcher((CharSequence)var6_10)).find() != false ? com.github.catvod.spider.merge.c1.c.c(var6_10.group(1).trim().replace("charset=", "")) : null;
                                                }
                                                var6_10 = var7_9;
                                                if (var7_9 == null) {
                                                    var6_10 = var7_9;
                                                    if (var13_17.n("charset")) {
                                                        var6_10 = var13_17.c("charset");
                                                    }
                                                }
                                                var7_9 = var6_10;
                                            } while (var6_10 == null);
                                            var9_15 = var6_10;
                                            if (var6_10 == null) {
                                                var9_15 = var6_10;
                                                if (var8_14.g() > 0) {
                                                    var7_9 = var8_14.f(0);
                                                    var7_9 = var7_9 instanceof w != false ? (w)var7_9 : (var7_9 instanceof e != false && (var7_9 = (e)var7_9).L() != false ? var7_9.K() : null);
                                                    var9_15 = var6_10;
                                                    if (var7_9 != null) {
                                                        var9_15 = var6_10;
                                                        if (var7_9.K().equalsIgnoreCase("xml")) {
                                                            var9_15 = var7_9.c("encoding");
                                                        }
                                                    }
                                                }
                                            }
                                            if ((var6_10 = com.github.catvod.spider.merge.c1.c.c((String)var9_15)) == null || var6_10.equalsIgnoreCase(com.github.catvod.spider.merge.c1.c.c)) break block34;
                                            var0 = var6_10.trim().replaceAll("[\"']", "");
                                            break block35;
                                        }
                                        if (var2_11 == 0) break block35;
                                        var6_10 = var8_14;
                                        break block36;
                                    }
                                    d.i((String)var0, "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML");
                                }
                                var6_10 = null;
                            }
                            if (var6_10 != null) break block31;
                            var6_10 = var0;
                            if (var0 == null) {
                                var6_10 = com.github.catvod.spider.merge.c1.c.c;
                            }
                            var7_9 = new BufferedReader;
                            var0 = new InputStreamReader((InputStream)var10_8, Charset.forName((String)var6_10));
                            var7_9((Reader)var0, 32768);
                            if (var12_13 != null) {
                            }
                            ** GOTO lbl96
                            break;
                        }
                    }
                    catch (Throwable var0_4) {
                        var10_8.close();
                        throw var0_4;
                    }
                    if (com.github.catvod.spider.merge.c1.b.b(var12_13)) {
                        if (var7_9.skip(1L) == 1L) {
                            var4_7 = true;
                        }
                        d.f(var4_7);
                    }
lbl96:
                    // 5 sources

                    var1_5 = var11_6.e((Reader)var7_9, (String)var1_5);
                    ** GOTO lbl100
                    {
                        catch (Throwable var0_2) {
                            ** GOTO lbl-1000
                        }
lbl100:
                        // 1 sources

                        var0 = var6_10.equals(com.github.catvod.spider.merge.c1.c.c) != false ? com.github.catvod.spider.merge.c1.c.b : Charset.forName((String)var6_10);
                        var1_5.B0().a((Charset)var0);
                        if (var0.canEncode()) ** GOTO lbl-1000
                        var1_5.x0(com.github.catvod.spider.merge.c1.c.b);
lbl-1000:
                        // 2 sources

                        {
                            var7_9.close();
                            var0 = var1_5;
                            break block32;
                        }
                        catch (com.github.catvod.spider.merge.b1.b var0_3) {}
                        {
                            throw (IOException)var0_3.getCause();
                        }
                    }
lbl-1000:
                    // 1 sources

                    {
                        var7_9.close();
                        throw var0_2;
                    }
                }
                var0 = var6_10;
            }
            var10_8.close();
            return var0;
        }
        var2_11 -= var3_12;
        {
            var6_10.write((byte[])var7_9, 0, var3_12);
            ** continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String c(String string) {
        if (string == null) return null;
        if (string.length() == 0) {
            return null;
        }
        string = string.trim().replaceAll("[\"']", "");
        try {
            if (Charset.isSupported(string)) {
                return string;
            }
            boolean bl = Charset.isSupported(string = string.toUpperCase(Locale.ENGLISH));
            if (!bl) return null;
            return string;
        }
        catch (IllegalCharsetNameException illegalCharsetNameException) {
            return null;
        }
    }
}

