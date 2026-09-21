/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.c0.h;
import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.N;
import java.util.AbstractCollection;

public final class A
extends N {
    public final int a;

    public /* synthetic */ A(int n2) {
        this.a = n2;
    }

    @Override
    public final boolean a(l l2, l l3) {
        int n2 = this.a;
        boolean bl = false;
        boolean bl2 = false;
        switch (n2) {
            default: {
                break;
            }
            case 0: {
                l2 = l3.f0();
                boolean bl3 = bl2;
                if (l2 != null) {
                    bl3 = bl2;
                    if (!(l2 instanceof h)) {
                        bl3 = bl2;
                        if (l3.U() == 0) {
                            bl3 = true;
                        }
                    }
                }
                return bl3;
            }
        }
        l2 = l3.f0();
        boolean bl4 = bl;
        if (l2 != null) {
            bl4 = bl;
            if (!(l2 instanceof h)) {
                bl4 = bl;
                if (((AbstractCollection)l3.l0()).isEmpty()) {
                    bl4 = true;
                }
            }
        }
        return bl4;
    }

    public final String toString() {
        switch (this.a) {
            default: {
                return cYh.d("5D3F2F3D2E770438283D33");
            }
            case 0: 
        }
        return cYh.d("5D362823242E4A3329383B3E");
    }
}

