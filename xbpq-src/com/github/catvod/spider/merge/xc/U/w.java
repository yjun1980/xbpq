/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.graphics.Color
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.Button
 *  android.widget.EditText
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 *  com.github.catvod.spider.InitOrigin
 *  com.google.gson.JsonObject
 */
package com.github.catvod.spider.merge.xc.U;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.KT.B;
import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.UY.K;
import com.github.catvod.spider.merge.UY.L;
import com.github.catvod.spider.merge.UY.M;
import com.github.catvod.spider.merge.UY.X;
import com.github.catvod.spider.merge.UY.b;
import com.github.catvod.spider.merge.UY.e;
import com.github.catvod.spider.merge.UY.f;
import com.github.catvod.spider.merge.UY.l;
import com.github.catvod.spider.merge.UY.r;
import com.github.catvod.spider.merge.UY.s;
import com.github.catvod.spider.merge.UY.y;
import com.github.catvod.spider.merge.xc.A0.c;
import com.github.catvod.spider.merge.xc.G.d;
import com.github.catvod.spider.merge.xc.U.C;
import com.github.catvod.spider.merge.xc.U.D;
import com.github.catvod.spider.merge.xc.U.t;
import com.github.catvod.spider.merge.xc.U.u;
import com.github.catvod.spider.merge.xc.U.v;
import com.github.catvod.spider.merge.xc.U.z;
import com.github.catvod.spider.merge.xc.a.a;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class w
implements Runnable {
    public final int a;

    public /* synthetic */ w(int n2) {
        this.a = n2;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        M m2;
        Object object;
        Object object2 = "";
        switch (this.a) {
            default: {
                object = M.r;
                m2 = L.a;
                m2.getClass();
                object = new StringBuilder();
                ((StringBuilder)object).append(System.currentTimeMillis());
                ((StringBuilder)object).append("");
                m2.d = ((StringBuilder)object).toString();
                object = new StringBuilder("https://api.open.uc.cn/cas/ajax/getTokenForQrcodeLogin?__dt=641254&__t=");
                ((StringBuilder)object).append(m2.d);
                Object object3 = ((StringBuilder)object).toString();
                object = new HashMap();
                ((HashMap)object).put("Accept", "application/json, text/plain, */*");
                ((HashMap)object).put("Content-Type", "application/x-www-form-urlencoded");
                ((HashMap)object).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36 Edg/126.0.0.0");
                ((HashMap)object).put("Referer", "https://broccoli.uc.cn/");
                Object object4 = new HashMap();
                ((HashMap)object4).put("client_id", "381");
                ((HashMap)object4).put("v", "1.2");
                ((HashMap)object4).put("request_id", m2.d);
                object4 = A.l((String)object3, object4, object);
                Object object5 = (Map)((X)object4).c;
                if (c.b(com.github.catvod.spider.merge.xc.O.a.g())) {
                    object = object3 = (List)object5.get("Set-Cookie");
                    if (object3 == null) {
                        object = (List)object5.get("set-cookie");
                    }
                    if (object != null) {
                        boolean bl;
                        object3 = new ArrayList();
                        object = object.iterator();
                        while (bl = object.hasNext()) {
                            ((ArrayList)object3).add(((String)object.next()).split(";")[0]);
                        }
                        object = TextUtils.join((CharSequence)";", object3);
                        object5 = com.github.catvod.spider.merge.xc.O.a.f();
                        object3 = ((com.github.catvod.spider.merge.xc.O.a)object5).d();
                        ((com.github.catvod.spider.merge.xc.O.c)object3).c((String)object);
                        ((com.github.catvod.spider.merge.xc.O.a)object5).j((com.github.catvod.spider.merge.xc.O.c)object3);
                    }
                }
                object3 = (Map)com.github.catvod.spider.merge.KT.C.L(((X)object4).b(), Map.class);
                object = object2;
                if ("ok".equals(object3.get("message"))) {
                    object = (String)((Map)((Map)object3.get("data")).get("members")).get("token");
                }
            }
            case 10: {
                com.github.catvod.spider.merge.UY.z z2 = y.a;
                z2.getClass();
                try {
                    object2 = com.github.catvod.spider.merge.UY.z.s();
                    if (object2 != null && !((String)object2).isEmpty()) {
                        com.github.catvod.spider.merge.UY.v v2 = new com.github.catvod.spider.merge.UY.v(z2, (String)object2, 0);
                        InitOrigin.run((Runnable)v2);
                        return;
                    }
                    object2 = new s(4);
                    InitOrigin.run((Runnable)object2);
                    return;
                }
                catch (Exception exception) {
                    InitOrigin.run((Runnable)new s(5));
                }
                return;
            }
            case 9: {
                A.m("\u8fc5\u96f7\u9a8c\u8bc1\u7801\u53d1\u9001\u5931\u8d25");
                return;
            }
            case 8: {
                com.github.catvod.spider.merge.xc.a.a.x(new v("\u79fb\u52a8\u4e91\u76d8\u8d26\u53f7\u767b\u5f55", "\u8f93\u5165\u79fb\u52a8\u4e91\u76d8\u8d26\u53f7\u548c\u5bc6\u7801", "\u8d26\u53f7/\u624b\u673a\u53f7", "\u5bc6\u7801", new u(1)));
                return;
            }
            case 7: {
                com.github.catvod.spider.merge.xc.a.a.x(new s(27));
                return;
            }
            case 6: {
                com.github.catvod.spider.merge.xc.a.a.z("\u5bfc\u5165\u79fb\u52a8\u4e91\u76d8\u6388\u6743", "\u652f\u6301 Authorization: Basic xxx\u3001pc:\u8d26\u53f7:token \u6216 \u624b\u673a\u53f7:token", "\u7c98\u8d34\u6388\u6743\u4e32", "\u4fdd\u5b58", new u(4));
                return;
            }
            case 5: {
                try {
                    object2 = com.github.catvod.spider.merge.xc.a.a.D();
                    LinearLayout linearLayout = new LinearLayout((Context)object2);
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(com.github.catvod.spider.merge.KT.C.j(26), com.github.catvod.spider.merge.KT.C.j(22), com.github.catvod.spider.merge.KT.C.j(26), com.github.catvod.spider.merge.KT.C.j(22));
                    linearLayout.setBackground((Drawable)com.github.catvod.spider.merge.xc.a.a.u(-1, com.github.catvod.spider.merge.KT.C.j(20)));
                    TextView textView = new TextView((Context)object2);
                    textView.setText((CharSequence)"\u5929\u7ffc\u4e91\u76d8\u77ed\u4fe1\u767b\u5f55");
                    textView.setTextColor(Color.rgb((int)17, (int)24, (int)39));
                    textView.setTextSize(21.0f);
                    textView.setTypeface(Typeface.DEFAULT, 1);
                    textView.setGravity(16);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    linearLayout.addView((View)textView, (ViewGroup.LayoutParams)layoutParams);
                    layoutParams = new TextView((Context)object2);
                    layoutParams.setText((CharSequence)"\u8f93\u5165\u624b\u673a\u53f7\u540e\u83b7\u53d6\u9a8c\u8bc1\u7801");
                    layoutParams.setTextColor(Color.rgb((int)75, (int)85, (int)99));
                    layoutParams.setTextSize(15.0f);
                    layoutParams.setPadding(0, com.github.catvod.spider.merge.KT.C.j(8), 0, com.github.catvod.spider.merge.KT.C.j(16));
                    textView = new LinearLayout.LayoutParams(-1, -2);
                    linearLayout.addView((View)layoutParams, (ViewGroup.LayoutParams)textView);
                    layoutParams = com.github.catvod.spider.merge.xc.a.a.G("\u624b\u673a\u53f7", false);
                    textView = new LinearLayout.LayoutParams(-1, com.github.catvod.spider.merge.KT.C.j(58));
                    linearLayout.addView((View)layoutParams, (ViewGroup.LayoutParams)textView);
                    Object object6 = new View((Context)object2);
                    textView = new LinearLayout.LayoutParams(1, com.github.catvod.spider.merge.KT.C.j(18));
                    linearLayout.addView(object6, (ViewGroup.LayoutParams)textView);
                    Object object7 = new LinearLayout((Context)object2);
                    object7.setOrientation(0);
                    object6 = com.github.catvod.spider.merge.xc.a.a.E("\u53d6\u6d88", false);
                    textView = com.github.catvod.spider.merge.xc.a.a.E("\u83b7\u53d6\u9a8c\u8bc1\u7801", true);
                    object7.addView(object6, (ViewGroup.LayoutParams)com.github.catvod.spider.merge.xc.a.a.F(true));
                    object7.addView((View)textView, (ViewGroup.LayoutParams)com.github.catvod.spider.merge.xc.a.a.F(false));
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, com.github.catvod.spider.merge.KT.C.j(52));
                    linearLayout.addView((View)object7, (ViewGroup.LayoutParams)layoutParams2);
                    layoutParams2 = new AlertDialog.Builder((Context)InitOrigin.getActivity());
                    layoutParams2 = layoutParams2.create();
                    object7 = new t((AlertDialog)layoutParams2, 3);
                    object6.setOnClickListener((View.OnClickListener)object7);
                    object6 = new C((EditText)layoutParams, (Button)textView, (AlertDialog)layoutParams2, 1);
                    textView.setOnClickListener((View.OnClickListener)object6);
                    object6 = new D((Button)textView, 2);
                    layoutParams.setOnEditorActionListener((TextView.OnEditorActionListener)object6);
                    layoutParams2.show();
                    layoutParams2.setContentView((View)linearLayout);
                    com.github.catvod.spider.merge.xc.a.a.B((AlertDialog)layoutParams2);
                    linearLayout = layoutParams2.getWindow();
                    if (linearLayout != null) {
                        linearLayout.setLayout(Math.min(com.github.catvod.spider.merge.KT.C.j(430), object2.getResources().getDisplayMetrics().widthPixels - com.github.catvod.spider.merge.KT.C.j(44)), -2);
                        linearLayout.clearFlags(131072);
                        linearLayout.setSoftInputMode(21);
                    }
                    com.github.catvod.spider.merge.xc.a.a.j((EditText)layoutParams);
                    return;
                }
                catch (Exception exception) {
                    A.m("\u5929\u7ffc\u4e91\u76d8\u77ed\u4fe1\u767b\u5f55\u5931\u8d25");
                }
                return;
            }
            case 4: {
                com.github.catvod.spider.merge.xc.a.a.z("\u5149\u9e2dRefreshToken", "\u7c98\u8d34\u5149\u9e2d refresh_token \u540e\u4fdd\u5b58", "\u7c98\u8d34 RefreshToken", "\u4fdd\u5b58", new u(2));
                return;
            }
            case 3: {
                InitOrigin.execute((Runnable)new w(0));
                return;
            }
            case 2: {
                r r2 = r.i;
                String string = "115\u626b\u7801\u767b\u5f55\u5931\u8d25";
                r2.a = false;
                try {
                    JsonObject jsonObject = r.j(com.github.catvod.spider.merge.KT.C.R(A.o("https://qrcodeapi.115.com/api/1.0/web/1.0/token/", null, r.a())), "data");
                    Object object8 = r.p(jsonObject, "uid");
                    String string2 = r.p(jsonObject, "qrcode");
                    if (!TextUtils.isEmpty((CharSequence)object8) && !TextUtils.isEmpty((CharSequence)string2)) {
                        object8 = new f(2, r2);
                        z z3 = new z(string2, "115\u7f51\u76d8", -14326805, (Runnable)object8);
                        InitOrigin.run((Runnable)z3);
                        string2 = r2.r(jsonObject);
                        if (TextUtils.isEmpty((CharSequence)string2)) {
                            object2 = new Exception("115\u626b\u7801\u767b\u5f55\u5931\u8d25");
                            throw object2;
                        }
                        if (string2 != null) {
                            object2 = string2.trim();
                        }
                        com.github.catvod.spider.merge.KT.C.N(object2, "pan115_cookie");
                        B.e("pan115");
                        com.github.catvod.spider.merge.xc.a.a.i();
                        A.m("115\u7f51\u76d8\u626b\u7801\u767b\u5f55\u6210\u529f");
                        return;
                    }
                    object2 = new Exception("115\u4e8c\u7ef4\u7801\u83b7\u53d6\u5931\u8d25");
                    throw object2;
                }
                catch (Throwable throwable) {}
                com.github.catvod.spider.merge.xc.a.a.i();
                if (r2.a) return;
                String string3 = TextUtils.isEmpty((CharSequence)throwable.getMessage()) ? string : throwable.getMessage();
                A.m(string3);
                return;
            }
            case 1: {
                e e2 = com.github.catvod.spider.merge.UY.d.a;
                e2.getClass();
                object2 = A.o("https://passport.aliyundrive.com/newlogin/qrcode/generate.do?appName=aliyun_drive&fromSite=52&appName=aliyun_drive&appEntrance=web&isMobile=false&lang=zh_CN&returnUrl=&bizParams=&_bx-v=2.2.3", null, null);
                InitOrigin.run((Runnable)new b(e2, object2, d.g((String)object2).c().d(), 0));
                return;
            }
            case 0: {
                l l2 = l.c;
                l2.a = false;
                try {
                    Object object9;
                    String string = l.o();
                    Object object10 = l.z(string);
                    String string4 = l.B(object10, "device_code");
                    object2 = object9 = l.B(object10, "verification_uri_complete");
                    if (TextUtils.isEmpty((CharSequence)object9)) {
                        object2 = l.B(object10, "verification_url");
                    }
                    if (!TextUtils.isEmpty((CharSequence)string4) && !TextUtils.isEmpty((CharSequence)object2)) {
                        object9 = new f();
                        object10 = new z((String)object2, "\u5149\u9e2d\u7f51\u76d8", -15681151, (Runnable)object9);
                        InitOrigin.run((Runnable)object10);
                        l2.E(string, string4);
                        com.github.catvod.spider.merge.xc.a.a.i();
                        B.e("guangya");
                        A.m("\u5149\u9e2d\u7f51\u76d8\u626b\u7801\u767b\u5f55\u6210\u529f");
                        return;
                    }
                    object2 = new Exception(l.j(object10, "\u5149\u9e2d\u4e8c\u7ef4\u7801\u83b7\u53d6\u5931\u8d25"));
                    throw object2;
                }
                catch (Throwable throwable) {}
                com.github.catvod.spider.merge.xc.a.a.i();
                if (l2.a) return;
                String string = TextUtils.isEmpty((CharSequence)throwable.getMessage()) ? "\u5149\u9e2d\u626b\u7801\u767b\u5f55\u5931\u8d25" : throwable.getMessage();
                A.m(string);
                return;
            }
        }
        catch (Exception exception) {
            object = object2;
        }
        InitOrigin.run((Runnable)new K(m2, (String)object, 0));
    }
}

