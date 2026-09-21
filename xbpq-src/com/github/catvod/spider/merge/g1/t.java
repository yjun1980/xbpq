/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g1;

import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.g1.N;
import java.util.regex.Pattern;

public final class t
extends N {
    public final int a;
    private final Object b;

    public /* synthetic */ t(Object object, int n2) {
        this.a = n2;
        this.b = object;
    }

    @Override
    public final boolean a(m m2, m m3) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                return m3.u0().contains((String)this.b);
            }
        }
        return ((Pattern)this.b).matcher(m3.h0()).find();
    }

    public final String toString() {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                return String.format(":containsWholeOwnText(%s)", (String)this.b);
            }
        }
        return String.format(":matchesOwn(%s)", (Pattern)this.b);
    }
}

