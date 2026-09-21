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
import com.github.catvod.spider.merge.d0.i1;
import com.github.catvod.spider.merge.l.a;

final class e
extends A {
    private boolean e(O o2, i1 i12) {
        if (i12.d(cYh.d("043F2D3625351220"))) {
            return i12.c(o2);
        }
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    final boolean d(O o2, b b2) {
        if (A.a(o2)) {
            b2.E((H)o2);
            return true;
        }
        int n2 = a.a(o2.a);
        if (n2 != 0) {
            String string = cYh.d("0F242C3D");
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 5) {
                            return this.e(o2, b2);
                        }
                        if (!b2.a().d0().equals(string)) return this.e(o2, b2);
                        return true;
                    }
                    b2.F((I)o2);
                    return true;
                } else {
                    if (!((L)o2).c.equals(cYh.d("043F2D3625351220"))) return this.e(o2, b2);
                    if (b2.a().d0().equals(string)) {
                        b2.n(this);
                        return false;
                    }
                    b2.U();
                    b2.j0(A.k);
                }
                return true;
            } else {
                M m2 = (M)o2;
                String string2 = m2.c;
                string2.getClass();
                if (!string2.equals(cYh.d("043F2D"))) {
                    if (string2.equals(string)) return b2.X(o2, A.i);
                    return this.e(o2, b2);
                }
                b2.G(m2);
            }
            return true;
        } else {
            b2.n(this);
        }
        return true;
    }
}

