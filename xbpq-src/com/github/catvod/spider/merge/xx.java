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

public abstract class xx<T> {
    private T l8 = null;

    protected void S(T t2) {
        this.l8 = t2;
    }

    public T getResult() {
        return this.l8;
    }

    protected void l8(Call object, Response response) {
        object = this.onParseResponse((Call)object, response);
        this.S(object);
        this.onResponse(object);
    }

    protected void onError(Call call, Exception exception) {
        this.onFailure(call, exception);
    }

    protected abstract void onFailure(Call var1, Exception var2);

    protected abstract T onParseResponse(Call var1, Response var2);

    protected abstract String onResponse(T var1);

    public static abstract class aA
    extends xx<Response> {
        @Override
        public Response onParseResponse(Call call, Response response) {
            return response;
        }
    }

    public static abstract class ut
    extends xx<String> {
        @Override
        public void onError(Call call, Exception exception) {
            this.S("");
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

