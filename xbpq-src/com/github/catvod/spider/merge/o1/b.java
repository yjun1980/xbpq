/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.o1;

import com.github.catvod.spider.merge.o1.a;
import java.util.Collections;
import java.util.List;

public final class b
extends a {
    protected final List<String> d;

    public b(a object) {
        String string = ((a)object).a;
        String string2 = ((a)object).b;
        String string3 = ((a)object).c;
        object = Collections.emptyList();
        super(string, string2, string3);
        this.d = Collections.unmodifiableList(object);
    }
}

