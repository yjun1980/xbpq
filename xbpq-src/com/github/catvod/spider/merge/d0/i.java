/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d0.A;
import com.github.catvod.spider.merge.d0.H;
import com.github.catvod.spider.merge.d0.I;
import com.github.catvod.spider.merge.d0.L;
import com.github.catvod.spider.merge.d0.M;
import com.github.catvod.spider.merge.d0.O;
import com.github.catvod.spider.merge.d0.b;
import com.github.catvod.spider.merge.d0.z;
import com.github.catvod.spider.merge.l.a;

final class i
extends A {
    /*
     * Enabled aggressive block sorting
     */
    @Override
    final boolean d(O object, b b2) {
        String string;
        M m2;
        String string2;
        block42: {
            block41: {
                String string3;
                String string4;
                block40: {
                    String string5;
                    block34: {
                        block33: {
                            block39: {
                                block37: {
                                    block38: {
                                        int n2;
                                        block36: {
                                            block35: {
                                                n2 = a.a(((O)object).a);
                                                if (n2 == 0) {
                                                    b2.n(this);
                                                    return false;
                                                }
                                                string5 = cYh.d("0F242C3D");
                                                string2 = cYh.d("14352D34342E");
                                                string4 = cYh.d("0820353625351220");
                                                string3 = cYh.d("082035383834");
                                                if (n2 == 1) break block34;
                                                if (n2 != 2) {
                                                    if (n2 == 3) {
                                                        b2.F((I)object);
                                                        return true;
                                                    }
                                                    if (n2 != 4) {
                                                        if (n2 != 5) {
                                                            b2.n(this);
                                                            return false;
                                                        }
                                                        if (b2.a().d0().equals(string5)) return true;
                                                        break block33;
                                                    } else {
                                                        if (((H)(object = (H)object)).j().equals(A.c())) {
                                                            b2.n(this);
                                                            return false;
                                                        }
                                                        b2.E((H)object);
                                                        return true;
                                                    }
                                                }
                                                object = ((L)object).c;
                                                object.getClass();
                                                int n3 = ((String)object).hashCode();
                                                n2 = -1;
                                                if (n3 == -1010136971) break block35;
                                                if (n3 != -906021636) {
                                                    if (n3 == -80773204 && ((String)object).equals(string4)) {
                                                        n2 = 2;
                                                    }
                                                    break block36;
                                                } else if (((String)object).equals(string2)) {
                                                    n2 = 1;
                                                }
                                                break block36;
                                            }
                                            if (((String)object).equals(string3)) {
                                                n2 = 0;
                                            }
                                        }
                                        if (n2 == 0) break block37;
                                        if (n2 == 1) break block38;
                                        if (n2 != 2) {
                                            b2.n(this);
                                            return false;
                                        }
                                        if (b2.a().d0().equals(string3) && b2.g(b2.a()) != null && b2.g(b2.a()).d0().equals(string4)) {
                                            b2.d(string3);
                                        }
                                        if (!b2.a().d0().equals(string4)) break block33;
                                        break block39;
                                    }
                                    if (!b2.z((String)object)) {
                                        b2.n(this);
                                        return false;
                                    }
                                    b2.V((String)object);
                                    b2.e0();
                                    return true;
                                }
                                if (!b2.a().d0().equals(string3)) break block33;
                            }
                            b2.U();
                            return true;
                        }
                        b2.n(this);
                        return true;
                    }
                    m2 = (M)object;
                    string = m2.c;
                    if (string.equals(string5)) {
                        return b2.X(m2, A.i);
                    }
                    if (!string.equals(string3)) break block40;
                    if (b2.a().d0().equals(string3)) {
                        b2.d(string3);
                    }
                    break block41;
                }
                if (!string.equals(string4)) break block42;
                if (b2.a().d0().equals(string3)) {
                    b2.d(string3);
                }
                if (b2.a().d0().equals(string4)) {
                    b2.d(string4);
                }
            }
            b2.D(m2);
            return true;
        }
        if (string.equals(string2)) {
            b2.n(this);
            return b2.d(string2);
        }
        if (com.github.catvod.spider.merge.b0.b.b(string, z.H)) {
            b2.n(this);
            if (!b2.z(string2)) {
                return false;
            }
            b2.d(string2);
            return b2.c(m2);
        }
        if (string.equals(cYh.d("14333338272E"))) {
            return b2.X((O)object, A.f);
        }
        b2.n(this);
        return false;
    }
}

