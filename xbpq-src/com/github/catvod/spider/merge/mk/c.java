/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  okhttp3.Call
 *  okhttp3.Response
 */
package com.github.catvod.spider.merge.mk;

import okhttp3.Call;
import okhttp3.Response;

public abstract class c<T> {
    private T a = null;

    protected final void a(Call object, Response response) {
        object = this.onParseResponse((Call)object, response);
        this.a = object;
        this.onResponse(object);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    protected final void b() {
        this.a = "";
    }

    public T getResult() {
        return this.a;
    }

    protected void onError(Call call, Exception exception) {
        this.onFailure(call, exception);
    }

    protected abstract void onFailure(Call var1, Exception var2);

    protected abstract T onParseResponse(Call var1, Response var2);

    protected abstract void onResponse(T var1);
}

