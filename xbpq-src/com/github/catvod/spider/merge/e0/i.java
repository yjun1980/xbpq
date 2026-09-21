/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.N;

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
                String string = this.b;
                return String.format(cYh.d("497532"), string);
            }
            case 0: {
                String string = this.b;
                return String.format(cYh.d("3C75320C"), string);
            }
        }
        String string = this.b;
        return String.format(cYh.d("4223"), string);
    }
}

