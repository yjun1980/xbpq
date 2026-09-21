package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.x.C0243a;

/* loaded from: classes.dex */
public final class D {
    public static final D c = new D(false, false);
    public static final D d = new D(true, true);
    private final boolean a;
    private final boolean b;

    public D(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final String a(String str) {
        String trim = str.trim();
        return !this.b ? C0243a.c(trim) : trim;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.github.catvod.spider.merge.c0.c b(com.github.catvod.spider.merge.c0.c cVar) {
        if (cVar != null && !this.b) {
            cVar.r();
        }
        return cVar;
    }

    public final String c(String str) {
        String trim = str.trim();
        return !this.a ? C0243a.c(trim) : trim;
    }

    public final boolean d() {
        return this.b;
    }

    public final boolean e() {
        return this.a;
    }
}
