package com.github.catvod.spider.merge.P;

import com.github.catvod.spider.merge.Q.AbstractC0021l;
import com.github.catvod.spider.merge.Q.C0010a;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class B<Symbol, ATNInterpreter extends AbstractC0021l> {
    protected ATNInterpreter b;
    private List<InterfaceC0000a> a = new A();
    private int c = -1;

    static {
        new WeakHashMap();
        new WeakHashMap();
    }

    public abstract C0010a f();

    public final InterfaceC0000a g() {
        return new y(this.a);
    }

    public final ATNInterpreter h() {
        return this.b;
    }

    public final int i() {
        return this.c;
    }

    public boolean j(int i) {
        return true;
    }

    public final void k(int i) {
        this.c = i;
    }
}
