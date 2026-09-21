/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.widget.Button
 *  com.github.catvod.spider.InitOrigin
 *  com.google.gson.JsonObject
 *  okhttp3.HttpUrl
 */
package com.github.catvod.spider.merge.xc.U;

import android.app.AlertDialog;
import android.widget.Button;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.UY.C;
import com.github.catvod.spider.merge.UY.E;
import com.github.catvod.spider.merge.UY.G;
import com.github.catvod.spider.merge.UY.X;
import com.github.catvod.spider.merge.UY.b;
import com.github.catvod.spider.merge.xc.a.a;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

public final class I
implements Runnable {
    public final int a;
    public final String b;
    public final Button c;
    public final AlertDialog d;

    public /* synthetic */ I(String string, Button button, AlertDialog alertDialog, int n2) {
        this.a = n2;
        this.b = string;
        this.c = button;
        this.d = alertDialog;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        block17: {
            block16: {
                switch (this.a) {
                    default: {
                        var10_1 = this.b;
                        var8_2 = this.c;
                        var9_3 = this.d;
                        var7_4 = C.a;
                        var12_5 = var7_4.a;
                        try {
                            ((HashMap)var12_5.b).clear();
                            var4_6 = new HashMap();
                            var4_6 = com.github.catvod.spider.merge.KT.C.R(A.l("https://open.e.189.cn/api/logbox/config/encryptConf.do?appId=cloud", (Map)var4_6, var7_4.i("https://open.e.189.cn/api/logbox/config/encryptConf.do?appId=cloud")).b()).getAsJsonObject("data");
                            var11_9 = var4_6.get("pubKey").getAsString();
                            var2_10 = var4_6.has("pre");
                            var4_6 = var2_10 != false ? var4_6.get("pre").getAsString() : "";
                        }
                        catch (Exception var4_7) {
                            ** GOTO lbl98
                        }
                        var5_11 = (List)A.g("https://cloud.189.cn/api/portal/loginUrl.action?redirectURL=https://cloud.189.cn/web/redirect.html&returnURL=/main.action", var7_4.i("https://cloud.189.cn/api/portal/loginUrl.action?redirectURL=https://cloud.189.cn/web/redirect.html&returnURL=/main.action")).get("Location");
                        if (var5_11 == null || var5_11.isEmpty()) ** GOTO lbl96
                        var5_11 = (String)var5_11.get(0);
                        if ((var5_11 = (List)A.g((String)var5_11, var7_4.i((String)var5_11)).get("Location")) == null || var5_11.isEmpty()) ** GOTO lbl94
                        var6_14 /* !! */  = HttpUrl.parse((String)((String)var5_11.get(0)));
                        var5_11 = var6_14 /* !! */ .queryParameter("reqId");
                        var6_14 /* !! */  = var6_14 /* !! */ .queryParameter("lt");
                        var13_16 = new HashMap<String, Object>(var7_4.i("https://open.e.189.cn"));
                        var13_16.put("Content-Type", "application/x-www-form-urlencoded");
                        var13_16.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:74.0) Gecko/20100101 Firefox/76.0");
                        var13_16.put("Referer", "https://open.e.189.cn/");
                        var13_16.put("Lt", var6_14 /* !! */ );
                        var13_16.put("Reqid", var5_11);
                        var5_11 = new HashMap();
                        var5_11.put("version", "2.0");
                        var5_11.put("appKey", "cloud");
                        var5_11 = A.l("https://open.e.189.cn/api/logbox/oauth2/appConf.do", var5_11, var13_16);
                        var7_4.s("https://open.e.189.cn", (List)((Map)var5_11.c).get("Set-Cookie"));
                        var16_17 = com.github.catvod.spider.merge.KT.C.R(var5_11.b()).getAsJsonObject("data");
                        var14_18 = var16_17.get("returnUrl").getAsString();
                        var15_19 = var16_17.get("paramId").getAsString();
                        var5_11 = var16_17.has("accountType") != false ? var16_17.get("accountType").getAsString() : "01";
                        var6_14 /* !! */  = var16_17.has("mailSuffix") != false ? var16_17.get("mailSuffix").getAsString() : "@189.cn";
                        var3_20 = var16_17.has("clientType");
                        var2_10 = true;
                        var1_21 = var3_20 != false ? var16_17.get("clientType").getAsInt() : 1;
                        if (!var16_17.has("isOauth2") || !var16_17.get("isOauth2").getAsBoolean()) {
                            var2_10 = false;
                        }
                        var17_22 = G.p(var11_9);
                        var16_17 = new StringBuilder();
                        var16_17.append((String)var4_6);
                        var16_17.append(G.e(var10_1, var17_22));
                        var16_17 = var16_17.toString();
                        var13_16.put("Cookie", var12_5.h("https://open.e.189.cn"));
                        var12_5 = new HashMap();
                        var12_5.put("version", "v2.0");
                        var12_5.put("mobile", var16_17);
                        var12_5.put("appKey", "cloud");
                        var12_5.put("captchaType", "");
                        var12_5.put("captchaToken", "");
                        var12_5.put("validateCode", "");
                        var12_5 = A.l("https://open.e.189.cn/api/logbox/oauth2/web/sendSmsCode.do", var12_5, var13_16);
                        var7_4.s("https://open.e.189.cn", (List)((Map)var12_5.c).get("Set-Cookie"));
                        var7_4 = com.github.catvod.spider.merge.KT.C.R(var12_5.b());
                        if (var7_4.has("result") && var7_4.get("result").getAsInt() != 0) {
                            var4_6 = var7_4.has("msg") != false ? var7_4.get("msg").getAsString() : "\u53d1\u9001\u77ed\u4fe1\u9a8c\u8bc1\u7801\u5931\u8d25";
                            var4_6 = E.a((String)var4_6);
                        } else {
                            var7_4 = new E(3, null);
                            var7_4.c = var10_1;
                            var7_4.d = var11_9;
                            var7_4.e = var4_6;
                            var7_4.f = var14_18;
                            var7_4.g = var15_19;
                            var7_4.h = var5_11;
                            var7_4.i = var6_14 /* !! */ ;
                            var7_4.j = var1_21;
                            var7_4.k = var2_10;
                            var7_4.l = var13_16;
                            var4_6 = var7_4;
                        }
                        ** GOTO lbl99
lbl94:
                        // 1 sources

                        var4_6 = E.a("\u83b7\u53d6\u767b\u5f55\u53c2\u6570\u5931\u8d25");
                        ** GOTO lbl99
lbl96:
                        // 1 sources

                        var4_6 = E.a("\u83b7\u53d6\u767b\u5f55\u91cd\u5b9a\u5411\u5931\u8d25");
                        ** GOTO lbl99
lbl98:
                        // 1 sources

                        var4_6 = E.a(var4_7.getMessage());
lbl99:
                        // 5 sources

                        InitOrigin.run((Runnable)new b(var8_2, var4_6, var9_3, 5));
                        return;
                    }
                    case 0: 
                }
                var4_8 = this.b;
                if (var4_8 == null) {
                    var4_8 = "";
                } else {
                    try {
                        var4_8 = var4_8.trim();
                    }
                    catch (Throwable var5_12) {
                        break block16;
                    }
                }
                if (!var4_8.matches("^1[3-9][0-9]{9}$")) {
                    var4_8 = X.a("\u8bf7\u8f93\u5165\u6b63\u786e\u7684\u624b\u673a\u53f7");
                    break block17;
                } else {
                    var5_13 = new LinkedHashMap();
                    var5_13.put("clientType", 670);
                    var5_13.put("nationCode", "+86");
                    var5_13.put("phoneNumber", var4_8);
                    var5_13.put("reqType", 3);
                    var5_13.put("random", Math.random());
                    var6_15 = com.github.catvod.spider.merge.KT.C.Z(var5_13);
                    var5_13 = com.github.catvod.spider.merge.xc.a.a.c();
                    var5_13.put("x-yun-app-channel", "10000034");
                    var5_13.put("x-yun-client-info", "||9|7.17.4|chrome|131.0.0.0|||windows 10||zh-CN|||");
                    var5_13 = com.github.catvod.spider.merge.KT.C.R(A.k("https://user-njs.yun.139.com/user/sms/getSmsCode", var6_15, (Map)var5_13).b());
                    if (com.github.catvod.spider.merge.xc.a.a.n((JsonObject)var5_13)) {
                        var5_13 = new X(3, null);
                        var5_13.c = var4_8;
                        var4_8 = var5_13;
                        break block17;
                    } else {
                        var4_8 = X.a(com.github.catvod.spider.merge.xc.a.a.p((JsonObject)var5_13, "\u9a8c\u8bc1\u7801\u53d1\u9001\u5931\u8d25"));
                    }
                }
                break block17;
            }
            var4_8 = new StringBuilder("\u79fb\u52a8\u4e91\u76d8\u9a8c\u8bc1\u7801\u53d1\u9001\u5931\u8d25: ");
            var4_8.append(var5_12.getMessage());
            var4_8 = X.a(var4_8.toString());
        }
        InitOrigin.run((Runnable)new b(this.c, var4_8, this.d, 4));
    }
}

