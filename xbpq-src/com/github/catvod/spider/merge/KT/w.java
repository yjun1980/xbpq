/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.SpiderDebug
 *  okhttp3.Response
 */
package com.github.catvod.spider.merge.KT;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.KT.y;
import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.by.p;
import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.a.a;
import com.github.catvod.spider.merge.xc.c0.f;
import com.github.catvod.spider.merge.xc.e0.d;
import com.github.catvod.spider.merge.xc.s0.B;
import java.util.Map;
import okhttp3.Response;

public final class w
extends com.github.catvod.spider.merge.xc.g0.i
implements p {
    public final String d;
    public final Map e;
    public final int f;

    public w(String string, Map map, int n2, d d2) {
        this.d = string;
        this.e = map;
        this.f = n2;
        super(d2);
    }

    @Override
    public final d create(Object object, d d2) {
        object = this.e;
        int n2 = this.f;
        return new w(this.d, (Map)object, n2, d2);
    }

    @Override
    public final Object invoke(Object object, Object object2) {
        return ((w)this.create((B)object, (d)object2)).invokeSuspend(com.github.catvod.spider.merge.xc.c0.f.a);
    }

    @Override
    public final Object invokeSuspend(Object object) {
        com.github.catvod.spider.merge.xc.a.a.C(object);
        object = y.a;
        Response response = A.i(this.d, this.e);
        Object var2_3 = null;
        object = response != null && (object = response.headers()) != null ? object.get("Content-Range") : null;
        StringBuilder stringBuilder = new StringBuilder("---\u7b2c");
        stringBuilder.append(this.f);
        stringBuilder.append("\u5757\u4e0b\u8f7d\u5b8c\u6210;Content-Range:");
        stringBuilder.append((String)object);
        SpiderDebug.log((String)stringBuilder.toString());
        object = var2_3;
        if (response != null) {
            object = response.body();
        }
        i.b(object);
        return object.byteStream();
    }
}

