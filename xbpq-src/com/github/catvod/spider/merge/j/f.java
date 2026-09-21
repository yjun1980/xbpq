/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.webkit.JsResult
 *  android.webkit.WebChromeClient
 *  android.webkit.WebChromeClient$CustomViewCallback
 *  android.webkit.WebView
 *  android.widget.FrameLayout$LayoutParams
 */
package com.github.catvod.spider.merge.j;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.github.catvod.spider.merge.j.k;

final class f
extends WebChromeClient {
    f() {
    }

    public final void onHideCustomView() {
        if (k.e() != null && k.g() != null) {
            k.g().removeView(k.e());
            k.g().setVisibility(8);
            k.p().getWindow().clearFlags(1024);
            if (k.q()) {
                k.p().setRequestedOrientation(1);
            }
            if (!k.r()) {
                k.t();
            }
        }
    }

    public final boolean onJsAlert(WebView webView, String string, String string2, JsResult jsResult) {
        return false;
    }

    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        if (k.g() != null) {
            k.f(view);
            k.g().setVisibility(0);
            k.g().addView(k.e());
            k.g().bringToFront();
            if (k.q()) {
                k.p().setRequestedOrientation(0);
            }
            k.u().setLayoutParams((ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -1));
            if (!k.r()) {
                k.v().getWindow().setLayout(-1, -1);
            }
            k.p().getWindow().setFlags(1024, 1024);
        }
        super.onShowCustomView(view, customViewCallback);
    }
}

