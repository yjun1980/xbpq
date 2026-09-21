package com.github.catvod.spider.merge.L;

/* loaded from: classes.dex */
public abstract class k extends e {
    private long d;
    private boolean e;
    private com.github.catvod.spider.merge.N.a f;

    private final long c(boolean z) {
        return z ? 4294967296L : 1L;
    }

    public static void e(k kVar, boolean z, int i, Object obj) {
        kVar.d += kVar.c(false);
        kVar.e = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long d() {
        com.github.catvod.spider.merge.N.a aVar = this.f;
        return (aVar == null || aVar.d()) ? Long.MAX_VALUE : 0L;
    }

    public final boolean f() {
        com.github.catvod.spider.merge.N.a aVar = this.f;
        if (aVar != null) {
            return aVar.d();
        }
        return true;
    }

    public final boolean g() {
        kotlinx.coroutines.b bVar;
        com.github.catvod.spider.merge.N.a aVar = this.f;
        if (aVar == null || (bVar = (kotlinx.coroutines.b) aVar.n()) == null) {
            return false;
        }
        bVar.run();
        return true;
    }
}
