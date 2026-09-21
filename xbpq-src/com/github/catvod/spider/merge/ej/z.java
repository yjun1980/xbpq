/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.ej;

import com.github.catvod.spider.merge.Em.e;
import com.github.catvod.spider.merge.Em.i;
import com.github.catvod.spider.merge.Em.l;
import com.github.catvod.spider.merge.Em.r;
import com.github.catvod.spider.merge.ej.N;
import java.util.Iterator;

public final class z
extends N {
    @Override
    public final boolean a(l r22, l object) {
        Iterator<r> iterator;
        for (r r2 : ((r)((Object)iterator)).i()) {
            if (r2 instanceof e || r2 instanceof i) continue;
            return false;
        }
        return true;
    }

    public final String toString() {
        return ":empty";
    }
}

