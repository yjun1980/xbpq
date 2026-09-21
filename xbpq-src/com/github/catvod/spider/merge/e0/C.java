/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.c0.h;
import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.N;
import java.util.AbstractCollection;

public final class C
extends N {
    public final int a;

    public /* synthetic */ C(int n2) {
        this.a = n2;
    }

    @Override
    public final boolean a(l l2, l l3) {
        int n2 = this.a;
        boolean bl = true;
        boolean bl2 = true;
        switch (n2) {
            default: {
                break;
            }
            case 0: {
                l2 = l3.f0();
                bl = l2 != null && !(l2 instanceof h) && l3.U() == ((AbstractCollection)l2.R()).size() - 1 ? bl2 : false;
                return bl;
            }
        }
        l l4 = l2;
        if (l2 instanceof h) {
            l4 = l2.P();
        }
        if (l3 != l4) {
            bl = false;
        }
        return bl;
    }

    public final String toString() {
        switch (this.a) {
            default: {
                return cYh.d("5D222E3E23");
            }
            case 0: 
        }
        return cYh.d("5D3C202223770438283D33");
    }
}

