package com.github.catvod.spider.merge.k;

import java.util.ArrayList;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.k.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0162e implements CookieJar {
    public final List<Cookie> loadForRequest(HttpUrl httpUrl) {
        List<Cookie> list = C0164g.d.get(httpUrl.host());
        return list != null ? list : new ArrayList();
    }

    public final void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        C0164g.d.put(httpUrl.host(), list);
    }
}
