/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.spider.merge.gu.A
 *  com.github.catvod.spider.merge.gu.a
 */
package com.github.catvod.spider.merge.gu;

import com.github.catvod.spider.merge.Nx.l;
import com.github.catvod.spider.merge.gu.A;
import com.github.catvod.spider.merge.gu.a;
import com.github.catvod.spider.merge.gu.y;
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

    public abstract com.github.catvod.spider.merge.Nx.a f();

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

