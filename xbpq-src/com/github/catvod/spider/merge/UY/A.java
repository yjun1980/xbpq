/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.github.catvod.crawler.Spider
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  okhttp3.Dns
 *  okhttp3.FormBody$Builder
 *  okhttp3.Headers
 *  okhttp3.HttpUrl
 *  okhttp3.MediaType
 *  okhttp3.OkHttpClient
 *  okhttp3.OkHttpClient$Builder
 *  okhttp3.Request
 *  okhttp3.Request$Builder
 *  okhttp3.RequestBody
 *  okhttp3.Response
 */
package com.github.catvod.spider.merge.UY;

import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.HR.o;
import com.github.catvod.spider.merge.KT.H;
import com.github.catvod.spider.merge.UY.T;
import com.github.catvod.spider.merge.UY.X;
import com.github.catvod.spider.merge.xc.A0.c;
import com.github.catvod.spider.merge.xc.E0.b;
import com.github.catvod.spider.merge.xc.F0.h;
import com.github.catvod.spider.merge.xc.F0.l;
import com.github.catvod.spider.merge.xc.F0.q;
import com.github.catvod.spider.merge.xc.F0.s;
import com.github.catvod.spider.merge.xc.G0.B;
import com.github.catvod.spider.merge.xc.G0.C;
import com.github.catvod.spider.merge.xc.G0.D;
import com.github.catvod.spider.merge.xc.G0.E;
import com.github.catvod.spider.merge.xc.G0.G;
import com.github.catvod.spider.merge.xc.G0.K;
import com.github.catvod.spider.merge.xc.G0.N;
import com.github.catvod.spider.merge.xc.G0.P;
import com.github.catvod.spider.merge.xc.S.a;
import com.github.catvod.spider.merge.xc.S.d;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Dns;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public final class A
implements o {
    public final int a;
    public Object b;

    public A() {
        this.a = 0;
        this.b = new HashMap();
    }

    public /* synthetic */ A(int n2) {
        this.a = n2;
    }

    public /* synthetic */ A(int n2, Object object) {
        this.a = n2;
        this.b = object;
    }

    public A(com.github.catvod.spider.merge.xc.G0.b b2) {
        this.a = 2;
        this.b = new C();
    }

    public static OkHttpClient a() {
        try {
            OkHttpClient okHttpClient = Spider.client();
            okHttpClient.getClass();
            return okHttpClient;
        }
        catch (Throwable throwable) {
            A a2 = com.github.catvod.spider.merge.xc.S.b.a;
            Object object = (OkHttpClient)a2.b;
            if (object == null) {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                try {
                    object = Spider.safeDns();
                    object.getClass();
                }
                catch (Throwable throwable2) {
                    object = Dns.SYSTEM;
                }
                builder = builder.dns((Dns)object);
                object = TimeUnit.SECONDS;
                object = builder.connectTimeout(30L, (TimeUnit)((Object)object)).readTimeout(30L, (TimeUnit)((Object)object)).writeTimeout(30L, (TimeUnit)((Object)object)).hostnameVerifier((HostnameVerifier)new a(0)).sslSocketFactory((SSLSocketFactory)new d(), (X509TrustManager)d.d).build();
                a2.b = object;
            }
            return object;
        }
    }

    public static X e(String object4, Map object2, Map map) {
        Request.Builder builder = new Request.Builder();
        Object object3 = object4;
        if (object2 != null) {
            object4 = m.f((String)object4, "?");
            for (String string : object2.keySet()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append("=");
                stringBuilder.append((String)object2.get(string));
                stringBuilder.append("&");
                object4 = ((String)object4).concat(stringBuilder.toString());
            }
            object2 = H.a;
            object3 = object4;
            if (object4 != null) {
                object3 = object4;
                if (((String)object4).length() > 1) {
                    object3 = m.d((String)object4, 1, 0);
                }
            }
        }
        if (map != null) {
            for (Object object4 : map.keySet()) {
                builder.addHeader((String)object4, (String)map.get(object4));
            }
        }
        object4 = builder.url((String)object3).build();
        object2 = A.a();
        try {
            object2 = object2.newCall((Request)object4).execute();
            object4 = new X(object2.code(), object2.body().string(), object2.headers().toMultimap());
        }
        catch (IOException iOException) {
            object4 = new X();
        }
        return object4;
    }

    public static String f(String string, Map map) {
        map = A.a().newBuilder().followRedirects(false).followSslRedirects(false).build().newCall(new Request.Builder().url(string).headers(Headers.of((Map)map)).build()).execute().headers().toMultimap();
        string = null;
        if (map != null) {
            if (map.containsKey("location")) {
                string = (String)((List)map.get("location")).get(0);
            } else if (map.containsKey("Location")) {
                string = (String)((List)map.get("Location")).get(0);
            }
        }
        return string;
    }

    public static Map g(String string, HashMap hashMap) {
        return A.a().newBuilder().followRedirects(false).followSslRedirects(false).build().newCall(new Request.Builder().url(string).headers(Headers.of((Map)hashMap)).build()).execute().headers().toMultimap();
    }

    public static Response i(String string, Map map) {
        return A.a().newCall(new Request.Builder().url(string).headers(Headers.of((Map)map)).build()).execute();
    }

    public static h j(String object, String object2) {
        com.github.catvod.spider.merge.xc.G0.b b2 = new com.github.catvod.spider.merge.xc.G0.b();
        Object object3 = new StringReader((String)object);
        object = new A(b2);
        if (object2 != null) {
            Object object4 = new h((String)object2);
            b2.d = object4;
            ((h)object4).k = object;
            b2.a = object;
            b2.h = D.c;
            b2.b = object4 = new com.github.catvod.spider.merge.xc.G0.a((StringReader)object3, 32768);
            object = (C)((A)object).b;
            int n2 = ((C)object).a > 0 ? 1 : 0;
            if (n2 != 0 && ((com.github.catvod.spider.merge.xc.G0.a)object4).i == null) {
                ((com.github.catvod.spider.merge.xc.G0.a)object4).i = new ArrayList(409);
                ((com.github.catvod.spider.merge.xc.G0.a)object4).y();
            } else if (n2 == 0) {
                ((com.github.catvod.spider.merge.xc.G0.a)object4).i = null;
            }
            b2.g = null;
            b2.c = new P(b2.b, (C)object);
            b2.e = new ArrayList(32);
            b2.i = new HashMap();
            b2.f = object2;
            b2.l = B.a;
            b2.m = null;
            b2.n = false;
            b2.o = null;
            b2.p = null;
            b2.q = new ArrayList();
            b2.r = new ArrayList();
            b2.s = new ArrayList();
            b2.t = new K();
            b2.u = true;
            b2.v = false;
            object2 = b2.c;
            while (true) {
                if (!((P)object2).e) {
                    ((P)object2).c.d((P)object2, ((P)object2).a);
                    continue;
                }
                object3 = ((P)object2).g;
                n2 = ((StringBuilder)object3).length();
                object = ((P)object2).l;
                if (n2 != 0) {
                    object4 = ((StringBuilder)object3).toString();
                    ((StringBuilder)object3).delete(0, ((StringBuilder)object3).length());
                    ((G)object).b = object4;
                    ((P)object2).f = null;
                } else {
                    object4 = ((P)object2).f;
                    if (object4 != null) {
                        ((G)object).b = object4;
                        ((P)object2).f = null;
                    } else {
                        ((P)object2).e = false;
                        object = ((P)object2).d;
                    }
                }
                b2.D((N)object);
                ((N)object).f();
                if (((N)object).a == 6) break;
            }
            b2.b.d();
            b2.b = null;
            b2.c = null;
            b2.e = null;
            b2.i = null;
            return b2.d;
        }
        object = new com.github.catvod.spider.merge.xc.D0.c("The parameter 'baseUri' must not be null.");
        throw object;
    }

    public static X k(String object, String string2, Map map) {
        Request.Builder builder = new Request.Builder();
        string2 = !TextUtils.isEmpty((CharSequence)string2) ? RequestBody.create((MediaType)MediaType.get((String)"application/json; charset=utf-8"), (String)string2) : new FormBody.Builder().build();
        builder.post((RequestBody)string2);
        if (map != null) {
            for (String string2 : map.keySet()) {
                builder.addHeader(string2, (String)map.get(string2));
            }
        }
        object = builder.url((String)object).build();
        string2 = A.a();
        try {
            string2 = string2.newCall((Request)object).execute();
            object = new X(string2.code(), string2.body().string(), string2.headers().toMultimap());
        }
        catch (IOException iOException) {
            object = new X();
        }
        return object;
    }

    public static X l(String object, Map object22, Map map) {
        Request.Builder builder = new Request.Builder();
        if (!TextUtils.isEmpty(null)) {
            object22 = RequestBody.create((MediaType)MediaType.get((String)"application/json; charset=utf-8"), null);
        } else {
            FormBody.Builder builder2 = new FormBody.Builder();
            if (object22 != null) {
                for (String string : object22.keySet()) {
                    builder2.add(string, (String)object22.get(string));
                }
            }
            object22 = builder2.build();
        }
        builder.post((RequestBody)object22);
        if (map != null) {
            for (Object object22 : map.keySet()) {
                builder.addHeader((String)object22, (String)map.get(object22));
            }
        }
        object = builder.url((String)object).build();
        object22 = A.a();
        try {
            object22 = object22.newCall((Request)object).execute();
            object = new X(object22.code(), object22.body().string(), object22.headers().toMultimap());
        }
        catch (IOException iOException) {
            object = new X();
        }
        return object;
    }

    public static void m(String string) {
        Init.run(new T(string, 8));
    }

    public static String n(String object, Map object2, int n2, int n3) {
        if (((String)object).startsWith("http")) {
            Object object32;
            Request.Builder builder = new Request.Builder();
            if (object2 != null) {
                for (Object object32 : object2.keySet()) {
                    builder.addHeader((String)object32, (String)object2.get(object32));
                }
            }
            object = builder.url((String)object).build();
            object32 = A.a().newBuilder();
            long l2 = n2;
            object2 = TimeUnit.SECONDS;
            object32 = object32.connectTimeout(l2, (TimeUnit)((Object)object2));
            l2 = n3;
            object2 = object32.readTimeout(l2, (TimeUnit)((Object)object2)).writeTimeout(l2, (TimeUnit)((Object)object2)).build();
            try {
                object2 = object2.newCall((Request)object).execute();
                object = new X(object2.code(), object2.body().string(), object2.headers().toMultimap());
            }
            catch (IOException iOException) {
                object = new X();
            }
            object = ((X)object).b();
        } else {
            object = "";
        }
        return object;
    }

    public static String o(String object4, Map object2, Map map) {
        if (((String)object4).startsWith("http")) {
            Request.Builder builder = new Request.Builder();
            Object object3 = object4;
            if (object2 != null) {
                object4 = m.f((String)object4, "?");
                for (String string : object2.keySet()) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string);
                    stringBuilder.append("=");
                    stringBuilder.append((String)object2.get(string));
                    stringBuilder.append("&");
                    object4 = ((String)object4).concat(stringBuilder.toString());
                }
                object2 = H.a;
                object3 = object4;
                if (object4 != null) {
                    object3 = object4;
                    if (((String)object4).length() > 1) {
                        object3 = m.d((String)object4, 1, 0);
                    }
                }
            }
            if (map != null) {
                for (Object object4 : map.keySet()) {
                    builder.addHeader((String)object4, (String)map.get(object4));
                }
            }
            object2 = builder.url((String)object3).build();
            object4 = A.a();
            try {
                object2 = object4.newCall((Request)object2).execute();
                object4 = new X(object2.code(), object2.body().string(), object2.headers().toMultimap());
            }
            catch (IOException iOException) {
                object4 = new X();
            }
            object4 = ((X)object4).b();
        } else {
            object4 = "";
        }
        return object4;
    }

    @Override
    public void b(q object, int n2) {
        if (object instanceof l && ((l)object).d.c && ((q)object).n() instanceof s && !s.B((StringBuilder)(object = (StringBuilder)this.b))) {
            ((StringBuilder)object).append(' ');
        }
    }

    @Override
    public void c(q object, int n2) {
        boolean bl = object instanceof s;
        StringBuilder stringBuilder = (StringBuilder)this.b;
        if (bl) {
            s s2 = (s)object;
            object = s2.y();
            if (!l.J(s2.a) && !(s2 instanceof com.github.catvod.spider.merge.xc.F0.d)) {
                com.github.catvod.spider.merge.xc.E0.b.a(stringBuilder, (String)object, s.B(stringBuilder));
            } else {
                stringBuilder.append((String)object);
            }
        } else if (object instanceof l) {
            object = (l)object;
            if (stringBuilder.length() > 0) {
                object = ((l)object).d;
                if ((((E)object).c || ((E)object).b.equals("br")) && !s.B(stringBuilder)) {
                    stringBuilder.append(' ');
                }
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void d(String iterator) {
        try {
            for (Object object : com.github.catvod.spider.merge.KT.C.R(iterator).entrySet()) {
                String string = (String)object.getKey();
                JsonObject jsonObject = ((JsonElement)object.getValue()).getAsJsonObject();
                HashMap<String, String> hashMap = new HashMap<String, String>();
                object = jsonObject.keySet().iterator();
                while (object.hasNext()) {
                    String string2 = (String)object.next();
                    hashMap.put(string2, jsonObject.get(string2).getAsString());
                }
                ((HashMap)this.b).put(string, hashMap);
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public String h(String object) {
        object = HttpUrl.parse((String)object);
        Map map = (Map)((HashMap)this.b).get(object.host());
        object = new ArrayList();
        if (map != null && map.size() > 0) {
            for (String string : map.keySet()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append("=");
                stringBuilder.append((String)map.get(string));
                ((ArrayList)object).add(stringBuilder.toString());
            }
        }
        return c.e(";", (List)object);
    }

    public String toString() {
        switch (this.a) {
            default: {
                return super.toString();
            }
            case 5: 
        }
        StringBuilder stringBuilder = new StringBuilder("<");
        stringBuilder.append((String)this.b);
        stringBuilder.append('>');
        return stringBuilder.toString();
    }
}

