/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.HR;

import com.github.catvod.spider.merge.HR.n;
import com.github.catvod.spider.merge.xc.F0.l;

public final class i
extends n {
    public final int a;
    public final int b;

    public i(int n2, int n3) {
        this.b = n3;
        this.a = n2;
    }

    @Override
    public final boolean a(l l2, l l3) {
        switch (this.b) {
            default: {
                boolean bl = l2 != l3 && l3.E() < this.a;
                return bl;
            }
            case 1: {
                boolean bl = l3.E() > this.a;
                return bl;
            }
            case 0: 
        }
        boolean bl = l3.E() == this.a;
        return bl;
    }

    public final String toString() {
        int n2 = this.a;
        switch (this.b) {
            default: {
                return String.format(":lt(%d)", n2);
            }
            case 1: {
                return String.format(":gt(%d)", n2);
            }
            case 0: 
        }
        return String.format(":eq(%d)", n2);
    }
}

