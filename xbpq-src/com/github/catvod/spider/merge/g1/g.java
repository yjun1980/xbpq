/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g1;

import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.g1.N;
import com.github.catvod.spider.merge.g1.P;
import com.github.catvod.spider.merge.g1.c;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

public final class g
extends ArrayList<m> {
    public g() {
    }

    public g(int n2) {
        super(n2);
    }

    public g(List<m> list) {
        super(list);
    }

    public g(m ... mArray) {
        super(Arrays.asList(mArray));
    }

    public final String a(String string) {
        for (m m2 : this) {
            if (!m2.n(string)) continue;
            return m2.c(string);
        }
        return "";
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public final List c() {
        ArrayList<String> arrayList = new ArrayList<String>(((AbstractCollection)this).size());
        for (m m2 : this) {
            if (!m2.n("data-clipboard-text")) continue;
            arrayList.add(m2.c("data-clipboard-text"));
        }
        return arrayList;
    }

    @Override
    public final Object clone() {
        g g2 = new g(((AbstractCollection)this).size());
        Iterator iterator = ((AbstractCollection)this).iterator();
        while (iterator.hasNext()) {
            ((AbstractCollection)g2).add(((m)iterator.next()).U());
        }
        return g2;
    }

    public final List<String> d() {
        ArrayList<String> arrayList = new ArrayList<String>(((AbstractCollection)this).size());
        for (m m2 : this) {
            if (!m2.a0()) continue;
            arrayList.add(m2.s0());
        }
        return arrayList;
    }

    public final m f() {
        m m2 = ((AbstractCollection)this).isEmpty() ? null : (m)((AbstractList)this).get(0);
        return m2;
    }

    public final m g() {
        m m2 = ((AbstractCollection)this).isEmpty() ? null : (m)((AbstractList)this).get(((AbstractCollection)this).size() - 1);
        return m2;
    }

    public final g i(String object) {
        d.h((String)object);
        N n2 = P.j((String)object);
        g g2 = new g();
        IdentityHashMap<m, Boolean> identityHashMap = new IdentityHashMap<m, Boolean>();
        for (Object object2 : this) {
            d.j(n2);
            d.j(object2);
            object2 = ((AbstractCollection)c.a(n2, (m)object2)).iterator();
            while (object2.hasNext()) {
                m m2 = (m)object2.next();
                if (identityHashMap.put(m2, Boolean.TRUE) != null) continue;
                ((AbstractCollection)g2).add(m2);
            }
        }
        return g2;
    }

    public final String j() {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.d1.c.b();
        for (m m2 : this) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(m2.s0());
        }
        return com.github.catvod.spider.merge.d1.c.i(stringBuilder);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.d1.c.b();
        for (m m2 : this) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append("\n");
            }
            stringBuilder.append(m2.t());
        }
        return com.github.catvod.spider.merge.d1.c.i(stringBuilder);
    }
}

