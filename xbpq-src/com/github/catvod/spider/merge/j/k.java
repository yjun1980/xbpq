/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.DialogInterface$OnClickListener
 *  android.content.DialogInterface$OnDismissListener
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.view.Display
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup$LayoutParams
 *  android.view.WindowManager$LayoutParams
 *  android.view.inputmethod.InputMethodManager
 *  android.webkit.CookieManager
 *  android.webkit.CookieSyncManager
 *  android.webkit.WebChromeClient
 *  android.webkit.WebSettings$LayoutAlgorithm
 *  android.webkit.WebSettings$PluginState
 *  android.webkit.WebSettings$RenderPriority
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  android.widget.Button
 *  android.widget.EditText
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 */
package com.github.catvod.spider.merge.j;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.XBPQ;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.j.a;
import com.github.catvod.spider.merge.j.b;
import com.github.catvod.spider.merge.j.c;
import com.github.catvod.spider.merge.j.d;
import com.github.catvod.spider.merge.j.e;
import com.github.catvod.spider.merge.j.f;
import com.github.catvod.spider.merge.j.g;
import com.github.catvod.spider.merge.j.h;
import com.github.catvod.spider.merge.j.i;
import com.github.catvod.spider.merge.j.j;
import com.github.catvod.spider.merge.j.o;

public final class k {
    private static CookieManager a;
    private static View b;
    private static WebView c;
    private static EditText d;
    private static Activity e;
    private static AlertDialog f;
    private static Button g;
    private static Button h;
    public static String i = "";
    private static int j;
    private static long k;
    private static long l;
    private static boolean m;
    private static boolean n;
    private static FrameLayout o;

