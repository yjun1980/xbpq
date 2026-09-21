/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.t;
import java.util.AbstractCollection;
import java.util.Iterator;

public class H
extends t {
    public H(int n2, int n3) {
        super(n2, n3);
    }

    @Override
    protected final int b(l l2) {
        int n2;
        l l3 = l2.f0();
        int n3 = 0;
        if (l3 == null) {
            return 0;
        }
        Iterator iterator = ((AbstractCollection)l2.f0().R()).iterator();
        do {
            n2 = n3;
            if (!iterator.hasNext()) break;
            l3 = (l)iterator.next();
            n2 = n3;
            if (l3.m0().equals(l2.m0())) {
                n2 = n3 + 1;
            }
            n3 = n2;
        } while (l3 != l2);
        return n2;
    }

    @Override
    protected final String c() {
        return cYh.d("0924297C383C4A24382132");
    }
}

