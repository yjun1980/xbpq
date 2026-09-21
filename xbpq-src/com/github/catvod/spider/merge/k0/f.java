/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.k0;

import com.github.catvod.spider.merge.c0.r;
import com.github.catvod.spider.merge.c0.u;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.O;
import com.github.catvod.spider.merge.e0.g;
import com.github.catvod.spider.merge.j.l;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.AbstractCollection;
import java.util.Map;

final class f
implements O {
    final Map a;
    final g b;

    f(Map map, g g2) {
        this.a = map;
        this.b = g2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(r object, int n2) {
        if (object instanceof u) {
            u u2 = (u)object;
            object = new StringBuilder();
            ((StringBuilder)object).append(n2);
            ((StringBuilder)object).append(cYh.d("38"));
            ((StringBuilder)object).append(u2.z().hashCode());
            Object object2 = ((StringBuilder)object).toString();
            object = (Integer)this.a.get(object2);
            object = object == null ? Integer.valueOf(1) : Integer.valueOf((Integer)object + 1);
            this.a.put(object2, object);
            object2 = new com.github.catvod.spider.merge.c0.l(cYh.d("2D081E05120233"));
            ((com.github.catvod.spider.merge.c0.l)object2).o0(u2.L());
            try {
                Method method = r.class.getDeclaredMethod(cYh.d("143535013628023E351F383E02"), r.class);
                ((AccessibleObject)method).setAccessible(true);
                method.invoke(object2, u2.z());
            }
            catch (Exception exception) {}
            l.f((com.github.catvod.spider.merge.c0.l)object2, (Integer)object);
            ((AbstractCollection)this.b).add(object2);
        }
    }

    @Override
    public final void b(r r2, int n2) {
    }
}

