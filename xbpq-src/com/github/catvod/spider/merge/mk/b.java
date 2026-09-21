/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  okhttp3.Call
 *  okhttp3.Response
 */
package com.github.catvod.spider.merge.mk;

import com.github.catvod.spider.merge.mk.c;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Response;

public abstract class b
extends c<String> {
    @Override
    public void onError(Call call, Exception exception) {
        this.b();
        this.onFailure(call, exception);
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

