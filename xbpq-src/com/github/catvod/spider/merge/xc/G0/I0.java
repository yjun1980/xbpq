/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.P;
import com.github.catvod.spider.merge.xc.G0.a;
import com.github.catvod.spider.merge.xc.G0.g1;

public final class I0
extends g1 {
    @Override
    public final void d(P p2, a object) {
        object = g1.c;
        int[] nArray = p2.b(null, false);
        if (nArray == null) {
            p2.e('&');
        } else {
            p2.g(new String(nArray, 0, nArray.length));
        }
        p2.o((g1)((Object)object));
    }
}

