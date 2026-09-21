package com.github.catvod.spider.merge.k;

import android.text.TextUtils;
import com.github.catvod.spider.merge.b.n;
import com.github.catvod.spider.merge.cYh;
import java.io.IOException;
import java.util.Map;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* renamed from: com.github.catvod.spider.merge.k.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0161d {
    private String a;
    private Object b;
    private final Map<String, String> c;
    private final Map<String, String> d;
    private final AbstractC0160c e;
    private Request f;
    private Request.Builder g;

    private C0161d(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2, AbstractC0160c abstractC0160c) {
        RequestBody build;
        this.b = null;
        this.a = str2;
        this.c = map;
        this.d = map2;
        this.e = abstractC0160c;
        this.g = new Request.Builder();
        if (str.equals(cYh.d("201515"))) {
            if (map != null) {
                this.a = n.b(new StringBuilder(), this.a, cYh.d("58"));
                for (String str4 : map.keySet()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.a);
                    sb.append(str4);
                    sb.append(cYh.d("5A"));
                    this.a = n.b(sb, this.c.get(str4), cYh.d("41"));
                }
                this.a = this.a.substring(0, r2.length() - 1);
            }
        } else if (str.equals(cYh.d("371F1205"))) {
            Request.Builder builder = this.g;
            if (TextUtils.isEmpty(str3)) {
                FormBody.Builder builder2 = new FormBody.Builder();
                if (map != null) {
                    for (String str5 : map.keySet()) {
                        builder2.add(str5, this.c.get(str5));
                    }
                }
                build = builder2.build();
            } else {
                build = RequestBody.create(MediaType.parse(cYh.d("0620313D3E390624283E39750D232E3F6C7A04382023243F136D342531775F")), str3);
            }
            builder.post(build);
        }
        this.g.url(this.a);
        Object obj = this.b;
        if (obj != null) {
            this.g.tag(obj);
        }
        Map<String, String> map3 = this.d;
        if (map3 != null) {
            for (String str6 : map3.keySet()) {
                this.g.addHeader(str6, this.d.get(str6));
            }
        }
        this.f = this.g.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0161d(String str, String str2, Map map, AbstractC0160c abstractC0160c) {
        this(cYh.d("371F1205"), str, str2, null, map, abstractC0160c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0161d(String str, String str2, Map<String, String> map, Map<String, String> map2, AbstractC0160c abstractC0160c) {
        this(str, str2, null, map, map2, abstractC0160c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(OkHttpClient okHttpClient) {
        Call newCall = okHttpClient.newCall(this.f);
        try {
            Response execute = newCall.execute();
            AbstractC0160c abstractC0160c = this.e;
            if (abstractC0160c != null) {
                abstractC0160c.a(newCall, execute);
            }
        } catch (IOException e) {
            AbstractC0160c abstractC0160c2 = this.e;
            if (abstractC0160c2 != null) {
                abstractC0160c2.onError(newCall, e);
            }
        }
    }

    public final void b(Object obj) {
        this.b = obj;
    }
}
