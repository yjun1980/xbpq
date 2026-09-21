/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.q0;

import com.github.catvod.spider.merge.a1.b;
import com.github.catvod.spider.merge.n0.c;
import com.github.catvod.spider.merge.n0.g;
import com.github.catvod.spider.merge.n0.h;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

public final class a {
    private final c a;

    public a(c c2) {
        this.a = c2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String a(com.github.catvod.spider.merge.r0.h var1_1) {
        block28: {
            block30: {
                block29: {
                    var11_2 = var1_1.d();
                    var9_3 = var1_1.a();
                    var2_4 = this.a.d();
                    var10_5 = new StringBuilder();
                    do {
                        block27: {
                            var7_17 = null;
                            var8_18 = this.c(var11_2, var9_3, this.a.f());
                            var8_18.setRequestMethod(var1_1.e());
                            var5_8 = var1_1.c();
                            if (var5_8 == null) ** GOTO lbl28
                            var8_18.setDoOutput(true);
                            var5_8 = new OutputStreamWriter(var8_18.getOutputStream(), "UTF-8");
                            var5_8.write(var1_1.c());
                            var5_8.flush();
                            var5_8.close();
                            ** GOTO lbl28
                            catch (Throwable var6_15) {
                                try {
                                    var5_8.close();
                                    throw var6_15;
                                }
                                catch (Throwable var5_9) {
                                    block26: {
                                        var6_15.addSuppressed(var5_9);
                                        throw var6_15;
lbl28:
                                        // 2 sources

                                        if ((var3_6 = var8_18.getResponseCode()) != 200) ** GOTO lbl70
                                        var3_6 = var8_18.getContentLength();
                                        if (var3_6 == 0) ** GOTO lbl68
                                        var6_14 = var8_18.getInputStream();
                                        var4_7 = this.a.f();
                                        var5_8 = var6_14;
                                        if (var4_7) {
                                            var5_8 = var6_14;
                                            if ("gzip".equals(var8_18.getHeaderField("content-encoding"))) {
                                                var5_8 = new GZIPInputStream((InputStream)var6_14);
                                            }
                                        }
                                        var6_14 = var5_8;
                                        if (this.a.f()) {
                                            var6_14 = var5_8;
                                            if ("br".equals(var8_18.getHeaderField("content-encoding"))) {
                                                var6_14 = new b((InputStream)var5_8);
                                            }
                                        }
                                        var5_8 = new InputStreamReader((InputStream)var6_14, "UTF-8");
                                        var8_18 = new BufferedReader((Reader)var5_8);
                                        try {
                                            while ((var5_8 = var8_18.readLine()) != null) {
                                                var10_5.append((String)var5_8);
                                                var10_5.append('\n');
                                            }
                                        }
                                        catch (Throwable var5_10) {
                                            var6_14 = var8_18;
                                            break block26;
                                        }
                                        var8_18.close();
                                        ** GOTO lbl77
                                        {
                                            catch (IOException var5_13) {}
                                        }
                                        catch (Throwable var5_11) {
                                            var6_14 = null;
                                        }
                                    }
                                    if (var6_14 == null) ** GOTO lbl80
                                    var6_14.close();
                                    ** GOTO lbl80
                                    {
                                        catch (IOException var6_16) {}
lbl68:
                                        // 1 sources

                                        var5_8 = new g("Failed to download: Response is empty");
                                        throw var5_8;
lbl70:
                                        // 1 sources

                                        var6_14 = new StringBuilder();
                                        var6_14.append("Failed to download: HTTP ");
                                        var6_14.append(var3_6);
                                        var5_8 = new g(var6_14.toString());
                                        throw var5_8;
lbl77:
                                        // 2 sources

                                        var5_8 = null;
                                        var3_6 = var2_4;
                                        break block27;
lbl80:
                                        // 3 sources

                                        ** try [egrp 9[TRYBLOCK] [18 : 356->417)] { 
lbl81:
                                        // 1 sources

                                        throw var5_8;
                                    }
lbl82:
                                    // 4 sources

                                    catch (IOException var5_12) {
                                        var3_6 = var2_4 - 1;
                                    }
                                }
                            }
                        }
                        if (var5_8 == null) break;
                        var2_4 = var3_6;
                    } while (var3_6 > 0);
                    if (var5_8 != null) throw var5_8;
                    var6_14 = var10_5.toString();
                    var1_1 = var7_17;
                    if (var6_14 == null) break block28;
                    if (!var6_14.isEmpty()) break block29;
                    var1_1 = var7_17;
                    break block28;
                }
                var1_1 = Pattern.compile("\"VISITOR_DATA\"\\s*:\\s*\"([^\"]+)\"").matcher((CharSequence)var6_14);
                if (var1_1.find() || (var1_1 = Pattern.compile("\"visitorData\"\\s*:\\s*\"([^\"]+)\"").matcher((CharSequence)var6_14)).find()) break block30;
                var5_8 = Pattern.compile("ytInitialData\\s*=\\s*\\{[^}]*\"responseContext\"[^}]*\"visitorData\"\\s*:\\s*\"([^\"]+)\"").matcher((CharSequence)var6_14);
                var1_1 = var7_17;
                if (!var5_8.find()) break block28;
                var1_1 = var5_8;
            }
            var1_1 = var1_1.group(1);
        }
        if (var1_1 == null) return var6_14;
        if (var1_1.isEmpty() != false) return var6_14;
        this.a.g((String)var1_1);
        return var6_14;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    private HttpURLConnection c(String object, Map object2, boolean bl) {
        object = new URL((String)object);
        object = this.a.e() != null ? ((URL)object).openConnection(this.a.e()) : ((URL)object).openConnection();
        object = (HttpURLConnection)object;
        for (Map.Entry entry : ((HashMap)this.a.c()).entrySet()) {
            ((URLConnection)object).setRequestProperty((String)entry.getKey(), (String)entry.getValue());
        }
        if (bl) {
            ((URLConnection)object).setRequestProperty("Accept-Encoding", "gzip");
        }
        if (object2 != null) {
            for (Map.Entry entry : object2.entrySet()) {
                ((URLConnection)object).setRequestProperty((String)entry.getKey(), (String)entry.getValue());
            }
        }
        return object;
    }

    public final com.github.catvod.spider.merge.s0.a b(com.github.catvod.spider.merge.r0.h c2) {
        block3: {
            try {
                c2 = com.github.catvod.spider.merge.s0.c.d(this.a((com.github.catvod.spider.merge.r0.h)((Object)c2)));
                break block3;
            }
            catch (h h2) {
            }
            catch (IOException iOException) {
                // empty catch block
            }
            c2 = com.github.catvod.spider.merge.s0.c.b((Throwable)((Object)c2));
        }
        return c2;
    }
}

