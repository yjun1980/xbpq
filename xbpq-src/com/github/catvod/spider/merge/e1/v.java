/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e1;

import com.github.catvod.spider.merge.d1.c;
import com.github.catvod.spider.merge.e1.g;
import com.github.catvod.spider.merge.e1.h;
import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.e1.o;
import com.github.catvod.spider.merge.e1.q;
import com.github.catvod.spider.merge.e1.s;

public class v
extends q {
    public v(String string) {
        this.d = string;
    }

    static boolean M(StringBuilder stringBuilder) {
        int n2 = stringBuilder.length();
        boolean bl = true;
        if (n2 == 0 || stringBuilder.charAt(stringBuilder.length() - 1) != ' ') {
            bl = false;
        }
        return bl;
    }

    public v K() {
        return (v)super.i();
    }

    public final boolean L() {
        return com.github.catvod.spider.merge.d1.c.d(this.I());
    }

    @Override
    public final s l() {
        return this;
    }

    @Override
    public String s() {
        return "#text";
    }

    @Override
    public final String toString() {
        return this.t();
    }

    @Override
    void v(Appendable appendable, int n2, g g2) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        block8: {
            block5: {
                boolean bl4;
                m m2;
                block7: {
                    boolean bl5;
                    s s2;
                    block6: {
                        bl3 = g2.i();
                        s2 = this.a;
                        m2 = s2 instanceof m ? (m)s2 : null;
                        bl5 = true;
                        bl2 = bl3 && !m.k0(s2);
                        if (!bl2) break block5;
                        bl3 = this.b == 0 && m2 != null && m2.q0().c() || this.a instanceof h;
                        bl = this.r() == null && m2 != null && m2.q0().c();
                        s2 = this.r();
                        if (!(s2 instanceof m)) break block6;
                        bl4 = bl5;
                        if (((m)s2).o0(g2)) break block7;
                    }
                    bl4 = s2 instanceof v && ((v)s2).L() ? bl5 : false;
                }
                if (bl4 && this.L()) {
                    return;
                }
                if (this.b == 0 && m2 != null && m2.q0().a() && !this.L()) {
                    this.q(appendable, n2, g2);
                }
                boolean bl6 = bl3;
                bl3 = bl;
                bl = bl6;
                break block8;
            }
            bl = false;
            bl3 = false;
        }
        o.e(appendable, this.I(), g2, false, bl2, bl, bl3);
    }

    @Override
    void w(Appendable appendable, int n2, g g2) {
    }
}

