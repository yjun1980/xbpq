/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.ValueCallback
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
package com.github.catvod.spider.merge.i0;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.github.catvod.spider.merge.i0.j;
import com.github.catvod.spider.merge.i0.l;
import java.util.HashMap;

final class k
extends WebViewClient {
    final HashMap a;
    final l b;

    k(HashMap hashMap) {
        this.a = hashMap;
        this.b = null;
    }

    public final void onPageFinished(WebView webView, String string) {
        webView.evaluateJavascript("document.documentElement.outerHTML", (ValueCallback)new j(this, string, webView));
    }
}

