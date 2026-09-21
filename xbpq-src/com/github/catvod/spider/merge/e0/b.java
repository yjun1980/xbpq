/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  okhttp3.Request$Builder
 *  okhttp3.RequestBody
 */
package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.e0.a;
import com.github.catvod.spider.merge.f0.g;
import com.github.catvod.spider.merge.m1.c;
import com.github.catvod.spider.merge.m1.d;
import com.github.catvod.spider.merge.n1.k;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.Request;
import okhttp3.RequestBody;

public final class b
extends com.github.catvod.spider.merge.m1.a {
    public static b g() {
        return a.a;
    }

    @Override
    public final d a(c c2) {
        String iterator2 = c2.c();
        String string = c2.d();
        Object object = c2.b();
        byte[] byArray = c2.a();
        c2 = null;
        if (byArray != null) {
            c2 = RequestBody.create(null, (byte[])byArray);
        }
        c2 = new Request.Builder().method(iterator2, (RequestBody)c2).url(string).addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:128.0) Gecko/20100101 Firefox/128.0");
        for (Map.Entry entry : object.entrySet()) {
            string = (String)entry.getKey();
            List list = (List)entry.getValue();
            if (list.size() > 1) {
                c2.removeHeader(string);
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    c2.addHeader(string, (String)iterator.next());
                }
                continue;
            }
            if (list.size() != 1) continue;
            c2.header(string, (String)list.get(0));
        }
        c2 = g.a().newCall(c2.build()).execute();
        if (c2.code() != 429) {
            object = c2.body().string();
            string = c2.request().url().toString();
            return new d(c2.code(), c2.message(), c2.headers().toMultimap(), (String)object, string);
        }
        c2.close();
        throw new k();
    }
}

