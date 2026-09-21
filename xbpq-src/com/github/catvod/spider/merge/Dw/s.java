/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.spider.merge.E.f
 *  okhttp3.HttpUrl
 */
package com.github.catvod.spider.merge.Dw;

import com.github.catvod.spider.merge.A.c;
import com.github.catvod.spider.merge.E.f;
import java.util.List;
import java.util.Locale;
import okhttp3.HttpUrl;

public final class s {
    public static void a(Throwable throwable, Throwable throwable2) {
        f.e((Object)throwable, (String)"<this>");
        f.e((Object)throwable2, (String)"exception");
        if (throwable != throwable2) {
            c.a.a(throwable, throwable2);
        }
    }

    public static HttpUrl b(String string, List list2) {
        HttpUrl httpUrl = HttpUrl.get((String)string);
        string = httpUrl;
        if (list2 != null) {
            if (list2.size() == 0) {
                string = httpUrl;
            } else {
                string = httpUrl.newBuilder();
                for (List list2 : list2) {
                    if (list2.c()) {
                        string.addEncodedQueryParameter(list2.a(), list2.b().toString());
                        continue;
                    }
                    string.addQueryParameter(list2.a(), list2.b().toString());
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
        return s.c(string).trim();
    }
}

