/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.DialogInterface$OnClickListener
 *  android.graphics.Color
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.view.KeyEvent$Callback
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnFocusChangeListener
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.Button
 *  android.widget.EditText
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 *  com.github.catvod.crawler.SpiderDebug
 *  com.github.catvod.spider.InitOrigin
 */
package com.github.catvod.spider.merge.UY;

import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.KT.B;
import com.github.catvod.spider.merge.KT.F;
import com.github.catvod.spider.merge.KT.J;
import com.github.catvod.spider.merge.KT.r;
import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.UY.L;
import com.github.catvod.spider.merge.UY.M;
import com.github.catvod.spider.merge.UY.f;
import com.github.catvod.spider.merge.UY.g;
import com.github.catvod.spider.merge.UY.t;
import com.github.catvod.spider.merge.xc.D0.b;
import com.github.catvod.spider.merge.xc.U.C;
import com.github.catvod.spider.merge.xc.U.D;
import com.github.catvod.spider.merge.xc.U.d;
import com.github.catvod.spider.merge.xc.U.e;
import com.github.catvod.spider.merge.xc.U.h;
import com.github.catvod.spider.merge.xc.U.i;
import com.github.catvod.spider.merge.xc.U.j;
import com.github.catvod.spider.merge.xc.U.k;
import com.github.catvod.spider.merge.xc.U.p;
import com.github.catvod.spider.merge.xc.U.u;
import com.github.catvod.spider.merge.xc.U.v;
import com.github.catvod.spider.merge.xc.U.w;
import com.github.catvod.spider.merge.xc.U.x;
import com.github.catvod.spider.merge.xc.U.y;
import com.github.catvod.spider.merge.xc.a.a;
import java.io.Serializable;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

