/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.N;
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
        Pattern pattern = this.a;
        return String.format(cYh.d("5D3D2025343202230E263972422368"), pattern);
    }
}

