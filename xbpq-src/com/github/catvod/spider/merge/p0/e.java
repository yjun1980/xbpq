/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.p0;

import com.github.catvod.spider.merge.p0.b;
import com.github.catvod.spider.merge.p0.d;
import com.github.catvod.spider.merge.p0.f;
import java.util.List;
import java.util.Map;

public final class e
implements b {
    private final Map<String, d> a;
    private final List<f> b;

    public e(List<f> list, Map<String, d> map) {
        this.a = map;
        this.b = list;
    }

    @Override
    public final String a(String object) {
        object = ((String)object).toCharArray();
        for (f f2 : this.b) {
            object = this.a.get(f2.b()).a((char[])object, f2.a());
        }
        return String.valueOf((char[])object);
    }
}

