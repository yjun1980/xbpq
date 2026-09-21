/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e1;

import com.github.catvod.spider.merge.e1.c;
import com.github.catvod.spider.merge.e1.s;
import com.github.catvod.spider.merge.e1.t;
import java.util.List;

abstract class q
extends s {
    Object d;

    q() {
    }

    private void J() {
        Object object = this.d;
        if (!(object instanceof c)) {
            c c2 = new c();
            this.d = c2;
            if (object != null) {
                c2.z(this.s(), (String)object);
            }
        }
    }

    public s H(String string, String string2) {
        if (!(this.d instanceof c) && string.equals(this.s())) {
            this.d = string2;
        } else {
            this.J();
            string = t.a(this).g().b(string);
            this.d().A(string, string2);
        }
        return this;
    }

    final String I() {
        return this.c(this.s());
    }

    @Override
    public String a(String string) {
        this.J();
        return super.a(string);
    }

    @Override
    public String c(String string) {
        if (!(this.d instanceof c)) {
            string = this.s().equals(string) ? (String)this.d : "";
            return string;
        }
        return super.c(string);
    }

    @Override
    public final c d() {
        this.J();
        return (c)this.d;
    }

    @Override
    public String e() {
        Object object = this.a;
        boolean bl = object != null;
        object = bl ? ((s)object).e() : "";
        return object;
    }

    @Override
    public int g() {
        return 0;
    }

    @Override
    protected final s j(s object) {
        q q2 = (q)super.j((s)object);
        object = this.d;
        if (object instanceof c) {
            q2.d = ((c)object).m();
        }
        return q2;
    }

    @Override
    protected final void k(String string) {
    }

    @Override
    public s l() {
        return this;
    }

    @Override
    protected final List<s> m() {
        return s.c;
    }

    @Override
    public boolean n(String string) {
        this.J();
        return super.n("version");
    }

    @Override
    protected final boolean o() {
        return this.d instanceof c;
    }
}

