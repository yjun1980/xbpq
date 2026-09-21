/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.G;
import com.github.catvod.spider.merge.E0.d;
import com.github.catvod.spider.merge.E0.j0;
import com.github.catvod.spider.merge.E0.s;
import com.github.catvod.spider.merge.E0.t;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class u {
    private static volatile u b;
    static final u c;
    private final Map<t, G<?, ?>> a;

    static {
        c = new u(true);
    }

    u() {
        this.a = new HashMap();
    }

    u(boolean bl) {
        this.a = Collections.emptyMap();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static u b() {
        Object object;
        int n2 = d.c;
        Object object2 = object = b;
        if (object != null) return object2;
        synchronized (u.class) {
            object2 = object = b;
            if (object != null) return object2;
            object = s.a;
            object2 = null;
            if (object != null) {
                try {
                    object2 = object = (u)((Class)object).getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            if (object2 == null) {
                object2 = c;
            }
            b = object2;
            return object2;
        }
    }

    public final <ContainingType extends j0> G<ContainingType, ?> a(ContainingType ContainingType, int n2) {
        return this.a.get(new t(ContainingType, n2));
    }
}

