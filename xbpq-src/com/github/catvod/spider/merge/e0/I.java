/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.c0.h;
import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.N;
import java.util.AbstractCollection;

public final class I
extends N {
    @Override
    public final boolean a(l object, l l2) {
        boolean bl;
        object = l2.f0();
        boolean bl2 = bl = false;
        if (object != null) {
            if (object instanceof h) {
                bl2 = bl;
            } else {
                object = ((AbstractCollection)((l)object).R()).iterator();
                int n2 = 0;
                while (object.hasNext()) {
                    if (!((l)object.next()).m0().equals(l2.m0())) continue;
                    ++n2;
                }
                bl2 = bl;
                if (n2 == 1) {
                    bl2 = true;
                }
            }
        }
        return bl2;
    }

    public final String toString() {
        return cYh.d("5D3F2F3D2E7708366C252E2A02");
    }
}

