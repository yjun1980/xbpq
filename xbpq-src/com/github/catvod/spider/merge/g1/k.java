/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g1;

import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.d1.c;
import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.g1.N;
import java.io.Serializable;
import java.util.regex.Pattern;

public final class k
extends N {
    public final int a;
    private final Serializable b;

    public k(String string, int n2) {
        this.a = n2;
        if (n2 != 1) {
            d.h(string);
            this.b = com.github.catvod.spider.merge.K1.d.e(string);
            return;
        }
        this.b = com.github.catvod.spider.merge.K1.d.e(c.g(string));
    }

    public k(Pattern pattern) {
        this.a = 2;
        this.b = pattern;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean a(m iterator, m m2) {
        switch (this.a) {
            default: {
                return ((Pattern)this.b).matcher(m2.s0()).find();
            }
            case 1: {
                return com.github.catvod.spider.merge.K1.d.e(m2.s0()).contains((String)((Object)this.b));
            }
            case 0: {
                iterator = m2.d().j().iterator();
                do {
                    if (!iterator.hasNext()) return false;
                } while (!com.github.catvod.spider.merge.K1.d.e(iterator.next().a()).startsWith((String)((Object)this.b)));
                return true;
            }
        }
    }

    public final String toString() {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                return String.format(":contains(%s)", (String)((Object)this.b));
            }
            case 0: {
                return String.format("[^%s]", (String)((Object)this.b));
            }
        }
        return String.format(":matches(%s)", (Pattern)this.b);
    }
}

