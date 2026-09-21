/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.P;

import com.github.catvod.spider.merge.P.A;
import com.github.catvod.spider.merge.P.a;
import com.github.catvod.spider.merge.P.y;
import com.github.catvod.spider.merge.Q.l;
import java.util.List;
import java.util.WeakHashMap;

public abstract class B<Symbol, ATNInterpreter extends l> {
    private List<a> a = new A();
    protected ATNInterpreter b;
    private int c = -1;

    static {
        new WeakHashMap();
        new WeakHashMap();
    }

    public abstract com.github.catvod.spider.merge.Q.a f();

    public final a g() {
        return new y(this.a);
    }

    public final ATNInterpreter h() {
        return this.b;
    }

    public final int i() {
        return this.c;
    }

    public boolean j(int n2) {
        return true;
    }

    public final void k(int n2) {
        this.c = n2;
    }
}

