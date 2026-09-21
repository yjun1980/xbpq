package com.github.catvod.spider.merge.h;

import android.text.TextUtils;
import com.github.catvod.spider.merge.b.n;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.j.o;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.h.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0150c {
    private final Map<String, List<String>> a;
    private final Map<String, String> b;
    private final Map<String, String> c;
    private final String d;
    private final String e;
    private Request f;
    private String g;
    private Object h;

    private C0150c(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        RequestBody build;
        this.g = str2;
        this.e = str3;
        this.d = str;
        this.c = map;
        this.b = map2;
        this.a = map3;
        Request.Builder builder = new Request.Builder();
        if (str.equals(cYh.d("201515")) && map != null) {
            this.g = n.b(new StringBuilder(), this.g, cYh.d("58"));
            for (String str4 : map.keySet()) {
                this.g = this.g.concat(str4 + cYh.d("5A") + this.c.get(str4) + cYh.d("41"));
            }
            String str5 = this.g;
            int i = o.a;
            if (str5 != null && str5.length() > 1) {
                str5 = str5.substring(0, str5.length() - 1);
            }
            this.g = str5;
        }
        if (this.d.equals(cYh.d("371F1205"))) {
            if (TextUtils.isEmpty(this.e)) {
                FormBody.Builder builder2 = new FormBody.Builder();
                Map<String, String> map4 = this.c;
                if (map4 != null) {
                    for (String str6 : map4.keySet()) {
                        builder2.add(str6, this.c.get(str6));
                    }
                }
                build = builder2.build();
            } else {
                build = RequestBody.create(MediaType.parse(cYh.d("0620313D3E390624283E39750D232E3F6C7A04382023243F136D342531775F")), this.e);
            }
            builder.post(build);
        }
        Map<String, String> map5 = this.b;
        if (map5 != null) {
            for (String str7 : map5.keySet()) {
                builder.addHeader(str7, this.b.get(str7));
            }
        }
        Object obj = this.h;
        if (obj != null) {
            builder.tag(obj);
        }
        this.f = builder.url(this.g).build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0150c(String str, String str2, Map map) {
        this(cYh.d("371F1205"), str, str2, null, map, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0150c(String str, String str2, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        this(str, str2, null, map, map2, map3);
    }

    public final d a(OkHttpClient okHttpClient) {
        try {
            Response execute = okHttpClient.newCall(this.f).execute();
            Map<String, List<String>> map = this.a;
            if (map != null) {
                map.clear();
            }
            Map<String, List<String>> map2 = this.a;
            if (map2 != null) {
                map2.putAll(execute.headers().toMultimap());
            }
            return new d(execute.code(), execute.body().string());
        } catch (IOException unused) {
            return new d();
        }
    }

    public final C0150c b() {
        this.h = null;
        return this;
    }
}
