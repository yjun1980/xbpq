/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.F0.a;
import com.github.catvod.spider.merge.F0.b;
import com.github.catvod.spider.merge.F0.e;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.stream.Stream;

public final class c
extends ArrayList<Object> {
    public final e a(int n2) {
        e e2 = new e();
        Object object = this.get(n2);
        if (object instanceof e) {
            e2 = (e)object;
        }
        return e2;
    }

    public final Stream<e> c() {
        return this.stream().filter(new b(e.class)).map(new a(e.class));
    }

    @Override
    public final Object get(int n2) {
        Object var2_2 = n2 < ((AbstractCollection)this).size() ? super.get(n2) : null;
        return var2_2;
    }
}

