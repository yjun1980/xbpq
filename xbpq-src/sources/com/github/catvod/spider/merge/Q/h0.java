package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.cYh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class h0 extends i0 {
    public final l0[] d;

    public h0(l0 l0Var, l0 l0Var2) {
        HashSet hashSet = new HashSet();
        if (l0Var instanceof h0) {
            hashSet.addAll(Arrays.asList(((h0) l0Var).d));
        } else {
            hashSet.add(l0Var);
        }
        if (l0Var2 instanceof h0) {
            hashSet.addAll(Arrays.asList(((h0) l0Var2).d));
        } else {
            hashSet.add(l0Var2);
        }
        List a = l0.a(hashSet);
        if (!a.isEmpty()) {
            hashSet.add((j0) Collections.max(a));
        }
        this.d = (l0[]) hashSet.toArray(new l0[hashSet.size()]);
    }

    @Override // com.github.catvod.spider.merge.Q.l0
    public final boolean c(com.github.catvod.spider.merge.P.B<?, ?> b, com.github.catvod.spider.merge.P.C c) {
        for (l0 l0Var : this.d) {
            if (l0Var.c(b, c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.github.catvod.spider.merge.Q.l0
    public final l0 d(com.github.catvod.spider.merge.P.B<?, ?> b, com.github.catvod.spider.merge.P.C c) {
        ArrayList arrayList = new ArrayList();
        l0[] l0VarArr = this.d;
        int length = l0VarArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                if (i2 == 0) {
                    return this;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                l0 l0Var = (l0) arrayList.get(0);
                while (r6 < arrayList.size()) {
                    l0Var = l0.e(l0Var, (l0) arrayList.get(r6));
                    r6++;
                }
                return l0Var;
            }
            l0 l0Var2 = l0VarArr[i];
            l0 d = l0Var2.d(b, c);
            i2 |= d == l0Var2 ? 0 : 1;
            k0 k0Var = l0.c;
            if (d == k0Var) {
                return k0Var;
            }
            if (d != null) {
                arrayList.add(d);
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h0) {
            return Arrays.equals(this.d, ((h0) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        l0[] l0VarArr = this.d;
        int hashCode = h0.class.hashCode();
        for (l0 l0Var : l0VarArr) {
            hashCode = com.github.catvod.spider.merge.N.a.p(hashCode, l0Var);
        }
        return com.github.catvod.spider.merge.N.a.b(hashCode, l0VarArr.length);
    }

    public final String toString() {
        return com.github.catvod.spider.merge.F.f.a(Arrays.asList(this.d).iterator(), cYh.d("1B2C"));
    }
}
