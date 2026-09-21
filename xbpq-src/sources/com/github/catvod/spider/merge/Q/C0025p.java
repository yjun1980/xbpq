package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0059d;
import java.util.Arrays;

/* renamed from: com.github.catvod.spider.merge.Q.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0025p extends X {
    public final X[] c;
    public final int[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0025p(com.github.catvod.spider.merge.Q.X[] r6, int[] r7) {
        /*
            r5 = this;
            int r0 = r6.length
            r1 = 0
            r2 = 1
            r3 = 0
        L4:
            if (r3 >= r0) goto Lf
            r4 = r6[r3]
            int r2 = com.github.catvod.spider.merge.N.a.p(r2, r4)
            int r3 = r3 + 1
            goto L4
        Lf:
            int r0 = r7.length
        L10:
            if (r1 >= r0) goto L1b
            r3 = r7[r1]
            int r2 = com.github.catvod.spider.merge.N.a.o(r2, r3)
            int r1 = r1 + 1
            goto L10
        L1b:
            int r0 = r6.length
            int r0 = r0 * 2
            int r0 = com.github.catvod.spider.merge.N.a.b(r2, r0)
            r5.<init>(r0)
            r5.c = r6
            r5.d = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Q.C0025p.<init>(com.github.catvod.spider.merge.Q.X[], int[]):void");
    }

    @Override // com.github.catvod.spider.merge.Q.X
    public final X c(int i) {
        return this.c[i];
    }

    @Override // com.github.catvod.spider.merge.Q.X
    public final int d(int i) {
        return this.d[i];
    }

    @Override // com.github.catvod.spider.merge.Q.X
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0025p) || this.a != obj.hashCode()) {
            return false;
        }
        C0025p c0025p = (C0025p) obj;
        return Arrays.equals(this.d, c0025p.d) && Arrays.equals(this.c, c0025p.c);
    }

    @Override // com.github.catvod.spider.merge.Q.X
    public final boolean f() {
        return this.d[0] == Integer.MAX_VALUE;
    }

    @Override // com.github.catvod.spider.merge.Q.X
    public final int h() {
        return this.d.length;
    }

    public final String toString() {
        String d;
        if (f()) {
            return cYh.d("3C0D");
        }
        StringBuilder b = C0059d.b(cYh.d("3C"));
        for (int i = 0; i < this.d.length; i++) {
            if (i > 0) {
                b.append(cYh.d("4B70"));
            }
            int[] iArr = this.d;
            if (iArr[i] == Integer.MAX_VALUE) {
                d = cYh.d("43");
            } else {
                b.append(iArr[i]);
                if (this.c[i] != null) {
                    b.append(' ');
                    d = this.c[i].toString();
                } else {
                    d = cYh.d("09252D3D");
                }
            }
            b.append(d);
        }
        b.append(cYh.d("3A"));
        return b.toString();
    }
}
