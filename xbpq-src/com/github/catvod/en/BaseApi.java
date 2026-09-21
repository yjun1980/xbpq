/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface$OnClickListener
 *  android.content.res.ColorStateList
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.GradientDrawable
 *  android.graphics.drawable.RippleDrawable
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup$LayoutParams
 *  android.view.WindowManager
 *  android.widget.EditText
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.ScrollView
 *  android.widget.TextView
 */
package com.github.catvod.en;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.github.catvod.en.BaseApi$Task;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.d0.a;
import com.github.catvod.spider.merge.d0.e;
import com.github.catvod.spider.merge.i0.m;
import com.github.catvod.utils.server.Server;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/*
 * Exception performing whole class analysis.
 * Exception performing whole class analysis ignored.
 */
public class BaseApi {
    public String a;
    private AlertDialog b;
    public String c;
    public Boolean d;
    public Boolean e;
    public String f;
    public EditText g;
    public ConcurrentHashMap<String, String> h;
    public String i;

    public native BaseApi();

    public static native String MD5(String var0, String var1);

    public static native /* synthetic */ void a(BaseApi var0, String var1);

    public static native void ab();

    public static native void b(Activity var0, String var1);

    public static native /* synthetic */ void c(Activity var0);

    public static native byte[] calculateMethodHash(byte[] var0);

    public static native byte[] convertFileToByteArray(String var0);

    public static native Drawable createRoundedBackground(int var0, int var1);

    public static native /* synthetic */ void d(Activity var0);

    private static native void e(Activity var0);

    private native void f(LinearLayout var1, int var2);

    public static native h fakeVod(List var0, String var1);

    private static native void g(Activity var0, String var1);

    public static native BaseApi get();

    public static native String getAppSignature(Context var0);

    public static native String getDexPathMatcher();

    private static native TextView h(Activity var0, View var1);

    private static native int i(int var0);

    public static native boolean isDebuggable(Context var0);

    public static native boolean isOk(String var0);

    private static native List j(View var0, List var1);

    private static native View k(View var0);

    private static native LinearLayout l(String var0);

    private static native void m(Activity var0);

    public static native boolean monitorCurrentActivityButtons();

    private static native void n(View var0, View var1);

    private static native void o(Activity var0, String var1);

    private native void p(String var1);

    public native void dismiss();

    public native void downloadFileWithDownloadManager(String var1, String var2, Map var3);

    public native void getDexPathList();

    public native void getDexPathList3();

    public native File getNetPanDownCache();

    public native File getNetPanIsoCache();

    public native File getNetPanOrderCache();

    public native File getSubscriptionUrlCache();

    public native EditText initEditText();

    public native void onClashUiNeutral();

    public native void onSubscriptionUrlPositive(String var1);

    public native void openBrower(String var1, String var2);

    public native void openFile(String var1);

    public native void setNetPanDown();

    public native void setNetPanIso();

    public native void setNetPanOrder(String var1, boolean var2);

