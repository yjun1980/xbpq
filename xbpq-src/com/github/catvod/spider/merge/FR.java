/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.A0;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.Rz;
import java.util.List;

abstract class FR
extends A0 {
    Object b;

    FR() {
    }

    private void f() {
        if (!this.E9()) {
            Object object = this.b;
            Rz rz = new Rz();
            this.b = rz;
            if (object != null) {
                rz.W(this.Q(), (String)object);
            }
        }
    }

    protected FR DL(A0 a02) {
        a02 = (FR)super.A(a02);
        if (this.E9()) {
            ((FR)a02).b = ((Rz)this.b).HM();
        }
        return a02;
    }

    @Override
    protected final boolean E9() {
        return this.b instanceof Rz;
    }

    @Override
    public int HM() {
        return 0;
    }

    String Lw() {
        return this.T4(this.Q());
    }

    @Override
    public final Rz OL() {
        this.f();
        return (Rz)this.b;
    }

    @Override
    public String T4(String string) {
        Rc.HM(string);
        if (!this.E9()) {
            string = string.equals(this.Q()) ? (String)this.b : "";
            return string;
        }
        return super.T4(string);
    }

    @Override
    public A0 b(String string, String string2) {
        if (!this.E9() && string.equals(this.Q())) {
            this.b = string2;
        } else {
            this.f();
            super.b(string, string2);
        }
        return this;
    }

    @Override
    protected void cD(String string) {
    }

    @Override
    protected List<A0> hR() {
        return A0.l8;
    }

    @Override
    public String l() {
        String string = this.uS() ? this.G().l() : "";
        return string;
    }

    @Override
    public String l8(String string) {
        this.f();
        return super.l8(string);
    }

    @Override
    public A0 s() {
        return this;
    }
}

