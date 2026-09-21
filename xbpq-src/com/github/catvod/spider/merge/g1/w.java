/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g1;

import com.github.catvod.spider.merge.J.j;
import com.github.catvod.spider.merge.d1.c;
import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.g1.N;
import java.util.Objects;
import java.util.regex.Pattern;

public final class w
extends N {
    public final int a;
    private final Object b;

    public /* synthetic */ w(Object object, int n2) {
        this.a = n2;
        this.b = object;
    }

    @Override
    public final boolean a(m object, m m2) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                return ((String)this.b).equals(m2.c0());
            }
        }
        object = (Pattern)this.b;
        Objects.requireNonNull(m2);
        StringBuilder stringBuilder = c.b();
        j.f(new com.github.catvod.spider.merge.e1.j(stringBuilder), m2);
        return ((Pattern)object).matcher(c.i(stringBuilder)).find();
    }

    public final String toString() {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                return String.format("#%s", (String)this.b);
            }
        }
        return String.format(":matchesWholeText(%s)", (Pattern)this.b);
    }
}

