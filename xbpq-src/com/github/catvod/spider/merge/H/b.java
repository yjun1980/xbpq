/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.B.g;
import com.github.catvod.spider.merge.B.j;
import com.github.catvod.spider.merge.B.o;
import com.github.catvod.spider.merge.B.p;
import com.github.catvod.spider.merge.C.f;
import com.github.catvod.spider.merge.C.h;
import com.github.catvod.spider.merge.C.m;
import com.github.catvod.spider.merge.C.q;
import com.github.catvod.spider.merge.C.v;
import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.M;
import com.github.catvod.spider.merge.D.V;
import com.github.catvod.spider.merge.D.Z;
import com.github.catvod.spider.merge.D.a0;
import com.github.catvod.spider.merge.D.c0;
import com.github.catvod.spider.merge.D.d0;
import com.github.catvod.spider.merge.D.e0;
import com.github.catvod.spider.merge.D.f0;
import com.github.catvod.spider.merge.D.g0;
import com.github.catvod.spider.merge.D.h0;
import com.github.catvod.spider.merge.D.i0;
import com.github.catvod.spider.merge.D.l0;
import com.github.catvod.spider.merge.D.w;
import com.github.catvod.spider.merge.D.x;
import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.H.a;
import com.github.catvod.spider.merge.H.e;
import com.github.catvod.spider.merge.H.i;
import com.github.catvod.spider.merge.H.k;
import com.github.catvod.spider.merge.H.l;
import com.github.catvod.spider.merge.H.n;
import com.github.catvod.spider.merge.y.N;
import com.github.catvod.spider.merge.y.O;
import com.github.catvod.spider.merge.y.P;
import com.github.catvod.spider.merge.y.Q;
import com.github.catvod.spider.merge.y.U;
import com.github.catvod.spider.merge.y.X;
import com.github.catvod.spider.merge.y.c;
import com.github.catvod.spider.merge.y.d;
import java.security.AccessController;
import java.security.ProtectionDomain;
import java.util.HashMap;
import java.util.Map;

public final class b
extends ClassLoader {
    private static ProtectionDomain a;
    private static Map<String, Class<?>> b;

    static {
        b = new HashMap();
        a = (ProtectionDomain)AccessController.doPrivileged(new a());
        for (int i2 = 0; i2 < 56; ++i2) {
            Class clazz = (new Class[]{com.github.catvod.spider.merge.y.a.class, com.github.catvod.spider.merge.y.e.class, com.github.catvod.spider.merge.y.b.class, N.class, c.class, d.class, O.class, P.class, Q.class, U.class, X.class, e.class, A.class, i.class, k.class, n.class, l.class, com.github.catvod.spider.merge.D.X.class, M.class, g0.class, d0.class, L.class, h0.class, f0.class, com.github.catvod.spider.merge.D.P.class, com.github.catvod.spider.merge.D.O.class, x.class, com.github.catvod.spider.merge.D.d.class, com.github.catvod.spider.merge.D.l.class, V.class, Z.class, a0.class, l0.class, i0.class, w.class, c0.class, e0.class, q.class, o.class, com.github.catvod.spider.merge.B.b.class, com.github.catvod.spider.merge.B.d.class, com.github.catvod.spider.merge.B.f.class, com.github.catvod.spider.merge.B.k.class, j.class, p.class, com.github.catvod.spider.merge.B.c.class, com.github.catvod.spider.merge.B.i.class, g.class, f.class, v.class, com.github.catvod.spider.merge.C.l.class, com.github.catvod.spider.merge.C.k.class, m.class, com.github.catvod.spider.merge.D.k.class, com.github.catvod.spider.merge.C.n.class, h.class})[i2];
            ((HashMap)b).put(clazz.getName(), clazz);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public b() {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if (classLoader != null) {
            try {
                classLoader.loadClass(com.github.catvod.spider.merge.y.a.class.getName());
            }
            catch (ClassNotFoundException classNotFoundException) {}
        }
        classLoader = com.github.catvod.spider.merge.y.a.class.getClassLoader();
        super(classLoader);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public final Class a(String string, byte[] byArray, int n2) {
        return this.defineClass(string, byArray, 0, n2, a);
    }

    public final boolean b(Class<?> object) {
        ClassLoader classLoader = ((Class)object).getClassLoader();
        if (classLoader == null) {
            return false;
        }
        for (object = this; object != null; object = ((ClassLoader)object).getParent()) {
            if (object != classLoader) continue;
            return false;
        }
        return true;
    }

    @Override
    protected final Class<?> loadClass(String object, boolean bl) {
        Class clazz = (Class)((HashMap)b).get(object);
        if (clazz != null) {
            return clazz;
        }
        object = super.loadClass((String)object, bl);
        return object;
    }
}