    public static void A(String object, String string, String object2, j j2) {
        String string2 = cYh.d("8EFACDB9F8DB80F0C0");
        try {
            Activity activity;
            e = activity = Init.getActivity();
            if (activity.getWindowManager().getDefaultDisplay().getWidth() - e.getWindowManager().getDefaultDisplay().getHeight() < 0) {
                n = true;
            }
            activity = new AlertDialog.Builder((Context)e);
            if (i.indexOf(string2) >= 0) {
                activity.setTitle((CharSequence)object);
                activity.setView((View)((LinearLayout)com.github.catvod.spider.merge.j.k.y((Context)e, string, (String)object2)));
                activity.setNegativeButton((CharSequence)cYh.d("82DFD7B7E1D2"), (DialogInterface.OnClickListener)com.github.catvod.spider.merge.j.d.a);
                object = cYh.d("80F1EFB4F9C0");
                object2 = new c(string, j2);
                activity.setPositiveButton((CharSequence)object, (DialogInterface.OnClickListener)object2);
                object = new a(j2);
            } else {
                activity.setView((View)((FrameLayout)com.github.catvod.spider.merge.j.k.y((Context)e, string, (String)object2)));
                object = new b(string, j2);
            }
            activity.setOnCancelListener((DialogInterface.OnCancelListener)object);
            object = activity.create();
            f = object;
            object.setOnDismissListener((DialogInterface.OnDismissListener)com.github.catvod.spider.merge.j.e.a);
            f.show();
            f.setCanceledOnTouchOutside(false);
            f.setCancelable(false);
            if (i.indexOf(string2) < 0) {
                string = f.getWindow();
                object = new ColorDrawable(0);
                string.setBackgroundDrawable((Drawable)object);
                com.github.catvod.spider.merge.j.k.z();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static /* synthetic */ void a() {
        f.cancel();
    }

    public static /* synthetic */ void b(String charSequence, j j2, DialogInterface dialogInterface) {
        CharSequence charSequence2;
        a.removeSessionCookie();
        a.removeAllCookie();
        if (Build.VERSION.SDK_INT < 21) {
            CookieSyncManager.getInstance().sync();
        } else {
            a.flush();
        }
        CharSequence charSequence3 = c.getSettings().getUserAgentString();
        String string = a.getCookie((String)charSequence);
        charSequence = charSequence2 = "";
        if (string != null) {
            charSequence = charSequence2;
            if (string.length() > 1) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(string);
                string = cYh.d("5C");
                ((StringBuilder)charSequence).append(string);
                charSequence = charSequence2 = ((StringBuilder)charSequence).toString().replaceAll(cYh.d("0A31220E3F3314242E232E050A28312338673C0E7A0C7C655C"), "");
                if (((String)charSequence2).endsWith(string)) {
                    charSequence = ((String)charSequence2).substring(0, ((String)charSequence2).length() - 1);
                }
                charSequence2 = new StringBuilder();
                ((StringBuilder)charSequence2).append((String)charSequence3);
                ((StringBuilder)charSequence2).append(cYh.d("44"));
                ((StringBuilder)charSequence2).append((String)charSequence);
                ((StringBuilder)charSequence2).append(cYh.d("437465"));
                charSequence = ((StringBuilder)charSequence2).toString();
            }
        }
        if (j2 != null) {
            charSequence2 = d;
            charSequence2 = charSequence2 != null && charSequence2.length() > 1 ? d.getText().toString() : cYh.d("56");
            charSequence3 = new StringBuilder();
            ((StringBuilder)charSequence3).append((String)charSequence);
            ((StringBuilder)charSequence3).append((String)charSequence2);
            j2.vertifyCode(((StringBuilder)charSequence3).toString());
        }
        com.github.catvod.spider.merge.j.k.x();
        dialogInterface.dismiss();
    }

    public static /* synthetic */ void c(j j2, DialogInterface dialogInterface) {
        if (j2 != null) {
            j2.vertifyCode(cYh.d("57"));
        }
        com.github.catvod.spider.merge.j.k.x();
        dialogInterface.dismiss();
    }

    public static /* synthetic */ void d(String charSequence, j j2, DialogInterface dialogInterface) {
        CharSequence charSequence2;
        a.removeSessionCookie();
        a.removeAllCookie();
        if (Build.VERSION.SDK_INT < 21) {
            CookieSyncManager.getInstance().sync();
        } else {
            a.flush();
        }
        CharSequence charSequence3 = c.getSettings().getUserAgentString();
        String string = a.getCookie((String)charSequence);
        charSequence = charSequence2 = "";
        if (string != null) {
            charSequence = charSequence2;
            if (string.length() > 1) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(string);
                string = cYh.d("5C");
                ((StringBuilder)charSequence).append(string);
                charSequence = charSequence2 = ((StringBuilder)charSequence).toString().replaceAll(cYh.d("0A31220E3F3314242E232E050A28312338673C0E7A0C7C655C"), "");
                if (((String)charSequence2).endsWith(string)) {
                    charSequence = ((String)charSequence2).substring(0, ((String)charSequence2).length() - 1);
                }
                charSequence2 = new StringBuilder();
                ((StringBuilder)charSequence2).append((String)charSequence3);
                ((StringBuilder)charSequence2).append(cYh.d("44"));
                ((StringBuilder)charSequence2).append((String)charSequence);
                ((StringBuilder)charSequence2).append(cYh.d("437465"));
                charSequence = ((StringBuilder)charSequence2).toString();
            }
        }
        if (j2 != null) {
            charSequence2 = d;
            charSequence2 = charSequence2 != null && charSequence2.length() > 1 ? d.getText().toString() : cYh.d("56");
            charSequence3 = new StringBuilder();
            ((StringBuilder)charSequence3).append((String)charSequence);
            ((StringBuilder)charSequence3).append((String)charSequence2);
            j2.vertifyCode(((StringBuilder)charSequence3).toString());
        }
        com.github.catvod.spider.merge.j.k.x();
        dialogInterface.dismiss();
    }

    static /* synthetic */ View e() {
        return b;
    }

    static /* synthetic */ View f(View view) {
        b = view;
        return view;
    }

    static /* synthetic */ FrameLayout g() {
        return o;
    }

    static /* synthetic */ int h() {
        return j;
    }

    static /* synthetic */ void i() {
        j = 0;
    }

    static /* synthetic */ int j() {
        int n2 = j;
        j = n2 + 1;
        return n2;
    }

    static /* synthetic */ long k() {
        return k;
    }

    static /* synthetic */ long l(long l2) {
        k = l2;
        return l2;
    }

    static /* synthetic */ long m() {
        return l;
    }

    static /* synthetic */ long n(long l2) {
        l = l2;
        return l2;
    }

    static /* synthetic */ Button o() {
        return g;
    }

    static /* synthetic */ Activity p() {
        return e;
    }

    static /* synthetic */ boolean q() {
        return n;
    }

    static /* synthetic */ boolean r() {
        return m;
    }

    static /* synthetic */ boolean s(boolean bl) {
        m = bl;
        return bl;
    }

    static /* synthetic */ void t() {
        com.github.catvod.spider.merge.j.k.z();
    }

    static /* synthetic */ WebView u() {
        return c;
    }

    static /* synthetic */ AlertDialog v() {
        return f;
    }

    static /* synthetic */ EditText w() {
        return d;
    }

    private static void x() {
        WebView webView = c;
        if (webView != null) {
            webView.stopLoading();
            c.clearHistory();
            c.clearCache(true);
            c.loadUrl(cYh.d("06322E242360053C203F3C"));
            c.onPause();
            c.removeAllViews();
            c.destroy();
            c.destroyDrawingCache();
        }
    }

    public static Object y(Context context, String string, String display) {
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout frameLayout = new FrameLayout(context);
        o = new FrameLayout(context);
        LinearLayout linearLayout2 = new LinearLayout(context);
        String string22 = i;
        String string3 = cYh.d("8EFACDB9F8DB80F0C0");
        if (string22.indexOf(string3) >= 0) {
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-1, -2));
            linearLayout.setGravity(17);
        } else {
            linearLayout.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-1, -1));
            frameLayout.setLayoutParams((ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -1));
            frameLayout.setBackgroundColor(0);
            o.setLayoutParams((ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -1));
            o.setBackgroundColor(0);
            o.setVisibility(8);
            linearLayout2.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-2, -2));
            linearLayout2.setDescendantFocusability(262144);
        }
        string22 = new WebView(context);
        c = string22;
        string22.setWebChromeClient((WebChromeClient)new f());
        c.setWebViewClient((WebViewClient)new g());
        c.setScrollBarStyle(0);
        c.setFocusable(true);
        c.setFocusableInTouchMode(true);
        c.setEnabled(true);
        string22 = c.getSettings();
        if (Build.VERSION.SDK_INT >= 21) {
            string22.setMixedContentMode(0);
        }
        string22.setBlockNetworkImage(false);
        string22.setJavaScriptEnabled(true);
        string22.setAllowContentAccess(true);
        string22.setAppCacheEnabled(true);
        string22.setBuiltInZoomControls(true);
        string22.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        string22.setPluginState(WebSettings.PluginState.ON);
        string22.setRenderPriority(WebSettings.RenderPriority.HIGH);
        string22.setJavaScriptCanOpenWindowsAutomatically(true);
        string22.setLoadWithOverviewMode(true);
        string22.setSupportZoom(true);
        string22.setUseWideViewPort(true);
        string22.setTextZoom(66);
        c.loadUrl(string);
        if (XBPQ.K.length() > 1) {
            string22.setUserAgentString(XBPQ.K);
        }
        CookieSyncManager.createInstance((Context)context);
        string22 = CookieManager.getInstance();
        a = string22;
        string22.setAcceptCookie(true);
        a.removeAllCookie();
        a.removeSessionCookie();
        if (display.length() > 0) {
            for (String string22 : display.split(cYh.d("5C"))) {
                a.setCookie(string, string22);
            }
            if (Build.VERSION.SDK_INT < 21) {
                CookieSyncManager.getInstance().sync();
            } else {
                a.flush();
            }
        }
        string = new EditText(context);
        d = string;
        string.setHint((CharSequence)i);
        d.setHintTextColor(-12303292);
        d.setTextColor(-16777216);
        d.setFocusable(true);
        d.setFocusableInTouchMode(true);
        if (i.indexOf(string3) >= 0) {
            linearLayout.addView((View)c);
            linearLayout.addView((View)d);
            d.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-1, -2));
            c.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-1, -2));
            return linearLayout;
        }
        linearLayout.setVisibility(8);
        display = e.getWindowManager().getDefaultDisplay();
        string = c;
        double d2 = display.getWidth();
        Double.isNaN(d2);
        int n2 = (int)(d2 * 0.75);
        d2 = display.getHeight();
        Double.isNaN(d2);
        string.setLayoutParams((ViewGroup.LayoutParams)new FrameLayout.LayoutParams(n2, (int)(d2 * 0.9)));
        string = new Button(context, null, 0);
        g = string;
        string.setPadding(20, 20, 0, 0);
        g.setEnabled(true);
        g.setFocusable(true);
        g.setFocusableInTouchMode(true);
        g.setText((CharSequence)cYh.d("85C6E1"));
        g.setTextColor(-3355444);
        g.setShadowLayer(5.0f, 5.0f, 5.0f, -7829368);
        g.setLayoutParams((ViewGroup.LayoutParams)new FrameLayout.LayoutParams(com.github.catvod.spider.merge.j.o.a(30), com.github.catvod.spider.merge.j.o.a(30)));
        g.setOnClickListener((View.OnClickListener)new h());
        string = new Button(context, null, 0);
        h = string;
        string.setPadding(30, 20, 0, 0);
        h.setEnabled(true);
        h.setFocusable(true);
        h.setFocusableInTouchMode(true);
        h.setText((CharSequence)cYh.d("85C8D3"));
        h.setTextColor(-3355444);
        h.setShadowLayer(4.0f, 4.0f, 4.0f, -7829368);
        h.setLayoutParams((ViewGroup.LayoutParams)new FrameLayout.LayoutParams(com.github.catvod.spider.merge.j.o.a(30), com.github.catvod.spider.merge.j.o.a(30)));
        h.setOnClickListener((View.OnClickListener)new i());
        linearLayout2.addView((View)h);
        linearLayout2.addView((View)g);
        frameLayout.addView((View)d);
        frameLayout.addView((View)o);
        frameLayout.addView((View)c);
        frameLayout.addView((View)linearLayout2);
        c.requestFocus();
        ((InputMethodManager)context.getSystemService(cYh.d("0E3E312423050A353539383E"))).showSoftInput((View)c, 2);
        return frameLayout;
    }

    private static void z() {
        Display display = e.getWindowManager().getDefaultDisplay();
        WindowManager.LayoutParams layoutParams = f.getWindow().getAttributes();
        double d2 = display.getWidth();
        Double.isNaN(d2);
        Double.isNaN(d2);
        layoutParams.width = (int)(d2 * 0.75);
        d2 = display.getHeight();
        Double.isNaN(d2);
        Double.isNaN(d2);
        layoutParams.height = (int)(d2 * 0.9);
        f.getWindow().setAttributes(layoutParams);
    }
}

