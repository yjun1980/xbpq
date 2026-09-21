/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.graphics.Color
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnFocusChangeListener
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.Button
 *  android.widget.EditText
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.TextView
 *  com.github.catvod.crawler.SpiderDebug
 *  com.github.catvod.spider.InitOrigin
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  okhttp3.HttpUrl
 */
package com.github.catvod.spider.merge.xc.D0;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.HR.o;
import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.KT.H;
import com.github.catvod.spider.merge.MP.g;
import com.github.catvod.spider.merge.MP.j;
import com.github.catvod.spider.merge.MP.k;
import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.UY.B;
import com.github.catvod.spider.merge.UY.D;
import com.github.catvod.spider.merge.UY.N;
import com.github.catvod.spider.merge.UY.X;
import com.github.catvod.spider.merge.UY.t;
import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.D0.c;
import com.github.catvod.spider.merge.xc.U.n;
import com.github.catvod.spider.merge.xc.U.s;
import com.github.catvod.spider.merge.xc.d0.q;
import com.github.catvod.spider.merge.xc.d0.r;
import com.github.catvod.spider.merge.xc.d0.v;
import com.github.catvod.spider.merge.xc.e0.h;
import com.github.catvod.spider.merge.xc.g.f;
import com.github.catvod.spider.merge.xc.h0.a;
import com.github.catvod.spider.merge.xc.r0.e;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

public abstract class b {
    public static String a = "";

    public static void A(Object object) {
        if (object != null) {
            return;
        }
        throw new c("Object must not be null");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static LinearLayout B(ContextWrapper contextWrapper, int n2, String string, boolean bl, Runnable runnable) {
        int n3;
        LinearLayout linearLayout = new LinearLayout((Context)contextWrapper);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(C.j(10), 0, C.j(10), 0);
        linearLayout.setFocusable(true);
        linearLayout.setFocusableInTouchMode(true);
        linearLayout.setClickable(true);
        b.e(linearLayout, bl, false);
        linearLayout.setOnFocusChangeListener((View.OnFocusChangeListener)new com.github.catvod.spider.merge.xc.U.c((View)linearLayout, bl, 2));
        linearLayout.setOnClickListener((View.OnClickListener)new com.github.catvod.spider.merge.xc.U.r(runnable, 0));
        runnable = new TextView((Context)contextWrapper);
        runnable.setText(String.valueOf(n2 + 1));
        int n4 = 235;
        n2 = bl ? Color.rgb((int)37, (int)99, (int)235) : Color.rgb((int)107, (int)114, (int)128);
        runnable.setTextColor(n2);
        runnable.setTextSize(12.0f);
        runnable.setTypeface(Typeface.DEFAULT, 1);
        runnable.setGravity(17);
        runnable.setIncludeFontPadding(false);
        if (bl) {
            n2 = 254;
            n4 = 219;
            n3 = 234;
        } else {
            int n5 = 229;
            n3 = 231;
            n2 = n4;
            n4 = n5;
        }
        n2 = Color.rgb((int)n4, (int)n3, (int)n2);
        runnable.setBackground((Drawable)com.github.catvod.spider.merge.xc.a.a.u(n2, C.j(12)));
        linearLayout.addView((View)runnable, (ViewGroup.LayoutParams)new LinearLayout.LayoutParams(C.j(24), C.j(24)));
        contextWrapper = new TextView((Context)contextWrapper);
        contextWrapper.setText((CharSequence)string);
        contextWrapper.setTextColor(Color.rgb((int)17, (int)24, (int)39));
        contextWrapper.setTextSize(14.0f);
        contextWrapper.setGravity(16);
        contextWrapper.setSingleLine(true);
        contextWrapper.setIncludeFontPadding(false);
        string = new LinearLayout.LayoutParams(0, -1, 1.0f);
        string.setMargins(C.j(8), 0, 0, 0);
        linearLayout.addView((View)contextWrapper, (ViewGroup.LayoutParams)string);
        return linearLayout;
    }

    public static LinearLayout.LayoutParams C(boolean bl) {
        int n2 = C.j(44);
        int n3 = 0;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, n2, 1.0f);
        n2 = bl ? 0 : C.j(6);
        int n4 = C.j(2);
        if (bl) {
            n3 = C.j(6);
        }
        layoutParams.setMargins(n2, n4, n3, C.j(6));
        return layoutParams;
    }

