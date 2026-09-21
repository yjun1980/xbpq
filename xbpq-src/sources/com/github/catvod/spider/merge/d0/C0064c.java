package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge.d0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0064c extends A {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0064c() {
        super(cYh.d("2E3E153035360204242923"), 9, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.A
    public final boolean d(O o, C0062b c0062b) {
        String str;
        A a = A.i;
        if (o.a == 5) {
            H h = (H) o;
            String j = h.j();
            str = A.z;
            if (j.equals(str)) {
                c0062b.n(this);
                return false;
            }
            ((ArrayList) c0062b.v()).add(h.j());
            return true;
        }
        if (((ArrayList) c0062b.v()).size() > 0) {
            Iterator it = ((ArrayList) c0062b.v()).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (com.github.catvod.spider.merge.b0.b.c(str2)) {
                    H h2 = new H();
                    h2.i(str2);
                    c0062b.E(h2);
                } else {
                    c0062b.n(this);
                    if (com.github.catvod.spider.merge.b0.b.b(c0062b.a().d0(), C0109z.C)) {
                        c0062b.g0(true);
                        H h3 = new H();
                        h3.i(str2);
                        c0062b.X(h3, a);
                        c0062b.g0(false);
                    } else {
                        H h4 = new H();
                        h4.i(str2);
                        c0062b.X(h4, a);
                    }
                }
            }
            c0062b.R();
        }
        c0062b.j0(c0062b.T());
        return c0062b.c(o);
    }
}