public final class s
implements Runnable {
    public final int a;

    public /* synthetic */ s(int n2) {
        this.a = n2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void a() {
        try {
            ContextWrapper contextWrapper = com.github.catvod.spider.merge.xc.a.a.D();
            LinearLayout linearLayout = new LinearLayout((Context)contextWrapper);
            linearLayout.setOrientation(1);
            linearLayout.setPadding(com.github.catvod.spider.merge.KT.C.j(26), com.github.catvod.spider.merge.KT.C.j(22), com.github.catvod.spider.merge.KT.C.j(26), com.github.catvod.spider.merge.KT.C.j(22));
            linearLayout.setBackground((Drawable)com.github.catvod.spider.merge.xc.a.a.u(-1, com.github.catvod.spider.merge.KT.C.j(20)));
            TextView textView = new TextView((Context)contextWrapper);
            textView.setText((CharSequence)"\u79fb\u52a8\u4e91\u76d8\u77ed\u4fe1\u767b\u5f55");
            textView.setTextColor(Color.rgb((int)17, (int)24, (int)39));
            textView.setTextSize(21.0f);
            textView.setTypeface(Typeface.DEFAULT, 1);
            textView.setGravity(16);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            linearLayout.addView((View)textView, (ViewGroup.LayoutParams)layoutParams);
            textView = new TextView((Context)contextWrapper);
            textView.setText((CharSequence)"\u8f93\u5165\u624b\u673a\u53f7\u540e\u83b7\u53d6\u9a8c\u8bc1\u7801");
            textView.setTextColor(Color.rgb((int)75, (int)85, (int)99));
            textView.setTextSize(15.0f);
            textView.setPadding(0, com.github.catvod.spider.merge.KT.C.j(8), 0, com.github.catvod.spider.merge.KT.C.j(16));
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
            linearLayout.addView((View)textView, (ViewGroup.LayoutParams)layoutParams);
            layoutParams = com.github.catvod.spider.merge.xc.a.a.G("\u624b\u673a\u53f7", false);
            textView = new LinearLayout.LayoutParams(-1, com.github.catvod.spider.merge.KT.C.j(58));
            linearLayout.addView((View)layoutParams, (ViewGroup.LayoutParams)textView);
            textView = new View((Context)contextWrapper);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(1, com.github.catvod.spider.merge.KT.C.j(18));
            linearLayout.addView((View)textView, (ViewGroup.LayoutParams)layoutParams2);
            LinearLayout linearLayout2 = new LinearLayout((Context)contextWrapper);
            linearLayout2.setOrientation(0);
            Button button = com.github.catvod.spider.merge.xc.a.a.E("\u53d6\u6d88", false);
            textView = com.github.catvod.spider.merge.xc.a.a.E("\u83b7\u53d6\u9a8c\u8bc1\u7801", true);
            linearLayout2.addView((View)button, (ViewGroup.LayoutParams)com.github.catvod.spider.merge.xc.a.a.F(true));
            linearLayout2.addView((View)textView, (ViewGroup.LayoutParams)com.github.catvod.spider.merge.xc.a.a.F(false));
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, com.github.catvod.spider.merge.KT.C.j(52));
            linearLayout.addView((View)linearLayout2, (ViewGroup.LayoutParams)layoutParams3);
            layoutParams3 = new AlertDialog.Builder((Context)InitOrigin.getActivity());
            layoutParams3 = layoutParams3.create();
            com.github.catvod.spider.merge.xc.U.t t2 = new com.github.catvod.spider.merge.xc.U.t((AlertDialog)layoutParams3, 1);
            button.setOnClickListener((View.OnClickListener)t2);
            C c2 = new C((EditText)layoutParams, (Button)textView, (AlertDialog)layoutParams3, 0);
            textView.setOnClickListener((View.OnClickListener)c2);
            D d2 = new D((Button)textView, 0);
            layoutParams.setOnEditorActionListener((TextView.OnEditorActionListener)d2);
            layoutParams3.show();
            layoutParams3.setContentView((View)linearLayout);
            com.github.catvod.spider.merge.xc.a.a.B((AlertDialog)layoutParams3);
            linearLayout = layoutParams3.getWindow();
            if (linearLayout != null) {
                linearLayout.setLayout(Math.min(com.github.catvod.spider.merge.KT.C.j(430), contextWrapper.getResources().getDisplayMetrics().widthPixels - com.github.catvod.spider.merge.KT.C.j(44)), -2);
                linearLayout.clearFlags(131072);
                linearLayout.setSoftInputMode(21);
            }
            com.github.catvod.spider.merge.xc.a.a.j((EditText)layoutParams);
            return;
        }
        catch (Exception exception) {
            A.m("\u79fb\u52a8\u4e91\u76d8\u77ed\u4fe1\u767b\u5f55\u5931\u8d25");
        }
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void run() {
        switch (this.a) {
            default: {
                com.github.catvod.spider.merge.xc.a.a.x(new w(5));
                return;
            }
            case 28: {
                com.github.catvod.spider.merge.xc.a.a.x(new v("\u5929\u7ffc\u4e91\u76d8\u8d26\u53f7\u767b\u5f55", "\u8f93\u5165\u624b\u673a\u53f7\u548c\u5bc6\u7801", "\u624b\u673a\u53f7", "\u5bc6\u7801", new u(5)));
                return;
            }
            case 27: {
                this.a();
                return;
            }
            case 26: {
                com.github.catvod.spider.merge.xc.a.a.z("115\u7f51\u76d8Cookie", "\u4ece\u6d4f\u89c8\u5668\u767b\u5f55115\u540e\u590d\u5236Cookie\u7c98\u8d34\u5230\u8fd9\u91cc", "\u7c98\u8d34115 Cookie", "\u4fdd\u5b58", new u(3));
                return;
            }
            case 25: {
                InitOrigin.execute((Runnable)new w(2));
                return;
            }
            case 24: {
                try {
                    var1_1 /* !! */  = new AlertDialog.Builder((Context)InitOrigin.getActivity());
                    var1_1 /* !! */  = var1_1 /* !! */ .setTitle((CharSequence)"UC \u667a\u80fd\u753b\u8d28\u6388\u6743");
                    var2_21 = new x(0);
                    var2_21 = var1_1 /* !! */ .setItems((CharSequence[])new String[]{"\u8df3\u8f6c UC App \u6388\u6743", "\u663e\u793a\u4e8c\u7ef4\u7801\u6388\u6743"}, (DialogInterface.OnClickListener)var2_21);
                    var1_1 /* !! */  = new x(1);
                    var2_21 = var2_21.setNegativeButton(0x1040000, (DialogInterface.OnClickListener)var1_1 /* !! */ );
                    var1_1 /* !! */  = new y();
                    var2_21.setOnCancelListener((DialogInterface.OnCancelListener)var1_1 /* !! */ ).show();
                    return;
                }
                catch (Exception var1_2) {
                    var1_3 = M.r;
                    L.a.i = true;
                    A.m("UC \u667a\u80fd\u753b\u8d28\u6388\u6743\u5931\u8d25");
                }
                return;
            }
            case 23: {
                var3_29 = b.Q();
                var2_22 = new ArrayList<E>(B.k());
                var1_4 = b.h(var3_29, 26, 26);
                var1_4.addView((View)b.N("\u7f51\u76d8\u542f\u7528"));
                var1_4.addView((View)b.v("\u5173\u95ed\u540e\u64ad\u653e\u7ebf\u8def\u91cc\u4e0d\u518d\u663e\u793a\u8be5\u7f51\u76d8\u3002"));
                b.b(var1_4, 14);
                var4_34 = new LinearLayout((Context)var3_29);
                var4_34.setOrientation(1);
                var5_39 = new LinearLayout.LayoutParams(-1, -2);
                var1_4.addView((View)var4_34, (ViewGroup.LayoutParams)var5_39);
                var6_44 = new Runnable[1];
                var5_39 = new com.github.catvod.spider.merge.xc.U.g(var4_34, var3_29, var2_22, (Serializable)var6_44, 0);
                var6_44[0] = var5_39;
                try {
                    var5_39.run();
                    b.b(var1_4, 12);
                    var4_34 = b.g("\u4fdd\u5b58", true);
                    var5_39 = new LinearLayout.LayoutParams(-1, com.github.catvod.spider.merge.KT.C.j(44));
                    var1_4.addView((View)var4_34, (ViewGroup.LayoutParams)var5_39);
                    var5_39 = new AlertDialog.Builder((Context)var3_29);
                    var3_29 = var5_39.create();
                    var5_39 = new h(var2_22, (AlertDialog)var3_29, 0);
                    var4_34.setOnClickListener((View.OnClickListener)var5_39);
                    b.K((AlertDialog)var3_29, var1_4, 500);
                    return;
                }
                catch (Exception var1_5) {
                    A.m("\u7f51\u76d8\u542f\u7528\u8bbe\u7f6e\u6253\u5f00\u5931\u8d25");
                }
                return;
            }
            case 22: {
                var4_35 = b.Q();
                var2_23 = b.h(var4_35, 26, 26);
                var2_23.addView((View)b.N("Go\u4ee3\u7406"));
                var1_6 = new StringBuilder("\u72b6\u6001\uff1a");
                var1_6.append(B.l());
                var1_6.append("\n\u542f\u7528\u540e\u4f1a\u6309\u5f53\u524d\u8bbe\u5907 ABI \u4e0b\u8f7d Go \u4e8c\u8fdb\u5236\uff0c\u542f\u52a8\u5931\u8d25\u81ea\u52a8\u56de\u9000 Java \u4ee3\u7406\u3002");
                var3_30 = b.v(var1_6.toString());
                var2_23.addView((View)var3_30);
                b.b(var2_23, 14);
                var7_49 /* !! */  = new LinearLayout((Context)var4_35);
                var7_49 /* !! */ .setOrientation(0);
                var7_49 /* !! */ .setGravity(17);
                var1_6 = B.q() != false ? "\u5173\u95ed" : "\u542f\u7528";
                var6_45 /* !! */  = b.g((String)var1_6, true);
                var5_40 = B.l;
                var1_6 = var5_40.t() != false ? "\u91cd\u542f" : "\u542f\u52a8";
                try {
                    var1_6 = b.g((String)var1_6, false);
                    var7_49 /* !! */ .addView((View)var6_45 /* !! */ , (ViewGroup.LayoutParams)b.R());
                    var7_49 /* !! */ .addView((View)var1_6, (ViewGroup.LayoutParams)b.R());
                    var8_53 = new LinearLayout.LayoutParams(-1, com.github.catvod.spider.merge.KT.C.j(44));
                    var2_23.addView((View)var7_49 /* !! */ , (ViewGroup.LayoutParams)var8_53);
                    var7_49 /* !! */  = new AlertDialog.Builder((Context)var4_35);
                    var4_35 = var7_49 /* !! */ .create();
                    var7_49 /* !! */  = new com.github.catvod.spider.merge.xc.U.b(var4_35, var3_30, 1);
                    var6_45 /* !! */ .setOnClickListener((View.OnClickListener)var7_49 /* !! */ );
                    var6_45 /* !! */  = new i((KeyEvent.Callback)var3_30, 0);
                    var1_6.setOnClickListener((View.OnClickListener)var6_45 /* !! */ );
                    if (B.q() && !var5_40.t()) {
                        var3_30.setText((CharSequence)"\u72b6\u6001\uff1a\u4e0b\u8f7d/\u542f\u52a8\u4e2d...");
                        var1_6 = new f(5, var3_30);
                        InitOrigin.execute((Runnable)var1_6);
                    }
                    b.K((AlertDialog)var4_35, var2_23, 460);
                    return;
                }
                catch (Exception var1_7) {
                    A.m("Go\u4ee3\u7406\u6253\u5f00\u5931\u8d25");
                }
                return;
            }
            case 21: {
                var7_50 = b.Q();
                var2_24 = new ArrayList<E>(B.n());
                var3_31 /* !! */  = new int[]{0};
                var1_8 = b.h(var7_50, 26, 26);
                var1_8.addView((View)b.N("\u7f51\u76d8\u6392\u5e8f"));
                var1_8.addView((View)b.v("\u9009\u62e9\u7f51\u76d8\u540e\u4f7f\u7528\u4e0a\u79fb\u3001\u4e0b\u79fb\u8c03\u6574\u987a\u5e8f\uff0c\u786e\u5b9a\u540e\u6309\u6b64\u987a\u5e8f\u663e\u793a\u3002"));
                b.b(var1_8, 14);
                var5_41 = new LinearLayout((Context)var7_50);
                var5_41.setOrientation(1);
                var5_41.setPadding(0, 0, 0, 0);
                var4_36 = new LinearLayout.LayoutParams(-1, -2);
                var1_8.addView((View)var5_41, (ViewGroup.LayoutParams)var4_36);
                var4_36 = new Runnable[1];
                var6_46 = new j(var5_41, var2_24, var7_50, var3_31 /* !! */ , var4_36);
                var4_36[0] = var6_46;
                try {
                    var6_46.run();
                    b.b(var1_8, 12);
                    var10_56 = new LinearLayout((Context)var7_50);
                    var10_56.setOrientation(0);
                    var10_56.setGravity(17);
                    var8_54 /* !! */  = b.g("\u4e0a\u79fb", false);
                    var6_46 = b.g("\u4e0b\u79fb", false);
                    var5_41 = b.g("\u786e\u5b9a", true);
                    var10_56.addView((View)var8_54 /* !! */ , (ViewGroup.LayoutParams)b.R());
                    var10_56.addView((View)var6_46, (ViewGroup.LayoutParams)b.R());
                    var10_56.addView((View)var5_41, (ViewGroup.LayoutParams)b.R());
                    var9_58 /* !! */  = new LinearLayout.LayoutParams(-1, com.github.catvod.spider.merge.KT.C.j(44));
                    var1_8.addView((View)var10_56, (ViewGroup.LayoutParams)var9_58 /* !! */ );
                    var9_58 /* !! */  = new AlertDialog.Builder((Context)var7_50);
                    var7_50 = var9_58 /* !! */ .create();
                    var9_58 /* !! */  = new k(var3_31 /* !! */ , var2_24, var4_36, 0);
                    var8_54 /* !! */ .setOnClickListener((View.OnClickListener)var9_58 /* !! */ );
                    var8_54 /* !! */  = new k(var3_31 /* !! */ , var2_24, var4_36, 1);
                    var6_46.setOnClickListener((View.OnClickListener)var8_54 /* !! */ );
                    var3_31 /* !! */  = (int[])new h;
                    var3_31 /* !! */ (var2_24, (AlertDialog)var7_50, 1);
                    var5_41.setOnClickListener((View.OnClickListener)var3_31 /* !! */ );
                    b.K((AlertDialog)var7_50, var1_8, 500);
                    return;
                }
                catch (Exception var1_9) {
                    A.m("\u7f51\u76d8\u6392\u5e8f\u6253\u5f00\u5931\u8d25");
                }
                return;
            }
            case 20: {
                var4_37 = b.Q();
                var2_25 /* !! */  = b.h(var4_37, 26, 26);
                var2_25 /* !! */ .addView((View)b.N("XENC\u89e3\u5bc6\u5bc6\u7801"));
                var2_25 /* !! */ .addView((View)b.v("\u64ad\u653e .xenc \u52a0\u5bc6\u89c6\u9891\u65f6\u4f7f\u7528\u3002"));
                b.b(var2_25 /* !! */ , 12);
                var1_10 = new EditText((Context)var4_37);
                var1_10.setSingleLine(true);
                var1_10.setInputType(145);
                var3_32 /* !! */  = J.a;
                var1_10.setText((CharSequence)com.github.catvod.spider.merge.KT.C.y("xenc_password"));
                var1_10.setHint((CharSequence)"\u8f93\u5165\u52a0\u5bc6\u65f6\u4f7f\u7528\u7684\u5bc6\u7801");
                var1_10.setTextSize(16.0f);
                var1_10.setSelectAllOnFocus(true);
                var1_10.setFocusable(true);
                var1_10.setFocusableInTouchMode(true);
                b.f(var1_10, false);
                var3_32 /* !! */  = (byte[])new com.github.catvod.spider.merge.xc.U.m;
                var3_32 /* !! */ (var1_10, 0);
                var1_10.setOnFocusChangeListener((View.OnFocusChangeListener)var3_32 /* !! */ );
                var1_10.setPadding(com.github.catvod.spider.merge.KT.C.j(14), 0, com.github.catvod.spider.merge.KT.C.j(14), 0);
                var3_32 /* !! */  = (byte[])new LinearLayout.LayoutParams;
                var3_32 /* !! */ (-1, com.github.catvod.spider.merge.KT.C.j(48));
                var2_25 /* !! */ .addView((View)var1_10, (ViewGroup.LayoutParams)var3_32 /* !! */ );
                b.b(var2_25 /* !! */ , 14);
                var7_51 = new LinearLayout((Context)var4_37);
                var7_51.setOrientation(0);
                var7_51.setGravity(17);
                var5_42 /* !! */  = b.g("\u6e05\u7a7a", false);
                var3_32 /* !! */  = (byte[])b.g("\u4fdd\u5b58", true);
                var7_51.addView((View)var5_42 /* !! */ , (ViewGroup.LayoutParams)b.R());
                var7_51.addView((View)var3_32 /* !! */ , (ViewGroup.LayoutParams)b.R());
                var6_47 /* !! */  = new LinearLayout.LayoutParams(-1, com.github.catvod.spider.merge.KT.C.j(44));
                var2_25 /* !! */ .addView((View)var7_51, (ViewGroup.LayoutParams)var6_47 /* !! */ );
                var6_47 /* !! */  = new AlertDialog.Builder((Context)var4_37);
                var4_37 = var6_47 /* !! */ .create();
                var6_47 /* !! */  = new com.github.catvod.spider.merge.xc.U.a(var1_10, 0);
                var5_42 /* !! */ .setOnClickListener((View.OnClickListener)var6_47 /* !! */ );
                var5_42 /* !! */  = new com.github.catvod.spider.merge.xc.U.b(var1_10, (AlertDialog)var4_37);
                var3_32 /* !! */ .setOnClickListener((View.OnClickListener)var5_42 /* !! */ );
                b.K((AlertDialog)var4_37, var2_25 /* !! */ , 420);
                var2_25 /* !! */  = var4_37.getWindow();
                if (var2_25 /* !! */  == null) ** GOTO lbl200
                var2_25 /* !! */ .clearFlags(131072);
                var2_25 /* !! */ .setSoftInputMode(21);
lbl200:
                // 3 sources

                var1_10.setFocusable(true);
                var1_10.setFocusableInTouchMode(true);
                var1_10.requestFocus();
                var1_10.requestFocusFromTouch();
                var2_25 /* !! */  = new p(var1_10, 0);
                var1_10.postDelayed((Runnable)var2_25 /* !! */ , 220L);
                return;
                catch (Exception var1_11) {
                    A.m("XENC\u89e3\u5bc6\u5bc6\u7801\u8bbe\u7f6e\u6253\u5f00\u5931\u8d25");
                }
                return;
            }
            case 19: {
                var6_48 = b.Q();
                var1_12 = B.i;
                var2_26 = new ArrayList<E>(B.k);
                var1_12 = new HashMap();
                for (String var3_33 : var2_26) {
                    var1_12.put(var3_33, B.p(var3_33));
                }
                var4_38 = new int[1];
                var4_38[0] = false;
                var3_33 = b.h(var6_48, 26, 26);
                var3_33.addView((View)b.N("\u7ebf\u7a0b\u8bbe\u7f6e"));
                var7_52 = b.v("");
                var3_33.addView((View)var7_52);
                b.b((LinearLayout)var3_33, 14);
                var8_55 = new LinearLayout((Context)var6_48);
                var8_55.setOrientation(1);
                var5_43 = new LinearLayout.LayoutParams(-1, -2);
                var3_33.addView((View)var8_55, (ViewGroup.LayoutParams)var5_43);
                var5_43 = new Runnable[1];
                var9_59 = new d(var8_55, var2_26, (int[])var4_38, var7_52, (HashMap)var1_12, var6_48, var5_43);
                var5_43[0] = var9_59;
                try {
                    var9_59.run();
                    b.b((LinearLayout)var3_33, 12);
                    var12_60 = new LinearLayout((Context)var6_48);
                    var12_60.setOrientation(0);
                    var12_60.setGravity(17);
                    var10_57 /* !! */  = b.g("-1", false);
                    var9_59 = b.g("+1", false);
                    var8_55 = b.g("\u9ed8\u8ba4", false);
                    var7_52 = b.g("\u4fdd\u5b58", true);
                    var12_60.addView((View)var10_57 /* !! */ , (ViewGroup.LayoutParams)b.R());
                    var12_60.addView((View)var9_59, (ViewGroup.LayoutParams)b.R());
                    var12_60.addView((View)var8_55, (ViewGroup.LayoutParams)b.R());
                    var12_60.addView((View)var7_52, (ViewGroup.LayoutParams)b.R());
                    var11_61 /* !! */  = new LinearLayout.LayoutParams(-1, com.github.catvod.spider.merge.KT.C.j(44));
                    var3_33.addView((View)var12_60, (ViewGroup.LayoutParams)var11_61 /* !! */ );
                    var11_61 /* !! */  = new AlertDialog.Builder((Context)var6_48);
                    var6_48 = var11_61 /* !! */ .create();
                    var11_61 /* !! */  = new e(var2_26, (int[])var4_38, (HashMap)var1_12, var5_43, 0);
                    var10_57 /* !! */ .setOnClickListener((View.OnClickListener)var11_61 /* !! */ );
                    var10_57 /* !! */  = new e(var2_26, (int[])var4_38, (HashMap)var1_12, var5_43, 1);
                    var9_59.setOnClickListener((View.OnClickListener)var10_57 /* !! */ );
                    var9_59 = new e(var2_26, (int[])var4_38, (HashMap)var1_12, var5_43, 2);
                    var8_55.setOnClickListener((View.OnClickListener)var9_59);
                    var4_38 = new com.github.catvod.spider.merge.xc.U.f(var2_26, (Serializable)var1_12, var6_48, 0);
                    var7_52.setOnClickListener((View.OnClickListener)var4_38);
                    b.K((AlertDialog)var6_48, (LinearLayout)var3_33, 560);
                    return;
                }
                catch (Exception var1_13) {
                    A.m("\u7ebf\u7a0b\u8bbe\u7f6e\u6253\u5f00\u5931\u8d25");
                }
                return;
            }
            case 18: {
                var1_14 = B.l.f() != false ? "Go\u4ee3\u7406\u542f\u52a8\u6210\u529f" : "Go\u4ee3\u7406\u542f\u52a8\u5931\u8d25";
                b.L(var1_14, B.l());
                return;
            }
            case 17: {
                try {
                    var1_15 = g.a;
                    g.a.g();
                    return;
                }
                catch (Exception var1_16) {
                    b.L("\u6388\u6743\u5931\u8d25", "\u767e\u5ea6\u4e91\u76d8\u4e8c\u7ef4\u7801\u83b7\u53d6\u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5\u3002");
                }
                return;
            }
            case 16: {
                var1_17 = F.a;
                var2_27 = F.c;
                if (var2_27 != null) {
                    var2_27.b = false;
                    ((ExecutorService)var2_27.d).shutdown();
                    ((ServerSocket)var2_27.c).close();
                }
                F.c = null;
                F.d = false;
                var1_17.j();
                var1_17 = B.l;
                var1_17.getClass();
                if (com.github.catvod.spider.merge.KT.C.x().getBoolean("go_proxy_user_disabled", false) || !B.q() || var1_17.d || var1_17.t()) return;
                var1_17.d = true;
                A.m("\u6b63\u5728\u62c9\u53d6\u542f\u52a8Go\u4ee3\u7406\u4e2d");
                Init.execute(new f(9, var1_17));
                return;
            }
            case 15: {
                var2_28 = Init.get().c;
                if (var2_28 == null || com.github.catvod.spider.merge.KT.t.a) return;
                com.github.catvod.spider.merge.KT.t.a = true;
                try {
                    var1_18 = new r();
                    var2_28.registerActivityLifecycleCallbacks(var1_18);
                    SpiderDebug.log((String)"[Doumu] hook installed");
                    return;
                }
                catch (Throwable var1_19) {
                    m.p(var1_19, new StringBuilder("[Doumu] install failed: "));
                }
                return;
            }
            case 14: {
                A.m("\u8fc5\u96f7\u767b\u5f55\u5f02\u5e38");
                return;
            }
            case 13: {
                A.m("\u8fc5\u96f7\u7f51\u76d8\u767b\u5f55\u6210\u529f");
                return;
            }
            case 12: {
                A.m("\u83b7\u53d6\u9a8c\u8bc1\u7801\u5931\u8d25");
                return;
            }
            case 11: {
                A.m("\u8fc5\u96f7\u9a8c\u8bc1\u7801\u767b\u5f55\u5f02\u5e38");
                return;
            }
            case 10: {
                A.m("\u8fc5\u96f7\u7f51\u76d8\u767b\u5f55\u6210\u529f");
                return;
            }
            case 9: {
                A.m("\u8fc5\u96f7: \u83b7\u53d6\u9a8c\u8bc1token\u5931\u8d25");
                return;
            }
            case 8: {
                A.m("UC\u7f51\u76d8\u7a7a\u95f4\u4e0d\u8db3\uff0c\u8bf7\u6e05\u7406\u540e\u91cd\u8bd5");
                return;
            }
            case 7: {
                A.m("[\u5929\u7ffc\u4e91\u76d8] \u9700\u8981\u9a8c\u8bc1\u7801\uff0c\u8bf7\u4f7f\u7528\u77ed\u4fe1\u767b\u5f55");
                return;
            }
            case 6: {
                A.m("\u5929\u7ffc\u4e91\u76d8\u767b\u5f55\u6210\u529f");
                return;
            }
            case 5: {
                A.m("\u5938\u514b\u626b\u7801\u521d\u59cb\u5316\u5931\u8d25");
                return;
            }
            case 4: {
                A.m("\u5938\u514b\u626b\u7801\u521d\u59cb\u5316\u5931\u8d25: \u83b7\u53d6\u4ee4\u724c\u5931\u8d25");
                return;
            }
            case 3: {
                A.m("\u6388\u6743\u5931\u8d25\uff1a\u672a\u83b7\u53d6\u5230 Cookie");
                return;
            }
            case 2: {
                A.m("\u5938\u514b\u83b7\u53d6cookie\u5931\u8d25");
                return;
            }
            case 1: {
                A.m("\u5938\u514b\u7f51\u76d8\u7a7a\u95f4\u4e0d\u8db3\uff0c\u8bf7\u6e05\u7406\u540e\u91cd\u8bd5");
                return;
            }
            case 0: 
        }
        t.b(t.b, t.c);
        return;
        catch (Exception var1_20) {
            return;
        }
    }
}

