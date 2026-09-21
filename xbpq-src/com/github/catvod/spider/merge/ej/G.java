/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.ej;

import com.github.catvod.spider.merge.Em.l;
import com.github.catvod.spider.merge.ej.t;
import java.util.AbstractCollection;
import java.util.AbstractList;

public class G
extends t {
    public G(int n2, int n3) {
        super(n2, n3);
    }

    @Override
    protected final int b(l l2) {
        Cloneable cloneable = l2.f0();
        int n2 = 0;
        if (cloneable == null) {
            return 0;
        }
        cloneable = l2.f0().R();
        for (int i2 = l2.U(); i2 < ((AbstractCollection)((Object)cloneable)).size(); ++i2) {
            int n3 = n2;
            if (((l)((AbstractList)((Object)cloneable)).get(i2)).m0().equals(l2.m0())) {
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

