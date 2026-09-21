/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface$OnClickListener
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.webkit.CookieManager
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  android.widget.EditText
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge.I;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.a1;
import com.github.catvod.spider.merge.I.u;
import com.github.catvod.spider.merge.L.c;
import com.github.catvod.spider.merge.i0.m;
import com.github.catvod.utils.server.Server;
import java.util.HashMap;
import java.util.Objects;
import org.json.JSONObject;

public final class j
implements Runnable {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ j(WebViewClient webViewClient, HashMap hashMap, String string) {
        this.a = 3;
        this.b = webViewClient;
        this.d = hashMap;
        this.c = string;
    }

    public /* synthetic */ j(Object object, Object object2, Object object3, int n2) {
        this.a = n2;
        this.b = object;
        this.c = object2;
        this.d = object3;
    }

    @Override
    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 2: {
                Init.f((Init)this.b, (JSONObject)this.c, (Boolean)this.d);
                return;
            }
            case 1: {
                a1 a12 = (a1)this.b;
                EditText editText = (EditText)this.c;
                DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener)this.d;
                int n2 = a1.i;
                Objects.requireNonNull(a12);
                BaseApi baseApi = BaseApi.get();
                StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("\u5f53\u524d\u4e3a");
                stringBuilder.append(a12.f.d());
                stringBuilder.append("|");
                stringBuilder.append(a12.f.e());
                baseApi.showThreadInputWithQRCode("\u8bbe\u7f6e\u76d8123\u8d26\u53f7\u5bc6\u7801", stringBuilder.toString(), "", Server.u(), editText, onClickListener, null);
                return;
            }
            case 0: {
                u.d((u)this.b, (String)this.c, (c)this.d);
                return;
            }
        }
        WebViewClient webViewClient = (WebViewClient)this.b;
        HashMap object2 = (HashMap)this.d;
        String string = (String)this.c;
        WebView webView = m.a;
        webView = new WebView((Context)Init.context());
        webView.getSettings().setDatabaseEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAllowContentAccess(true);
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setGeolocationEnabled(true);
        webView.getSettings().setUserAgentString("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36 Edg/120.0.0.0");
        m.d((View)webView, new ViewGroup.LayoutParams(0, 0));
        webView.setWebViewClient(webViewClient);
        if (object2.containsKey("cookie")) {
            String string2 = (String)object2.get("cookie");
            webViewClient = CookieManager.getInstance();
            webViewClient.setAcceptCookie(true);
            webViewClient.removeAllCookies(null);
            for (String string3 : string2.split(";\\s*")) {
                if (string3.trim().isEmpty()) continue;
                webViewClient.setCookie(string, string3.trim());
            }
            webViewClient.setAcceptThirdPartyCookies(webView, true);
            webViewClient.flush();
        }
        webView.loadUrl(string);
    }
}

