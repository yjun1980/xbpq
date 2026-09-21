/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.net.Uri
 *  com.github.catvod.crawler.SpiderDebug
 *  com.github.catvod.spider.InitOrigin
 */
package com.github.catvod.spider.merge.UY;

import android.content.Intent;
import android.net.Uri;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.KT.B;
import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.KT.H;
import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.UY.J;
import com.github.catvod.spider.merge.UY.M;
import com.github.catvod.spider.merge.UY.c;
import com.github.catvod.spider.merge.UY.u;
import com.github.catvod.spider.merge.xc.U.z;
import com.github.catvod.spider.merge.xc.a.a;
import java.util.HashMap;
import java.util.Map;

public final class K
implements Runnable {
    public final int a;
    public final M b;
    public final String c;

    public /* synthetic */ K(M m2, String string, int n2) {
        this.a = n2;
        this.b = m2;
        this.c = string;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        block21: {
            block20: {
                switch (this.a) {
                    default: {
                        var4_1 = this.c;
                        var3_4 = this.b;
                        var3_4.getClass();
                        var2_6 = new StringBuilder("https://drive.uc.cn/account/info?st=");
                        var2_6.append((String)var4_1);
                        var4_1 = var2_6.toString();
                        var2_6 = new HashMap();
                        var2_6.put("Accept", "application/json, text/plain, */*");
                        var2_6.put("Referer", "https://drive.uc.cn/");
                        var4_1 = A.i((String)var4_1, (Map)var2_6);
                        var5_9 = var4_1.headers("set-cookie");
                        if (var5_9.isEmpty()) {
                            SpiderDebug.log((String)"[UC] \u83b7\u53d6cookie\u5931\u8d25");
                            var4_1.close();
                            return;
                        }
                        var2_6 = new StringBuilder();
                        var6_14 = var5_9.iterator();
                        while (var6_14.hasNext()) {
                            var5_9 = ((String)var6_14.next()).split(";")[0];
                            if (var2_6.length() > 0) {
                                var2_6.append(";");
                            }
                            var2_6.append((String)var5_9);
                        }
                        var2_6 = var2_6.toString();
                        var4_1.close();
                        var4_1 = new HashMap();
                        var4_1.put("Cookie", var2_6);
                        var4_1.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) uc-cloud-drive/1.8.7 Chrome/100.0.4896.160 Electron/18.3.5.16-b62cf9c50d Safari/537.36 Channel/ucpan_other_ch");
                        var4_1.put("Referer", "https://drive.uc.cn");
                        var4_1 = A.i("https://pc-api.uc.cn/1/clouddrive/member?pr=UCBrowser&fr=pc", var4_1);
                        var5_9 = var4_1.body().string();
                        var5_9 = (Map)C.L((String)var5_9, Map.class);
                        if (var5_9 == null || var5_9.get("data") == null || (var5_9 = (Map)var5_9.get("data")).get("member_type") == null) ** GOTO lbl48
                        var3_4.c = var5_9.get("member_type").toString();
lbl48:
                        // 3 sources

                        while (true) {
                            try {
                                var5_9 = var4_1.headers("set-cookie").iterator();
                                while (var5_9.hasNext()) {
                                    var2_6 = M.y((String)var2_6, (String)var5_9.next());
                                }
                                var4_1.close();
                                var4_1 = new HashMap();
                                var4_1.put("Referer", "https://drive.uc.cn");
                                var4_1.put("Cookie", var2_6);
                                var4_1.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) uc-cloud-drive/1.8.7 Chrome/100.0.4896.160 Electron/18.3.5.16-b62cf9c50d Safari/537.36 Channel/ucpan_other_ch");
                                var4_1 = A.i("https://pc-api.uc.cn/1/clouddrive/config?pr=UCBrowser&fr=pc&uc_param_str=", (Map)var4_1);
                                var5_9 = var4_1.headers("set-cookie").iterator();
                                while (true) {
                                    if (!var5_9.hasNext()) {
                                        var4_1.close();
                                        H.a((String)var2_6);
                                        var5_9 = com.github.catvod.spider.merge.xc.O.a.f();
                                        var4_1 = var5_9.d();
                                        var4_1.c((String)var2_6);
                                        var5_9.j((com.github.catvod.spider.merge.xc.O.c)var4_1);
                                        var2_6 = new J(var3_4, 0);
                                        InitOrigin.execute((Runnable)var2_6);
                                        B.e("uc");
                                        var1_16 = M.w(var3_4.c);
                                        com.github.catvod.spider.merge.xc.a.a.i();
                                        var2_6 = new u(1, var1_16);
                                        InitOrigin.run((Runnable)var2_6);
                                        return;
                                    }
                                    var2_6 = M.y((String)var2_6, (String)var5_9.next());
                                }
                            }
                            catch (Exception var2_7) {
                                com.github.catvod.spider.merge.xc.a.a.i();
                            }
                            return;
                        }
                    }
                    case 0: 
                }
                var2_8 = this.b;
                var2_8.getClass();
                var4_2 /* !! */  = new StringBuilder("https://su.uc.cn/1_n0ZCv?uc_param_str=dsdnfrpfbivesscpgimibtbmnijblauputogpintnwktprchmt&token=");
                var3_5 = this.c;
                var4_2 /* !! */  = m.h(var4_2 /* !! */ , var3_5, "&client_id=381&uc_biz_str=S%3Acustom%7CC%3Atitlebar_fix");
                ** try [egrp 3[TRYBLOCK] [13, 12 : 598->639)] { 
lbl94:
                // 1 sources

                break block21;
lbl-1000:
                // 1 sources

                {
                    catch (Throwable var4_3) {
                        break block20;
                    }
lbl97:
                    // 1 sources

                    catch (Exception var5_11) {}
                    {
                        var5_12 = new J((M)var2_8, 2);
                        var6_15 = new z((String)var4_2 /* !! */ , "UC\u7f51\u76d8", -39424, var5_12);
                        InitOrigin.run((Runnable)var6_15);
                        var2_8 = new c(var2_8, m.j("token", var3_5), 5);
                    }
                }
lbl102:
                // 2 sources

                while (true) {
                    InitOrigin.execute((Runnable)var2_8);
                    return;
                }
            }
            InitOrigin.execute((Runnable)new c(var2_8, m.j("token", var3_5), 5));
            throw var4_3;
            catch (Exception var5_13) {
                ** continue;
            }
        }
        var5_10 = new Intent("android.intent.action.VIEW", Uri.parse((String)var4_2 /* !! */ ));
        var5_10.setPackage("com.UCMobile");
        var5_10.addFlags(0x10000000);
        InitOrigin.context().startActivity(var5_10);
        var2_8 = new c(var2_8, m.j("token", var3_5), 5);
        ** while (true)
    }
}

