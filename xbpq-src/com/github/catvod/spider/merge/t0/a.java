/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.TypeAdapter
 *  com.google.gson.reflect.TypeToken
 *  com.google.gson.stream.JsonWriter
 *  okhttp3.MediaType
 *  okhttp3.RequestBody
 *  okio.Buffer
 *  okio.ByteString
 *  rxhttp.wrapper.utils.b
 */
package com.github.catvod.spider.merge.t0;

import com.github.catvod.spider.merge.K.c;
import com.github.catvod.spider.merge.cYh;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import okio.ByteString;
import rxhttp.wrapper.utils.b;

public final class a
implements com.github.catvod.spider.merge.s0.a {
    private static final MediaType b = MediaType.get((String)cYh.d("0620313D3E390624283E39750D232E3F6C7A04382023243F136D140511775F"));
    private final Gson a;

    private a(Gson gson) {
        this.a = gson;
    }

    public static a b() {
        Gson gson = rxhttp.wrapper.utils.b.a();
        if (gson != null) {
            return new a(gson);
        }
        throw new NullPointerException(cYh.d("00232E3F77675A702F243B36"));
    }

    @Override
    public final <T> RequestBody a(T t2) {
        TypeToken typeToken = TypeToken.get(t2.getClass());
        TypeAdapter typeAdapter = this.a.getAdapter(typeToken);
        typeToken = new Buffer();
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(typeToken.outputStream(), c.a);
        outputStreamWriter = this.a.newJsonWriter((Writer)outputStreamWriter);
        typeAdapter.write((JsonWriter)outputStreamWriter, t2);
        outputStreamWriter.close();
        return RequestBody.create((MediaType)b, (ByteString)typeToken.readByteString());
    }
}

