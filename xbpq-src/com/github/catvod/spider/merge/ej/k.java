/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.ej;

import com.github.catvod.spider.merge.Dw.i;
import com.github.catvod.spider.merge.Dw.s;
import com.github.catvod.spider.merge.Em.l;
import com.github.catvod.spider.merge.ej.N;

public final class k
extends N {
    public final int a;
    private final String b;

    public k(String string, int n2) {
        this.a = n2;
        if (n2 != 1) {
            i.i(string);
            this.b = s.c(string);
            return;
        }
        this.b = s.c(string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean a(l iterator, l l2) {
        switch (this.a) {
            default: {
                return s.c(l2.T()).contains(this.b);
            }
            case 0: {
                iterator = l2.d().f().iterator();
                do {
                    if (!iterator.hasNext()) return false;
                } while (!s.c(iterator.next().a()).startsWith(this.b));
                return true;
            }
        }
    }

    public final String toString() {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                return String.format("[^%s]", this.b);
            }
        }
        return String.format(":containsData(%s)", this.b);
    }
}

