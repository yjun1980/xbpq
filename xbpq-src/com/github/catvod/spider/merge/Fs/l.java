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
import com.github.catvod.spider.merge.Fs.t;
import com.github.catvod.spider.merge.Fs.w;

final class l
extends A {
    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    final boolean d(O object, b b2) {
        void var2_6;
        if (A.a((O)object)) {
            var2_6.E((H)object);
            return true;
        }
        if (((O)object).b()) {
            var2_6.F((I)object);
            return true;
        }
        if (((O)object).c()) {
            var2_6.n(this);
            return false;
        }
        if (((O)object).f()) {
            M m2 = (M)object;
            String string = m2.c;
            string.getClass();
            int n2 = -1;
            switch (string.hashCode()) {
                default: {
                    break;
                }
                case 1192721831: {
                    if (!string.equals("noframes")) break;
                    n2 = 3;
                    break;
                }
                case 97692013: {
                    if (!string.equals("frame")) break;
                    n2 = 2;
                    break;
                }
                case 3213227: {
                    if (!string.equals("html")) break;
                    n2 = 1;
                    break;
                }
                case -1644953643: {
                    if (!string.equals("frameset")) break;
                    n2 = 0;
                }
            }
            switch (n2) {
                default: {
                    var2_6.n(this);
                    return false;
                }
                case 3: {
                    void var1_5;
                    t t2 = A.f;
                    return var2_6.X(m2, (A)var1_5);
                }
                case 2: {
                    var2_6.G(m2);
                    return true;
                }
                case 1: {
                    void var1_5;
                    w w2 = A.i;
                    return var2_6.X(m2, (A)var1_5);
                }
                case 0: 
            }
            var2_6.D(m2);
            return true;
        }
        if (((O)object).e() && ((L)object).c.equals("frameset")) {
            if (var2_6.a().d0().equals("html")) {
                var2_6.n(this);
                return false;
            }
            var2_6.U();
            if (var2_6.a().d0().equals("frameset")) return true;
            var2_6.j0(A.v);
            return true;
        }
        if (((O)object).d()) {
            if (var2_6.a().d0().equals("html")) return true;
            var2_6.n(this);
            return true;
        }
        var2_6.n(this);
        return false;
    }
}

