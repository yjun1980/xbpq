/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.SpiderDebug
 *  okhttp3.Call
 *  okhttp3.Response
 */
package com.github.catvod.spider.merge.mk;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.mk.c;
import java.io.IOException;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Response;

final class f
extends c<String> {
    final Map b;

    f(Map map) {
        this.b = map;
    }

    @Override
    public final void onFailure(Call call, Exception exception) {
        this.b();
        SpiderDebug.log((Throwable)exception);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final Object onParseResponse(Call object, Response response) {
        try {
            object = this.b;
            if (object == null) return response.body().string();
        }
        catch (IOException iOException) {
            return "";
        }
        object.clear();
        this.b.putAll(response.headers().toMultimap());
        return response.body().string();
    }
}

