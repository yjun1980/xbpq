package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.P.InterfaceC0003d;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class D {
    private final C[] a;
    private final int b;

    public D(C[] cArr) {
        this.a = cArr;
        int i = 0;
        for (C c : cArr) {
            i = com.github.catvod.spider.merge.N.a.p(i, c);
        }
        this.b = com.github.catvod.spider.merge.N.a.b(i, cArr.length);
    }

    public static D a(D d, C c) {
        if (d == null) {
            return new D(new C[]{c});
        }
        C[] cArr = d.a;
        C[] cArr2 = (C[]) Arrays.copyOf(cArr, cArr.length + 1);
        cArr2[cArr2.length - 1] = c;
        return new D(cArr2);
    }

    public final void b(com.github.catvod.spider.merge.P.s sVar, InterfaceC0003d interfaceC0003d, int i) {
        int i2 = interfaceC0003d.i();
        boolean z = false;
        try {
            boolean z2 = false;
            for (C c : this.a) {
                try {
                    if (c instanceof H) {
                        int d = ((H) c).d() + i;
                        interfaceC0003d.d(d);
                        c = ((H) c).c();
                        if (d != i2) {
                            z2 = true;
                        }
                        z2 = false;
                    } else if (c.b()) {
                        interfaceC0003d.d(i2);
                        z2 = false;
                    }
                    c.a(sVar);
                } catch (Throwable th) {
                    th = th;
                    z = z2;
                    if (z) {
                        interfaceC0003d.d(i2);
                    }
                    throw th;
                }
            }
            if (z2) {
                interfaceC0003d.d(i2);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final D c(int i) {
        C[] cArr = null;
        int i2 = 0;
        while (true) {
            C[] cArr2 = this.a;
            if (i2 >= cArr2.length) {
                break;
            }
            if (cArr2[i2].b()) {
                C[] cArr3 = this.a;
                if (!(cArr3[i2] instanceof H)) {
                    if (cArr == null) {
                        cArr = (C[]) cArr3.clone();
                    }
                    cArr[i2] = new H(i, this.a[i2]);
                }
            }
            i2++;
        }
        return cArr == null ? this : new D(cArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d = (D) obj;
        return this.b == d.b && Arrays.equals(this.a, d.a);
    }

    public final int hashCode() {
        return this.b;
    }
}
