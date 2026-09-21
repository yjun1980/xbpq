package com.github.catvod.spider.merge.x0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0059d;
import com.github.catvod.spider.merge.x.C0243a;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* loaded from: classes.dex */
public final class e extends a<e> {
    private Map<String, Object> i;

    public e(String str) {
        super(str);
    }

    @Override // com.github.catvod.spider.merge.x0.h
    public final RequestBody h() {
        Map<String, Object> map = this.i;
        return map == null ? RequestBody.create((MediaType) null, new byte[0]) : r(map);
    }

    @Override // com.github.catvod.spider.merge.x0.h
    public final h k(String str, Object obj) {
        if (this.i == null) {
            this.i = new LinkedHashMap();
        }
        this.i.put(str, obj);
        return this;
    }

    @Override // com.github.catvod.spider.merge.x0.b
    public final String q() {
        HttpUrl b = C0243a.b(u(), com.github.catvod.spider.merge.A0.a.b(t()));
        return b.newBuilder().addQueryParameter(cYh.d("0D232E3F"), rxhttp.wrapper.utils.b.a().toJson(com.github.catvod.spider.merge.A0.a.c(this.i))).toString();
    }

    public final String toString() {
        StringBuilder b = C0059d.b(cYh.d("2D232E3F073B15312C2A22280B707C71"));
        b.append(v());
        b.append(cYh.d("053F2528073B15312C716A7A"));
        b.append(this.i);
        b.append('}');
        return b.toString();
    }

    public final e w(Map<String, ?> map) {
        if (this.i == null) {
            this.i = new LinkedHashMap();
        }
        n(map);
        return this;
    }
}
