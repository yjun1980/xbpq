package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
public class n0 extends X {
    public final X c;
    public final int d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n0(com.github.catvod.spider.merge.Q.X r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            if (r3 == 0) goto L11
            int r0 = com.github.catvod.spider.merge.N.a.p(r0, r3)
            int r0 = com.github.catvod.spider.merge.N.a.o(r0, r4)
            r1 = 2
            int r0 = com.github.catvod.spider.merge.N.a.b(r0, r1)
            goto L16
        L11:
            r1 = 0
            int r0 = com.github.catvod.spider.merge.N.a.b(r0, r1)
        L16:
            r2.<init>(r0)
            r2.c = r3
            r2.d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Q.n0.<init>(com.github.catvod.spider.merge.Q.X, int):void");
    }

    public static n0 i(X x, int i) {
        return (i == Integer.MAX_VALUE && x == null) ? X.b : new n0(x, i);
    }

    @Override // com.github.catvod.spider.merge.Q.X
    public X c(int i) {
        return this.c;
    }

    @Override // com.github.catvod.spider.merge.Q.X
    public int d(int i) {
        return this.d;
    }

    @Override // com.github.catvod.spider.merge.Q.X
    public boolean equals(Object obj) {
        X x;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0) || this.a != obj.hashCode()) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.d == n0Var.d && (x = this.c) != null && x.equals(n0Var.c);
    }

    @Override // com.github.catvod.spider.merge.Q.X
    public int h() {
        return 1;
    }

    public String toString() {
        X x = this.c;
        String obj = x != null ? x.toString() : "";
        if (obj.length() == 0) {
            int i = this.d;
            return i == Integer.MAX_VALUE ? cYh.d("43") : String.valueOf(i);
        }
        return String.valueOf(this.d) + cYh.d("47") + obj;
    }
}
