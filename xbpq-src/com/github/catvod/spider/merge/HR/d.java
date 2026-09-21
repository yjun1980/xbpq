/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.HR;

import com.github.catvod.spider.merge.HR.p;
import com.github.catvod.spider.merge.UY.h;
import com.github.catvod.spider.merge.xc.E0.b;
import com.github.catvod.spider.merge.xc.F0.l;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public final class d
extends ArrayList {
    public d() {
    }

    public d(int n2) {
        super(n2);
    }

    public d(LinkedHashSet linkedHashSet) {
        super(linkedHashSet);
    }

    public d(List list) {
        super(list);
    }

    public final String a(String string) {
        for (l l2 : this) {
            if (!l2.k(string)) continue;
            return l2.c(string);
        }
        return "";
    }

    public final ArrayList b() {
        ArrayList<String> arrayList = new ArrayList<String>(((AbstractCollection)this).size());
        for (l l2 : this) {
            if (!l2.F()) continue;
            arrayList.add(l2.O());
        }
        return arrayList;
    }

    public final l c() {
        l l2 = ((AbstractCollection)this).isEmpty() ? null : (l)((AbstractList)this).get(((AbstractCollection)this).size() - 1);
        return l2;
    }

    @Override
    public final Object clone() {
        d d2 = new d(((AbstractCollection)this).size());
        Iterator iterator = ((AbstractCollection)this).iterator();
        while (iterator.hasNext()) {
            ((AbstractCollection)d2).add(((l)iterator.next()).B());
        }
        return d2;
    }

    public final d d(String object) {
        com.github.catvod.spider.merge.xc.D0.b.y((String)object);
        object = p.j((String)object);
        d d2 = new d();
        IdentityHashMap<l, Boolean> identityHashMap = new IdentityHashMap<l, Boolean>();
        for (l l2 : this) {
            com.github.catvod.spider.merge.xc.D0.b.A(object);
            com.github.catvod.spider.merge.xc.D0.b.A(l2);
            Object object2 = new d();
            com.github.catvod.spider.merge.xc.D0.b.O(new h(l2, object2, object), l2);
            object2 = ((AbstractCollection)object2).iterator();
            while (object2.hasNext()) {
                l2 = (l)object2.next();
                if (identityHashMap.put(l2, Boolean.TRUE) != null) continue;
                ((AbstractCollection)d2).add(l2);
            }
        }
        return d2;
    }

    public final String e() {
        StringBuilder stringBuilder = b.b();
        for (l l2 : this) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(l2.O());
        }
        return b.g(stringBuilder);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = b.b();
        for (l l2 : this) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append("\n");
            }
            stringBuilder.append(l2.p());
        }
        return b.g(stringBuilder);
    }
}

