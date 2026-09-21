package com.github.catvod.spider.merge.P;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0059d;

/* loaded from: classes.dex */
public class C implements com.github.catvod.spider.merge.T.e {
    public static final x c = new x();
    public C a;
    public int b;

    public C() {
        this.b = -1;
    }

    public C(C c2, int i) {
        this.a = c2;
        this.b = i;
    }

    @Override // com.github.catvod.spider.merge.T.b
    public com.github.catvod.spider.merge.T.b b(int i) {
        throw null;
    }

    @Override // com.github.catvod.spider.merge.T.b
    public final String c() {
        if (d() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < d(); i++) {
            sb.append(b(i).c());
        }
        return sb.toString();
    }

    @Override // com.github.catvod.spider.merge.T.b
    public int d() {
        throw null;
    }

    @Override // com.github.catvod.spider.merge.T.b
    public <T> T e(com.github.catvod.spider.merge.T.d<? extends T> dVar) {
        return dVar.A(this);
    }

    public int f() {
        return -1;
    }

    public final boolean g() {
        return this.b == -1;
    }

    public final String toString() {
        StringBuilder b = C0059d.b(cYh.d("3C"));
        for (C c2 = this; c2 != null; c2 = c2.a) {
            if (!c2.g()) {
                b.append(c2.b);
            }
            C c3 = c2.a;
            if (c3 != null && !c3.g()) {
                b.append(cYh.d("47"));
            }
        }
        b.append(cYh.d("3A"));
        return b.toString();
    }
}
