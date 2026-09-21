/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Dw.h;
import com.github.catvod.spider.merge.Fs.A;
import com.github.catvod.spider.merge.Fs.H;
import com.github.catvod.spider.merge.Fs.I;
import com.github.catvod.spider.merge.Fs.L;
import com.github.catvod.spider.merge.Fs.M;
import com.github.catvod.spider.merge.Fs.O;
import com.github.catvod.spider.merge.Fs.b;
import com.github.catvod.spider.merge.Fs.i1;

final class e
extends A {
    private boolean e(O o2, i1 i12) {
        if (i12.d("colgroup")) {
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
        int n2 = com.github.catvod.spider.merge.Dw.h.a(o2.a);
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 5) {
                            return this.e(o2, b2);
                        }
                        if (!b2.a().d0().equals("html")) return this.e(o2, b2);
                        return true;
                    }
                    b2.F((I)o2);
                    return true;
                } else {
                    if (!((L)o2).c.equals("colgroup")) return this.e(o2, b2);
                    if (b2.a().d0().equals("html")) {
                        b2.n(this);
                        return false;
                    }
                    b2.U();
                    b2.j0(A.k);
                }
                return true;
            } else {
                M m2 = (M)o2;
                String string = m2.c;
                string.getClass();
                if (!string.equals("col")) {
                    if (string.equals("html")) return b2.X(o2, A.i);
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

