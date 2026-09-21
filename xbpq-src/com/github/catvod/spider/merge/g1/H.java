/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g1;

import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.g1.v;
import java.util.AbstractCollection;
import java.util.AbstractList;

public class H
extends v {
    public H(int n2, int n3) {
        super(n2, n3);
    }

    @Override
    protected final int b(m m2) {
        Cloneable cloneable = m2.i0();
        int n2 = 0;
        if (cloneable == null) {
            return 0;
        }
        cloneable = m2.i0().T();
        for (int i2 = m2.W(); i2 < ((AbstractCollection)((Object)cloneable)).size(); ++i2) {
            int n3 = n2;
            if (((m)((AbstractList)((Object)cloneable)).get(i2)).q0().equals(m2.q0())) {
                n3 = n2 + 1;
            }
            n2 = n3;
        }
        return n2;
    }

    @Override
    protected final String c() {
        return "nth-last-of-type";
    }
}

