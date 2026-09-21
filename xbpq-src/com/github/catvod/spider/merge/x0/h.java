/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  okhttp3.Headers
 *  okhttp3.HttpUrl
 *  okhttp3.Request
 *  okhttp3.RequestBody
 */
package com.github.catvod.spider.merge.x0;

import com.github.catvod.spider.merge.r0.a;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;

public interface h<P extends h<P>> {
    public Request a();

    public int b();

    public RequestBody c();

    public Object d(Map<String, String> var1);

    public int e();

    public HttpUrl f();

    public Object g(Object var1);

    public RequestBody h();

    public boolean i();

    public a j();

    public Object k(String var1, Object var2);

    public <T> Object l(Class<? super T> var1, T var2);

    public Headers m();
}

