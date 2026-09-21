/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  okhttp3.MediaType
 *  okhttp3.Response
 *  okhttp3.ResponseBody
 *  okio.BufferedSource
 *  okio.Okio
 *  okio.Source
 */
package com.github.catvod.spider.merge.af;

import java.io.InputStream;
import java.util.zip.InflaterInputStream;
import okhttp3.MediaType;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;

final class f
extends ResponseBody {
    final Response a;
    final InflaterInputStream b;

    f(Response response, InflaterInputStream inflaterInputStream) {
        this.a = response;
        this.b = inflaterInputStream;
    }

    public final long contentLength() {
        return this.a.body().contentLength();
    }

    public final MediaType contentType() {
        return this.a.body().contentType();
    }

    public final BufferedSource source() {
        return Okio.buffer((Source)Okio.source((InputStream)this.b));
    }
}

