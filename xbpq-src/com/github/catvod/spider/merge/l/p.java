/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.l;

import com.github.catvod.spider.merge.l.h;
import com.github.catvod.spider.merge.l.r;
import java.util.Iterator;

final class p
implements Iterable<String> {
    final CharSequence c;
    final r d;

    p(r r2, CharSequence charSequence) {
        this.d = r2;
        this.c = charSequence;
    }

    @Override
    public final Iterator<String> iterator() {
        return r.a(this.d, this.c);
    }

    public final String toString() {
        h h2 = h.b();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        stringBuilder = h2.a(stringBuilder, this);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

