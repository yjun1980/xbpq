package com.github.catvod.spider.merge.c0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d0.C0062b;
import com.github.catvod.spider.merge.d0.D;
import com.github.catvod.spider.merge.d0.E;
import com.github.catvod.spider.merge.d0.F;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h extends l {
    private g l;
    private E m;
    private int n;

    public h() {
        super(F.l(cYh.d("44222E3E23"), D.c), "", null);
        this.l = new g();
        this.n = 1;
        this.m = new E(new C0062b());
    }

    @Override // com.github.catvod.spider.merge.c0.l
    public final l o0(String str) {
        l M;
        l M2;
        Iterator<l> it = Q().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String d = cYh.d("0F242C3D");
            if (!hasNext) {
                M = M(d);
                break;
            }
            M = it.next();
            if (M.d0().equals(d)) {
                break;
            }
        }
        Iterator<l> it2 = M.Q().iterator();
        while (true) {
            boolean hasNext2 = it2.hasNext();
            String d2 = cYh.d("053F2528");
            if (!hasNext2) {
                M2 = M.M(d2);
                break;
            }
            M2 = it2.next();
            if (d2.equals(M2.d0())) {
                break;
            }
            if (cYh.d("0122203C32290224").equals(M2.d0())) {
                break;
            }
        }
        M2.o0(str);
        return this;
    }

    @Override // com.github.catvod.spider.merge.c0.l, com.github.catvod.spider.merge.c0.r
    /* renamed from: r0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final h j() {
        h hVar = (h) super.j();
        hVar.l = this.l.clone();
        return hVar;
    }

    public final g s0() {
        return this.l;
    }

    @Override // com.github.catvod.spider.merge.c0.l, com.github.catvod.spider.merge.c0.r
    public final String t() {
        return cYh.d("44342E322237023E35");
    }

    public final h t0(E e) {
        this.m = e;
        return this;
    }

    @Override // com.github.catvod.spider.merge.c0.r
    public final String u() {
        return X();
    }

    public final E u0() {
        return this.m;
    }

    public final h v0() {
        this.n = 2;
        return this;
    }

    public final int w0() {
        return this.n;
    }
}