    public static ArrayList D(String string, String string2, String object, String string3, String string4) {
        String string5 = com.github.catvod.spider.merge.KT.B.m((String)object);
        object = new ArrayList();
        ((ArrayList)object).add(b.s(string, string5.concat(string4), string3, "\u6388\u6743".concat(string5)));
        ((ArrayList)object).add(b.s(string2, string5.concat("\u6e05\u9664CK"), "https://d.kstore.dev/download/6741/jar/png/sc.png", m.r("\u6e05\u9664", string5, "\u767b\u5f55\u4fe1\u606f")));
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String E(String object, String object2) {
        Exception exception2;
        int n2;
        Object object3;
        block4: {
            i.e(object, "id");
            i.e(object2, "flag");
            object = e.Y((CharSequence)object, new String[]{"\\+\\+"}, 0, 6);
            object2 = new StringBuilder("\u64ad\u653e\u53c2\u6570\uff1a");
            ((StringBuilder)object2).append(object);
            SpiderDebug.log((String)((StringBuilder)object2).toString());
            object2 = (String)object.get(0);
            long l2 = Long.parseLong((String)object.get(1));
            object3 = (String)object.get(2);
            long l3 = Long.parseLong((String)object.get(3));
            Object object4 = (String)object.get(4);
            i.e(object2, "shareKey");
            i.e(object3, "s3KeyFlag");
            i.e(object4, "etag");
            SpiderDebug.log((String)"\u83b7\u53d6\u4e0b\u8f7d\u94fe\u63a5\u53c2\u6570\uff1a");
            SpiderDebug.log((String)"ShareKey: ".concat((String)object2));
            object = new StringBuilder("FileID: ");
            ((StringBuilder)object).append(l2);
            SpiderDebug.log((String)((StringBuilder)object).toString());
            SpiderDebug.log((String)"S3KeyFlag: ".concat((String)object3));
            object = new StringBuilder("Size: ");
            ((StringBuilder)object).append(l3);
            SpiderDebug.log((String)((StringBuilder)object).toString());
            SpiderDebug.log((String)"Etag: ".concat((String)object4));
            object = e.T(a) ^ true ? a : t.a;
            object = e.e0(30, (String)object);
            StringBuilder stringBuilder = new StringBuilder("Auth Token: ");
            stringBuilder.append((String)object);
            stringBuilder.append("...");
            SpiderDebug.log((String)stringBuilder.toString());
            object2 = v.U(new com.github.catvod.spider.merge.xc.c0.b("ShareKey", object2), new com.github.catvod.spider.merge.xc.c0.b("FileID", l2), new com.github.catvod.spider.merge.xc.c0.b("S3KeyFlag", object3), new com.github.catvod.spider.merge.xc.c0.b("Size", l3), new com.github.catvod.spider.merge.xc.c0.b("Etag", object4));
            SpiderDebug.log((String)"\u8bf7\u6c42URL: https://www.123684.com/b/api/share/download/info");
            object3 = C.Z(object2);
            object = new StringBuilder("\u8bf7\u6c42\u6570\u636e: ");
            ((StringBuilder)object).append((String)object3);
            SpiderDebug.log((String)((StringBuilder)object).toString());
            object3 = new com.github.catvod.spider.merge.xc.c0.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Safari/537.36");
            object4 = new com.github.catvod.spider.merge.xc.c0.b("Content-Type", "application/json");
            object = e.T(a) ^ true ? a : t.a;
            object = v.U(new com.github.catvod.spider.merge.xc.c0.b[]{object3, object4, new com.github.catvod.spider.merge.xc.c0.b("Authorization", m.q("Bearer ", (String)object)), new com.github.catvod.spider.merge.xc.c0.b("platform", "android")});
            try {
                object = A.k("https://www.123684.com/b/api/share/download/info", C.Z(object2), (Map)object);
                n2 = ((X)object).a;
                object2 = new StringBuilder("\u54cd\u5e94\u72b6\u6001\u7801: ");
                ((StringBuilder)object2).append(n2);
                SpiderDebug.log((String)((StringBuilder)object2).toString());
                object3 = ((X)object).b();
                object2 = new StringBuilder("\u54cd\u5e94\u5185\u5bb9: ");
                ((StringBuilder)object2).append((String)object3);
                SpiderDebug.log((String)((StringBuilder)object2).toString());
                if (n2 != 200 || !(object2 = C.R(((X)object).b())).has("data") || !object2.getAsJsonObject("data").has("DownloadURL")) break block4;
                object = HttpUrl.parse((String)object2.getAsJsonObject("data").get("DownloadURL").getAsString());
                object = object != null ? object.queryParameter("params") : null;
                object = H.b((String)object);
            }
            catch (Exception exception2) {}
            object = com.github.catvod.spider.merge.KT.B.y((String)object, v.U(new com.github.catvod.spider.merge.xc.c0.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Safari/537.36"), new com.github.catvod.spider.merge.xc.c0.b("Referer", "https://www.123pan.com/")), com.github.catvod.spider.merge.KT.B.p("pan123"), "pan123");
            i.d(object, "play(...)");
            object2 = new g();
            ((g)object2).w((String)object);
            ((g)object2).j();
            object = ((g)object2).toString();
            i.d(object, "string(...)");
            return object;
        }
        object3 = ((X)object).b();
        object = new StringBuilder("\u83b7\u53d6\u4e0b\u8f7d\u94fe\u63a5\u5931\u8d25: HTTP\u72b6\u6001\u7801=");
        ((StringBuilder)object).append(n2);
        ((StringBuilder)object).append(", \u54cd\u5e94=");
        ((StringBuilder)object).append((String)object3);
        object2 = new Exception(((StringBuilder)object).toString());
        throw object2;
        m.o("\u83b7\u53d6\u4e0b\u8f7d\u94fe\u63a5\u65f6\u53d1\u751f\u9519\u8bef: ", exception2.getMessage());
        throw exception2;
    }

    public static com.github.catvod.spider.merge.xc.e0.i F(com.github.catvod.spider.merge.xc.e0.g g2, com.github.catvod.spider.merge.xc.e0.i i2) {
        i.e(i2, "context");
        return com.github.catvod.spider.merge.xc.a.a.s(g2, i2);
    }

    public static void I(Runnable runnable, int n2) {
        runnable = new s(runnable, n2);
        n2 = n2 == 0 ? 450 : 350;
        InitOrigin.run((Runnable)runnable, (int)n2);
    }

    public static void J(String string) {
        b.L(string.concat("\u672a\u6388\u6743"), "\u8bf7\u5728\u914d\u7f6e\u4e2d\u5fc3\u5b8c\u6210\u7f51\u76d8\u6388\u6743\u540e\u7ee7\u7eed\u4f7f\u7528\u3002");
    }

    public static void K(AlertDialog alertDialog, LinearLayout linearLayout, int n2) {
        alertDialog.show();
        alertDialog.setContentView((View)linearLayout);
        com.github.catvod.spider.merge.xc.a.a.B(alertDialog);
        alertDialog = alertDialog.getWindow();
        if (alertDialog != null) {
            alertDialog.setLayout(Math.min(C.j(n2), InitOrigin.context().getResources().getDisplayMetrics().widthPixels - C.j(40)), -2);
        }
    }

    public static void L(String string, String string2) {
        b.I(new n(0, string, string2), 0);
    }

    public static String M(String string, HashMap serializable) {
        serializable = (Integer)((HashMap)serializable).get(string);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(com.github.catvod.spider.merge.KT.B.m(string));
        stringBuilder.append(" ");
        int n2 = serializable == null ? com.github.catvod.spider.merge.KT.B.p(string) : (Integer)serializable;
        stringBuilder.append(n2);
        stringBuilder.append("\u7ebf\u7a0b");
        return stringBuilder.toString();
    }

    public static TextView N(String string) {
        TextView textView = new TextView((Context)InitOrigin.context());
        textView.setText((CharSequence)string);
        textView.setTextColor(Color.rgb((int)17, (int)24, (int)39));
        textView.setTextSize(20.0f);
        textView.setTypeface(Typeface.DEFAULT, 1);
        textView.setGravity(16);
        return textView;
    }

    public static void O(o o2, com.github.catvod.spider.merge.xc.F0.q q2) {
        b.A(q2);
        com.github.catvod.spider.merge.xc.F0.q q3 = q2;
        int n2 = 0;
        while (q3 != null) {
            com.github.catvod.spider.merge.xc.F0.q q4 = q3.a;
            int n3 = q4 != null ? q4.f() : 0;
            com.github.catvod.spider.merge.xc.F0.q q5 = q3.n();
            o2.c(q3, n2);
            com.github.catvod.spider.merge.xc.F0.q q6 = q3;
            if (q4 != null) {
                if (q3.a != null) {
                    q6 = q3;
                } else if (n3 == q4.f()) {
                    n3 = q3.b;
                    q6 = (com.github.catvod.spider.merge.xc.F0.q)q4.j().get(n3);
                } else {
                    if (q5 == null) {
                        --n2;
                        q3 = q4;
                        continue;
                    }
                    q3 = q5;
                    continue;
                }
            }
            q3 = q6;
            if (q6.f() > 0) {
                q3 = (com.github.catvod.spider.merge.xc.F0.q)q6.j().get(0);
                continue;
            }
            for (n3 = n2++; q3.n() == null && n3 > 0; --n3) {
                o2.b(q3, n3);
                q3 = q3.a;
            }
            o2.b(q3, n3);
            if (q3 == q2) break;
            q3 = q3.n();
            n2 = n3;
        }
    }

    public static Activity P() {
        Exception exception2;
        block5: {
            block4: {
                boolean bl;
                Activity activity;
                try {
                    activity = InitOrigin.getActivity();
                    if (activity == null) break block4;
                }
                catch (Exception exception2) {}
                if (activity.isFinishing()) break block4;
                if (Build.VERSION.SDK_INT >= 17 && (bl = N.r(activity))) {
                    return null;
                }
                break block5;
                return activity;
            }
            return null;
        }
        m.m(exception2, new StringBuilder("PanConfigCenter getActivity error: "));
        return null;
    }

    public static ContextWrapper Q() {
        Activity activity = b.P();
        if (activity == null) {
            activity = InitOrigin.context();
        }
        return activity;
    }

    public static LinearLayout.LayoutParams R() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
        layoutParams.setMargins(C.j(4), 0, C.j(4), 0);
        return layoutParams;
    }

    /*
     * Exception decompiling
     */
    public static String a(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [2 : 251->261)] java.lang.Exception
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static void b(LinearLayout linearLayout, int n2) {
        linearLayout.addView(new View((Context)InitOrigin.context()), (ViewGroup.LayoutParams)new LinearLayout.LayoutParams(1, C.j(n2)));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void c(Throwable throwable, Throwable throwable2) {
        i.e(throwable, "<this>");
        i.e(throwable2, "exception");
        if (throwable == throwable2) return;
        Object object = com.github.catvod.spider.merge.xc.i0.a.a;
        if (object != null && (Integer)object < 19) {
            object = com.github.catvod.spider.merge.xc.h0.a.a;
            if (object == null) return;
            ((Method)object).invoke(throwable, throwable2);
            return;
        }
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(throwable, throwable2);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static void d(Button var0, boolean var1_1, boolean var2_2) {
        if (var2_2) {
            var4_3 = 11;
            var6_4 = 245;
            var5_5 = 158;
lbl5:
            // 2 sources

            while (true) {
                var5_5 = Color.rgb((int)var6_4, (int)var5_5, (int)var4_3);
                break;
            }
        } else if (var1_1) {
            var5_5 = Color.rgb((int)37, (int)99, (int)235);
        } else {
            var4_3 = 246;
            var6_4 = 243;
            var5_5 = 244;
            ** continue;
        }
        var4_3 = var2_2 != false ? Color.rgb((int)180, (int)83, (int)9) : (var1_1 != false ? Color.rgb((int)37, (int)99, (int)235) : Color.rgb((int)229, (int)231, (int)235));
        var6_4 = -1;
        if (!var2_2 && !var1_1) {
            var6_4 = Color.rgb((int)31, (int)41, (int)55);
        }
        var0.setTextColor(var6_4);
        var3_6 = C.j(12);
        var6_4 = var2_2 != false ? 3 : 1;
        var0.setBackground((Drawable)com.github.catvod.spider.merge.xc.a.a.v(var5_5, var3_6, var4_3, C.j(var6_4)));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void e(LinearLayout linearLayout, boolean bl, boolean bl2) {
        int n2;
        int n3;
        int n4;
        if (bl2) {
            n4 = 254;
            n3 = 219;
            n2 = 234;
        } else if (bl) {
            n4 = 255;
            n3 = 232;
            n2 = 244;
        } else {
            n4 = 251;
            n3 = 249;
            n2 = 250;
        }
        int n5 = Color.rgb((int)n3, (int)n2, (int)n4);
        if (bl2) {
            n2 = 11;
            n4 = 245;
            n3 = 158;
        } else {
            n2 = 235;
            if (bl) {
                n4 = 37;
                n3 = 99;
            } else {
                n4 = 229;
                n3 = 231;
            }
        }
        n3 = Color.rgb((int)n4, (int)n3, (int)n2);
        n4 = bl2 ? 3 : (bl ? 2 : 1);
        n4 = C.j(n4);
        linearLayout.setBackground((Drawable)com.github.catvod.spider.merge.xc.a.a.v(n5, C.j(12), n3, n4));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void f(EditText editText, boolean bl) {
        int n2;
        int n3;
        int n4;
        editText.setTextColor(Color.rgb((int)17, (int)24, (int)39));
        editText.setHintTextColor(Color.rgb((int)107, (int)114, (int)128));
        if (bl) {
            n4 = 255;
            n3 = 239;
            n2 = 246;
        } else {
            n4 = 251;
            n3 = 249;
            n2 = 250;
        }
        int n5 = Color.rgb((int)n3, (int)n2, (int)n4);
        float f2 = C.j(12);
        if (bl) {
            n3 = 11;
            n4 = 245;
            n2 = 158;
        } else {
            n3 = 235;
            n4 = 37;
            n2 = 99;
        }
        n3 = Color.rgb((int)n4, (int)n2, (int)n3);
        n4 = bl ? 3 : 1;
        editText.setBackground((Drawable)com.github.catvod.spider.merge.xc.a.a.v(n5, f2, n3, C.j(n4)));
    }

    public static Button g(String string, boolean bl) {
        Button button = new Button((Context)InitOrigin.context());
        button.setText((CharSequence)string);
        button.setTextSize(14.0f);
        button.setAllCaps(false);
        button.setFocusable(true);
        button.setFocusableInTouchMode(true);
        b.d(button, bl, false);
        button.setOnFocusChangeListener((View.OnFocusChangeListener)new com.github.catvod.spider.merge.xc.U.c((View)button, bl, 0));
        return button;
    }

    public static LinearLayout h(ContextWrapper contextWrapper, int n2, int n3) {
        contextWrapper = new LinearLayout((Context)contextWrapper);
        contextWrapper.setOrientation(1);
        contextWrapper.setPadding(C.j(n2), C.j(22), C.j(n3), C.j(20));
        contextWrapper.setBackground((Drawable)com.github.catvod.spider.merge.xc.a.a.u(-1, C.j(20)));
        return contextWrapper;
    }

    public static String l(String arrayList, String string) {
        Integer n2 = 1;
        if (string != null && string.length() > 0 && !"1".equals(string)) {
            return g.o(n2, n2, 0, 0, new ArrayList());
        }
        if ("__pan_quark__".equals(arrayList)) {
            arrayList = b.D("pan_config_quark_login", "pan_config_quark_clear", "quark", "https://d.kstore.dev/download/6741/jar/png/kuake.png", "Cookie\u914d\u7f6e");
        } else if ("__pan_uc__".equals(arrayList)) {
            arrayList = b.D("pan_config_uc_login", "pan_config_uc_clear", "uc", "https://d.kstore.dev/download/6741/jar/png/UC.png", "Cookie\u914d\u7f6e");
        } else if ("__pan_baidu__".equals(arrayList)) {
            arrayList = b.D("pan_config_baidu_login", "pan_config_baidu_clear", "baidu", "https://d.kstore.dev/download/6741/jar/png/baidu.png", "Cookie\u914d\u7f6e");
        } else if ("__pan_ali__".equals(arrayList)) {
            arrayList = b.D("pan_config_ali_login", "pan_config_ali_clear", "ali", "https://d.kstore.dev/download/6741/jar/png/ali.png", "Cookie\u914d\u7f6e");
        } else if ("__pan_tianyi__".equals(arrayList)) {
            arrayList = b.D("pan_config_tianyi_login", "pan_config_tianyi_clear", "tianyi", "https://d.kstore.dev/download/6741/jar/png/tianyi.png", "Cookie\u914d\u7f6e");
        } else if ("__pan_yidong__".equals(arrayList)) {
            arrayList = b.D("pan_config_yidong_enable", "pan_config_yidong_clear", "yidong", "https://d.kstore.dev/download/6741/jar/png/yidong.png", "\u6388\u6743\u8bbe\u7f6e");
        } else if ("__pan_123__".equals(arrayList)) {
            arrayList = b.D("pan_config_pan123_login", "pan_config_pan123_clear", "pan123", "https://d.kstore.dev/download/6741/jar/png/123.png", "\u8d26\u53f7\u914d\u7f6e");
        } else if ("__pan_xunlei__".equals(arrayList)) {
            arrayList = b.D("pan_config_xunlei_login", "pan_config_xunlei_clear", "xunlei", "https://d.kstore.dev/download/6741/jar/png/xunlei.png", "\u8d26\u53f7\u914d\u7f6e");
        } else if ("__pan_guangya__".equals(arrayList)) {
            arrayList = b.D("pan_config_guangya_login", "pan_config_guangya_clear", "guangya", "https://d.kstore.dev/download/6741/jar/png/GY.png", "\u6388\u6743\u914d\u7f6e");
        } else if ("__pan_115__".equals(arrayList)) {
            arrayList = b.D("pan_config_pan115_login", "pan_config_pan115_clear", "pan115", "https://d.kstore.dev/download/6741/jar/png/115.png", "Cookie\u914d\u7f6e");
        } else {
            arrayList = new ArrayList();
            arrayList.add(b.s("pan_config_enable", "\u7f51\u76d8\u542f\u7528", "https://d.kstore.dev/download/6741/jar/png/qy.png", "\u9009\u62e9\u64ad\u653e\u7ebf\u8def\u53ef\u663e\u793a\u7684\u7f51\u76d8"));
            arrayList.add(b.s("pan_config_thread", "\u7ebf\u7a0b\u8bbe\u7f6e", "https://d.kstore.dev/download/6741/jar/png/xc.png", "\u8c03\u6574\u5404\u7f51\u76d8\u4e0b\u8f7d\u7ebf\u7a0b\u6570\u91cf"));
            arrayList.add(b.s("pan_config_go_proxy", "Go\u4ee3\u7406", "https://d.kstore.dev/download/6741/jar/png/sz.png", "\u624b\u673a\u3001\u7535\u89c6\u3001\u6a21\u62df\u5668\u672c\u5730\u4ee3\u7406"));
            arrayList.add(b.s("pan_config_xenc_password", "XENC\u89e3\u5bc6\u5bc6\u7801", "https://d.kstore.dev/download/6741/jar/png/xc.png", "\u8bbe\u7f6e\u52a0\u5bc6\u89c6\u9891\u64ad\u653e\u5bc6\u7801"));
        }
        return g.o(n2, n2, arrayList.size(), arrayList.size(), arrayList);
    }

    public static com.github.catvod.spider.merge.xc.e0.g m(com.github.catvod.spider.merge.xc.e0.g g2, h h2) {
        i.e(h2, "key");
        if (!i.a(g2.getKey(), h2)) {
            g2 = null;
        }
        return g2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final Class n(com.github.catvod.spider.merge.xc.p0.c clazz) {
        i.e(clazz, "<this>");
        clazz = ((com.github.catvod.spider.merge.mI.c)((Object)clazz)).a();
        if (!clazz.isPrimitive()) {
            return clazz;
        }
        switch (clazz.getName()) {
            default: {
                return clazz;
            }
            case "short": {
                return Short.class;
            }
            case "float": {
                return Float.class;
            }
            case "boolean": {
                return Boolean.class;
            }
            case "void": {
                return Void.class;
            }
            case "long": {
                return Long.class;
            }
            case "char": {
                return Character.class;
            }
            case "byte": {
                return Byte.class;
            }
            case "int": {
                return Integer.class;
            }
            case "double": 
        }
        return Double.class;
    }

    /*
     * Unable to fully structure code
     */
    public static Map o(String var0) {
        i.e(var0, "url");
        SpiderDebug.log((String)"123\u94fe\u63a5\uff1a".concat((String)var0));
        var1_1 = URLDecoder.decode((String)var0, "UTF-8");
        i.b(var1_1);
        var0 = var1_1;
        if (e.M((CharSequence)var1_1, "\u63d0\u53d6\u7801", false)) {
            var0 = var1_1;
            if (!e.M((CharSequence)var1_1, "?", false)) {
                var0 = Pattern.compile("\u63d0\u53d6\u7801[:\uff1a]");
                i.d(var0, "compile(...)");
                var0 = var0.matcher((CharSequence)var1_1).replaceAll("?");
                i.d(var0, "replaceAll(...)");
            }
        }
        var1_1 = var0;
        if (e.M((CharSequence)var0, "\u63d0\u53d6\u7801", false)) {
            var1_1 = var0;
            if (e.M((CharSequence)var0, "?", false)) {
                var1_1 = Pattern.compile("\u63d0\u53d6\u7801[:\uff1a]?");
                i.d(var1_1, "compile(...)");
                var1_1 = var1_1.matcher((CharSequence)var0).replaceAll("");
                i.d(var1_1, "replaceAll(...)");
            }
        }
        var0 = var1_1;
        if (e.M((CharSequence)var1_1, "\uff1a", false)) {
            var0 = com.github.catvod.spider.merge.xc.r0.m.K((String)var1_1, "\uff1a", "");
        }
        var3_2 = Pattern.compile("https://(123592\\.com|123912\\.com|123865\\.com|123684\\.com|www\\.123684\\.com|www\\.123865\\.com|www\\.123912\\.com|www\\.123pan\\.com|www\\.123pan\\.cn|www\\.123592\\.com)/s/([^/]+)").matcher((CharSequence)var0);
        if (!e.M((CharSequence)var0, "?", false)) ** GOTO lbl-1000
        var1_1 = (String)e.Y((CharSequence)var0, new String[]{"?"}, 0, 6).get(1);
        var0 = Pattern.compile("[A-Za-z0-9]+");
        i.d(var0, "compile(...)");
        i.e(var1_1, "input");
        var0 = var0.matcher((CharSequence)var1_1);
        i.d(var0, "matcher(...)");
        var0 = var0.find(0) == false ? null : new D((Matcher)var0, (CharSequence)var1_1);
        if (var0 != null) {
            var2_3 = (String)e.Y((CharSequence)var1_1, new String[]{"="}, 0, 6).get(1);
        } else lbl-1000:
        // 2 sources

        {
            var2_3 = "";
        }
        if (var3_2.find()) {
            var1_1 = var0 = var3_2.group(2);
            if (var0 == null) {
                var1_1 = "";
            }
            if (e.M((CharSequence)var1_1, "?", false)) {
                var0 = (String)e.Y((CharSequence)var1_1, new String[]{"?"}, 0, 6).get(0);
            } else if (e.M((CharSequence)var1_1, ".html", false)) {
                var0 = com.github.catvod.spider.merge.xc.r0.m.K((String)var1_1, ".html", "");
            } else {
                var0 = var1_1;
                if (e.M((CharSequence)var1_1, "www", false) && (var0 = var3_2.group(1)) == null) {
                    var0 = var1_1;
                }
            }
            return v.U(new com.github.catvod.spider.merge.xc.c0.b[]{new com.github.catvod.spider.merge.xc.c0.b("key", var0), new com.github.catvod.spider.merge.xc.c0.b("sharePwd", var2_3)});
        }
        return r.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List p(String object, String object2, int n2, long l2) {
        int n3;
        Object object3;
        Object object4;
        Object object5;
        ArrayList<Object> arrayList;
        ArrayList<Object> arrayList2;
        block9: {
            Exception exception2;
            q q2;
            block8: {
                q2 = q.a;
                arrayList2 = new ArrayList<Object>();
                arrayList = new ArrayList<Object>();
                object5 = ((Object)e.f0((CharSequence)object)).toString();
                object4 = ((String)object2).length() == 0 ? "" : object2;
                object3 = new StringBuilder("https://www.123684.com/b/api/share/get?limit=100&next=");
                ((StringBuilder)object3).append(n2);
                ((StringBuilder)object3).append("&orderBy=file_name&orderDirection=asc&shareKey=");
                ((StringBuilder)object3).append((String)object5);
                ((StringBuilder)object3).append("&SharePwd=");
                ((StringBuilder)object3).append(object4);
                ((StringBuilder)object3).append("&ParentFileId=");
                ((StringBuilder)object3).append(l2);
                ((StringBuilder)object3).append("&Page=1");
                object4 = ((StringBuilder)object3).toString();
                try {
                    object5 = new com.github.catvod.spider.merge.xc.c0.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Safari/537.36");
                    object4 = C.R(A.o((String)object4, null, v.T((com.github.catvod.spider.merge.xc.c0.b)object5)));
                    if (object4.has("code") && object4.get("code").getAsInt() == 5103) {
                        object2 = object4.get("message").getAsString();
                        object = new StringBuilder("123\u83b7\u53d6\u6587\u4ef6\u5217\u8868\u51fa\u9519\uff1a");
                        ((StringBuilder)object).append((String)object2);
                        SpiderDebug.log((String)((StringBuilder)object).toString());
                        return q2;
                    }
                }
                catch (Exception exception2) {
                    break block8;
                }
                if ((object4 = object4.getAsJsonObject("data")).get("Len").getAsLong() <= 0L) {
                    return q2;
                }
                n3 = object4.get("Next").getAsInt();
                object4 = object4.getAsJsonArray("InfoList").iterator();
                i.d(object4, "iterator(...)");
                break block9;
            }
            m.o("\u83b7\u53d6\u5206\u4eab\u4fe1\u606f\u65f6\u53d1\u751f\u9519\u8bef: ", exception2.getMessage());
            return q2;
        }
        while (object4.hasNext()) {
            Object object6;
            long l3;
            String string;
            object5 = ((JsonElement)object4.next()).getAsJsonObject();
            n2 = object5.get("Category").getAsInt();
            if (n2 == 0) {
                string = object5.get("FileName").getAsString();
                i.d(string, "getAsString(...)");
                l2 = object5.get("FileId").getAsLong();
                object3 = object5.get("S3KeyFlag").getAsString();
                i.d(object3, "getAsString(...)");
                l3 = object5.get("Size").getAsLong();
                object5 = object5.get("Etag").getAsString();
                i.d(object5, "getAsString(...)");
                object6 = new com.github.catvod.spider.merge.xc.K.b(string, (String)object, (String)object2, n3, l2, (String)object3, l3, (String)object5);
                arrayList2.add(object6);
                continue;
            }
            if (object5.get("Category").getAsInt() == 0) continue;
            string = object5.get("FileName").getAsString();
            i.d(string, "getAsString(...)");
            l3 = object5.get("FileId").getAsLong();
            object6 = object5.get("S3KeyFlag").getAsString();
            i.d(object6, "getAsString(...)");
            l2 = object5.get("Size").getAsLong();
            object5 = object5.get("Etag").getAsString();
            i.d(object5, "getAsString(...)");
            object3 = new com.github.catvod.spider.merge.xc.K.b(string, (String)object, (String)object2, n3, l3, (String)object6, l2, (String)object5);
            arrayList.add(object3);
        }
        object = arrayList2.iterator();
        while (object.hasNext()) {
            object2 = (com.github.catvod.spider.merge.xc.K.b)object.next();
            arrayList.addAll(b.p(((com.github.catvod.spider.merge.xc.K.b)object2).b, ((com.github.catvod.spider.merge.xc.K.b)object2).c, ((com.github.catvod.spider.merge.xc.K.b)object2).d, ((com.github.catvod.spider.merge.xc.K.b)object2).e));
        }
        return arrayList;
    }

    public static k q(String string, String string2) {
        Object object;
        i.e(string, "key");
        i.e(string2, "sharePwd");
        Object object2 = b.p(string, string2, 0, 0L);
        Object object3 = new D();
        Object object4 = new ArrayList();
        object2 = object2.iterator();
        while (object2.hasNext()) {
            Object object5 = (com.github.catvod.spider.merge.xc.K.b)object2.next();
            object = new j();
            CharSequence charSequence = m.i("[", H.i(((com.github.catvod.spider.merge.xc.K.b)object5).g), "]");
            charSequence.append(((com.github.catvod.spider.merge.xc.K.b)object5).a);
            ((j)object).a = charSequence.toString();
            long l2 = ((com.github.catvod.spider.merge.xc.K.b)object5).e;
            long l3 = ((com.github.catvod.spider.merge.xc.K.b)object5).g;
            String string3 = ((com.github.catvod.spider.merge.xc.K.b)object5).f;
            charSequence = ((com.github.catvod.spider.merge.xc.K.b)object5).h;
            object5 = Arrays.asList(((com.github.catvod.spider.merge.xc.K.b)object5).b, l2, string3, l3, charSequence);
            i.d(object5, "asList(...)");
            ((j)object).b = com.github.catvod.spider.merge.xc.d0.i.K((Iterable)object5, "\\+\\+", null, null, null, 62);
            ((ArrayList)object4).add(object);
        }
        object2 = (new String[]{"\u539f\u753b"})[0];
        object = new StringBuilder("123\u4e91\u76d8");
        ((StringBuilder)object).append((String)object2);
        ((D)object3).a(((StringBuilder)object).toString(), (ArrayList)object4);
        object4 = ((D)object3).d();
        object3 = new k();
        object2 = new StringBuilder();
        ((StringBuilder)object2).append(string);
        ((StringBuilder)object2).append("++");
        ((StringBuilder)object2).append(string2);
        ((k)object3).l(((StringBuilder)object2).toString());
        ((k)object3).n("");
        ((k)object3).s("");
        ((k)object3).m("");
        ((k)object3).j("");
        ((k)object3).o(((B)object4).b);
        ((k)object3).p(((B)object4).c);
        return object3;
    }

    public static void r(boolean bl) {
        if (bl) {
            return;
        }
        throw new c("Must be true");
    }

    public static k s(String string, String string2, String string3, String string4) {
        return new k(string, string2, string3, string4, new com.github.catvod.spider.merge.MP.i(Float.valueOf(1.0f)), string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static JsonObject t(String object, String object2) {
        Exception exception2;
        block5: {
            int n2;
            Object object3;
            block4: {
                i.e(object, "passport");
                i.e(object2, "password");
                object3 = v.U(new com.github.catvod.spider.merge.xc.c0.b("passport", object), new com.github.catvod.spider.merge.xc.c0.b("password", object2), new com.github.catvod.spider.merge.xc.c0.b("remember", Boolean.TRUE));
                object2 = v.U(new com.github.catvod.spider.merge.xc.c0.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Safari/537.36"), new com.github.catvod.spider.merge.xc.c0.b("Content-Type", "application/json"), new com.github.catvod.spider.merge.xc.c0.b("App-Version", "43"), new com.github.catvod.spider.merge.xc.c0.b("Referer", "https://login.123pan.com/centerlogin?redirect_url=https%3A%2F%2Fwww.123684.com&source_page=website"), new com.github.catvod.spider.merge.xc.c0.b("Accept", "application/json, text/plain, */*"), new com.github.catvod.spider.merge.xc.c0.b("Origin", "https://login.123pan.com"), new com.github.catvod.spider.merge.xc.c0.b("Connection", "keep-alive"), new com.github.catvod.spider.merge.xc.c0.b("Accept-Language", "zh-CN,zh;q=0.9"));
                try {
                    object2 = A.k("https://login.123pan.com/api/user/sign_in", C.Z(object3), (Map)object2);
                    SpiderDebug.log((String)"\u767b\u5f55\u8bf7\u6c42\u4fe1\u606f\uff1a");
                    SpiderDebug.log((String)"URL: https://login.123pan.com/api/user/sign_in");
                    SpiderDebug.log((String)"\u8d26\u53f7: ".concat((String)object));
                    object3 = ((X)object2).b();
                    object = new StringBuilder("\u54cd\u5e94\u5185\u5bb9: ");
                    ((StringBuilder)object).append((String)object3);
                    SpiderDebug.log((String)((StringBuilder)object).toString());
                    n2 = ((X)object2).a;
                    if (n2 != 200) break block4;
                }
                catch (Exception exception2) {
                    break block5;
                }
                object = C.R(((X)object2).b());
                object3 = new StringBuilder("\u89e3\u6790\u540e\u7684\u54cd\u5e94\u6570\u636e: ");
                ((StringBuilder)object3).append(object);
                SpiderDebug.log((String)((StringBuilder)object3).toString());
                if (object.has("data") && object.getAsJsonObject("data").has("token")) {
                    object2 = object.getAsJsonObject("data").get("token").getAsString();
                    SpiderDebug.log((String)"\u767b\u5f55\u6210\u529f");
                    a = object2;
                    return object.get("data").getAsJsonObject();
                }
            }
            object3 = ((X)object2).b();
            object2 = new StringBuilder("\u767b\u5f55\u5931\u8d25: HTTP\u72b6\u6001\u7801=");
            ((StringBuilder)object2).append(n2);
            ((StringBuilder)object2).append(", \u54cd\u5e94=");
            ((StringBuilder)object2).append((String)object3);
            object = new Exception(((StringBuilder)object2).toString());
            throw object;
        }
        m.o("\u767b\u5f55\u8fc7\u7a0b\u4e2d\u53d1\u751f\u9519\u8bef: ", exception2.getMessage());
        throw exception2;
    }

    public static String u(String string) {
        string = string != null ? string.toLowerCase(Locale.ENGLISH) : "";
        return string;
    }

    public static TextView v(String string) {
        TextView textView = new TextView((Context)InitOrigin.context());
        textView.setText((CharSequence)string);
        textView.setTextColor(Color.rgb((int)75, (int)85, (int)99));
        textView.setTextSize(14.0f);
        textView.setLineSpacing((float)C.j(2), 1.0f);
        textView.setPadding(0, C.j(8), 0, 0);
        return textView;
    }

    public static com.github.catvod.spider.merge.xc.e0.i w(com.github.catvod.spider.merge.xc.e0.g g2, h h2) {
        i.e(h2, "key");
        com.github.catvod.spider.merge.xc.e0.i i2 = g2;
        if (i.a(g2.getKey(), h2)) {
            i2 = com.github.catvod.spider.merge.xc.e0.j.a;
        }
        return i2;
    }

    public static String x(String string) {
        return b.u(string).trim();
    }

    public static void y(String string) {
        if (string != null && string.length() != 0) {
            return;
        }
        throw new c("String must not be empty");
    }

    public static void z(String string, String string2) {
        if (string != null && string.length() != 0) {
            return;
        }
        throw new c(string2);
    }

    public abstract void G(f var1, f var2);

    public abstract void H(f var1, Thread var2);

    public abstract boolean i(com.github.catvod.spider.merge.xc.g.g var1, com.github.catvod.spider.merge.xc.g.c var2, com.github.catvod.spider.merge.xc.g.c var3);

    public abstract boolean j(com.github.catvod.spider.merge.xc.g.g var1, Object var2, Object var3);

    public abstract boolean k(com.github.catvod.spider.merge.xc.g.g var1, f var2, f var3);
}

