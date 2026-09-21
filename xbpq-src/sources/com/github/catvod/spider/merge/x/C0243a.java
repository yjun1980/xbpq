package com.github.catvod.spider.merge.x;

import com.github.catvod.spider.merge.cYh;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import okhttp3.HttpUrl;

/* renamed from: com.github.catvod.spider.merge.x.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0243a {
    public static void a(Throwable th, Throwable th2) {
        com.github.catvod.spider.merge.E.f.e(th, cYh.d("5B2429382464"));
        com.github.catvod.spider.merge.E.f.e(th2, cYh.d("02282234272E0E3F2F"));
        if (th != th2) {
            com.github.catvod.spider.merge.A.c.a.a(th, th2);
        }
    }

    public static HttpUrl b(String str, List list) {
        HttpUrl httpUrl = HttpUrl.get(str);
        if (list == null || list.size() == 0) {
            return httpUrl;
        }
        HttpUrl.Builder newBuilder = httpUrl.newBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.github.catvod.spider.merge.u0.a aVar = (com.github.catvod.spider.merge.u0.a) it.next();
            if (aVar.c()) {
                newBuilder.addEncodedQueryParameter(aVar.a(), aVar.b().toString());
            } else {
                newBuilder.addQueryParameter(aVar.a(), aVar.b().toString());
            }
        }
        return newBuilder.build();
    }

    public static String c(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    public static String d(String str) {
        return c(str).trim();
    }
}
