/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.ej;

import com.github.catvod.spider.merge.Em.l;
import com.github.catvod.spider.merge.ej.N;
import java.util.regex.Pattern;

public final class K
extends N {
    private final Pattern a;

    public K(Pattern pattern) {
        this.a = pattern;
    }

    @Override
    public final boolean a(l l2, l l3) {
        return this.a.matcher(l3.p0()).find();
    }

    public final String toString() {
        return String.format(":matches(%s)", this.a);
    }
}

