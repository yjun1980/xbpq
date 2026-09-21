package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.d0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0082l extends A {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0082l() {
        super(cYh.d("2E3E0723363702232425"), 18, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x0077. Please report as an issue. */
    @Override // com.github.catvod.spider.merge.d0.A
    public final boolean d(O o, C0062b c0062b) {
        A a;
        if (A.a(o)) {
            c0062b.E((H) o);
        } else if (o.b()) {
            c0062b.F((I) o);
        } else {
            if (o.c()) {
                c0062b.n(this);
                return false;
            }
            boolean f = o.f();
            String d = cYh.d("0122203C32290224");
            String d2 = cYh.d("0F242C3D");
            if (f) {
                M m = (M) o;
                String str = m.c;
                str.getClass();
                char c = 65535;
                switch (str.hashCode()) {
                    case -1644953643:
                        if (str.equals(d)) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3213227:
                        if (str.equals(d2)) {
                            c = 1;
                            break;
                        }
                        break;
                    case 97692013:
                        if (str.equals(cYh.d("0122203C32"))) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1192721831:
                        if (str.equals(cYh.d("093F272336370223"))) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        c0062b.D(m);
                        break;
                    case 1:
                        a = A.i;
                        return c0062b.X(m, a);
                    case 2:
                        c0062b.G(m);
                        break;
                    case 3:
                        a = A.f;
                        return c0062b.X(m, a);
                    default:
                        c0062b.n(this);
                        return false;
                }
            } else if (o.e() && ((L) o).c.equals(d)) {
                if (c0062b.a().d0().equals(d2)) {
                    c0062b.n(this);
                    return false;
                }
                c0062b.U();
                if (!c0062b.a().d0().equals(d)) {
                    c0062b.j0(A.v);
                }
            } else {
                if (!o.d()) {
                    c0062b.n(this);
                    return false;
                }
                if (!c0062b.a().d0().equals(d2)) {
                    c0062b.n(this);
                }
            }
        }
        return true;
    }
}
