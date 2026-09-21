/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  okhttp3.Call
 *  okhttp3.Response
 */
package com.github.catvod.spider.merge.k0;

import okhttp3.Call;
import okhttp3.Response;

public abstract class b<T> {
    private T a = null;

    protected abstract void a(Exception var1);

    protected abstract void b(T var1);

    protected final void c(Call object, Response response) {
        object = this.onParseResponse((Call)object, response);
        this.a = object;
        this.b(object);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    protected final void d() {
        this.a = "";
    }

    public T getResult() {
        return this.a;
    }

    protected abstract T onParseResponse(Call var1, Response var2);
}

