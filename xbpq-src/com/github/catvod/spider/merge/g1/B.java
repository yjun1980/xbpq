/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g1;

import com.github.catvod.spider.merge.e1.e;
import com.github.catvod.spider.merge.e1.h;
import com.github.catvod.spider.merge.e1.i;
import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.e1.w;
import com.github.catvod.spider.merge.g1.N;
import java.util.AbstractCollection;

public final class B
extends N {
    public final int a;

    public /* synthetic */ B(int n2) {
        this.a = n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean a(m iterator, m s2) {
        int n2 = this.a;
        boolean bl = false;
        boolean bl2 = false;
        switch (n2) {
            default: {
                break;
            }
            case 0: {
                iterator = s2.h().iterator();
                do {
                    if (!iterator.hasNext()) return true;
                } while ((s2 = iterator.next()) instanceof e || s2 instanceof w || s2 instanceof i);
                return bl2;
            }
        }
        iterator = ((m)s2).i0();
        bl2 = bl;
        if (iterator == null) return bl2;
        if (iterator instanceof h) {
            return bl;
        }
        iterator = ((AbstractCollection)((m)((Object)iterator)).T()).iterator();
        n2 = 0;
        while (iterator.hasNext()) {
            if (!((m)iterator.next()).q0().equals(((m)s2).q0())) continue;
            ++n2;
        }
        bl2 = bl;
        if (n2 != 1) return bl2;
        return true;
    }

    public final String toString() {
        switch (this.a) {
            default: {
                return ":only-of-type";
            }
            case 0: 
        }
        return ":empty";
    }
}

