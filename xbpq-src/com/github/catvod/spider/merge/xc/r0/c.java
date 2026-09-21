/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.r0;

import com.github.catvod.spider.merge.by.p;
import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.q0.e;
import com.github.catvod.spider.merge.xc.r0.b;
import java.util.Iterator;

public final class c
implements e {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final p d;

    public c(CharSequence charSequence, int n2, int n3, p p2) {
        i.e(charSequence, "input");
        this.a = charSequence;
        this.b = n2;
        this.c = n3;
        this.d = p2;
    }

    @Override
    public final Iterator iterator() {
        return new b(this);
    }
}

