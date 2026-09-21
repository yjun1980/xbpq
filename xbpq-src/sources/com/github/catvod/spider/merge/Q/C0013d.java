package com.github.catvod.spider.merge.Q;

/* renamed from: com.github.catvod.spider.merge.Q.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0013d extends com.github.catvod.spider.merge.O.m {
    public static final C0013d a = new C0013d();

    private C0013d() {
    }

    @Override // com.github.catvod.spider.merge.O.m
    public final boolean E(Object obj, Object obj2) {
        C0011b c0011b = (C0011b) obj;
        C0011b c0011b2 = (C0011b) obj2;
        if (c0011b == c0011b2) {
            return true;
        }
        return c0011b != null && c0011b2 != null && c0011b.a.b == c0011b2.a.b && c0011b.b == c0011b2.b && c0011b.e.equals(c0011b2.e);
    }

    @Override // com.github.catvod.spider.merge.O.m
    public final int F(Object obj) {
        C0011b c0011b = (C0011b) obj;
        return c0011b.e.hashCode() + ((((c0011b.a.b + 217) * 31) + c0011b.b) * 31);
    }
}
