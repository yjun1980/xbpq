/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  okhttp3.Call
 *  okhttp3.FormBody
 *  okhttp3.FormBody$Builder
 *  okhttp3.MediaType
 *  okhttp3.OkHttpClient
 *  okhttp3.Request
 *  okhttp3.Request$Builder
 *  okhttp3.RequestBody
 *  okhttp3.Response
 */
package com.github.catvod.spider.merge.k;

import android.text.TextUtils;
import com.github.catvod.spider.merge.b.n;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.k.c;
import java.io.IOException;
import java.util.Iterator;
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

    /*
     * WARNING - void declaration
     */
    private d(String object3, String charSequence2, String iterator, Map<String, String> object22, Map<String, String> map, c c2) {
        Map<String, String> map2;
        void var6_19;
        void var5_18;
        void var4_15;
        Object object4;
        this.a = object4;
        this.c = var4_15;
        this.d = var5_18;
        this.e = var6_19;
        this.g = new Request.Builder();
        if (!((String)object3).equals(cYh.d("201515"))) {
            if (((String)object3).equals(cYh.d("371F1205"))) {
                void var1_5;
                Iterator iterator2;
                object4 = this.g;
                if (!TextUtils.isEmpty((CharSequence)((Object)iterator2))) {
                    RequestBody requestBody = RequestBody.create((MediaType)MediaType.parse((String)cYh.d("0620313D3E390624283E39750D232E3F6C7A04382023243F136D342531775F")), (String)((Object)iterator2));
                } else {
                    FormBody.Builder builder = new FormBody.Builder();
                    if (var4_15 != null) {
                        for (String string : var4_15.keySet()) {
                            builder.add(string, this.c.get(string));
                        }
                    }
                    FormBody formBody = builder.build();
                }
                object4.post((RequestBody)var1_5);
            }
        } else if (var4_15 != null) {
            this.a = n.b(new StringBuilder(), this.a, cYh.d("58"));
            for (String string : var4_15.keySet()) {
                object4 = new StringBuilder();
                ((StringBuilder)object4).append(this.a);
                ((StringBuilder)object4).append(string);
                ((StringBuilder)object4).append(cYh.d("5A"));
                this.a = n.b((StringBuilder)object4, this.c.get(string), cYh.d("41"));
            }
            String string = this.a;
            this.a = string.substring(0, string.length() - 1);
        }
        this.g.url(this.a);
        Object object2 = this.b;
        if (object2 != null) {
            this.g.tag(object2);
        }
        if ((map2 = this.d) != null) {
            for (Object object4 : map2.keySet()) {
                this.g.addHeader((String)object4, this.d.get(object4));
            }
        }
        this.f = this.g.build();
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    d(String string, String string2, Map map, c c2) {
        this(cYh.d("371F1205"), string, string2, null, map, c2);
    }

    d(String string, String string2, Map<String, String> map, Map<String, String> map2, c c2) {
        this(string, string2, null, map, map2, c2);
    }

    final void a(OkHttpClient okHttpClient) {
        block3: {
            okHttpClient = okHttpClient.newCall(this.f);
            Object object = okHttpClient.execute();
            c c2 = this.e;
            if (c2 == null) break block3;
            try {
                c2.a((Call)okHttpClient, (Response)object);
            }
            catch (IOException iOException) {
                object = this.e;
                if (object == null) break block3;
                ((c)object).onError((Call)okHttpClient, iOException);
            }
        }
    }

    public final void b(Object object) {
        this.b = object;
    }
}

