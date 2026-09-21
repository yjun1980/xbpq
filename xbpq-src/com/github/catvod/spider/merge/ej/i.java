/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.ej;

import com.github.catvod.spider.merge.Em.l;
import com.github.catvod.spider.merge.ej.N;

public final class i
extends N {
    public final int a;
    private final String b;

    public /* synthetic */ i(String string, int n2) {
        this.a = n2;
        this.b = string;
    }

    @Override
    public final boolean a(l l2, l l3) {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                return l3.W(this.b);
            }
            case 0: {
                return l3.o(this.b);
            }
        }
        return l3.d0().endsWith(this.b);
    }

    public final String toString() {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                return String.format(".%s", this.b);
            }
            case 0: {
                return String.format("[%s]", this.b);
            }
        }
        return String.format("%s", this.b);
    }
}

