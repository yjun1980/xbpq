package com.github.catvod.spider.merge.j;

import android.app.AlertDialog;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.github.catvod.spider.merge.cYh;
import java.net.URLEncoder;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g extends WebViewClient {
    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        EditText editText;
        WebView webView2;
        WebView webView3;
        super.onPageFinished(webView, str);
        try {
            if (k.i.indexOf(cYh.d("83EAFBB7CBE0")) >= 0) {
                webView2 = k.c;
                if (webView2.getHeight() < 240) {
                    webView3 = k.c;
                    webView3.setLayoutParams(new LinearLayout.LayoutParams(-2, 240));
                }
            }
            if (k.i.indexOf(cYh.d("8EFACDB9F8DB80F0C0")) >= 0) {
                editText = k.d;
                editText.requestFocus();
            } else {
                k.j = 0;
                long unused = k.k = 0L;
                long unused2 = k.l = 0L;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        sslErrorHandler.proceed();
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int i;
        int i2;
        long j;
        long j2;
        AlertDialog alertDialog;
        int i3;
        if (keyEvent.getKeyCode() == 4) {
            if (webView.canGoBack()) {
                i3 = k.j;
                if (i3 > 0) {
                    k.j = 0;
                    long unused = k.k = 0L;
                    long unused2 = k.l = 0L;
                }
                webView.goBack();
                return true;
            }
            k.j();
            i = k.j;
            if (i == 1) {
                long unused3 = k.k = System.currentTimeMillis();
            } else {
                i2 = k.j;
                if (i2 == 2) {
                    long unused4 = k.l = System.currentTimeMillis();
                    j = k.l;
                    j2 = k.k;
                    if (j - j2 < 1000) {
                        alertDialog = k.f;
                        alertDialog.cancel();
                    }
                    k.j = 0;
                    long unused5 = k.k = 0L;
                    long unused6 = k.l = 0L;
                    return true;
                }
            }
        }
        return super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        byte[] bArr;
        String d = cYh.d("5C202E222361");
        if (str.indexOf(d) < 0) {
            webView.loadUrl(str);
        } else {
            String str2 = str.split(d)[0];
            if (str.split(d).length > 1) {
                String str3 = str.split(d)[1];
                String d2 = cYh.d("5A");
                String str4 = "";
                if (str3.indexOf(d2) >= 0) {
                    StringBuilder sb = new StringBuilder("");
                    for (String str5 : str3.split(cYh.d("3B76"))) {
                        try {
                            sb.append(str5.split(d2)[0]);
                            sb.append(d2);
                            sb.append(str5.split(d2).length > 1 ? URLEncoder.encode(str5.split(d2)[1], cYh.d("3204077C6F")) : "");
                            sb.append(cYh.d("41"));
                        } catch (Exception unused) {
                        }
                    }
                    String sb2 = sb.toString();
                    str4 = sb2.substring(0, sb2.length() - 1);
                }
                bArr = str4.getBytes();
            } else {
                bArr = null;
            }
            webView.postUrl(str2, bArr);
        }
        return true;
    }
}
