/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Fs.A;
import com.github.catvod.spider.merge.Fs.H;
import com.github.catvod.spider.merge.Fs.I;
import com.github.catvod.spider.merge.Fs.L;
import com.github.catvod.spider.merge.Fs.M;
import com.github.catvod.spider.merge.Fs.O;
import com.github.catvod.spider.merge.Fs.b;

final class n
extends A {
    @Override
    final boolean d(O o2, b b2) {
        block14: {
            block8: {
                block13: {
                    A a2;
                    block11: {
                        block12: {
                            block10: {
                                block9: {
                                    block7: {
                                        if (!A.a(o2)) break block7;
                                        b2.E((H)o2);
                                        break block8;
                                    }
                                    if (!o2.b()) break block9;
                                    b2.F((I)o2);
                                    break block8;
                                }
                                if (o2.c()) {
                                    b2.n(this);
                                    return false;
                                }
                                if (!o2.f() || !((M)o2).c.equals("html")) break block10;
                                a2 = A.i;
                                break block11;
                            }
                            if (!o2.e() || !((L)o2).c.equals("html")) break block12;
                            b2.j0(A.x);
                            break block8;
                        }
                        if (!o2.f() || !((M)o2).c.equals("noframes")) break block13;
                        a2 = A.f;
                    }
                    return b2.X(o2, a2);
                }
                if (!o2.d()) break block14;
            }
            return true;
        }
        b2.n(this);
        return false;
    }
}

