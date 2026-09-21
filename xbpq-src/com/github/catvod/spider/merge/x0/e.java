/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  okhttp3.RequestBody
 *  rxhttp.wrapper.utils.b
 */
package com.github.catvod.spider.merge.x0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.d;
import com.github.catvod.spider.merge.x0.a;
import com.github.catvod.spider.merge.x0.h;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.RequestBody;
import rxhttp.wrapper.utils.b;

public final class e
extends a<e> {
    private Map<String, Object> i;

    public e(String string) {
        super(string);
    }

    @Override
    public final RequestBody h() {
        Map<String, Object> map = this.i;
        if (map == null) {
            return RequestBody.create(null, (byte[])new byte[0]);
        }
        return this.r(map);
    }

    @Override
    public final h k(String string, Object object) {
        if (this.i == null) {
            this.i = new LinkedHashMap<String, Object>();
        }
        this.i.put(string, object);
        return this;
    }

    @Override
    public final String q() {
        List list = com.github.catvod.spider.merge.A0.a.b(this.t());
        list = com.github.catvod.spider.merge.x.a.b(this.u(), list);
        Object object = com.github.catvod.spider.merge.A0.a.c(this.i);
        object = b.a().toJson(object);
        return list.newBuilder().addQueryParameter(cYh.d("0D232E3F"), (String)object).toString();
    }

    public final String toString() {
        StringBuilder stringBuilder = d.b(cYh.d("2D232E3F073B15312C2A22280B707C71"));
        stringBuilder.append(this.v());
        stringBuilder.append(cYh.d("053F2528073B15312C716A7A"));
        stringBuilder.append(this.i);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final e w(Map<String, ?> map) {
        if (this.i == null) {
            this.i = new LinkedHashMap<String, Object>();
        }
        this.n(map);
        return this;
    }
}

