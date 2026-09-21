/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.d0.B;
import java.util.AbstractCollection;
import java.util.ArrayList;

public final class C
extends ArrayList<B> {
    private final int c;

    C() {
        super(0);
        this.c = 0;
    }

    final boolean a() {
        boolean bl = ((AbstractCollection)this).size() < this.c;
        return bl;
    }
}

