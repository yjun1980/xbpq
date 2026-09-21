/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.SpiderDebug
 *  okhttp3.Call
 *  okhttp3.MediaType
 *  okhttp3.OkHttpClient
 *  okhttp3.OkHttpClient$Builder
 *  okhttp3.Response
 */
package com.github.catvod.spider.merge;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.Cj;
import com.github.catvod.spider.merge.H;
import com.github.catvod.spider.merge.vV;
import com.github.catvod.spider.merge.xx;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Response;

public class Yy {
    private static OkHttpClient S;
    private static OkHttpClient T4;
    private static final MediaType b;
    private static final Object l8;

    static {
        l8 = new Object();
        b = MediaType.parse((String)"application/x-protobuf");
    }

    public static String A(String string, Map<String, String> map, Map<String, List<String>> map2) {
        return Yy.cD(Yy.T4(), string, null, null, map, map2);
    }

    public static void HM(OkHttpClient okHttpClient, String string, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        new H("POST", string, map, map2, map3).l8(okHttpClient);
    }

    public static String Kf(String string, Map<String, String> map, Map<String, List<String>> map2) {
        return Yy.cD(Yy.l(), string, null, null, map, map2);
    }

    public static void N(OkHttpClient okHttpClient, String string, String string2, Map<String, String> map, xx xx2) {
        new vV("POST", string, string2, map, xx2).l8(okHttpClient);
    }

    public static String OL(Map<String, List<String>> map) {
        if (map == null) {
            return null;
        }
        if (map.containsKey("location")) {
            return map.get("location").get(0);
        }
        if (map.containsKey("Location")) {
            return map.get("Location").get(0);
        }
        return null;
    }

    public static void S(OkHttpClient okHttpClient2, Object object) {
        if (okHttpClient2 != null && object != null) {
            for (Object object2 : okHttpClient2.dispatcher().queuedCalls()) {
                if (!object.equals(object2.request().tag())) continue;
                object2.cancel();
            }
            for (OkHttpClient okHttpClient2 : okHttpClient2.dispatcher().runningCalls()) {
                if (!object.equals(okHttpClient2.request().tag())) continue;
                okHttpClient2.cancel();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static OkHttpClient T4() {
        Object object = l8;
        synchronized (object) {
            if (S != null) return S;
            Object object2 = new OkHttpClient.Builder();
            Object object3 = TimeUnit.SECONDS;
            OkHttpClient.Builder builder = object2.readTimeout(15L, object3).writeTimeout(15L, object3).connectTimeout(15L, object3).retryOnConnectionFailure(true);
            object2 = Cj.T4;
            object3 = new Cj((X509TrustManager)object2);
            S = builder.sslSocketFactory((SSLSocketFactory)object3, (X509TrustManager)object2).build();
            return S;
        }
    }

    public static void b(OkHttpClient okHttpClient, String string, Map<String, String> map, Map<String, String> map2, xx xx2) {
        new vV("GET", string, map, map2, xx2).l8(okHttpClient);
    }

    public static String cD(OkHttpClient okHttpClient, String object, String string, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> object2) {
        object2 = new xx<String>(object2){
            final Map S;
            {
                this.S = map;
            }

            @Override
            public void onFailure(Call call, Exception exception) {
                this.S("");
                SpiderDebug.log((Throwable)exception);
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Override
            public String onParseResponse(Call object, Response response) {
                try {
                    object = this.S;
                    if (object == null) return response.body().string();
                }
                catch (IOException iOException) {
                    return "";
                }
                object.clear();
                this.S.putAll(response.headers().toMultimap());
                return response.body().string();
            }

            @Override
            public String onResponse(String string) {
                return string;
            }
        };
        object = new vV("GET", (String)object, map, map2, (xx)object2);
        ((vV)object).l(string);
        ((vV)object).l8(okHttpClient);
        return (String)((xx)object2).getResult();
    }

    public static String hR(OkHttpClient okHttpClient, String object, String string, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> object2) {
        object2 = new xx<String>(object2){
            final Map S;
            {
                this.S = map;
            }

            @Override
            public void onFailure(Call call, Exception exception) {
                this.S("");
                SpiderDebug.log((Throwable)exception);
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Override
            public String onParseResponse(Call object, Response response) {
                try {
                    object = this.S;
                    if (object == null) return new String(response.body().bytes(), "GB2312");
                }
                catch (IOException iOException) {
                    return "";
                }
                object.clear();
                this.S.putAll(response.headers().toMultimap());
                return new String(response.body().bytes(), "GB2312");
            }

            @Override
            public String onResponse(String string) {
                return string;
            }
        };
        object = new vV("GET", (String)object, map, map2, (xx)object2);
        ((vV)object).l(string);
        ((vV)object).l8(okHttpClient);
        return (String)((xx)object2).getResult();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static OkHttpClient l() {
        Object object = l8;
        synchronized (object) {
            if (T4 != null) return T4;
            Object object2 = new OkHttpClient.Builder();
            Object object3 = TimeUnit.SECONDS;
            OkHttpClient.Builder builder = object2.readTimeout(15L, object3).writeTimeout(15L, object3).connectTimeout(15L, object3).followRedirects(false).followSslRedirects(false).retryOnConnectionFailure(true);
            object2 = Cj.T4;
            object3 = new Cj((X509TrustManager)object2);
            T4 = builder.sslSocketFactory((SSLSocketFactory)object3, (X509TrustManager)object2).build();
            return T4;
        }
    }

    public static void l8(Object object) {
        Yy.S(Yy.T4(), object);
    }

    public static String n(String string, String string2, Map<String, String> map) {
        return Yy.cD(Yy.T4(), string, string2, null, map, null);
    }

    public static String s(String string, Map<String, String> map) {
        return Yy.hR(Yy.T4(), string, null, null, map, null);
    }

    public static void tT(OkHttpClient okHttpClient, String string, Map<String, String> map, Map<String, String> map2, xx xx2) {
        new vV("POST", string, map, map2, xx2).l8(okHttpClient);
    }

    public static String v(String string, Map<String, String> map) {
        return Yy.cD(Yy.T4(), string, null, null, map, null);
    }
}

