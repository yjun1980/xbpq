/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.B;
import com.github.catvod.spider.merge.f1.I;
import com.github.catvod.spider.merge.f1.J;
import com.github.catvod.spider.merge.f1.M;
import com.github.catvod.spider.merge.f1.N;
import com.github.catvod.spider.merge.f1.P;
import com.github.catvod.spider.merge.f1.b;
import com.github.catvod.spider.merge.f1.u;
import com.github.catvod.spider.merge.f1.x;
import java.util.Objects;

final class n
extends B {
    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    final boolean i(P object, b b2) {
        void var2_6;
        if (B.b((P)object)) {
            var2_6.I((I)object);
            return true;
        }
        if (((P)object).c()) {
            var2_6.J((J)object);
            return true;
        }
        if (((P)object).d()) {
            var2_6.r(this);
            return false;
        }
        if (((P)object).g()) {
            N n2 = (N)object;
            String string = n2.e;
            Objects.requireNonNull(string);
            int n3 = -1;
            switch (string.hashCode()) {
                default: {
                    break;
                }
                case 1192721831: {
                    if (!string.equals("noframes")) break;
                    n3 = 3;
                    break;
                }
                case 97692013: {
                    if (!string.equals("frame")) break;
                    n3 = 2;
                    break;
                }
                case 3213227: {
                    if (!string.equals("html")) break;
                    n3 = 1;
                    break;
                }
                case -1644953643: {
                    if (!string.equals("frameset")) break;
                    n3 = 0;
                }
            }
            switch (n3) {
                default: {
                    var2_6.r(this);
                    return false;
                }
                case 3: {
                    void var1_5;
                    u u2 = B.d;
                    return var2_6.d0(n2, (B)var1_5);
                }
                case 2: {
                    var2_6.K(n2);
                    return true;
                }
                case 1: {
                    void var1_5;
                    x x2 = B.g;
                    return var2_6.d0(n2, (B)var1_5);
                }
                case 0: 
            }
            var2_6.H(n2);
            return true;
        }
        if (((P)object).f() && ((M)object).e.equals("frameset")) {
            if (var2_6.b("html")) {
                var2_6.r(this);
                return false;
            }
            var2_6.Z();
            if (var2_6.b("frameset")) return true;
            var2_6.s0(B.u);
            return true;
        }
        if (((P)object).e()) {
            if (var2_6.b("html")) return true;
            var2_6.r(this);
            return true;
        }
        var2_6.r(this);
        return false;
    }
}

