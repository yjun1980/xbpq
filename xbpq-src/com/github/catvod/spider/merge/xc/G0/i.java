/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.F0.l;
import com.github.catvod.spider.merge.xc.G0.A;
import com.github.catvod.spider.merge.xc.G0.B;
import com.github.catvod.spider.merge.xc.G0.G;
import com.github.catvod.spider.merge.xc.G0.H;
import com.github.catvod.spider.merge.xc.G0.K;
import com.github.catvod.spider.merge.xc.G0.L;
import com.github.catvod.spider.merge.xc.G0.N;
import com.github.catvod.spider.merge.xc.G0.b;
import com.github.catvod.spider.merge.xc.G0.u;
import com.github.catvod.spider.merge.xc.G0.x;
import com.github.catvod.spider.merge.xc.y0.a;

public final class i
extends B {
    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean c(N object, b b2) {
        int n2 = 3;
        int n3 = com.github.catvod.spider.merge.xc.y0.a.a(((N)object).a);
        if (n3 == 0) {
            b2.h(this);
            return false;
        }
        u u2 = B.d;
        if (n3 != 1) {
            if (n3 != 2) {
                if (n3 == 3) {
                    b2.t((H)object);
                    return true;
                }
                if (n3 != 4) {
                    if (n3 != 5) {
                        b2.h(this);
                        return false;
                    }
                    if (b2.g("html")) return true;
                    b2.h(this);
                    return true;
                }
                object = (G)object;
                if (((G)object).b.equals(B.x)) {
                    b2.h(this);
                    return false;
                }
                b2.s((G)object);
                return true;
            }
            String string = ((K)object).c;
            string.getClass();
            int n4 = -1;
            switch (string.hashCode()) {
                case -80773204: {
                    if (!string.equals("optgroup")) break;
                    n4 = 1;
                    break;
                }
                case -906021636: {
                    if (!string.equals("select")) break;
                    n4 = 2;
                    break;
                }
                case -1010136971: {
                    if (!string.equals("option")) break;
                    n4 = 3;
                    break;
                }
                case -1321546630: {
                    if (!string.equals("template")) break;
                    n4 = 4;
                    break;
                }
            }
            switch (n4) {
                default: {
                    n2 = -1;
                    break;
                }
                case 2: {
                    n2 = 2;
                    break;
                }
                case 3: {
                    n2 = 1;
                    break;
                }
                case 4: {
                    n2 = 0;
                    break;
                }
                case 1: 
            }
            switch (n2) {
                default: {
                    b2.h(this);
                    return false;
                }
                case 3: {
                    if (b2.g("option") && b2.a(b2.f()) != null && b2.a((l)b2.f()).d.b.equals("optgroup")) {
                        b2.F("option");
                    }
                    if (b2.g("optgroup")) {
                        b2.A();
                        return true;
                    }
                    b2.h(this);
                    return true;
                }
                case 2: {
                    if (!b2.o(string)) {
                        b2.h(this);
                        return false;
                    }
                    b2.B(string);
                    b2.M();
                    return true;
                }
                case 1: {
                    if (b2.g("option")) {
                        b2.A();
                        return true;
                    }
                    b2.h(this);
                    return true;
                }
                case 0: 
            }
            b2.g = object;
            return u2.c((N)object, b2);
        }
        L l2 = (L)object;
        String string = l2.c;
        if (string.equals("html")) {
            object = B.g;
            b2.g = l2;
            return ((x)((Object)object)).c(l2, b2);
        }
        if (string.equals("option")) {
            if (b2.g("option")) {
                b2.F("option");
            }
            b2.r(l2);
            return true;
        }
        if (string.equals("optgroup")) {
            if (b2.g("option")) {
                b2.F("option");
            }
            if (b2.g("optgroup")) {
                b2.F("optgroup");
            }
            b2.r(l2);
            return true;
        }
        if (string.equals("select")) {
            b2.h(this);
            return b2.F("select");
        }
        if (com.github.catvod.spider.merge.xc.E0.b.c(string, A.F)) {
            b2.h(this);
            if (!b2.o("select")) {
                return false;
            }
            b2.F("select");
            return b2.D(l2);
        }
        if (!string.equals("script") && !string.equals("template")) {
            b2.h(this);
            return false;
        }
        b2.g = object;
        return u2.c((N)object, b2);
    }
}

