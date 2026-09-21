package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.cYh;

/* renamed from: com.github.catvod.spider.merge.e0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0135t extends N {
    protected final int a;
    protected final int b;

    public AbstractC0135t(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.github.catvod.spider.merge.e0.N
    public final boolean a(com.github.catvod.spider.merge.c0.l lVar, com.github.catvod.spider.merge.c0.l lVar2) {
        com.github.catvod.spider.merge.c0.l f0 = lVar2.f0();
        if (f0 != null && !(f0 instanceof com.github.catvod.spider.merge.c0.h)) {
            int b = b(lVar2);
            int i = this.a;
            if (i == 0) {
                return b == this.b;
            }
            int i2 = b - this.b;
            if (i2 * i >= 0 && i2 % i == 0) {
                return true;
            }
        }
        return false;
    }

    protected abstract int b(com.github.catvod.spider.merge.c0.l lVar);

    protected abstract String c();

    public String toString() {
        return this.a == 0 ? String.format(cYh.d("5D753279723E4E"), c(), Integer.valueOf(this.b)) : this.b == 0 ? String.format(cYh.d("5D753279723E0979"), c(), Integer.valueOf(this.a)) : String.format(cYh.d("5D753279723E09756A357E"), c(), Integer.valueOf(this.a), Integer.valueOf(this.b));
    }
}
