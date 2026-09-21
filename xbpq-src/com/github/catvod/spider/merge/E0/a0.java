/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.B;
import com.github.catvod.spider.merge.E0.D0;
import com.github.catvod.spider.merge.E0.I;
import com.github.catvod.spider.merge.E0.N;
import com.github.catvod.spider.merge.E0.U;
import com.github.catvod.spider.merge.E0.W;
import com.github.catvod.spider.merge.E0.Y;
import com.github.catvod.spider.merge.E0.Z;
import com.github.catvod.spider.merge.E0.d;
import com.github.catvod.spider.merge.E0.d0;
import com.github.catvod.spider.merge.E0.f0;
import com.github.catvod.spider.merge.E0.g0;
import com.github.catvod.spider.merge.E0.h0;
import com.github.catvod.spider.merge.E0.m0;
import com.github.catvod.spider.merge.E0.n0;
import com.github.catvod.spider.merge.E0.o0;
import com.github.catvod.spider.merge.E0.q0;
import com.github.catvod.spider.merge.E0.u0;
import com.github.catvod.spider.merge.E0.v;
import com.github.catvod.spider.merge.E0.v0;
import com.github.catvod.spider.merge.E0.x;
import com.github.catvod.spider.merge.y.z;

final class a0 {
    private static final Y b = new Y();
    private final h0 a;

    public a0() {
        Object object;
        h0 h02 = B.c();
        int n2 = d.c;
        try {
            object = (h0)Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        }
        catch (Exception exception) {
            object = b;
        }
        h02 = new Z(new h0[]{h02, object});
        object = N.b;
        this.a = h02;
    }

    public final <T> u0<T> a(Class<T> object) {
        v<?> v2;
        D0<?, ?> d02;
        U u2;
        v0.b(object);
        g0 g02 = this.a.b((Class<?>)object);
        if (g02.c()) {
            v<?> v3;
            int n2 = d.c;
            if (I.class.isAssignableFrom((Class<?>)object)) {
                object = v0.f();
                v3 = x.b();
            } else {
                object = v0.e();
                v3 = x.a();
            }
            return n0.h(object, v3, g02.b());
        }
        int n3 = d.c;
        boolean bl = I.class.isAssignableFrom((Class<?>)object);
        object = null;
        Object object2 = null;
        int n4 = 0;
        n3 = 0;
        if (bl) {
            o0 o02 = q0.b();
            u2 = W.b();
            d02 = v0.f();
            if (z.c(g02.a()) != 1) {
                n3 = 1;
            }
            object = object2;
            if (n3 != 0) {
                object = x.b();
            }
            object2 = f0.b();
            v2 = object;
            object = o02;
        } else {
            object2 = q0.a();
            u2 = W.a();
            d02 = v0.e();
            n3 = n4;
            if (z.c(g02.a()) != 1) {
                n3 = 1;
            }
            if (n3 != 0) {
                object = x.a();
            }
            v2 = object;
            d0 d03 = f0.a();
            object = object2;
            object2 = d03;
        }
        return m0.x(g02, (o0)object, u2, d02, v2, (d0)object2);
    }
}

