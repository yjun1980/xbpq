/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.graphics.Color
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.GradientDrawable
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  android.text.TextUtils$TruncateAt
 *  android.view.KeyEvent
 *  android.view.KeyEvent$Callback
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnFocusChangeListener
 *  android.view.View$OnKeyListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.WindowManager$LayoutParams
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.Button
 *  android.widget.EditText
 *  android.widget.GridLayout
 *  android.widget.GridLayout$LayoutParams
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.ScrollView
 *  android.widget.TextView
 *  com.github.catvod.crawler.SpiderDebug
 */
package com.github.catvod.spider.merge.KT;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.KT.f;
import com.github.catvod.spider.merge.KT.g;
import com.github.catvod.spider.merge.KT.j;
import com.github.catvod.spider.merge.KT.k;
import com.github.catvod.spider.merge.KT.n;
import com.github.catvod.spider.merge.KT.o;
import com.github.catvod.spider.merge.KT.p;
import com.github.catvod.spider.merge.KT.q;
import com.github.catvod.spider.merge.KT.s;
import com.github.catvod.spider.merge.xc.U.E;
import com.github.catvod.spider.merge.xc.U.b;
import com.github.catvod.spider.merge.xc.U.i;
import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;

public abstract class t {
    public static volatile boolean a;

    public static void a(Activity activity) {
        String string;
        if (activity != null && ((string = activity.getClass().getName().toLowerCase(Locale.ROOT)).endsWith(".videoactivity") || string.contains("videoactivity"))) {
            Init.run(new q(activity, 0), 800);
            Init.run(new q(activity, 1), 2000);
        }
    }

