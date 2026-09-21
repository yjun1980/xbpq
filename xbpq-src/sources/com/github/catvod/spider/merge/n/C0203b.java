package com.github.catvod.spider.merge.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.n.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0203b {
    static final C0203b c;
    static final C0203b d;
    final boolean a;
    final Throwable b;

    static {
        if (AbstractC0216o.f) {
            d = null;
            c = null;
        } else {
            d = new C0203b(false, null);
            c = new C0203b(true, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0203b(boolean z, Throwable th) {
        this.a = z;
        this.b = th;
    }
}
