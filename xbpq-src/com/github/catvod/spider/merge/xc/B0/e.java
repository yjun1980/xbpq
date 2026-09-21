/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.B0;

import com.github.catvod.spider.merge.xc.B0.i;
import com.github.catvod.spider.merge.xc.B0.o;

public final class e
extends i {
    public final int b;

    public e(int n2) {
        this.b = n2;
        switch (n2) {
            default: {
                super(1);
                return;
            }
            case 4: {
                super(10);
                return;
            }
            case 3: {
                super(11);
                return;
            }
            case 2: {
                super(7);
                return;
            }
            case 1: 
        }
        super(2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final int c(o o2, int n2) {
        switch (this.b) {
            default: {
                int n3 = n2;
                if (n2 != 12) return n3;
                return 0;
            }
            case 3: {
                int n4 = n2;
                if (n2 != 24) return n4;
                return 0;
            }
            case 2: {
                int n5 = 1;
                if (n2 == 7) {
                    return n5;
                }
                ++n2;
                return n2;
            }
            case 1: {
                return n2 - 1;
            }
            case 0: 
        }
        int n6 = n2;
        if (n2 >= 100) return n6;
        n6 = o2.d + n2;
        if (n2 < o2.e) return n6 + 100;
        n2 = n6;
        return n2;
    }
}

