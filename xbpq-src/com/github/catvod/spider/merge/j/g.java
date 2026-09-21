/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.net.http.SslError
 *  android.view.KeyEvent
 *  android.view.ViewGroup$LayoutParams
 *  android.webkit.SslErrorHandler
 *  android.webkit.WebResourceError
 *  android.webkit.WebResourceRequest
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  android.widget.LinearLayout$LayoutParams
 */
package com.github.catvod.spider.merge.j;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.j.k;
import java.net.URLEncoder;

final class g
extends WebViewClient {
    g() {
    }

    public final void onPageFinished(WebView webView, String string) {
        super.onPageFinished(webView, string);
        try {
            if (k.i.indexOf(cYh.d("83EAFBB7CBE0")) >= 0 && k.u().getHeight() < 240) {
                webView = k.u();
                string = new LinearLayout.LayoutParams(-2, 240);
                webView.setLayoutParams((ViewGroup.LayoutParams)string);
            }
            if (k.i.indexOf(cYh.d("8EFACDB9F8DB80F0C0")) >= 0) {
                k.w().requestFocus();
            } else {
                k.i();
                k.l(0L);
                k.n(0L);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public final void onPageStarted(WebView webView, String string, Bitmap bitmap) {
        super.onPageStarted(webView, string, bitmap);
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        sslErrorHandler.proceed();
    }

    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            if (webView.canGoBack()) {
                if (k.h() > 0) {
                    k.i();
                    k.l(0L);
                    k.n(0L);
                }
                webView.goBack();
                return true;
            }
            k.j();
            if (k.h() == 1) {
                k.l(System.currentTimeMillis());
            } else if (k.h() == 2) {
                k.n(System.currentTimeMillis());
                if (k.m() - k.k() < 1000L) {
                    k.v().cancel();
                }
                k.i();
                k.l(0L);
                k.n(0L);
                return true;
            }
        }
        return super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean shouldOverrideUrlLoading(WebView webView, String object) {
        void var2_15;
        String string;
        block10: {
            void var2_12;
            block8: {
                int n2;
                String[] stringArray;
                StringBuilder stringBuilder;
                int n3;
                String string2;
                String string3;
                block9: {
                    block6: {
                        String string4;
                        block7: {
                            string3 = cYh.d("5C202E222361");
                            if (((String)object).indexOf(string3) < 0) {
                                webView.loadUrl((String)object);
                                return true;
                            }
                            string = ((String)object).split(string3)[0];
                            if (((String)object).split(string3).length <= 1) break block6;
                            string4 = ((String)object).split(string3)[1];
                            string2 = cYh.d("5A");
                            n3 = string4.indexOf(string2);
                            string3 = "";
                            if (n3 >= 0) break block7;
                            String string5 = string3;
                            break block8;
                        }
                        stringBuilder = new StringBuilder("");
                        stringArray = string4.split(cYh.d("3B76"));
                        n2 = stringArray.length;
                        break block9;
                    }
                    Object var2_14 = null;
                    break block10;
                }
                for (n3 = 0; n3 < n2; ++n3) {
                    void var2_9;
                    String string6 = stringArray[n3];
                    stringBuilder.append(string6.split(string2)[0]);
                    stringBuilder.append(string2);
                    if (string6.split(string2).length > 1) {
                        String string7 = URLEncoder.encode(string6.split(string2)[1], cYh.d("3204077C6F"));
                    } else {
                        String string8 = "";
                    }
                    stringBuilder.append((String)var2_9);
                    stringBuilder.append(cYh.d("41"));
                    continue;
                }
                String string10 = stringBuilder.toString();
                string10 = string10.substring(0, string10.length() - 1);
                break block8;
                catch (Exception exception) {
                    String string11 = string3;
                }
            }
            byte[] byArray = var2_12.getBytes();
        }
        webView.postUrl(string, (byte[])var2_15);
        return true;
    }
}

