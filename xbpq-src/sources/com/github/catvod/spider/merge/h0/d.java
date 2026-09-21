package com.github.catvod.spider.merge.h0;

import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0059d;
import com.github.catvod.spider.merge.e0.C0123g;
import com.github.catvod.spider.merge.x.C0244b;

/* loaded from: classes.dex */
public final class d {
    private C0123g a;
    private boolean b = false;
    private d c;

    private d(l lVar) {
        C0123g c0123g = new C0123g();
        this.a = c0123g;
        c0123g.add(lVar);
    }

    private d(C0123g c0123g) {
        C0123g c0123g2 = new C0123g();
        this.a = c0123g2;
        c0123g2.addAll(c0123g);
    }

    public static d b(l lVar) {
        return new d(lVar);
    }

    public static d c(C0123g c0123g) {
        return new d(c0123g);
    }

    public static d d(d dVar) {
        d dVar2 = new d(dVar.a);
        dVar2.c = dVar;
        return dVar2;
    }

    public final C0123g a() {
        return this.a;
    }

    public final d e() {
        return this.c;
    }

    public final boolean f() {
        return this.b;
    }

    public final void g() {
        this.b = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        this.b = true;
    }

    public final void i(C0123g c0123g) {
        this.a = c0123g;
    }

    public final d j(d dVar) {
        this.c = dVar;
        return this;
    }

    public final l k() {
        if (this.a.size() == 1) {
            C0123g c0123g = this.a;
            if (c0123g.isEmpty()) {
                return null;
            }
            return c0123g.get(0);
        }
        StringBuilder b = C0059d.b(cYh.d("0425332332341370223E392E022835713E29473D2E23327A1338203F7735093561343B76133F35303B7A5A70"));
        b.append(this.a.size());
        throw new C0244b(b.toString());
    }
}
