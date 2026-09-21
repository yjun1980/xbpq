/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.KT;

import com.github.catvod.spider.merge.KT.G;
import com.github.catvod.spider.merge.KT.y;
import com.github.catvod.spider.merge.by.p;
import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.a.a;
import com.github.catvod.spider.merge.xc.c0.f;
import com.github.catvod.spider.merge.xc.e0.d;
import com.github.catvod.spider.merge.xc.s0.B;
import java.util.HashMap;
import java.util.Map;

public final class v
extends com.github.catvod.spider.merge.xc.g0.i
implements p {
    public final String d;
    public final Map e;

    public v(String string, Map map, d d2) {
        this.d = string;
        this.e = map;
        super(d2);
    }

    @Override
    public final d create(Object object, d d2) {
        return new v(this.d, this.e, d2);
    }

    @Override
    public final Object invoke(Object object, Object object2) {
        return ((v)this.create((B)object, (d)object2)).invokeSuspend(f.a);
    }

    @Override
    public final Object invokeSuspend(Object hashMap) {
        com.github.catvod.spider.merge.xc.a.a.C(hashMap);
        hashMap = y.a;
        hashMap = this.e;
        i.e(hashMap, "headers");
        hashMap = new HashMap<String, String>(hashMap);
        hashMap.put("Range", "bytes=0-1048575");
        hashMap.put("range", "bytes=0-1048575");
        return G.d(this.d, hashMap);
    }
}

