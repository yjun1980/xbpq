/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.A;
import com.github.catvod.spider.merge.E0.E0;
import com.github.catvod.spider.merge.E0.J;
import com.github.catvod.spider.merge.E0.M;
import com.github.catvod.spider.merge.E0.N;
import com.github.catvod.spider.merge.E0.O;
import com.github.catvod.spider.merge.E0.P0;
import com.github.catvod.spider.merge.E0.X;
import com.github.catvod.spider.merge.E0.e;
import com.github.catvod.spider.merge.E0.g;
import com.github.catvod.spider.merge.E0.m0;
import com.github.catvod.spider.merge.E0.n;
import com.github.catvod.spider.merge.E0.q;
import com.github.catvod.spider.merge.E0.r;
import com.github.catvod.spider.merge.E0.u0;

final class f {
    private static void a(int n2) {
        if (n2 < 100) {
            return;
        }
        throw O.e();
    }

    static int b(byte[] byArray, int n2, e e2) {
        int n3 = f.u(byArray, n2, e2);
        n2 = e2.a;
        if (n2 >= 0) {
            if (n2 <= byArray.length - n3) {
                if (n2 == 0) {
                    e2.c = n.b;
                    return n3;
                }
                e2.c = n.d(byArray, n3, n2);
                return n3 + n2;
            }
            throw O.g();
        }
        throw O.c();
    }

    static int c(byte[] byArray, int n2) {
        byte by = byArray[n2];
        byte by2 = byArray[n2 + 1];
        byte by3 = byArray[n2 + 2];
        return (byArray[n2 + 3] & 0xFF) << 24 | (by & 0xFF | (by2 & 0xFF) << 8 | (by3 & 0xFF) << 16);
    }

    static long d(byte[] byArray, int n2) {
        long l2 = byArray[n2];
        long l3 = byArray[n2 + 1];
        long l4 = byArray[n2 + 2];
        long l5 = byArray[n2 + 3];
        long l6 = byArray[n2 + 4];
        long l7 = byArray[n2 + 5];
        long l8 = byArray[n2 + 6];
        return ((long)byArray[n2 + 7] & 0xFFL) << 56 | (l2 & 0xFFL | (l3 & 0xFFL) << 8 | (l4 & 0xFFL) << 16 | (l5 & 0xFFL) << 24 | (l6 & 0xFFL) << 32 | (l7 & 0xFFL) << 40 | (l8 & 0xFFL) << 48);
    }

    static int e(u0 u02, byte[] byArray, int n2, int n3, int n4, e e2) {
        Object t2 = u02.e();
        n2 = f.x(t2, u02, byArray, n2, n3, n4, e2);
        u02.f(t2);
        e2.c = t2;
        return n2;
    }

    static int f(u0 u02, byte[] byArray, int n2, int n3, e e2) {
        Object t2 = u02.e();
        n2 = f.y(t2, u02, byArray, n2, n3, e2);
        u02.f(t2);
        e2.c = t2;
        return n2;
    }

    static int g(u0 u02, int n2, byte[] byArray, int n3, int n4, M m2, e e2) {
        n3 = f.f(u02, byArray, n3, n4, e2);
        while (true) {
            m2.add(e2.c);
            if (n3 >= n4) break;
            int n5 = f.u(byArray, n3, e2);
            if (n2 != e2.a) break;
            n3 = f.f(u02, byArray, n5, n4, e2);
        }
        return n3;
    }

    static int h(byte[] byArray, int n2, M m2, e e2) {
        m2 = (g)m2;
        n2 = f.u(byArray, n2, e2);
        int n3 = e2.a + n2;
        while (n2 < n3) {
            n2 = f.w(byArray, n2, e2);
            boolean bl = e2.b != 0L;
            ((g)m2).c(bl);
        }
        if (n2 == n3) {
            return n2;
        }
        throw O.g();
    }

    static int i(byte[] byArray, int n2, M m2, e e2) {
        int n3;
        m2 = (r)m2;
        int n4 = (n2 = f.u(byArray, n2, e2)) + (n3 = e2.a);
        if (n4 <= byArray.length) {
            int n5 = ((r)m2).size();
            ((r)m2).d(n3 / 8 + n5);
            while (n2 < n4) {
                ((r)m2).c(Double.longBitsToDouble(f.d(byArray, n2)));
                n2 += 8;
            }
            if (n2 == n4) {
                return n2;
            }
            throw O.g();
        }
        throw O.g();
    }

    static int j(byte[] byArray, int n2, M m2, e e2) {
        int n3;
        m2 = (J)m2;
        int n4 = (n2 = f.u(byArray, n2, e2)) + (n3 = e2.a);
        if (n4 <= byArray.length) {
            int n5 = ((J)m2).size();
            ((J)m2).d(n3 / 4 + n5);
            while (n2 < n4) {
                ((J)m2).c(f.c(byArray, n2));
                n2 += 4;
            }
            if (n2 == n4) {
                return n2;
            }
            throw O.g();
        }
        throw O.g();
    }

