/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.A0;
import com.github.catvod.spider.merge.E0.C;
import com.github.catvod.spider.merge.E0.C0;
import com.github.catvod.spider.merge.E0.I;
import com.github.catvod.spider.merge.E0.N;
import com.github.catvod.spider.merge.E0.Q;
import com.github.catvod.spider.merge.E0.Q0;
import com.github.catvod.spider.merge.E0.S;
import com.github.catvod.spider.merge.E0.j0;
import com.github.catvod.spider.merge.E0.k0;
import com.github.catvod.spider.merge.E0.w0;
import com.github.catvod.spider.merge.E0.x0;
import com.github.catvod.spider.merge.E0.y;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

final class z<T extends y<T>> {
    private static final z<?> d = new z(true);
    private final A0<T, Object> a;
    private boolean b;
    private boolean c;

    private z() {
        int n2 = A0.g;
        this.a = new w0();
    }

    private z(boolean bl) {
        int n2 = A0.g;
        w0 w02 = new w0();
        this.a = w02;
        this.k();
        this.k();
    }

    private static Object b(Object object) {
        if (object instanceof byte[]) {
            byte[] byArray = (byte[])object;
            object = new byte[byArray.length];
            System.arraycopy(byArray, 0, object, 0, byArray.length);
            return object;
        }
        return object;
    }

    public static <T extends y<T>> z<T> c() {
        return d;
    }

    private static <T extends y<T>> boolean h(Map.Entry<T, Object> entry) {
        y y2 = (y)entry.getKey();
        if (y2.f() == Q0.j) {
            y2.a();
            return z.i(entry.getValue());
        }
        return true;
    }

    private static boolean i(Object object) {
        if (object instanceof k0) {
            return ((k0)object).d();
        }
        if (object instanceof S) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void m(Map.Entry<T, Object> a02) {
        y y2 = (y)a02.getKey();
        Object object = a02.getValue();
        boolean bl = object instanceof S;
        y2.a();
        if (y2.f() == Q0.j) {
            Object object2 = this.d(y2);
            if (object2 == null) {
                this.a.n(y2, z.b(object));
                if (!bl) return;
                this.c = true;
                return;
            } else {
                a02 = object;
                if (bl) {
                    a02 = ((S)object).a(null);
                }
                if (y2.g(object2)) {
                    object = ((j0)object2).c();
                    y2.c(object, a02);
                    a02 = this.a;
                    object = ((C)object).e();
                    if (!((I)object).d()) throw new C0();
                    a02.n(y2, object);
                    return;
                } else {
                    y2.c(object2, a02);
                }
            }
            return;
        } else {
            if (bl) throw new IllegalStateException("Lazy fields must be message-valued");
            this.a.n(y2, z.b(object));
        }
    }

    private void o(T object, Object object2) {
        object.d();
        object = N.b;
        Objects.requireNonNull(object2);
        throw null;
    }

    public final z<T> a() {
        z<y> z2 = new z<y>();
        int n2 = this.a.i();
        for (int i2 = 0; i2 < n2; ++i2) {
            x0 x02 = (x0)this.a.h(i2);
            z2.n((y)x02.getKey(), x02.getValue());
        }
        for (Map.Entry entry : this.a.j()) {
            z2.n((y)entry.getKey(), entry.getValue());
        }
        z2.c = this.c;
        return z2;
    }

    public final Object d(T object) {
        Object object2 = this.a.get(object);
        object = object2;
        if (object2 instanceof S) {
            object = ((S)object2).a(null);
        }
        return object;
    }

    final boolean e() {
        return this.a.isEmpty();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof z)) {
            return false;
        }
        object = (z)object;
        return this.a.equals(((z)object).a);
    }

    public final boolean f() {
        return this.b;
    }

    public final boolean g() {
        int n2 = this.a.i();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (z.h(this.a.h(i2))) continue;
            return false;
        }
        Iterator<Map.Entry<T, Object>> iterator = this.a.j().iterator();
        while (iterator.hasNext()) {
            if (z.h(iterator.next())) continue;
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final Iterator<Map.Entry<T, Object>> j() {
        if (this.e()) {
            return Collections.emptyIterator();
        }
        if (this.c) {
            return new Q(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }

    public final void k() {
        Object object;
        if (this.b) {
            return;
        }
        int n2 = this.a.i();
        for (int i2 = 0; i2 < n2; ++i2) {
            object = ((x0)this.a.h(i2)).getValue();
            if (!(object instanceof I)) continue;
            ((I)object).m();
        }
        object = this.a.j().iterator();
        while (object.hasNext()) {
            Object v2 = ((Map.Entry)object.next()).getValue();
            if (!(v2 instanceof I)) continue;
            ((I)v2).m();
        }
        this.a.m();
        this.b = true;
    }

    public final void l(z<T> object) {
        int n2 = ((z)object).a.i();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.m(((z)object).a.h(i2));
        }
        object = ((z)object).a.j().iterator();
        while (object.hasNext()) {
            this.m((Map.Entry)object.next());
        }
    }

    public final void n(T t2, Object object) {
        t2.a();
        this.o(t2, object);
        throw null;
    }
}

