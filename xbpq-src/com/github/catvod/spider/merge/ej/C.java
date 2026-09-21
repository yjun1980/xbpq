/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.ej;

import com.github.catvod.spider.merge.Em.h;
import com.github.catvod.spider.merge.Em.l;
import com.github.catvod.spider.merge.ej.N;
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
                if (l2 == null || l2 instanceof h || l3.U() != ((AbstractCollection)l2.R()).size() - 1) {
                    bl2 = false;
                }
                return bl2;
            }
        }
        l l4 = l2;
        if (l2 instanceof h) {
            l4 = l2.P();
        }
        bl2 = l3 == l4 ? bl : false;
        return bl2;
    }

    public final String toString() {
        switch (this.a) {
            default: {
                return ":root";
            }
            case 0: 
        }
        return ":last-child";
    }
}

