/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.SpiderDebug
 *  okhttp3.Call
 *  okhttp3.Cookie
 *  okhttp3.CookieJar
 *  okhttp3.HttpUrl
 *  okhttp3.OkHttpClient
 *  okhttp3.OkHttpClient$Builder
 *  okhttp3.Response
 */
package com.github.catvod.spider.merge;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u078a;
import com.github.catvod.spider.merge.\u078b;
import com.github.catvod.spider.merge.\u078d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;

public class \u078c {
    private static final Object \u037f = new Object();
    private static OkHttpClient \u0528;
    public static HashMap<String, List<Cookie>> \u0529;
    private static OkHttpClient \u052a;

    static {
        \u0529 = new HashMap();
        \u052a = null;
    }

    public static void \u037f(Object object) {
        \u078c.\u0528(\u078c.\u0529(), object);
    }

    public static void \u0528(OkHttpClient object, Object object2) {
        if (object != null && object2 != null) {
            for (Call call : object.dispatcher().queuedCalls()) {
                if (!object2.equals(call.request().tag())) continue;
                call.cancel();
            }
            for (Call call : object.dispatcher().runningCalls()) {
                if (!object2.equals(call.request().tag())) continue;
                call.cancel();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static OkHttpClient \u0529() {
        Object object = \u037f;
        synchronized (object) {
            if (\u0528 != null) return \u0528;
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            Object object2 = new CookieJar(){

                public List<Cookie> loadForRequest(HttpUrl object) {
                    if ((object = \u0529.get(object.host())) == null) {
                        object = new ArrayList();
                    }
                    return object;
                }

                public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
                    \u0529.put(httpUrl.host(), list);
                }
            };
            builder = builder.cookieJar((CookieJar)object2);
            object2 = TimeUnit.SECONDS;
            builder = builder.readTimeout(10L, (TimeUnit)((Object)object2)).writeTimeout(10L, (TimeUnit)((Object)object2)).connectTimeout(10L, (TimeUnit)((Object)object2)).retryOnConnectionFailure(true);
            object2 = \u078d.\u0529;
            \u078d \u078d2 = new \u078d((X509TrustManager)object2);
            \u0528 = builder.sslSocketFactory((SSLSocketFactory)\u078d2, (X509TrustManager)object2).build();
            return \u0528;
        }
    }

    public static void \u052a(OkHttpClient okHttpClient, String string, Map<String, String> map, Map<String, String> map2, \u078a \u078a2) {
        new \u078b(SOY.d("3D1705"), string, map, map2, \u078a2).\u037f(okHttpClient);
    }

    public static String \u052b(Map<String, List<String>> map) {
        if (map == null) {
            return null;
        }
        String string = SOY.d("163D3217001E153C");
        if (map.containsKey(string)) {
            return map.get(string).get(0);
        }
        string = SOY.d("363D3217001E153C");
        if (map.containsKey(string)) {
            return map.get(string).get(0);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static OkHttpClient \u052c() {
        Object object = \u037f;
        synchronized (object) {
            if (\u052a != null) return \u052a;
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            Object object2 = TimeUnit.SECONDS;
            builder = builder.readTimeout(10L, object2).writeTimeout(10L, object2).connectTimeout(10L, object2).followRedirects(false).followSslRedirects(false).retryOnConnectionFailure(true);
            object2 = \u078d.\u0529;
            \u078d \u078d2 = new \u078d((X509TrustManager)object2);
            \u052a = builder.sslSocketFactory((SSLSocketFactory)\u078d2, (X509TrustManager)object2).build();
            return \u052a;
        }
    }

    public static void \u052d(OkHttpClient okHttpClient, String string, Map<String, String> map, Map<String, String> map2, \u078a \u078a2) {
        new \u078b(SOY.d("2A1D0222"), string, map, map2, \u078a2).\u037f(okHttpClient);
    }

    public static void \u052e(OkHttpClient okHttpClient, String string, String string2, Map<String, String> map, \u078a \u078a2) {
        new \u078b(SOY.d("2A1D0222"), string, string2, map, \u078a2).\u037f(okHttpClient);
    }

    public static String \u052f(String string, String string2, Map<String, String> map) {
        return \u078c.\u0780(\u078c.\u0529(), string, string2, null, map, null);
    }

    public static String \u058f(String string, Map<String, String> map) {
        return \u078c.\u0780(\u078c.\u0529(), string, null, null, map, null);
    }

    public static String \u0620(String string, Map<String, String> map, Map<String, List<String>> map2) {
        return \u078c.\u0780(\u078c.\u0529(), string, null, null, map, map2);
    }

    public static String \u0780(OkHttpClient okHttpClient, String object, String string, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> object2) {
        object2 = new \u078a<String>(object2){
            final Map \u0528;
            {
                this.\u0528 = map;
            }

            @Override
            public void onFailure(Call call, Exception exception) {
                this.\u0528("");
                SpiderDebug.log((Throwable)exception);
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Override
            public String onParseResponse(Call object, Response response) {
                try {
                    object = this.\u0528;
                    if (object == null) return response.body().string();
                }
                catch (IOException iOException) {
                    return "";
                }
                object.clear();
                this.\u0528.putAll(response.headers().toMultimap());
                return response.body().string();
            }

            @Override
            public void onResponse(String string) {
            }
        };
        object = new \u078b(SOY.d("3D1705"), (String)object, map, map2, (\u078a)object2);
        ((\u078b)object).\u052c(string);
        ((\u078b)object).\u037f(okHttpClient);
        return (String)((\u078a)object2).getResult();
    }

    public static String \u0781(String string, Map<String, String> map, Map<String, List<String>> map2) {
        return \u078c.\u0780(\u078c.\u052c(), string, null, null, map, map2);
    }
}