    static int k(byte[] byArray, int n2, M m2, e e2) {
        int n3;
        m2 = (X)m2;
        int n4 = (n2 = f.u(byArray, n2, e2)) + (n3 = e2.a);
        if (n4 <= byArray.length) {
            int n5 = ((X)m2).size();
            ((X)m2).d(n3 / 8 + n5);
            while (n2 < n4) {
                ((X)m2).c(f.d(byArray, n2));
                n2 += 8;
            }
            if (n2 == n4) {
                return n2;
            }
            throw O.g();
        }
        throw O.g();
    }

    static int l(byte[] byArray, int n2, M m2, e e2) {
        int n3;
        m2 = (A)m2;
        int n4 = (n2 = f.u(byArray, n2, e2)) + (n3 = e2.a);
        if (n4 <= byArray.length) {
            int n5 = ((A)m2).size();
            ((A)m2).d(n3 / 4 + n5);
            while (n2 < n4) {
                ((A)m2).c(Float.intBitsToFloat(f.c(byArray, n2)));
                n2 += 4;
            }
            if (n2 == n4) {
                return n2;
            }
            throw O.g();
        }
        throw O.g();
    }

    static int m(byte[] byArray, int n2, M m2, e e2) {
        m2 = (J)m2;
        n2 = f.u(byArray, n2, e2);
        int n3 = e2.a + n2;
        while (n2 < n3) {
            n2 = f.u(byArray, n2, e2);
            ((J)m2).c(q.a(e2.a));
        }
        if (n2 == n3) {
            return n2;
        }
        throw O.g();
    }

    static int n(byte[] byArray, int n2, M m2, e e2) {
        m2 = (X)m2;
        n2 = f.u(byArray, n2, e2);
        int n3 = e2.a + n2;
        while (n2 < n3) {
            n2 = f.w(byArray, n2, e2);
            ((X)m2).c(q.b(e2.b));
        }
        if (n2 == n3) {
            return n2;
        }
        throw O.g();
    }

    static int o(byte[] byArray, int n2, M m2, e e2) {
        m2 = (J)m2;
        n2 = f.u(byArray, n2, e2);
        int n3 = e2.a + n2;
        while (n2 < n3) {
            n2 = f.u(byArray, n2, e2);
            ((J)m2).c(e2.a);
        }
        if (n2 == n3) {
            return n2;
        }
        throw O.g();
    }

    static int p(byte[] byArray, int n2, M m2, e e2) {
        m2 = (X)m2;
        n2 = f.u(byArray, n2, e2);
        int n3 = e2.a + n2;
        while (n2 < n3) {
            n2 = f.w(byArray, n2, e2);
            ((X)m2).c(e2.b);
        }
        if (n2 == n3) {
            return n2;
        }
        throw O.g();
    }

    static int q(byte[] byArray, int n2, e e2) {
        int n3 = f.u(byArray, n2, e2);
        n2 = e2.a;
        if (n2 >= 0) {
            if (n2 == 0) {
                e2.c = "";
                return n3;
            }
            e2.c = new String(byArray, n3, n2, N.a);
            return n3 + n2;
        }
        throw O.c();
    }

    static int r(byte[] byArray, int n2, e e2) {
        n2 = f.u(byArray, n2, e2);
        int n3 = e2.a;
        if (n3 >= 0) {
            if (n3 == 0) {
                e2.c = "";
                return n2;
            }
            e2.c = P0.d(byArray, n2, n3);
            return n2 + n3;
        }
        throw O.c();
    }

    static int s(int n2, byte[] object, int n3, int n4, E0 e02, e e2) {
        if (n2 >>> 3 != 0) {
            int n5 = n2 & 7;
            if (n5 != 0) {
                if (n5 != 1) {
                    if (n5 != 2) {
                        int n6;
                        if (n5 != 3) {
                            if (n5 == 5) {
                                e02.h(n2, f.c((byte[])object, n3));
                                return n3 + 4;
                            }
                            throw O.a();
                        }
                        E0 e03 = E0.f();
                        int n7 = n2 & 0xFFFFFFF8 | 4;
                        n5 = 0;
                        e2.e = n6 = e2.e + 1;
                        f.a(n6);
                        while (true) {
                            n6 = n3;
                            if (n3 >= n4) break;
                            n6 = f.u((byte[])object, n3, e2);
                            n3 = n5 = e2.a;
                            if (n5 == n7) {
                                n5 = n3;
                                break;
                            }
                            n3 = f.s(n3, (byte[])object, n6, n4, e03, e2);
                        }
                        --e2.e;
                        if (n6 <= n4 && n5 == n7) {
                            e02.h(n2, e03);
                            return n6;
                        }
                        throw O.d();
                    }
                    n3 = f.u((byte[])object, n3, e2);
                    n4 = e2.a;
                    if (n4 >= 0) {
                        if (n4 <= ((byte[])object).length - n3) {
                            object = n4 == 0 ? (Object)n.b : (Object)n.d((byte[])object, n3, n4);
                            e02.h(n2, object);
                            return n3 + n4;
                        }
                        throw O.g();
                    }
                    throw O.c();
                }
                e02.h(n2, f.d((byte[])object, n3));
                return n3 + 8;
            }
            n3 = f.w((byte[])object, n3, e2);
            e02.h(n2, e2.b);
            return n3;
        }
        throw O.a();
    }

