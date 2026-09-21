package com.github.catvod.spider.merge.P;

import com.github.catvod.spider.merge.cYh;

/* renamed from: com.github.catvod.spider.merge.P.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0007h extends AbstractC0009j {
    private final int[] c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0007h(int i, int i2, int[] iArr) {
        super(i2);
        this.c = iArr;
    }

    @Override // com.github.catvod.spider.merge.P.r
    public final int f(int i) {
        int signum = Integer.signum(1);
        if (signum == -1) {
            int i2 = this.b + 1;
            if (i2 < 0) {
                return -1;
            }
            return this.c[i2];
        }
        if (signum == 0) {
            return 0;
        }
        if (signum != 1) {
            throw new UnsupportedOperationException(cYh.d("293F3571253F0633293433"));
        }
        int i3 = (this.b + 1) - 1;
        if (i3 >= this.a) {
            return -1;
        }
        return this.c[i3];
    }

    @Override // com.github.catvod.spider.merge.P.InterfaceC0003d
    public final String h(com.github.catvod.spider.merge.S.i iVar) {
        int min = Math.min(iVar.a, this.a);
        return new String(this.c, min, Math.min((iVar.b - iVar.a) + 1, this.a - min));
    }
}
