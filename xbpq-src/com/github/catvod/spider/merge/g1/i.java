/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g1;

import com.github.catvod.spider.merge.K1.d;
import com.github.catvod.spider.merge.d1.c;
import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.g1.N;

public final class i
extends N {
    public final int a;
    private final String b;

    public i(String string, int n2) {
        this.a = n2;
        if (n2 != 1) {
            this.b = string;
            return;
        }
        this.b = d.e(c.g(string));
    }

    @Override
    public final boolean a(m m2, m m3) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                return m3.n(this.b);
            }
        }
        return d.e(m3.h0()).contains(this.b);
    }

    public final String toString() {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                return String.format("[%s]", this.b);
            }
        }
        return String.format(":containsOwn(%s)", this.b);
    }
}

