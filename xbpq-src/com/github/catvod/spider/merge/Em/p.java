/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Em;

import com.github.catvod.spider.merge.Dw.i;
import com.github.catvod.spider.merge.Em.c;
import com.github.catvod.spider.merge.Em.r;
import java.util.List;

abstract class p
extends r {
    Object f;

    p() {
    }

    private void J() {
        Object object = this.f;
        if (!(object instanceof c)) {
            c c2 = new c();
            this.f = c2;
            if (object != null) {
                c2.t(this.t(), (String)object);
            }
        }
    }

    final String I() {
        return this.c(this.t());
    }

    @Override
    public String a(String string) {
        this.J();
        return super.a(string);
    }

    @Override
    public r b(String string, String string2) {
        if (!(this.f instanceof c) && string.equals("#doctype")) {
            this.f = string2;
        } else {
            this.J();
            super.b(string, string2);
        }
        return this;
    }

    @Override
    public String c(String string) {
        i.k(string);
        if (!(this.f instanceof c)) {
            string = string.equals(this.t()) ? (String)this.f : "";
            return string;
        }
        return super.c(string);
    }

    @Override
    public final c d() {
        this.J();
        return (c)this.f;
    }

    @Override
    public String e() {
        Object object = this.c;
        boolean bl = object != null;
        object = bl ? ((r)object).e() : "";
        return object;
    }

    @Override
    public int h() {
        return 0;
    }

    @Override
    protected final r k(r r2) {
        r2 = (p)super.k(r2);
        Object object = this.f;
        if (object instanceof c) {
            ((p)r2).f = ((c)object).h();
        }
        return r2;
    }

    @Override
    protected final void l(String string) {
    }

    @Override
    public r m() {
        return this;
    }

    @Override
    protected final List<r> n() {
        return r.e;
    }

    @Override
    protected final boolean p() {
        return this.f instanceof c;
    }
}

