/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  okhttp3.Interceptor
 *  okhttp3.Interceptor$Chain
 *  okhttp3.Request
 *  okhttp3.Response
 */
package com.github.catvod.spider.merge.w0;

import com.github.catvod.spider.merge.E.f;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.w0.a;
import com.github.catvod.spider.merge.x.c;
import com.github.catvod.spider.merge.x.d;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public final class b
implements Interceptor {
    private final com.github.catvod.spider.merge.r0.a c;
    private final c d;

    public b(com.github.catvod.spider.merge.r0.a a2) {
        f.e(a2, cYh.d("04312239320913222025323D1E"));
        this.c = a2;
        this.d = com.github.catvod.spider.merge.x.d.a(a.c);
    }

    private final boolean a(int ... nArray) {
        int n2 = this.c.b();
        int n3 = nArray.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            if (nArray[i2] != n2) continue;
            return true;
        }
        return false;
    }

    private final Response b(Request object, long l2) {
        object = this.d.getValue();
        f.d(object, cYh.d("5B3724257A39063329346972497E6F78"));
        object = (com.github.catvod.spider.merge.r0.b)object;
        this.c.getClass();
        Response response = object.get();
        if (response != null) {
            long l3 = response.receivedResponseAtMillis();
            object = response;
            if (l2 != -1L) {
                object = response;
                if (System.currentTimeMillis() - l3 > l2) {
                    object = null;
                }
            }
            return object;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final Response intercept(Interceptor.Chain object) {
        Response response;
        Object var4_4;
        Request request;
        block8: {
            block7: {
                Response response2;
                f.e(object, cYh.d("0438203839"));
                request = object.request();
                boolean bl = this.a(2, 4);
                var4_4 = null;
                if (!bl) break block7;
                response = response2 = this.b(request, this.c.c());
                if (response2 != null) break block8;
                if (this.a(2)) throw new com.github.catvod.spider.merge.v0.a();
            }
            response = null;
        }
        if (response != null) {
            return response;
        }
        try {
            object = object.proceed(request);
            if (this.a(1)) return object;
            object = this.d.getValue();
            f.d(object, cYh.d("5B3724257A39063329346972497E6F78"));
            object = (com.github.catvod.spider.merge.r0.b)object;
            this.c.getClass();
            object = object.a();
            f.d(object, cYh.d("1C5A6171777A47706171777A47706171777A487FA8CCC915291C180E191F33070E031CBCCFF1A4EDD8BEDFDB6DB9F8ED81E1C3B7DFCA82DADEBEEBD682D6D8B4D2FF80ECD2B4FAC26D706171777A47706171777A47706171773906332934792A122469233229173F2F223276473320323F3F34243330233F00296F3236390F350A342E736D706171777A47706171777A472D"));
            return object;
        }
        catch (Throwable throwable) {
            object = var4_4;
            if (this.a(5)) {
                object = this.b(request, this.c.c());
            }
            if (object == null) throw throwable;
            return object;
        }
    }
}

