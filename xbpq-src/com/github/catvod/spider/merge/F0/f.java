/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.F0.g;
import com.github.catvod.spider.merge.F0.j;
import java.io.StringReader;

public final class f<T> {
    private final Class<T> a;

    f(Class<T> clazz) {
        this.a = clazz;
    }

    public final T a(String string) {
        return new g(new j(new StringReader(string))).e(this.a);
    }
}

