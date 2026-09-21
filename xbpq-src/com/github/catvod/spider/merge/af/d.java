/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  okhttp3.OkHttpClient
 *  okhttp3.Request
 *  okhttp3.Request$Builder
 *  okhttp3.Response
 */
package com.github.catvod.spider.merge.af;

import com.github.catvod.spider.merge.af.e;
import java.io.IOException;
import java.util.Map;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

final class d {
    private final Map<String, String> a;
    private final Map<String, String> b;
    private Request c;
    private String d;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    d(String string) {
        this.d = string;
        this.b = null;
        this.a = null;
        this.c = new Request.Builder().url(this.d).build();
    }

    public final e a(OkHttpClient object) {
        try {
            Response response = object.newCall(this.c).execute();
            response.code();
            object = response.body().string();
            response.headers().toMultimap();
            object = new e((String)object);
            return object;
        }
        catch (IOException iOException) {
            return new e();
        }
    }
}

