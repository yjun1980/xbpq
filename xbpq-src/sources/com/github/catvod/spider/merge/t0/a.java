package com.github.catvod.spider.merge.t0;

import com.github.catvod.spider.merge.K.c;
import com.github.catvod.spider.merge.cYh;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import java.io.OutputStreamWriter;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import rxhttp.wrapper.utils.b;

/* loaded from: classes.dex */
public final class a implements com.github.catvod.spider.merge.s0.a {
    private static final MediaType b = MediaType.get(cYh.d("0620313D3E390624283E39750D232E3F6C7A04382023243F136D140511775F"));
    private final Gson a;

    private a(Gson gson) {
        this.a = gson;
    }

    public static a b() {
        Gson a = b.a();
        if (a != null) {
            return new a(a);
        }
        throw new NullPointerException(cYh.d("00232E3F77675A702F243B36"));
    }

    @Override // com.github.catvod.spider.merge.s0.a
    public final <T> RequestBody a(T t) {
        TypeAdapter adapter = this.a.getAdapter(TypeToken.get(t.getClass()));
        Buffer buffer = new Buffer();
        JsonWriter newJsonWriter = this.a.newJsonWriter(new OutputStreamWriter(buffer.outputStream(), c.a));
        adapter.write(newJsonWriter, t);
        newJsonWriter.close();
        return RequestBody.create(b, buffer.readByteString());
    }
}
