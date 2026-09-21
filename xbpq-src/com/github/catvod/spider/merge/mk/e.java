/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  okhttp3.Cookie
 *  okhttp3.CookieJar
 *  okhttp3.HttpUrl
 */
package com.github.catvod.spider.merge.mk;

import com.github.catvod.spider.merge.mk.g;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

final class e
implements CookieJar {
    e() {
    }

    public final List<Cookie> loadForRequest(HttpUrl object) {
        if ((object = g.d.get(object.host())) == null) {
            object = new ArrayList();
        }
        return object;
    }

    public final void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        g.d.put(httpUrl.host(), list);
    }
}

