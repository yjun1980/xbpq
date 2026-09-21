/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.F.f;
import com.github.catvod.spider.merge.N.a;
import com.github.catvod.spider.merge.P.B;
import com.github.catvod.spider.merge.P.C;
import com.github.catvod.spider.merge.Q.i0;
import com.github.catvod.spider.merge.Q.j0;
import com.github.catvod.spider.merge.Q.l0;
import com.github.catvod.spider.merge.cYh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public final class h0
extends i0 {
    public final l0[] d;

    public h0(l0 object, l0 l02) {
        HashSet<l0> hashSet = new HashSet<l0>();
        if (object instanceof h0) {
            hashSet.addAll(Arrays.asList(((h0)object).d));
        } else {
            hashSet.add((l0)object);
        }
        if (l02 instanceof h0) {
            hashSet.addAll(Arrays.asList(((h0)l02).d));
        } else {
            hashSet.add(l02);
        }
        object = l0.a(hashSet);
        if (!object.isEmpty()) {
            hashSet.add((j0)Collections.max(object));
        }
        this.d = hashSet.toArray(new l0[hashSet.size()]);
    }

    @Override
    public final boolean c(B<?, ?> b2, C c2) {
        l0[] l0Array = this.d;
        int n2 = l0Array.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!l0Array[i2].c(b2, c2)) continue;
            return true;
        }
        return false;
    }

    @Override
    public final l0 d(B<?, ?> object, C c2) {
        ArrayList<l0> arrayList = new ArrayList<l0>();
        l0[] l0Array = this.d;
        int n2 = l0Array.length;
        int n3 = 0;
        int n4 = 0;
        while (true) {
            int n5 = 1;
            int n6 = 1;
            if (n3 >= n2) break;
            l0 l02 = l0Array[n3];
            l0 l03 = l02.d((B<?, ?>)object, c2);
            if (l03 == l02) {
                n6 = 0;
            }
            n4 |= n6;
            l02 = l0.c;
            if (l03 == l02) {
                return l02;
            }
            if (l03 != null) {
                arrayList.add(l03);
            }
            ++n3;
        }
        if (n4 == 0) {
            return this;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        object = (l0)arrayList.get(0);
        for (n4 = n5; n4 < arrayList.size(); ++n4) {
            object = l0.e((l0)object, (l0)arrayList.get(n4));
        }
        return object;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof h0)) {
            return false;
        }
        object = (h0)object;
        return Arrays.equals(this.d, ((h0)object).d);
    }

    public final int hashCode() {
        l0[] l0Array = this.d;
        int n2 = h0.class.hashCode();
        int n3 = l0Array.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            n2 = a.p(n2, l0Array[i2]);
        }
        return a.b(n2, l0Array.length);
    }

    public final String toString() {
        return f.a(Arrays.asList(this.d).iterator(), cYh.d("1B2C"));
    }
}

