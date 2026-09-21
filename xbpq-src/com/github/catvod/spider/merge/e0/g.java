/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.N.a;
import com.github.catvod.spider.merge.b0.b;
import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.N;
import com.github.catvod.spider.merge.e0.P;
import com.github.catvod.spider.merge.e0.c;
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
        a.i((String)object);
        N n2 = P.h((String)object);
        g g2 = new g();
        object = new IdentityHashMap();
        for (Object object2 : this) {
            a.k(n2);
            a.k(object2);
            object2 = ((AbstractCollection)c.a(n2, (l)object2)).iterator();
            while (object2.hasNext()) {
                l l2 = (l)object2.next();
                if (((IdentityHashMap)object).put(l2, Boolean.TRUE) != null) continue;
                ((AbstractCollection)g2).add(l2);
            }
        }
        return g2;
    }

    public final String e() {
        StringBuilder stringBuilder = b.a();
        for (l l2 : this) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append(cYh.d("47"));
            }
            stringBuilder.append(l2.p0());
        }
        return b.g(stringBuilder);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = b.a();
        for (l l2 : this) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append(cYh.d("6D"));
            }
            stringBuilder.append(l2.u());
        }
        return b.g(stringBuilder);
    }
}

