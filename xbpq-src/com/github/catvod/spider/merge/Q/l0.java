/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.P.B;
import com.github.catvod.spider.merge.P.C;
import com.github.catvod.spider.merge.Q.g0;
import com.github.catvod.spider.merge.Q.h0;
import com.github.catvod.spider.merge.Q.j0;
import com.github.catvod.spider.merge.Q.k0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class l0 {
    public static final k0 c = new k0();

    static List a(Collection list) {
        List list2;
        Iterator iterator = list.iterator();
        list = null;
        while (iterator.hasNext()) {
            l0 l02 = (l0)iterator.next();
            if (!(l02 instanceof j0)) continue;
            list2 = list;
            if (list == null) {
                list2 = new ArrayList();
            }
            ((ArrayList)list2).add((j0)((j0)l02));
            iterator.remove();
            list = list2;
        }
        list2 = list;
        if (list == null) {
            list2 = Collections.emptyList();
        }
        return list2;
    }

    public static l0 b(l0 l0Array, l0 l02) {
        k0 k02;
        if (l0Array != null && l0Array != (k02 = c)) {
            if (l02 != null && l02 != k02) {
                l02 = new g0((l0)l0Array, l02);
                l0Array = ((g0)l02).d;
                if (l0Array.length == 1) {
                    return l0Array[0];
                }
                return l02;
            }
            return l0Array;
        }
        return l02;
    }

    public static l0 e(l0 l0Array, l0 l02) {
        k0 k02;
        if (l0Array == null) {
            return l02;
        }
        if (l02 == null) {
            return l0Array;
        }
        l0 l03 = k02 = c;
        if (l0Array != k02) {
            if (l02 == k02) {
                l03 = k02;
            } else {
                l03 = new h0((l0)l0Array, l02);
                l0Array = ((h0)l03).d;
                if (l0Array.length == 1) {
                    return l0Array[0];
                }
            }
        }
        return l03;
    }

    public abstract boolean c(B<?, ?> var1, C var2);

    public l0 d(B<?, ?> b2, C c2) {
        return this;
    }
}