    /*
     * Enabled aggressive block sorting
     */
    static int t(int n2, byte[] byArray, int n3, e e2) {
        int n4;
        int n5;
        block13: {
            block11: {
                block12: {
                    block9: {
                        block10: {
                            block8: {
                                n5 = n2 & 0x7F;
                                n2 = n3 + 1;
                                if ((n3 = byArray[n3]) < 0) break block8;
                                n3 <<= 7;
                                break block9;
                            }
                            n5 |= (n3 & 0x7F) << 7;
                            n4 = n2 + 1;
                            if ((n2 = byArray[n2]) < 0) break block10;
                            n3 = n2 << 14;
                            n2 = n4;
                            break block11;
                        }
                        n5 |= (n2 & 0x7F) << 14;
                        n3 = n4 + 1;
                        n2 = byArray[n4];
                        if (n2 < 0) break block12;
                        n4 = n2 << 21;
                        n2 = n3;
                        n3 = n4;
                    }
                    e2.a = n5 | n3;
                    return n2;
                }
                n5 |= (n2 & 0x7F) << 21;
                n2 = n3 + 1;
                n4 = byArray[n3];
                if (n4 < 0) break block13;
                n3 = n4 << 28;
            }
            e2.a = n5 | n3;
            return n2;
        }
        while (true) {
            n3 = n2 + 1;
            if (byArray[n2] >= 0) {
                e2.a = n5 | (n4 & 0x7F) << 28;
                return n3;
            }
            n2 = n3;
        }
    }

    static int u(byte[] byArray, int n2, e e2) {
        int n3 = n2 + 1;
        if ((n2 = byArray[n2]) >= 0) {
            e2.a = n2;
            return n3;
        }
        return f.t(n2, byArray, n3, e2);
    }

    static int v(int n2, byte[] byArray, int n3, int n4, M m2, e e2) {
        m2 = (J)m2;
        n3 = f.u(byArray, n3, e2);
        while (true) {
            ((J)m2).c(e2.a);
            if (n3 >= n4) break;
            int n5 = f.u(byArray, n3, e2);
            if (n2 != e2.a) break;
            n3 = f.u(byArray, n5, e2);
        }
        return n3;
    }

    static int w(byte[] byArray, int n2, e e2) {
        int n3 = n2 + 1;
        long l2 = byArray[n2];
        if (l2 >= 0L) {
            e2.b = l2;
            return n3;
        }
        n2 = n3 + 1;
        byte by = byArray[n3];
        l2 = l2 & 0x7FL | (long)(by & 0x7F) << 7;
        n3 = 7;
        while (by < 0) {
            by = byArray[n2];
            l2 |= (long)(by & 0x7F) << (n3 += 7);
            ++n2;
        }
        e2.b = l2;
        return n2;
    }

    static int x(Object object, u0 u02, byte[] byArray, int n2, int n3, int n4, e e2) {
        int n5;
        u02 = (m0)u02;
        e2.e = n5 = e2.e + 1;
        f.a(n5);
        n2 = ((m0)u02).F(object, byArray, n2, n3, n4, e2);
        --e2.e;
        e2.c = object;
        return n2;
    }

    static int y(Object object, u0 u02, byte[] byArray, int n2, int n3, e e2) {
        int n4 = n2 + 1;
        int n5 = byArray[n2];
        int n6 = n4;
        n2 = n5;
        if (n5 < 0) {
            n6 = f.t(n5, byArray, n4, e2);
            n2 = e2.a;
        }
        if (n2 >= 0 && n2 <= n3 - n6) {
            e2.e = n3 = e2.e + 1;
            f.a(n3);
            u02.c(object, byArray, n6, n2 += n6, e2);
            --e2.e;
            e2.c = object;
            return n2;
        }
        throw O.g();
    }

    static int z(int n2, byte[] byArray, int n3, int n4, e e2) {
        if (n2 >>> 3 != 0) {
            int n5 = n2 & 7;
            if (n5 != 0) {
                if (n5 != 1) {
                    if (n5 != 2) {
                        if (n5 != 3) {
                            if (n5 == 5) {
                                return n3 + 4;
                            }
                            throw O.a();
                        }
                        int n6 = n2 & 0xFFFFFFF8 | 4;
                        n2 = 0;
                        while (true) {
                            n5 = n3;
                            if (n3 >= n4) break;
                            n5 = f.u(byArray, n3, e2);
                            n2 = e2.a;
                            if (n2 == n6) break;
                            n3 = f.z(n2, byArray, n5, n4, e2);
                        }
                        if (n5 <= n4 && n2 == n6) {
                            return n5;
                        }
                        throw O.d();
                    }
                    return f.u(byArray, n3, e2) + e2.a;
                }
                return n3 + 8;
            }
            return f.w(byArray, n3, e2);
        }
        throw O.a();
    }
}

