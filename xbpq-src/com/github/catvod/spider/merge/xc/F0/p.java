/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.F0;

import com.github.catvod.spider.merge.xc.D0.b;
import com.github.catvod.spider.merge.xc.F0.c;
import com.github.catvod.spider.merge.xc.F0.q;
import com.github.catvod.spider.merge.xc.a.a;
import java.util.List;

public abstract class p
extends q {
    public Object d;

    @Override
    public final String a(String string) {
        this.z();
        return super.a(string);
    }

    @Override
    public final String c(String string) {
        if (!(this.d instanceof c)) {
            string = this.o().equals(string) ? (String)this.d : "";
            return string;
        }
        return super.c(string);
    }

    @Override
    public final c d() {
        this.z();
        return (c)this.d;
    }

    @Override
    public final String e() {
        Object object = this.a;
        object = object != null ? ((q)object).e() : "";
        return object;
    }

    @Override
    public final int f() {
        return 0;
    }

    @Override
    public final q h(q object) {
        p p2 = (p)super.h((q)object);
        object = this.d;
        if (object instanceof c) {
            p2.d = ((c)object).c();
        }
        return p2;
    }

    @Override
    public final q i() {
        return this;
    }

    @Override
    public final List j() {
        return q.c;
    }

    @Override
    public final boolean l() {
        return this.d instanceof c;
    }

    public final p x(String string, String string2) {
        if (!(this.d instanceof c) && string.equals("#doctype")) {
            this.d = string2;
        } else {
            this.z();
            com.github.catvod.spider.merge.xc.a.a.r(this);
            string = com.github.catvod.spider.merge.xc.D0.b.u(string.trim());
            c c2 = this.d();
            int n2 = c2.h(string);
            if (n2 != -1) {
                c2.c[n2] = string2;
                if (!c2.b[n2].equals(string)) {
                    c2.b[n2] = string;
                }
            } else {
                c2.a(string2, string);
            }
        }
        return this;
    }

    public final String y() {
        return this.c(this.o());
    }

    public final void z() {
        Object object = this.d;
        if (!(object instanceof c)) {
            c c2 = new c();
            this.d = c2;
            if (object != null) {
                c2.k(this.o(), (String)object);
            }
        }
    }
}

