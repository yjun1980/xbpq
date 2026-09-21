package com.github.catvod.spider.merge.Q;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class l0 {
    public static final k0 c = new k0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List a(Collection collection) {
        Iterator it = collection.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            l0 l0Var = (l0) it.next();
            if (l0Var instanceof j0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((j0) l0Var);
                it.remove();
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    public static l0 b(l0 l0Var, l0 l0Var2) {
        k0 k0Var;
        if (l0Var == null || l0Var == (k0Var = c)) {
            return l0Var2;
        }
        if (l0Var2 == null || l0Var2 == k0Var) {
            return l0Var;
        }
        g0 g0Var = new g0(l0Var, l0Var2);
        l0[] l0VarArr = g0Var.d;
        return l0VarArr.length == 1 ? l0VarArr[0] : g0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static l0 e(l0 l0Var, l0 l0Var2) {
        if (l0Var == null) {
            return l0Var2;
        }
        if (l0Var2 == null) {
            return l0Var;
        }
        k0 k0Var = c;
        k0 k0Var2 = k0Var;
        k0Var2 = k0Var;
        if (l0Var != k0Var && l0Var2 != k0Var) {
            h0 h0Var = new h0(l0Var, l0Var2);
            l0[] l0VarArr = h0Var.d;
            k0Var2 = h0Var;
            if (l0VarArr.length == 1) {
                return l0VarArr[0];
            }
        }
        return k0Var2;
    }

    public abstract boolean c(com.github.catvod.spider.merge.P.B<?, ?> b, com.github.catvod.spider.merge.P.C c2);

    public l0 d(com.github.catvod.spider.merge.P.B<?, ?> b, com.github.catvod.spider.merge.P.C c2) {
        return this;
    }
}
