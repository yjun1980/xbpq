/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Em;

import com.github.catvod.spider.merge.Em.g;
import com.github.catvod.spider.merge.Em.l;
import com.github.catvod.spider.merge.Fs.D;
import com.github.catvod.spider.merge.Fs.E;
import com.github.catvod.spider.merge.Fs.F;
import com.github.catvod.spider.merge.Fs.b;

public final class h
extends l {
    private g l = new g();
    private E m = new E(new b());
    private int n = 1;

    public h() {
        super(F.l("#root", D.c), "", null);
    }

    @Override
    public final l o0(String string) {
        Object object;
        block4: {
            l l22;
            block3: {
                for (l l22 : this.Q()) {
                    if (!l22.d0().equals("html")) continue;
                    break block3;
                }
                l22 = this.M("html");
            }
            for (l l3 : l22.Q()) {
                object = l3;
                if (!"body".equals(l3.d0())) {
                    if (!"frameset".equals(l3.d0())) continue;
                    object = l3;
                }
                break block4;
            }
            object = l22.M("body");
        }
        ((l)object).o0(string);
        return this;
    }

    public final h r0() {
        h h2 = (h)super.S();
        h2.l = this.l.a();
        return h2;
    }

    public final g s0() {
        return this.l;
    }

    @Override
    public final String t() {
        return "#document";
    }

    public final h t0(E e2) {
        this.m = e2;
        return this;
    }

    @Override
    public final String u() {
        return this.X();
    }

    public final E u0() {
        return this.m;
    }

    public final h v0() {
        this.n = 2;
        return this;
    }

    public final int w0() {
        return this.n;
    }
}

