/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.widget.Toast
 *  com.github.catvod.spider.InitOrigin
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge.UY;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.KT.B;
import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.UY.U;
import com.github.catvod.spider.merge.UY.V;
import com.github.catvod.spider.merge.UY.X;
import com.github.catvod.spider.merge.UY.l;
import com.github.catvod.spider.merge.UY.r;
import com.github.catvod.spider.merge.xc.Q.b;
import com.github.catvod.spider.merge.xc.U.n;
import com.github.catvod.spider.merge.xc.U.w;
import com.github.catvod.spider.merge.xc.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class T
implements Runnable {
    public final int a;
    public final String b;

    public /* synthetic */ T(String string, int n2) {
        this.a = n2;
        this.b = string;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        var1_1 = "";
        switch (this.a) {
            default: {
                var2_3 = this.b;
                var1_1 = C.o;
                if (TextUtils.isEmpty((CharSequence)var2_3)) {
                    return;
                }
                var3_8 = (Toast)var1_1.b;
                if (var3_8 != null) {
                    var3_8.cancel();
                }
                var2_3 = Toast.makeText((Context)Init.context(), (CharSequence)var2_3, (int)1);
                var1_1.b = var2_3;
                var2_3.show();
                return;
            }
            case 7: {
                var3_9 = this.b;
                var2_4 = V.f;
                var4_11 = U.a;
                var4_11.getClass();
                try {
                    var2_4 = var4_11.o(var3_9);
                    if (!TextUtils.isEmpty((CharSequence)var2_4)) ** GOTO lbl26
                    var2_4 = var1_1;
                    ** GOTO lbl57
lbl26:
                    // 1 sources

                    var5_12 = new JSONObject();
                    var6_13 = new StringBuilder("+86 ");
                    var6_13.append(var3_9);
                    var5_12.put("phone_number", (Object)var6_13.toString());
                    var5_12.put("target", (Object)"ANY");
                    var5_12.put("usage", (Object)"SIGN_IN");
                    var5_12.put("client_id", (Object)"Xp6vsxz_7IYVw2BB");
                    var6_13 = new HashMap();
                    var6_13.put("User-Agent", "thunder/12.4.4.3740 Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.5359.215 XDASKernel/22.3.27 Safari/537.36");
                    var6_13.put("Content-Type", "application/json");
                    var6_13.put("x-captcha-token", var2_4);
                    var6_13.put("x-client-id", "Xp6vsxz_7IYVw2BB");
                    var6_13.put("x-device-id", var4_11.a.b().b());
                    var4_11 = A.k("https://xluser-ssl.xunlei.com/v1/auth/verification", var5_12.toString(), (Map)var6_13);
                    var2_4 = var1_1;
                    if (var4_11.a == 200) {
                        var2_4 = new JSONObject(var4_11.b());
                        var2_4 = var2_4.optString("verification_id", "");
                    }
                }
                catch (Exception var2_5) {
                    var2_4 = var1_1;
                }
lbl57:
                // 3 sources

                if (var2_4 != null && var2_4.length() != 0) {
                    InitOrigin.run((Runnable)new n(5, var3_9, (String)var2_4));
                    return;
                }
                InitOrigin.run((Runnable)new w(9));
                return;
            }
            case 6: {
                r.i.getClass();
                var2_6 = this.b;
                if (var2_6 != null) {
                    var1_1 = var2_6.trim();
                }
                C.N(var1_1, "pan115_cookie");
                B.e("pan115");
                var1_1 = var2_6 != null && !var2_6.trim().isEmpty() ? "115\u7f51\u76d8Cookie\u5df2\u4fdd\u5b58" : "115\u7f51\u76d8Cookie\u5df2\u6e05\u7a7a";
                A.m((String)var1_1);
                return;
            }
            case 5: {
                var1_1 = this.b;
                C.N(l.D((String)var1_1), "guangya_refresh_token");
                C.N("", "guangya_access_token");
                B.e("guangya");
                var1_1 = var1_1 != null && !var1_1.trim().isEmpty() ? "\u5149\u9e2dRefreshToken\u5df2\u4fdd\u5b58" : "\u5149\u9e2dRefreshToken\u5df2\u6e05\u7a7a";
                A.m((String)var1_1);
                return;
            }
            case 4: {
                var1_1 = this.b;
                try {
                    var1_1 = com.github.catvod.spider.merge.xc.a.a.q((String)var1_1);
                    if (var1_1.length() != 0) ** GOTO lbl90
                    var1_1 = X.a("Yidong auth is empty");
                    ** GOTO lbl99
                }
                catch (Throwable var1_2) {
                    ** GOTO lbl97
                }
lbl90:
                // 1 sources

                var3_10 = com.github.catvod.spider.merge.xc.Q.a.b();
                var2_7 = new b((String)var1_1);
                var3_10.c(var2_7);
                C.b0("yun", com.github.catvod.spider.merge.xc.Q.a.b().toString());
                B.e("yidong");
                var1_1 = new X(0, null);
                ** GOTO lbl99
lbl97:
                // 1 sources

                var1_1 = var1_2.getMessage() == null ? "Yidong auth invalid" : var1_2.getMessage();
                var1_1 = X.a((String)var1_1);
lbl99:
                // 3 sources

                if (var1_1.a == 0) {
                    A.m("\u79fb\u52a8\u4e91\u76d8\u6388\u6743\u5df2\u4fdd\u5b58");
                    return;
                }
                var1_1 = var1_1.b;
                if (var1_1 == null) {
                    var1_1 = "\u79fb\u52a8\u4e91\u76d8\u6388\u6743\u4fdd\u5b58\u5931\u8d25";
                }
                A.m((String)var1_1);
                return;
            }
            case 3: {
                var1_1 = new StringBuilder("\u8fc5\u96f7: ");
                var1_1.append(this.b);
                A.m(var1_1.toString());
                return;
            }
            case 2: {
                A.m("\u8d26\u53f7\u5b58\u5728\u5b89\u5168\u9a8c\u8bc1\uff0c\u8bf7\u4f7f\u7528\u9a8c\u8bc1\u7801\u767b\u5f55");
                InitOrigin.execute((Runnable)new T(this.b, 7));
                return;
            }
            case 1: {
                var1_1 = new StringBuilder("\u8fc5\u96f7: ");
                var1_1.append(this.b);
                A.m(var1_1.toString());
                return;
            }
            case 0: 
        }
        var1_1 = new StringBuilder("\u8fc5\u96f7: ");
        var1_1.append(this.b);
        A.m(var1_1.toString());
    }
}

