/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  okhttp3.HttpUrl
 */
package com.github.catvod.spider.merge.x;

import com.github.catvod.spider.merge.A.c;
import com.github.catvod.spider.merge.E.f;
import com.github.catvod.spider.merge.cYh;
import java.util.List;
import java.util.Locale;
import okhttp3.HttpUrl;

public final class a {
    public static void a(Throwable throwable, Throwable throwable2) {
        f.e(throwable, cYh.d("5B2429382464"));
        f.e(throwable2, cYh.d("02282234272E0E3F2F"));
        if (throwable != throwable2) {
            c.a.a(throwable, throwable2);
        }
    }

    public static HttpUrl b(String string, List object) {
        Object object2 = HttpUrl.get((String)string);
        string = object2;
        if (object != null) {
            if (object.size() == 0) {
                string = object2;
            } else {
                string = object2.newBuilder();
                object = object.iterator();
                while (object.hasNext()) {
                    object2 = (com.github.catvod.spider.merge.u0.a)object.next();
                    if (((com.github.catvod.spider.merge.u0.a)object2).c()) {
                        string.addEncodedQueryParameter(((com.github.catvod.spider.merge.u0.a)object2).a(), ((com.github.catvod.spider.merge.u0.a)object2).b().toString());
                        continue;
                    }
                    string.addQueryParameter(((com.github.catvod.spider.merge.u0.a)object2).a(), ((com.github.catvod.spider.merge.u0.a)object2).b().toString());
                }
                string = string.build();
            }
        }
        return string;
    }

    public static String c(String string) {
        string = string != null ? string.toLowerCase(Locale.ENGLISH) : "";
        return string;
    }

    public static String d(String string) {
        return a.c(string).trim();
    }
}

