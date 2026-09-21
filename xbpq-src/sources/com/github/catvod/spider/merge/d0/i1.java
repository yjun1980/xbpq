package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.x.C0243a;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class i1 {
    protected E a;
    C0060a b;
    Q c;
    protected com.github.catvod.spider.merge.c0.h d;
    protected ArrayList<com.github.catvod.spider.merge.c0.l> e;
    protected String f;
    protected O g;
    protected D h;
    private M i = new M();
    private L j = new L();

    /* JADX INFO: Access modifiers changed from: protected */
    public final com.github.catvod.spider.merge.c0.l a() {
        int size = this.e.size();
        if (size > 0) {
            return this.e.get(size - 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean b(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean c(O o);

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean d(String str) {
        O o = this.g;
        L l = this.j;
        if (o == l) {
            L l2 = new L();
            l2.s(str);
            return c(l2);
        }
        l.g();
        l.s(str);
        return c(l);
    }

    public boolean e(com.github.catvod.spider.merge.c0.c cVar) {
        M m = this.i;
        O o = this.g;
        String d = cYh.d("0E3E312423");
        if (o == m) {
            m = new M();
        } else {
            m.g();
        }
        m.b = d;
        m.j = cVar;
        m.c = C0243a.c(d);
        return c(m);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean f(String str) {
        M m = this.i;
        if (this.g == m) {
            m = new M();
        } else {
            m.g();
        }
        m.s(str);
        return c(m);
    }
}
