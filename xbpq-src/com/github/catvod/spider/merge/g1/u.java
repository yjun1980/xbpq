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

public final class u
extends N {
    public final int a;
    private final Object b;

    public /* synthetic */ u(Object object, int n2) {
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
                Objects.requireNonNull(m2);
                object = c.b();
                j.f(new com.github.catvod.spider.merge.e1.j((StringBuilder)object), m2);
                return c.i((StringBuilder)object).contains((String)this.b);
            }
        }
        return ((Pattern)this.b).matcher(m2.u0()).find();
    }

    public final String toString() {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                return String.format(":containsWholeText(%s)", (String)this.b);
            }
        }
        return String.format(":matchesWholeOwnText(%s)", (Pattern)this.b);
    }
}

