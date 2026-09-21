/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.ValueCallback
 *  android.webkit.WebResourceRequest
 *  android.webkit.WebResourceResponse
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  com.github.catvod.crawler.SpiderDebug
 */
package com.github.catvod.spider;

import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init$1$1;
import com.github.catvod.spider.merge.i0.m;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

class Init$1
extends WebViewClient {
    public void onLoadResource(WebView object, String string) {
        if (!string.contains(".mp3")) {
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("url:mp4");
        ((StringBuilder)object).append(string);
        m.y(((StringBuilder)object).toString());
        object = System.out;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("url:mp4");
        stringBuilder.append(string);
        ((PrintStream)object).println(stringBuilder.toString());
        throw null;
    }

    public void onPageFinished(WebView webView, String string) {
        PrintStream printStream = System.out;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onPageFinished url:");
        stringBuilder.append(string);
        printStream.println(stringBuilder.toString());
        webView.evaluateJavascript("this.localStorage['vid']", (ValueCallback)new Init$1$1());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public WebResourceResponse shouldInterceptRequest(WebView object, WebResourceRequest object2) {
        String string = object2.getUrl().toString();
        Object object3 = new StringBuilder();
        ((StringBuilder)object3).append("url:");
        ((StringBuilder)object3).append(string);
        SpiderDebug.log((String)((StringBuilder)object3).toString());
        if (!string.contains("mp4")) {
            return null;
        }
        String string2 = object2.getMethod();
        object3 = object2.getRequestHeaders();
        if ("POST".equalsIgnoreCase(object2.getMethod())) {
            try {
                int n2;
                Object object4 = object.getContext().getContentResolver().openInputStream(object2.getUrl());
                byte[] byArray = new byte[1024];
                object = new StringBuilder();
                while ((n2 = ((InputStream)object4).read(byArray)) != -1) {
                    object2 = new String(byArray, 0, n2);
                    ((StringBuilder)object).append((String)object2);
                }
                ((InputStream)object4).close();
                object4 = System.out;
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("POST Request URL: ");
                ((StringBuilder)object2).append(string);
                ((PrintStream)object4).println(((StringBuilder)object2).toString());
                object2 = System.out;
                object4 = new StringBuilder();
                ((StringBuilder)object4).append("POST Request Body: ");
                ((StringBuilder)object4).append(((StringBuilder)object).toString());
                ((PrintStream)object2).println(((StringBuilder)object4).toString());
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        object2 = System.out;
        object = new StringBuilder();
        ((StringBuilder)object).append("Request URL: ");
        ((StringBuilder)object).append(string);
        ((PrintStream)object2).println(((StringBuilder)object).toString());
        object = System.out;
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Request Method: ");
        ((StringBuilder)object2).append(string2);
        ((PrintStream)object).println(((StringBuilder)object2).toString());
        object = System.out;
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Request Headers: ");
        ((StringBuilder)object2).append(object3);
        ((PrintStream)object).println(((StringBuilder)object2).toString());
        return null;
    }
}

