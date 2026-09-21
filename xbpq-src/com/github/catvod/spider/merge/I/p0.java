/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.github.catvod.crawler.SpiderDebug
 */
package com.github.catvod.spider.merge.I;

import android.content.Context;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.TimeBasedEncryption;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.K0;
import com.github.catvod.spider.merge.I.P0;
import com.github.catvod.spider.merge.I.T0;
import com.github.catvod.spider.merge.I.U0;
import com.github.catvod.spider.merge.I.X0;
import com.github.catvod.spider.merge.I.a1;
import com.github.catvod.spider.merge.I.e1;
import com.github.catvod.spider.merge.I.r0;
import com.github.catvod.spider.merge.I.s0;
import com.github.catvod.spider.merge.I.t;
import com.github.catvod.spider.merge.I.z;
import com.github.catvod.spider.merge.R0.e;
import com.github.catvod.spider.merge.Y.c;
import com.github.catvod.spider.merge.f0.d;
import com.github.catvod.spider.merge.i0.m;
import com.github.catvod.spider.merge.j0.b;
import com.github.catvod.utils.server.Server;
import java.io.File;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;

public final class p0
implements Runnable {
    public final int a;
    public final Object b;

    public /* synthetic */ p0(Object object, int n2) {
        this.a = n2;
        this.b = object;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 3: {
                var3_1 = (Map)this.b;
                if (e.d((CharSequence)var3_1.get("aliToken"))) {
                    t.a.a0(((String)var3_1.get("aliToken")).trim());
                }
                if (!(var2_6 = e.d((CharSequence)var3_1.get("aliThread")))) ** GOTO lbl14
                t.a.b = var1_8 = Integer.parseInt(((String)var3_1.get("aliThread")).trim());
                com.github.catvod.spider.merge.c.b.f(t.a.I(), String.valueOf(var1_8));
lbl14:
                // 3 sources

                while (true) {
                    if (e.d((CharSequence)var3_1.get("quarkCookie"))) {
                        r0.a.K(((String)var3_1.get("quarkCookie")).trim(), true);
                    }
                    if (!(var2_6 = e.d((CharSequence)var3_1.get("quarkThread")))) ** GOTO lbl25
                    var1_8 = Integer.parseInt(((String)var3_1.get("quarkThread")).trim());
                    if (r0.a.m == null) ** GOTO lbl25
                    r0.a.m.d = var1_8;
                    r0.a.m.i();
lbl25:
                    // 4 sources

                    while (true) {
                        if (e.d((CharSequence)var3_1.get("ucCookie"))) {
                            K0.a.P(((String)var3_1.get("ucCookie")).trim(), true);
                        }
                        if (!(var2_6 = e.d((CharSequence)var3_1.get("ucThread")))) ** GOTO lbl36
                        var1_8 = Integer.parseInt(((String)var3_1.get("ucThread")).trim());
                        if (K0.a.n == null) ** GOTO lbl36
                        K0.a.n.c = var1_8;
                        K0.a.n.j();
lbl36:
                        // 4 sources

                        while (true) {
                            if (e.d((CharSequence)var3_1.get("yun115Cookie"))) {
                                e1.a.l(((String)var3_1.get("yun115Cookie")).trim(), true);
                            }
                            if (e.d((CharSequence)var3_1.get("yun123Account"))) {
                                var1_8 = a1.i;
                                X0.a.k(((String)var3_1.get("yun123Account")).trim(), true);
                            }
                            if (e.d((CharSequence)var3_1.get("xunleiAccount"))) {
                                var1_8 = T0.i;
                                P0.a.v(((String)var3_1.get("xunleiAccount")).trim(), true);
                            }
                            if (!(var2_6 = e.d((CharSequence)var3_1.get("baiduThread")))) ** GOTO lbl53
                            var1_8 = Integer.parseInt(((String)var3_1.get("baiduThread")).trim());
                            if (z.a.b == null) ** GOTO lbl53
                            z.a.b.c = var1_8;
                            z.a.b.c();
lbl53:
                            // 4 sources

                            while (true) {
                                try {
                                    if (e.d((CharSequence)var3_1.get("netPanOrder"))) {
                                        BaseApi.get().setNetPanOrder(((String)var3_1.get("netPanOrder")).trim(), true);
                                    }
                                    if (e.d((CharSequence)var3_1.get("subscriptionUrl"))) {
                                        BaseApi.get().f = ((String)var3_1.get("subscriptionUrl")).trim();
                                        var4_11 = new File(Init.context().getFilesDir(), "subscriptionUrl.txt");
                                        com.github.catvod.spider.merge.c.b.f(var4_11, ((String)var3_1.get("subscriptionUrl")).trim());
                                    }
                                    m.y("Web\u7aef\u914d\u7f6e\u4fdd\u5b58\u6210\u529f");
                                }
                                catch (Exception var3_2) {
                                    SpiderDebug.log((Throwable)var3_2);
                                }
                                return;
                            }
                            break;
                        }
                        break;
                    }
                    break;
                }
            }
            case 2: {
                var3_3 = (BaseApi)this.b;
                Objects.requireNonNull(var3_3);
                var1_9 = Server.l;
                try {
                    var2_7 = e.d(d.p("http://127.0.0.1:9975/proxy", 1L));
                }
                catch (Exception var4_12) {
                    var2_7 = false;
                }
                if (var2_7) ** GOTO lbl81
                Init.get().exeGoProxy((Context)Init.context(), false);
lbl81:
                // 2 sources

                Class.forName("dalvik.system.BaseDexClassLoader");
                var4_13 = var3_3.getClass().getClassLoader();
                var3_3 = Class.forName("dalvik.system.BaseDexClassLoader").getDeclaredField("pathList");
                var3_3.setAccessible(true);
                var3_3 = var3_3.get(var4_13);
                var3_3 = Pattern.compile("zip file \"([^\"]+)\"").matcher(var3_3.toString());
                if (var3_3.find()) {
                    var3_3 = var3_3.group(1);
                    var4_13 = new String(BaseApi.calculateMethodHash(BaseApi.convertFileToByteArray((String)var3_3)));
                    var4_13 = BaseApi.MD5((String)var4_13, "UTF-8");
                    Thread.sleep(5000L);
                    var3_3 = new StringBuilder();
                    var3_3.append(t.a.c);
                    var3_3.append("/api/classes?dexBytes=");
                    var3_3.append(URLEncoder.encode(TimeBasedEncryption.extracted((String)var4_13)));
                    d.k(var3_3.toString()).contains("true");
                }
lbl102:
                // 4 sources

                return;
            }
            case 1: {
                var3_4 = (c)this.b;
                Objects.requireNonNull(var3_4);
                Objects.requireNonNull(U0.a);
                com.github.catvod.spider.merge.c.b.f(com.github.catvod.spider.merge.c.b.e("115_user"), var3_4.toString());
                return;
            }
            case 0: {
                s0.a((s0)this.b);
                return;
            }
        }
        com.github.catvod.spider.merge.j0.b.a((b)this.b);
        return;
        catch (Exception var4_10) {
            ** continue;
        }
        catch (Exception var4_14) {
            ** continue;
        }
        catch (Exception var4_15) {
            ** continue;
        }
        catch (Exception var4_16) {
            ** continue;
        }
        catch (Exception var3_5) {
            ** continue;
        }
    }
}

