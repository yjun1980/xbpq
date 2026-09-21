/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  okhttp3.Call
 *  okhttp3.Response
 */
package com.github.catvod.spider.merge;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.Response;

public abstract class \u078a<T> {
    private T \u037f = null;

    public T getResult() {
        return this.\u037f;
    }

    protected void onError(Call call, Exception exception) {
        this.onFailure(call, exception);
    }

    protected abstract void onFailure(Call var1, Exception var2);

    protected abstract T onParseResponse(Call var1, Response var2);

    protected abstract void onResponse(T var1);

    protected void \u037f(Call object, Response response) {
        object = this.onParseResponse((Call)object, response);
        this.\u0528(object);
        this.onResponse(object);
    }

    protected void \u0528(T t2) {
        this.\u037f = t2;
    }

    public static abstract class \u037f
    extends \u078a<Response> {
        @Override
        public Response onParseResponse(Call call, Response response) {
            return response;
        }
    }

    public static abstract class \u0528
    extends \u078a<String> {
        @Override
        public void onError(Call call, Exception exception) {
            this.\u0528("");
            super.onError(call, exception);
        }

        @Override
        public String onParseResponse(Call object, Response response) {
            try {
                object = response.body().string();
                return object;
            }
            catch (IOException iOException) {
                return "";
            }
        }
    }
}