    public static Button b(Activity activity, String string, boolean bl) {
        Button button = new Button((Context)activity);
        button.setText((CharSequence)string);
        button.setAllCaps(false);
        button.setFocusable(true);
        button.setFocusableInTouchMode(true);
        button.setTextSize(15.0f);
        t.t(activity, button, bl, false);
        button.setOnFocusChangeListener((View.OnFocusChangeListener)new k(activity, (TextView)button, bl, 0));
        return button;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void c(Activity object, String object2) {
        if (TextUtils.isEmpty((CharSequence)object2)) {
            return;
        }
        try {
            Class.forName("com.fongmi.android.tv.event.RefreshEvent", true, object.getClass().getClassLoader()).getMethod("danmaku", String.class).invoke(null, object2);
            return;
        }
        catch (Throwable throwable) {
            Throwable throwable22;
            block10: {
                Object object3;
                block11: {
                    m.p(throwable, new StringBuilder("[Doumu] RefreshEvent failed: "));
                    {
                        catch (Throwable throwable22) {
                            break block10;
                        }
                        for (object3 = object.getClass(); object3 != null; object3 = ((Class)object3).getSuperclass()) {
                            try {
                                Method method = ((Class)object3).getDeclaredMethod("player", null);
                                object3 = method;
                                break block11;
                            }
                            catch (Throwable throwable3) {}
                        }
                    }
                    object3 = null;
                }
                if (object3 != null) {
                    ((AccessibleObject)object3).setAccessible(true);
                    object3 = ((Method)object3).invoke(object, null);
                    object = Class.forName("com.fongmi.android.tv.bean.Danmaku", true, object.getClass().getClassLoader());
                    object2 = ((Class)object).getMethod("from", String.class).invoke(null, object2);
                    object3.getClass().getMethod("setDanmaku", new Class[]{object}).invoke(object3, object2);
                    return;
                }
                object = new NoSuchMethodException("player");
                throw object;
            }
            m.p(throwable22, new StringBuilder("[Doumu] apply failed: "));
            return;
        }
    }

    public static TextView d(Activity activity, TextView object) {
        Drawable drawable;
        TextView textView = new TextView((Context)activity);
        textView.setTag((Object)1684895024);
        textView.setText((CharSequence)"\u8c46\u5e55");
        textView.setTextColor(object.getCurrentTextColor());
        textView.setTextSize(0, object.getTextSize());
        textView.setTypeface(object.getTypeface());
        textView.setGravity(17);
        textView.setSingleLine(true);
        textView.setFocusable(object.isFocusable());
        textView.setFocusableInTouchMode(object.isFocusableInTouchMode());
        textView.setClickable(true);
        textView.setMinWidth(object.getMinWidth());
        textView.setMinHeight(object.getMinHeight());
        textView.setMinimumWidth(object.getMinimumWidth());
        textView.setMinimumHeight(object.getMinimumHeight());
        if (Build.VERSION.SDK_INT >= 21) {
            g.r(textView, g.d(object));
            g.q(textView, g.a(object));
        }
        if ((drawable = object.getBackground()) != null && drawable.getConstantState() != null) {
            textView.setBackground(drawable.getConstantState().newDrawable().mutate());
        } else {
            textView.setBackground(object.getBackground());
        }
        textView.setIncludeFontPadding(object.getIncludeFontPadding());
        textView.setPadding(object.getPaddingLeft(), object.getPaddingTop(), object.getPaddingRight(), object.getPaddingBottom());
        object = object.getLayoutParams();
        object = object instanceof LinearLayout.LayoutParams ? new LinearLayout.LayoutParams((LinearLayout.LayoutParams)object) : (object != null ? new ViewGroup.LayoutParams(object.width, object.height) : new ViewGroup.LayoutParams(-2, -2));
        textView.setLayoutParams((ViewGroup.LayoutParams)object);
        textView.setOnClickListener((View.OnClickListener)new i((KeyEvent.Callback)activity, 1));
        return textView;
    }

    public static void e(View view, ArrayList arrayList) {
        TextView textView;
        CharSequence charSequence;
        if (view instanceof TextView && !TextUtils.isEmpty((CharSequence)(charSequence = (charSequence = (textView = (TextView)view).getText()) == null ? "" : charSequence.toString().trim())) && ((String)charSequence).length() <= 8) {
            arrayList.add(textView);
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        view = (ViewGroup)view;
        for (int i2 = 0; i2 < view.getChildCount(); ++i2) {
            t.e(view.getChildAt(i2), arrayList);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String f(Activity object) {
        Object object2 = C.e;
        boolean bl = TextUtils.isEmpty((CharSequence)object2);
        String string = "";
        if (!bl) {
            if (object2 != null) return ((String)object2).replaceAll("[\\[\\(\uff08].*?[\\]\\)\uff09]", "").trim();
            return string;
        }
        object2 = C.a;
        if (!TextUtils.isEmpty((CharSequence)object2)) {
            return ((String)object2).replaceAll("[\\[\\(\uff08].*?[\\]\\)\uff09]", "").trim();
        }
        try {
            object = (ViewGroup)object.findViewById(0x1020002);
            object2 = new ArrayList();
            t.e((View)object, object2);
            object2 = ((ArrayList)object2).iterator();
            do {
                object = string;
                if (!object2.hasNext()) return object;
            } while (!t.o((String)(object = (object = ((TextView)object2.next()).getText()) == null ? "" : object.toString().trim())));
            if (object != null) return ((String)object).replaceAll("[\\[\\(\uff08].*?[\\]\\)\uff09]", "").trim();
            return string;
        }
        catch (Throwable throwable) {
            return string;
        }
    }

    public static int g(Context context, int n2) {
        return (int)((float)n2 * context.getResources().getDisplayMetrics().density + 0.5f);
    }

    public static TextView h(Activity activity, f object, boolean bl) {
        Object object2;
        TextView textView = new TextView((Context)activity);
        CharSequence charSequence = ((f)object).a;
        charSequence = charSequence == null ? "" : ((String)charSequence).replace("\u6309\u8f93\u5165\u76f4\u63a5\u5339\u914d\uff1a", "");
        object = object2 = ((f)object).b;
        if (object2 == null) {
            object = "";
        }
        String string = ((String)object).replaceAll("[^0-9]", "");
        object2 = object;
        if (!string.isEmpty()) {
            try {
                object2 = String.format(Locale.ROOT, "%02d", Integer.parseInt(string));
            }
            catch (Throwable throwable) {
                object2 = object;
            }
        }
        object = object2;
        if (TextUtils.isEmpty((CharSequence)object2)) {
            object = "01";
        }
        object2 = charSequence;
        if (((String)charSequence).length() > 8) {
            object2 = ((String)charSequence).substring(0, 8);
        }
        charSequence = new StringBuilder("\u3010qq&qiyi\u3011 ");
        ((StringBuilder)charSequence).append((String)object2);
        ((StringBuilder)charSequence).append("_");
        ((StringBuilder)charSequence).append((String)object);
        textView.setText((CharSequence)((StringBuilder)charSequence).toString());
        textView.setTextColor(Color.rgb((int)45, (int)45, (int)52));
        textView.setTextSize(14.0f);
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLineSpacing(0.0f, 1.0f);
        textView.setFocusable(true);
        textView.setFocusableInTouchMode(true);
        textView.setClickable(true);
        textView.setOnKeyListener((View.OnKeyListener)new p());
        textView.setPadding(t.g((Context)activity, 6), 0, t.g((Context)activity, 6), 0);
        t.v(activity, textView, bl, false);
        textView.setOnFocusChangeListener((View.OnFocusChangeListener)new k(activity, textView, bl, 1));
        return textView;
    }

    public static TextView i(ViewGroup object) {
        ArrayList arrayList = new ArrayList();
        t.e((View)object, arrayList);
        for (int i2 = 0; i2 < 8; ++i2) {
            String string = (new String[]{"\u5f39\u5e55", "\u5c0f\u767d\u5f39\u5e55", "\u5b57\u5e55", "\u97f3\u8f68", "\u89c6\u8f68", "\u7247\u5934", "\u7247\u5c3e", "\u5237\u65b0"})[i2];
            for (TextView textView : arrayList) {
                object = textView.getText();
                object = object == null ? "" : object.toString().trim();
                if (!string.equals(object)) continue;
                return textView;
            }
        }
        return null;
    }

    public static View j(View view) {
        if (view == null) {
            return null;
        }
        Object object = view.getTag();
        if (object instanceof Integer && (Integer)object == 1684895024) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        object = (ViewGroup)view;
        for (int i2 = 0; i2 < object.getChildCount(); ++i2) {
            view = t.j(object.getChildAt(i2));
            if (view == null) continue;
            return view;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static GridLayout.LayoutParams k(Activity activity, int n2) {
        GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
        int n3 = (int)((float)activity.getResources().getDisplayMetrics().widthPixels * 0.82f);
        int n4 = t.g((Context)activity, 56);
        int n5 = n2 >= 4 ? 128 : 158;
        n5 = t.g((Context)activity, n5);
        layoutParams.width = Math.max(n5, (n3 - n4) / Math.max(1, n2) - t.g((Context)activity, 8));
        layoutParams.height = t.g((Context)activity, 62);
        layoutParams.setMargins(0, 0, t.g((Context)activity, 8), t.g((Context)activity, 8));
        return layoutParams;
    }

    public static boolean l(s s2, int n2, KeyEvent keyEvent) {
        boolean bl = Boolean.TRUE.equals(s2.getTag());
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        if (keyEvent.getAction() == 1 && (n2 == 4 || n2 == 111)) {
            s2.setTag(Boolean.FALSE);
            return false;
        }
        if (n2 == 19 || n2 == 20) {
            bl2 = true;
        }
        return bl2;
    }

    public static void m(Activity activity) {
        block7: {
            if (activity != null) {
                Throwable throwable2;
                block11: {
                    block8: {
                        TextView textView;
                        ViewGroup viewGroup;
                        block10: {
                            block9: {
                                try {
                                    if (activity.isFinishing()) break block7;
                                    viewGroup = (ViewGroup)activity.findViewById(0x1020002);
                                    if (viewGroup == null) break block8;
                                }
                                catch (Throwable throwable2) {
                                    break block11;
                                }
                                if (t.j((View)viewGroup) != null) break block8;
                                textView = t.i(viewGroup);
                                if (textView != null) break block9;
                                viewGroup = null;
                                break block10;
                            }
                            viewGroup = (ViewGroup)textView.getParent();
                        }
                        if (viewGroup == null) {
                            return;
                        }
                        viewGroup.addView((View)t.d(activity, textView), Math.min(viewGroup.indexOfChild((View)textView) + 1, viewGroup.getChildCount()));
                        SpiderDebug.log((String)"[Doumu] button injected");
                    }
                    return;
                }
                m.p(throwable2, new StringBuilder("[Doumu] inject failed: "));
            }
        }
    }

    public static s n(Activity activity, String string, String string2) {
        s s2 = new s((Context)activity);
        s2.setSingleLine(true);
        s2.setInputType(1);
        s2.setFocusable(true);
        s2.setFocusableInTouchMode(true);
        String string3 = string2;
        if (string2 == null) {
            string3 = "";
        }
        s2.setText(string3);
        s2.setSelectAllOnFocus(true);
        s2.setHint(string);
        s2.setTextSize(16.0f);
        s2.setTextColor(Color.rgb((int)31, (int)35, (int)45));
        s2.setHintTextColor(Color.rgb((int)132, (int)136, (int)148));
        s2.setPadding(t.g((Context)activity, 14), 0, t.g((Context)activity, 14), 0);
        t.w(activity, s2, false);
        s2.setOnClickListener(new b(activity, (TextView)s2, 2));
        s2.setOnKeyListener(new n(activity, s2));
        s2.setOnFocusChangeListener(new j(activity, s2));
        return s2;
    }

    public static boolean o(String string) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return false;
        }
        return !((string = string.trim()).length() <= 1 || string.length() >= 40 || string.equals("\u8c46\u5e55") || string.contains(":") || string.contains("\uff1a") || string.contains("\u627e\u4e0d\u5230") || string.contains("\u6682\u65e0") || string.contains("\u6ca1\u6709") || string.contains("\u52a0\u8f7d") || string.contains("\u5931\u8d25") || string.equals("\u641c\u7d22") || string.equals("\u53d6\u6d88") || string.equals("\u786e\u5b9a") || string.equals("\u8fd4\u56de"));
        {
        }
    }

    public static LinearLayout.LayoutParams p(int n2, int n3, int n4, int n5, int n6) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(n2, n3);
        layoutParams.setMargins(n4, n5, n6, 0);
        return layoutParams;
    }

    public static void q(Activity activity, AlertDialog alertDialog, String string, String string2) {
        String string3 = "";
        string = string == null ? "" : string.trim();
        string2 = string2 == null ? string3 : string2.trim();
        if (string.isEmpty()) {
            return;
        }
        Init.execute(new com.github.catvod.spider.merge.xc.U.g(string, alertDialog, activity, (Serializable)((Object)string2), 1));
    }

    public static void r(Activity activity, EditText editText) {
        block3: {
            editText.setTag((Object)Boolean.TRUE);
            editText.requestFocus();
            activity = (InputMethodManager)activity.getSystemService("input_method");
            if (activity == null) break block3;
            try {
                activity.showSoftInput((View)editText, 2);
            }
            catch (Throwable throwable) {
                m.p(throwable, new StringBuilder("[Doumu] keyboard failed: "));
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void s(Activity object, String object2, String string, ArrayList object3) {
        int n2;
        TextView textView;
        LinearLayout.LayoutParams layoutParams;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        block10: {
            block9: {
                try {
                    object7 = TextUtils.isEmpty((CharSequence)string) ? "1" : string;
                    object6 = new ArrayList();
                    object5 = new StringBuilder("\u6309\u8f93\u5165\u76f4\u63a5\u5339\u914d\uff1a");
                    ((StringBuilder)object5).append((String)object2);
                    object4 = new f(((StringBuilder)object5).toString(), (String)object7, C.e("danmu", (String)object2, object7, "", ""));
                    ((ArrayList)object6).add(object4);
                    object5 = object3.iterator();
                    break block9;
                }
                catch (Throwable throwable) {}
                m.p(throwable, new StringBuilder("[Doumu] result failed: "));
                return;
            }
            while (object5.hasNext()) {
                object4 = (f)object5.next();
                if (!TextUtils.isEmpty((CharSequence)string)) {
                    object4 = ((f)object4).a;
                    object3 = new f((String)object4, string, C.e("danmu", (String)object4, string, "", ""));
                    ((ArrayList)object6).add(object3);
                    continue;
                }
                ((ArrayList)object6).add(object4);
            }
            if (((ArrayList)object6).isEmpty()) {
                t.c((Activity)object, C.e("danmu", (String)object2, object7, "", ""));
                return;
            }
            object4 = new LinearLayout((Context)object);
            object4.setOrientation(1);
            object4.setPadding(t.g((Context)object, 20), t.g((Context)object, 16), t.g((Context)object, 20), t.g((Context)object, 14));
            object3 = new LinearLayout((Context)object);
            object3.setOrientation(0);
            object3.setGravity(16);
            object7 = t.n((Activity)object, "\u641c\u7d22\u5267\u540d", (String)object2);
            object5 = t.b((Activity)object, "\u641c\u7d22", true);
            layoutParams = new LinearLayout.LayoutParams(0, t.g((Context)object, 54), 1.0f);
            object3.addView((View)object7, (ViewGroup.LayoutParams)layoutParams);
            object3.addView((View)object5, (ViewGroup.LayoutParams)t.p(t.g((Context)object, 92), t.g((Context)object, 54), t.g((Context)object, 12), 0, 0));
            layoutParams = new LinearLayout.LayoutParams(-1, t.g((Context)object, 58));
            object4.addView((View)object3, (ViewGroup.LayoutParams)layoutParams);
            object3 = new TextView((Context)object);
            object3.setText((CharSequence)"\u5168\u90e8\uff08\u672c\u6b21\u83b7\u80dc\u6e90--\u672c\u5730\uff09");
            object3.setTextColor(Color.rgb((int)25, (int)122, (int)220));
            object3.setTextSize(15.0f);
            object3.setTypeface(object3.getTypeface(), 1);
            object4.addView((View)object3, (ViewGroup.LayoutParams)t.p(-1, t.g((Context)object, 32), 0, t.g((Context)object, 14), 0));
            layoutParams = new TextView((Context)object);
            textView = ((ArrayList)object6).iterator();
            while (textView.hasNext()) {
                object3 = (f)textView.next();
                if (TextUtils.isEmpty((CharSequence)((f)object3).a) || ((String)(object3 = ((f)object3).a)).startsWith("\u6309\u8f93\u5165\u76f4\u63a5\u5339\u914d")) continue;
                break block10;
            }
            object3 = object2;
        }
        layoutParams.setText((CharSequence)m.f((String)object3, " from danmu_api"));
        layoutParams.setTextColor(Color.rgb((int)38, (int)38, (int)42));
        layoutParams.setTextSize(17.0f);
        layoutParams.setSingleLine(false);
        layoutParams.setMaxLines(2);
        layoutParams.setEllipsize(TextUtils.TruncateAt.END);
        object3 = new LinearLayout.LayoutParams(-1, t.g((Context)object, 48));
        object4.addView((View)layoutParams, (ViewGroup.LayoutParams)object3);
        layoutParams = new ScrollView((Context)object);
        object3 = new GridLayout((Context)object);
        int n3 = object.getResources().getDisplayMetrics().widthPixels < t.g((Context)object, 760) ? 3 : 4;
        object3.setColumnCount(n3);
        object3.setPadding(0, t.g((Context)object, 4), 0, t.g((Context)object, 4));
        for (n2 = 0; n2 < ((ArrayList)object6).size(); ++n2) {
            f f2 = (f)((ArrayList)object6).get(n2);
            boolean bl = n2 == 0;
            textView = t.h((Activity)object, f2, bl);
            com.github.catvod.spider.merge.xc.U.f f4 = new com.github.catvod.spider.merge.xc.U.f(f2, (Serializable)object2, object, 2);
            textView.setOnClickListener((View.OnClickListener)f4);
            object3.addView((View)textView, (ViewGroup.LayoutParams)t.k((Activity)object, n3));
        }
        layoutParams.addView((View)object3);
        n2 = object.getResources().getDisplayMetrics().heightPixels;
        n3 = t.g((Context)object, 230);
        object2 = new LinearLayout.LayoutParams(-1, Math.max(t.g((Context)object, 188), Math.min(t.g((Context)object, 340), n2 - n3)));
        object4.addView((View)layoutParams, (ViewGroup.LayoutParams)object2);
        object2 = new AlertDialog.Builder((Context)object);
        object2 = object2.setView((View)object4).create();
        object6 = new E((s)((Object)object7), (AlertDialog)object2, (Activity)object, string);
        object5.setOnClickListener((View.OnClickListener)object6);
        object = new o((AlertDialog)object2, (s)((Object)object7));
        object2.setOnShowListener((DialogInterface.OnShowListener)object);
        object2.show();
        object = object7;
        if (object3.getChildCount() > 0) {
            object = object3.getChildAt(0);
        }
        object.getClass();
        object2 = new com.github.catvod.spider.merge.UY.f(7, object);
        object.postDelayed((Runnable)object2, 250L);
    }

    /*
     * Unable to fully structure code
     */
    public static void t(Activity var0, Button var1_1, boolean var2_2, boolean var3_3) {
        if (var3_3) {
            var6_4 = 36;
            var5_5 = 28;
            var4_6 = 30;
lbl5:
            // 2 sources

            while (true) {
                var4_6 = Color.rgb((int)var5_5, (int)var4_6, (int)var6_4);
                break;
            }
        } else if (var2_2) {
            var4_6 = -1;
        } else {
            var6_4 = 92;
            var5_5 = 75;
            var4_6 = 80;
            ** continue;
        }
        var1_1.setTextColor(var4_6);
        var8_7 = new GradientDrawable();
        var7_8 = 0;
        if (var3_3) {
            var4_6 = Color.rgb((int)255, (int)221, (int)0);
        } else if (var2_2) {
            var4_6 = 214;
            var5_5 = 100;
            var6_4 = 93;
lbl25:
            // 2 sources

            while (true) {
                var4_6 = Color.rgb((int)var5_5, (int)var6_4, (int)var4_6);
                break;
            }
        } else {
            var4_6 = 246;
            var5_5 = 238;
            var6_4 = 240;
            ** continue;
        }
        var8_7.setColor(var4_6);
        var8_7.setCornerRadius((float)t.g((Context)var0, 10));
        var4_6 = var3_3 != false ? 3 : 0;
        var5_5 = t.g((Context)var0, var4_6);
        var4_6 = var7_8;
        if (var3_3) {
            var4_6 = Color.rgb((int)255, (int)242, (int)150);
        }
        var8_7.setStroke(var5_5, var4_6);
        var1_1.setBackground((Drawable)var8_7);
    }

    public static void u(AlertDialog alertDialog) {
        if ((alertDialog = alertDialog.getWindow()) == null) {
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.rgb((int)250, (int)249, (int)255));
        gradientDrawable.setCornerRadius(28.0f);
        alertDialog.setBackgroundDrawable((Drawable)gradientDrawable);
        gradientDrawable = new WindowManager.LayoutParams();
        gradientDrawable.copyFrom(alertDialog.getAttributes());
        gradientDrawable.width = (int)((float)alertDialog.getContext().getResources().getDisplayMetrics().widthPixels * 0.82f);
        gradientDrawable.height = -2;
        alertDialog.setAttributes((WindowManager.LayoutParams)gradientDrawable);
    }

    public static void v(Activity activity, TextView textView, boolean bl, boolean bl2) {
        int n2 = bl2 ? Color.rgb((int)20, (int)22, (int)28) : Color.rgb((int)45, (int)45, (int)52);
        textView.setTextColor(n2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        n2 = bl2 ? Color.rgb((int)255, (int)221, (int)0) : (bl ? Color.rgb((int)255, (int)244, (int)172) : -1);
        gradientDrawable.setColor(n2);
        gradientDrawable.setCornerRadius((float)t.g((Context)activity, 6));
        n2 = bl2 ? 3 : 1;
        int n3 = t.g((Context)activity, n2);
        n2 = bl2 ? Color.rgb((int)255, (int)183, (int)0) : Color.rgb((int)216, (int)218, (int)228);
        gradientDrawable.setStroke(n3, n2);
        textView.setBackground((Drawable)gradientDrawable);
    }

    public static void w(Activity activity, s s2, boolean bl) {
        s2.setTextColor(Color.rgb((int)31, (int)35, (int)45));
        s2.setHintTextColor(Color.rgb((int)132, (int)136, (int)148));
        GradientDrawable gradientDrawable = new GradientDrawable();
        int n2 = bl ? Color.rgb((int)255, (int)249, (int)222) : Color.rgb((int)246, (int)247, (int)251);
        gradientDrawable.setColor(n2);
        gradientDrawable.setCornerRadius((float)t.g((Context)activity, 10));
        n2 = bl ? 3 : 1;
        int n3 = t.g((Context)activity, n2);
        n2 = bl ? Color.rgb((int)255, (int)204, (int)0) : Color.rgb((int)222, (int)225, (int)234);
        gradientDrawable.setStroke(n3, n2);
        s2.setBackground((Drawable)gradientDrawable);
    }
}

