/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  okhttp3.Call
 *  okhttp3.Response
 */
package com.github.catvod.spider.merge.mk;

import com.github.catvod.spider.merge.mk.c;
import okhttp3.Call;
import okhttp3.Response;

public abstract class a
extends c<Response> {
    @Override
    public Response onParseResponse(Call call, Response response) {
        return response;
    }
}

