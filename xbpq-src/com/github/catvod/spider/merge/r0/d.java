/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.r0;

import com.github.catvod.spider.merge.r0.a;
import com.github.catvod.spider.merge.w0.b;
import com.github.catvod.spider.merge.w0.c;

public final class d
extends a<d, com.github.catvod.spider.merge.w0.d> {
    private final c b;

    public d(com.github.catvod.spider.merge.w0.d d2) {
        if (d2 instanceof b) {
            this.b = ((b)d2).b();
            return;
        }
        throw new IllegalArgumentException("Search result must have a continuation");
    }

    public final c c() {
        return this.b;
    }
}

