/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.ej;

import com.github.catvod.spider.merge.Em.l;
import com.github.catvod.spider.merge.ej.N;
import java.util.regex.Pattern;

public final class L
extends N {
    private final Pattern a;

    public L(Pattern pattern) {
        this.a = pattern;
    }

    @Override
    public final boolean a(l l2, l l3) {
        return this.a.matcher(l3.e0()).find();
    }

    public final String toString() {
        return String.format(":matchesOwn(%s)", this.a);
    }
}

