/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.SpiderDebug
 *  okhttp3.Call
 *  okhttp3.Response
 */
package com.github.catvod.spider.merge.k0;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.k0.b;
import java.io.IOException;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Response;

final class d
extends b<String> {
    final Map b;

    d(Map map) {
        this.b = map;
    }

    @Override
    public final void a(Exception exception) {
        this.d();
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

