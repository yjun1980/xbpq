/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  okhttp3.Call
 *  okhttp3.FormBody$Builder
 *  okhttp3.MediaType
 *  okhttp3.OkHttpClient
 *  okhttp3.Request
 *  okhttp3.Request$Builder
 *  okhttp3.RequestBody
 *  okhttp3.Response
 */
package com.github.catvod.spider.merge.mk;

import android.text.TextUtils;
import com.github.catvod.spider.merge.dp.n;
import com.github.catvod.spider.merge.mk.c;
import java.io.IOException;
import java.util.Map;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

final class d {
    private String a;
    private Object b = null;
    private final Map<String, String> c;
    private final Map<String, String> d;
    private final c e;
    private Request f;
    private Request.Builder g;

    private d(String object4, String object2, String string2, Map<String, String> object3, Map<String, String> map, c c2) {
        this.a = object2;
        this.c = object3;
        this.d = map;
        this.e = c2;
        this.g = new Request.Builder();
        if (!((String)object4).equals("GET")) {
            if (((String)object4).equals("POST")) {
                object2 = this.g;
                if (!TextUtils.isEmpty((CharSequence)string2)) {
                    object4 = RequestBody.create((MediaType)MediaType.parse((String)"application/json; charset=utf-8"), (String)string2);
                } else {
                    object4 = new FormBody.Builder();
                    if (object3 != null) {
                        for (String string2 : object3.keySet()) {
                            object4.add(string2, this.c.get(string2));
                        }
                    }
                    object4 = object4.build();
                }
                object2.post((RequestBody)object4);
            }
        } else if (object3 != null) {
            this.a = n.b(new StringBuilder(), this.a, "?");
            for (String string2 : object3.keySet()) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(this.a);
                ((StringBuilder)object2).append(string2);
                ((StringBuilder)object2).append("=");
                this.a = n.b((StringBuilder)object2, this.c.get(string2), "&");
            }
            object4 = this.a;
            this.a = ((String)object4).substring(0, ((String)object4).length() - 1);
        }
        this.g.url(this.a);
        object4 = this.b;
        if (object4 != null) {
            this.g.tag(object4);
        }
        if ((object4 = this.d) != null) {
            for (Object object4 : object4.keySet()) {
                this.g.addHeader((String)object4, this.d.get(object4));
            }
        }
        this.f = this.g.build();
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    d(String string, String string2, Map map, c c2) {
        this("POST", string, string2, null, map, c2);
    }

    d(String string, String string2, Map<String, String> map, Map<String, String> map2, c c2) {
        this(string, string2, null, map, map2, c2);
    }

    final void a(OkHttpClient okHttpClient) {
        block3: {
            okHttpClient = okHttpClient.newCall(this.f);
            Response response = okHttpClient.execute();
            c c2 = this.e;
            if (c2 == null) break block3;
            try {
                c2.a((Call)okHttpClient, response);
            }
            catch (IOException iOException) {
                c2 = this.e;
                if (c2 == null) break block3;
                c2.onError((Call)okHttpClient, iOException);
            }
        }
    }

    public final void b(Object object) {
        this.b = object;
    }
}