    public void showInputWithOption(String string, DialogInterface.OnClickListener onClickListener, BaseApi$Task baseApi$Task, String string2, String string3, List<String> list) {
        this.showInputWithOption(string, onClickListener, baseApi$Task, string2, string3, list, "");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void showInputWithOption(String string, DialogInterface.OnClickListener object, BaseApi$Task baseApi$Task, String string2, String string3, List<String> layoutParams, String object2) {
        try {
            LinearLayout linearLayout = new LinearLayout((Context)Init.context());
            int n2 = 1;
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            linearLayout.setPadding(m.e(16), m.e(16), m.e(16), m.e(16));
            ScrollView scrollView = new ScrollView((Context)Init.context());
            LinearLayout linearLayout2 = new LinearLayout((Context)Init.context());
            linearLayout2.setOrientation(1);
            for (String string4 : layoutParams) {
                TextView textView = new TextView((Context)Init.context());
                textView.setText((CharSequence)string4);
                textView.setPadding(16, 16, 16, 16);
                textView.setGravity(17);
                textView.setTypeface(null, 1);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(-3355444);
                gradientDrawable.setCornerRadius(8.0f);
                gradientDrawable.setStroke(2, -16777216);
                RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf((int)-7829368), (Drawable)gradientDrawable, null);
                textView.setBackground((Drawable)rippleDrawable);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams2.setMargins(0, 1, 0, 8);
                textView.setLayoutParams((ViewGroup.LayoutParams)layoutParams2);
                e e2 = new e(this, string4);
                textView.setOnClickListener((View.OnClickListener)e2);
                linearLayout2.addView((View)textView);
            }
            scrollView.addView((View)linearLayout2);
            if (!layoutParams.isEmpty()) {
                scrollView.setVerticalScrollBarEnabled(true);
                scrollView.setScrollbarFadingEnabled(false);
            }
            int n3 = layoutParams.size() > 3 ? 200 : 100;
            n3 = m.e(n3);
            layoutParams = new LinearLayout.LayoutParams(-1, n3);
            scrollView.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
            linearLayout.addView((View)scrollView);
            this.f(linearLayout, m.e(10));
            layoutParams = BaseApi.get().initEditText();
            layoutParams.setHint((CharSequence)string3);
            if (com.github.catvod.spider.merge.R0.e.d((CharSequence)object2)) {
                layoutParams.setText((CharSequence)object2);
            }
            layoutParams.setPadding(m.e(8), m.e(8), m.e(8), m.e(8));
            layoutParams.setBackground(BaseApi.createRoundedBackground(-3355444, m.e(8)));
            string3 = new LinearLayout.LayoutParams(-1, -2);
            linearLayout.addView((View)layoutParams, (ViewGroup.LayoutParams)string3);
            this.f(linearLayout, m.e(10));
            string3 = BaseApi.l(Server.u());
            object2 = new LinearLayout.LayoutParams(-1, -2);
            linearLayout.addView((View)string3, (ViewGroup.LayoutParams)object2);
            string3 = new TextView((Context)Init.context());
            string3.setText((CharSequence)string2);
            string3.setGravity(17);
            string3.setPadding(m.e(1), m.e(16), m.e(1), m.e(1));
            string3.setTextSize(20.0f);
            string3.setTypeface(null, 1);
            string2 = new AlertDialog.Builder((Context)Init.getConfigActivity());
            string3 = string2.setCustomTitle((View)string3).setView((View)linearLayout).setNegativeButton(0x1040000, null);
            object2 = new a(this, (EditText)layoutParams, baseApi$Task);
            string3.setPositiveButton(17039370, (DialogInterface.OnClickListener)object2);
            n3 = object == null ? n2 : 0;
            if (n3 == 0) {
                string2.setNeutralButton((CharSequence)string, (DialogInterface.OnClickListener)object);
            }
            string = string2.create();
            this.b = string;
            string.show();
            n3 = ((WindowManager)Init.context().getSystemService("window")).getDefaultDisplay().getWidth();
            this.b.getWindow().setLayout((int)((double)n3 * 0.9), -2);
            return;
        }
        catch (Exception exception) {
            object = new StringBuilder();
            ((StringBuilder)object).append("\u5f53\u524d\u8282\u70b9\u4e3a");
            ((StringBuilder)object).append(exception);
            m.y(((StringBuilder)object).toString());
            exception.printStackTrace();
        }
    }

    public native void showNetPanOrderInputWithOption();

    public native void showSingBoxInputWithOption();

    public native void showSubscriptionUrlInput();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void showThreadInputWithQRCode(String string, String string2, String string3, String string4, EditText editText, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        try {
            LinearLayout linearLayout = new LinearLayout((Context)Init.context());
            int n2 = 1;
            linearLayout.setOrientation(1);
            linearLayout.setPadding(m.e(24), m.e(24), m.e(24), m.e(24));
            linearLayout.setBackground(BaseApi.createRoundedBackground(-1, m.e(16)));
            TextView textView = new TextView((Context)Init.context());
            textView.setText((CharSequence)string);
            textView.setTextSize(18.0f);
            textView.setTextColor(-16777216);
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            textView.setGravity(17);
            linearLayout.addView((View)textView);
            string = new ScrollView((Context)Init.context());
            textView = new TextView((Context)Init.context());
            textView.setText((CharSequence)string2);
            textView.setTextSize(14.0f);
            textView.setTextColor(-7829368);
            textView.setGravity(17);
            string.addView((View)textView);
            if (com.github.catvod.spider.merge.R0.e.d(string2)) {
                string.setVerticalScrollBarEnabled(true);
                string.setScrollbarFadingEnabled(false);
            }
            int n3 = com.github.catvod.spider.merge.R0.e.d(string2) && string2.length() > 200 ? 150 : 50;
            n3 = m.e(n3);
            string2 = new LinearLayout.LayoutParams(-1, n3);
            string.setLayoutParams((ViewGroup.LayoutParams)string2);
            linearLayout.addView((View)string);
            this.f(linearLayout, m.e(5));
            string = new FrameLayout((Context)Init.context());
            string2 = new FrameLayout.LayoutParams(-1, -2);
            string.addView((View)editText, (ViewGroup.LayoutParams)string2);
            linearLayout.addView((View)string);
            this.f(linearLayout, m.e(24));
            linearLayout.addView((View)BaseApi.l(string4));
            string = new AlertDialog.Builder((Context)Init.getConfigActivity());
            n3 = onClickListener2 == null ? n2 : 0;
            if (n3 == 0) {
                string.setNeutralButton((CharSequence)string3, onClickListener2);
            }
            this.b = string.setView((View)linearLayout).setNegativeButton(0x1040000, null).setPositiveButton(17039370, onClickListener).show();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}

