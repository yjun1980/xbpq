/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  okhttp3.Call
 *  okhttp3.OkHttpClient
 *  okhttp3.Request
 *  okhttp3.Request$Builder
 *  okhttp3.Response
 */
package com.github.catvod.spider.merge.k0;

import com.github.catvod.spider.merge.k0.b;
import java.io.IOException;
import java.util.Map;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

final class c {
    private String a;
    private Object b = null;
    private final Map<String, String> c;
    private final Map<String, String> d;
    private final b e;
    private Request f;
    private Request.Builder g;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    c(String object3, Map object2, b b2) {
        this.a = object3;
        this.c = null;
        this.d = object2;
        this.e = b2;
        object3 = new Request.Builder();
        this.g = object3;
        object3.url(this.a);
        object3 = this.b;
        if (object3 != null) {
            this.g.tag(object3);
        }
        for (Object object3 : object2.keySet()) {
            this.g.addHeader((String)object3, this.d.get(object3));
        }
        this.f = this.g.build();
    }

    final void a(OkHttpClient object) {
        block3: {
            object = object.newCall(this.f);
            Response response = object.execute();
            b b2 = this.e;
            if (b2 == null) break block3;
            try {
                b2.c((Call)object, response);
            }
            catch (IOException iOException) {
                object = this.e;
                if (object == null) break block3;
                ((b)object).a(iOException);
            }
        }
    }

    public final void b(Object object) {
        this.b = object;
    }
}

