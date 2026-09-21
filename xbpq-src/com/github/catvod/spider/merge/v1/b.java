/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.v1;

import com.github.catvod.spider.merge.F0.e;
import com.github.catvod.spider.merge.v1.j;
import java.util.Map;
import java.util.function.Function;

public final class b
implements Function {
    public final e a;

    public /* synthetic */ b(e e2) {
        this.a = e2;
    }

    public final Object apply(Object object) {
        e e2 = this.a;
        object = (Map.Entry)object;
        return new j(e2, (String)object.getKey(), (e)object.getValue());
    }
}

