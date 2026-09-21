/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.C;
import com.github.catvod.spider.merge.E0.D0;
import com.github.catvod.spider.merge.E0.E;
import com.github.catvod.spider.merge.E0.E0;
import com.github.catvod.spider.merge.E0.G;
import com.github.catvod.spider.merge.E0.I;
import com.github.catvod.spider.merge.E0.O;
import com.github.catvod.spider.merge.E0.e;
import com.github.catvod.spider.merge.E0.f;
import com.github.catvod.spider.merge.E0.j0;
import com.github.catvod.spider.merge.E0.n;
import com.github.catvod.spider.merge.E0.r0;
import com.github.catvod.spider.merge.E0.u0;
import com.github.catvod.spider.merge.E0.v;
import com.github.catvod.spider.merge.E0.v0;
import com.github.catvod.spider.merge.E0.z;

final class n0<T>
implements u0<T> {
    private final j0 a;
    private final D0<?, ?> b;
    private final boolean c;
    private final v<?> d;

    private n0(D0<?, ?> d02, v<?> v2, j0 j02) {
        this.b = d02;
        this.c = v2.d(j02);
        this.d = v2;
        this.a = j02;
    }

    static <T> n0<T> h(D0<?, ?> d02, v<?> v2, j0 j02) {
        return new n0<T>(d02, v2, j02);
    }

    @Override
    public final void a(T t2, T object) {
        Object object2 = this.b;
        int n2 = v0.d;
        ((D0)object2).f(t2, ((D0)object2).e(((D0)object2).c(t2), ((D0)object2).c(object)));
        if (this.c && !((z)(object = ((v)(object2 = this.d)).b(object))).e()) {
            ((v)object2).c(t2).l(object);
        }
    }

    @Override
    public final boolean b(T t2) {
        return this.d.b(t2).g();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void c(T object, byte[] byArray, int n2, int n3, e e2) {
        I i2 = (I)object;
        Object object2 = i2.c;
        E0 e02 = object2;
        if (object2 == E0.b()) {
            i2.c = e02 = E0.f();
        }
        ((E)object).u();
        object = null;
        while (true) {
            int n4;
            if (n2 < n3) {
                n2 = f.u(byArray, n2, e2);
                n4 = e2.a;
                if (n4 != 11) {
                    if ((n4 & 7) == 2) {
                        object = (G)this.d.a(e2.d, this.a, n4 >>> 3);
                        if (object != null) {
                            n2 = r0.d;
                            throw null;
                        }
                        n2 = f.s(n4, byArray, n2, n3, e02, e2);
                        continue;
                    }
                    n2 = f.z(n4, byArray, n2, n3, e2);
                    continue;
                }
            } else {
                if (n2 == n3) {
                    return;
                }
                throw O.d();
            }
            int n5 = 0;
            object2 = null;
            while (true) {
                n4 = n2;
                if (n2 >= n3) break;
                n4 = f.u(byArray, n2, e2);
                n2 = e2.a;
                int n6 = n2 >>> 3;
                int n7 = n2 & 7;
                if (n6 != 2) {
                    if (n6 == 3) {
                        if (object != null) {
                            n2 = r0.d;
                            throw null;
                        }
                        if (n7 == 2) {
                            n2 = f.b(byArray, n4, e2);
                            object2 = (n)e2.c;
                            continue;
                        }
                    }
                } else if (n7 == 0) {
                    n2 = f.u(byArray, n4, e2);
                    n5 = e2.a;
                    object = (G)this.d.a(e2.d, this.a, n5);
                    continue;
                }
                if (n2 == 12) break;
                n2 = f.z(n2, byArray, n4, n3, e2);
            }
            if (object2 != null) {
                e02.h(n5 << 3 | 2, object2);
            }
            n2 = n4;
        }
    }

    @Override
    public final boolean d(T t2, T t3) {
        if (!this.b.c(t2).equals(this.b.c(t3))) {
            return false;
        }
        if (this.c) {
            return this.d.b(t2).equals(this.d.b(t3));
        }
        return true;
    }

    @Override
    public final T e() {
        j0 j02 = this.a;
        if (j02 instanceof I) {
            return (T)((I)j02).q();
        }
        return (T)((C)j02.a()).e();
    }

    @Override
    public final void f(T t2) {
        this.b.d(t2);
        this.d.e(t2);
    }

    @Override
    public final int g(T t2) {
        int n2;
        int n3 = n2 = this.b.c(t2).hashCode();
        if (this.c) {
            n3 = n2 * 53 + this.d.b(t2).hashCode();
        }
        return n3;
    }
}

