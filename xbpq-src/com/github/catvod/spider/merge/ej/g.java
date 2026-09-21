/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.ej;

import com.github.catvod.spider.merge.Dw.e;
import com.github.catvod.spider.merge.Dw.i;
import com.github.catvod.spider.merge.Em.l;
import com.github.catvod.spider.merge.ej.N;
import com.github.catvod.spider.merge.ej.P;
import com.github.catvod.spider.merge.ej.c;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

public final class g
extends ArrayList<l> {
    public g() {
    }

    public g(int n2) {
        super(n2);
    }

    public g(List<l> list) {
        super(list);
    }

    public g(l ... lArray) {
        super(Arrays.asList(lArray));
    }

    public final String a(String string) {
        for (l l2 : this) {
            if (!l2.o(string)) continue;
            return l2.c(string);
        }
        return "";
    }

    public final g b(int n2) {
        g g2 = ((AbstractCollection)this).size() > n2 ? new g((l)((AbstractList)this).get(n2)) : new g();
        return g2;
    }

    public final l c() {
        l l2 = ((AbstractCollection)this).isEmpty() ? null : (l)((AbstractList)this).get(((AbstractCollection)this).size() - 1);
        return l2;
    }

    @Override
    public final Object clone() {
        g g2 = new g(((AbstractCollection)this).size());
        Iterator iterator = ((AbstractCollection)this).iterator();
        while (iterator.hasNext()) {
            ((AbstractCollection)g2).add(((l)iterator.next()).S());
        }
        return g2;
    }

    public final g d(String object) {
        i.i((String)object);
        N n2 = P.h((String)object);
        g g2 = new g();
        IdentityHashMap<l, Boolean> identityHashMap = new IdentityHashMap<l, Boolean>();
        for (l l22 : this) {
            i.k(n2);
            i.k(l22);
            for (l l22 : c.a(n2, l22)) {
                if (identityHashMap.put(l22, Boolean.TRUE) != null) continue;
                ((AbstractCollection)g2).add(l22);
            }
        }
        return g2;
    }

    public final String e() {
        StringBuilder stringBuilder = e.a();
        for (l l2 : this) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(l2.p0());
        }
        return e.g(stringBuilder);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = e.a();
        for (l l2 : this) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append("\n");
            }
            stringBuilder.append(l2.u());
        }
        return e.g(stringBuilder);
    }
}

