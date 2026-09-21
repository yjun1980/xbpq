/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.B;
import com.github.catvod.spider.merge.xc.G0.G;
import com.github.catvod.spider.merge.xc.G0.H;
import com.github.catvod.spider.merge.xc.G0.K;
import com.github.catvod.spider.merge.xc.G0.L;
import com.github.catvod.spider.merge.xc.G0.N;
import com.github.catvod.spider.merge.xc.G0.b;
import com.github.catvod.spider.merge.xc.G0.x;
import com.github.catvod.spider.merge.xc.y0.a;

public final class e
extends B {
    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean c(N n2, b b2) {
        int n3 = 0;
        if (B.a(n2)) {
            b2.s((G)n2);
            return true;
        }
        int n4 = com.github.catvod.spider.merge.xc.y0.a.a(n2.a);
        if (n4 == 0) {
            b2.h(this);
            return true;
        }
        B b3 = B.d;
        if (n4 != 1) {
            if (n4 != 2) {
                if (n4 == 3) {
                    b2.t((H)n2);
                    return true;
                }
                if (n4 != 5) {
                    return this.d(n2, b2);
                }
                if (!b2.g("html")) return this.d(n2, b2);
                return true;
            }
            String string = ((K)n2).c;
            string.getClass();
            if (string.equals("template")) {
                b2.E(n2, b3);
                return true;
            }
            if (!string.equals("colgroup")) {
                return this.d(n2, b2);
            }
            if (!b2.g(string)) {
                b2.h(this);
                return false;
            }
            b2.A();
            b2.l = B.i;
            return true;
        }
        L l2 = (L)n2;
        String string = l2.c;
        string.getClass();
        int n5 = -1;
        switch (string.hashCode()) {
            case 3213227: {
                if (!string.equals("html")) break;
                n5 = 1;
                break;
            }
            case 98688: {
                if (!string.equals("col")) break;
                n5 = 2;
                break;
            }
            case -1321546630: {
                if (!string.equals("template")) break;
                n5 = 3;
                break;
            }
        }
        switch (n5) {
            default: {
                n3 = -1;
                break;
            }
            case 1: {
                n3 = 2;
                break;
            }
            case 2: {
                n3 = 1;
                break;
            }
            case 3: 
        }
        switch (n3) {
            default: {
                return this.d(n2, b2);
            }
            case 2: {
                b3 = B.g;
                b2.g = n2;
                return ((x)b3).c(n2, b2);
            }
            case 1: {
                b2.u(l2);
                return true;
            }
            case 0: 
        }
        b2.E(n2, b3);
        return true;
    }

    public final boolean d(N n2, b b2) {
        if (!b2.g("colgroup")) {
            b2.h(this);
            return false;
        }
        b2.A();
        b2.l = B.i;
        b2.D(n2);
        return true;
    }
}

