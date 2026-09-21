/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Dw.e;
import com.github.catvod.spider.merge.Dw.h;
import com.github.catvod.spider.merge.Fs.A;
import com.github.catvod.spider.merge.Fs.H;
import com.github.catvod.spider.merge.Fs.I;
import com.github.catvod.spider.merge.Fs.L;
import com.github.catvod.spider.merge.Fs.M;
import com.github.catvod.spider.merge.Fs.O;
import com.github.catvod.spider.merge.Fs.b;
import com.github.catvod.spider.merge.Fs.z;

final class i
extends A {
    /*
     * Enabled aggressive block sorting
     */
    @Override
    final boolean d(O object, b b2) {
        String string;
        M m2;
        block42: {
            block41: {
                block40: {
                    block34: {
                        block33: {
                            block39: {
                                block37: {
                                    block38: {
                                        int n2;
                                        block36: {
                                            block35: {
                                                n2 = com.github.catvod.spider.merge.Dw.h.a(((O)object).a);
                                                if (n2 == 0) {
                                                    b2.n(this);
                                                    return false;
                                                }
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
                                                        if (b2.a().d0().equals("html")) return true;
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
                                                    if (n3 == -80773204 && ((String)object).equals("optgroup")) {
                                                        n2 = 2;
                                                    }
                                                    break block36;
                                                } else if (((String)object).equals("select")) {
                                                    n2 = 1;
                                                }
                                                break block36;
                                            }
                                            if (((String)object).equals("option")) {
                                                n2 = 0;
                                            }
                                        }
                                        if (n2 == 0) break block37;
                                        if (n2 == 1) break block38;
                                        if (n2 != 2) {
                                            b2.n(this);
                                            return false;
                                        }
                                        if (b2.a().d0().equals("option") && b2.g(b2.a()) != null && b2.g(b2.a()).d0().equals("optgroup")) {
                                            b2.d("option");
                                        }
                                        if (!b2.a().d0().equals("optgroup")) break block33;
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
                                if (!b2.a().d0().equals("option")) break block33;
                            }
                            b2.U();
                            return true;
                        }
                        b2.n(this);
                        return true;
                    }
                    m2 = (M)object;
                    string = m2.c;
                    if (string.equals("html")) {
                        return b2.X(m2, A.i);
                    }
                    if (!string.equals("option")) break block40;
                    if (b2.a().d0().equals("option")) {
                        b2.d("option");
                    }
                    break block41;
                }
                if (!string.equals("optgroup")) break block42;
                if (b2.a().d0().equals("option")) {
                    b2.d("option");
                }
                if (b2.a().d0().equals("optgroup")) {
                    b2.d("optgroup");
                }
            }
            b2.D(m2);
            return true;
        }
        if (string.equals("select")) {
            b2.n(this);
            return b2.d("select");
        }
        if (com.github.catvod.spider.merge.Dw.e.b(string, z.H)) {
            b2.n(this);
            if (!b2.z("select")) {
                return false;
            }
            b2.d("select");
            return b2.c(m2);
        }
        if (string.equals("script")) {
            return b2.X((O)object, A.f);
        }
        b2.n(this);
        return false;
    }
}

