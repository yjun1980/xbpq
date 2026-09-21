/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g1;

import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.g1.v;
import java.util.AbstractCollection;

public class I
extends v {
    public I(int n2, int n3) {
        super(n2, n3);
    }

    @Override
    protected final int b(m m2) {
        int n2;
        m m3;
        Object object = m2.i0();
        int n3 = 0;
        if (object == null) {
            return 0;
        }
        object = ((AbstractCollection)m2.i0().T()).iterator();
        do {
            n2 = n3;
            if (!object.hasNext()) break;
            m3 = (m)object.next();
            n2 = n3;
            if (m3.q0().equals(m2.q0())) {
                n2 = n3 + 1;
            }
            n3 = n2;
        } while (m3 != m2);
        return n2;
    }

    @Override
    protected final String c() {
        return "nth-of-type";
    }
}

