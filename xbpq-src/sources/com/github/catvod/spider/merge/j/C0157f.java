package com.github.catvod.spider.merge.j;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.View;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.j.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0157f extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        View view;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        View view2;
        FrameLayout frameLayout3;
        Activity activity;
        boolean z;
        boolean z2;
        Activity activity2;
        view = k.b;
        if (view != null) {
            frameLayout = k.o;
            if (frameLayout == null) {
                return;
            }
            frameLayout2 = k.o;
            view2 = k.b;
            frameLayout2.removeView(view2);
            frameLayout3 = k.o;
            frameLayout3.setVisibility(8);
            activity = k.e;
            activity.getWindow().clearFlags(1024);
            z = k.n;
            if (z) {
                activity2 = k.e;
                activity2.setRequestedOrientation(1);
            }
            z2 = k.m;
            if (z2) {
                return;
            }
            k.z();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        View view2;
        FrameLayout frameLayout4;
        boolean z;
        WebView webView;
        boolean z2;
        Activity activity;
        AlertDialog alertDialog;
        Activity activity2;
        frameLayout = k.o;
        if (frameLayout != null) {
            View unused = k.b = view;
            frameLayout2 = k.o;
            frameLayout2.setVisibility(0);
            frameLayout3 = k.o;
            view2 = k.b;
            frameLayout3.addView(view2);
            frameLayout4 = k.o;
            frameLayout4.bringToFront();
            z = k.n;
            if (z) {
                activity2 = k.e;
                activity2.setRequestedOrientation(0);
            }
            webView = k.c;
            webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            z2 = k.m;
            if (!z2) {
                alertDialog = k.f;
                alertDialog.getWindow().setLayout(-1, -1);
            }
            activity = k.e;
            activity.getWindow().setFlags(1024, 1024);
        }
        super.onShowCustomView(view, customViewCallback);
    }
}
