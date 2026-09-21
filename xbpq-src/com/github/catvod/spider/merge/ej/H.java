/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.ej;

import com.github.catvod.spider.merge.Em.l;
import com.github.catvod.spider.merge.ej.t;
import java.util.AbstractCollection;

public class H
extends t {
    public H(int n2, int n3) {
        super(n2, n3);
    }

    @Override
    protected final int b(l l2) {
        int n2;
        l l3;
        Object object = l2.f0();
        int n3 = 0;
        if (object == null) {
            return 0;
        }
        object = ((AbstractCollection)l2.f0().R()).iterator();
        do {
            n2 = n3;
            if (!object.hasNext()) break;
            l3 = (l)object.next();
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
        return "nth-of-type";
    }
}

