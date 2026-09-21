package com.github.catvod.spider.merge.c0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d0.D;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class r implements Cloneable {
    static final List<r> e = Collections.emptyList();
    r c;
    int d;

    private void B(int i) {
        List<r> n = n();
        while (i < n.size()) {
            n.get(i).d = i;
            i++;
        }
    }

    public final r A() {
        return this.c;
    }

    public final void C() {
        com.github.catvod.spider.merge.N.a.k(this.c);
        this.c.D(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void D(r rVar) {
        com.github.catvod.spider.merge.N.a.f(rVar.c == this);
        int i = rVar.d;
        n().remove(i);
        B(i);
        rVar.c = null;
    }

    public final void E(r rVar) {
        com.github.catvod.spider.merge.N.a.k(this.c);
        r rVar2 = this.c;
        rVar2.getClass();
        com.github.catvod.spider.merge.N.a.f(this.c == rVar2);
        r rVar3 = rVar.c;
        if (rVar3 != null) {
            rVar3.D(rVar);
        }
        int i = this.d;
        rVar2.n().set(i, rVar);
        rVar.c = rVar2;
        rVar.d = i;
        this.c = null;
    }

    public r F() {
        r rVar = this;
        while (true) {
            r rVar2 = rVar.c;
            if (rVar2 == null) {
                return rVar;
            }
            rVar = rVar2;
        }
    }

    public final void G(String str) {
        l(str);
    }

    public final int H() {
        return this.d;
    }

    public String a(String str) {
        com.github.catvod.spider.merge.N.a.i(str);
        String str2 = "";
        if (p() && d().m(str)) {
            String e2 = e();
            String k = d().k(str);
            int i = com.github.catvod.spider.merge.b0.b.d;
            try {
                try {
                    str2 = com.github.catvod.spider.merge.b0.b.h(new URL(e2), k).toExternalForm();
                } catch (MalformedURLException unused) {
                    str2 = new URL(k).toExternalForm();
                }
            } catch (MalformedURLException unused2) {
            }
        }
        return str2;
    }

    public r b(String str, String str2) {
        s.a(this).getClass();
        d().u(D.c.a(str), str2);
        return this;
    }

    public String c(String str) {
        com.github.catvod.spider.merge.N.a.k(str);
        if (!p()) {
            return "";
        }
        String k = d().k(str);
        return k.length() > 0 ? k : str.startsWith(cYh.d("0632326B")) ? a(str.substring(4)) : "";
    }

    public abstract c d();

    public abstract String e();

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final r f(r rVar) {
        boolean z;
        com.github.catvod.spider.merge.N.a.k(this.c);
        r rVar2 = this.c;
        int i = this.d;
        int i2 = 1;
        r[] rVarArr = {rVar};
        rVar2.getClass();
        List<r> n = rVar2.n();
        r z2 = rVarArr[0].z();
        if (z2 != null && z2.h() == 1) {
            List<r> n2 = z2.n();
            int i3 = 1;
            while (true) {
                int i4 = i3 - 1;
                if (i3 <= 0) {
                    z = true;
                    break;
                }
                if (rVarArr[i4] != n2.get(i4)) {
                    z = false;
                    break;
                }
                i3 = i4;
            }
            if (z) {
                z2.m();
                n.addAll(i, Arrays.asList(rVarArr));
                while (true) {
                    int i5 = i2 - 1;
                    if (i2 <= 0) {
                        break;
                    }
                    rVarArr[i5].c = rVar2;
                    i2 = i5;
                }
                rVar2.B(i);
                return this;
            }
        }
        for (int i6 = 0; i6 < 1; i6++) {
            if (rVarArr[i6] == null) {
                throw new IllegalArgumentException(cYh.d("262233302E7A0A25322577340824613238341331283F773B0929613F22360B702E333D3F042432"));
            }
        }
        for (int i7 = 0; i7 < 1; i7++) {
            r rVar3 = rVarArr[i7];
            rVar3.getClass();
            r rVar4 = rVar3.c;
            if (rVar4 != null) {
                rVar4.D(rVar3);
            }
            rVar3.c = rVar2;
        }
        n.addAll(i, Arrays.asList(rVarArr));
        rVar2.B(i);
        return this;
    }

    public final r g(int i) {
        return n().get(i);
    }

    public abstract int h();

    public final List<r> i() {
        if (h() == 0) {
            return e;
        }
        List<r> n = n();
        ArrayList arrayList = new ArrayList(n.size());
        arrayList.addAll(n);
        return Collections.unmodifiableList(arrayList);
    }

    @Override // 
    public r j() {
        r k = k(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(k);
        while (!linkedList.isEmpty()) {
            r rVar = (r) linkedList.remove();
            int h = rVar.h();
            for (int i = 0; i < h; i++) {
                List<r> n = rVar.n();
                r k2 = n.get(i).k(rVar);
                n.set(i, k2);
                linkedList.add(k2);
            }
        }
        return k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public r k(r rVar) {
        try {
            r rVar2 = (r) super.clone();
            rVar2.c = rVar;
            rVar2.d = rVar == null ? 0 : this.d;
            return rVar2;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    protected abstract void l(String str);

    public abstract r m();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract List<r> n();

    public final boolean o(String str) {
        com.github.catvod.spider.merge.N.a.k(str);
        if (!p()) {
            return false;
        }
        if (str.startsWith(cYh.d("0632326B"))) {
            String substring = str.substring(4);
            if (d().m(substring) && !a(substring).isEmpty()) {
                return true;
            }
        }
        return d().m(str);
    }

    protected abstract boolean p();

    public final boolean q() {
        return this.c != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r(Appendable appendable, int i, g gVar) {
        appendable.append('\n').append(com.github.catvod.spider.merge.b0.b.f(gVar.d() * i));
    }

    public final r s() {
        r rVar = this.c;
        if (rVar == null) {
            return null;
        }
        List<r> n = rVar.n();
        int i = this.d + 1;
        if (n.size() > i) {
            return n.get(i);
        }
        return null;
    }

    public abstract String t();

    public String toString() {
        return u();
    }

    public String u() {
        StringBuilder a = com.github.catvod.spider.merge.b0.b.a();
        v(a);
        return com.github.catvod.spider.merge.b0.b.g(a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void v(Appendable appendable) {
        h y = y();
        if (y == null) {
            y = new h();
        }
        com.github.catvod.spider.merge.W.a.c(new q(appendable, y.s0()), this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void w(Appendable appendable, int i, g gVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void x(Appendable appendable, int i, g gVar);

    public final h y() {
        r F = F();
        if (F instanceof h) {
            return (h) F;
        }
        return null;
    }

    public r z() {
        return this.c;
    }
}
