package com.github.catvod.spider.merge.Q;

/* loaded from: classes.dex */
final class Z extends com.github.catvod.spider.merge.O.m {
    public static final Z a = new Z();

    private Z() {
    }

    @Override // com.github.catvod.spider.merge.O.m
    public final boolean E(Object obj, Object obj2) {
        C0011b c0011b = (C0011b) obj;
        C0011b c0011b2 = (C0011b) obj2;
        if (c0011b == c0011b2) {
            return true;
        }
        return c0011b != null && c0011b2 != null && c0011b.a.b == c0011b2.a.b && c0011b.c.equals(c0011b2.c);
    }

    @Override // com.github.catvod.spider.merge.O.m
    public final int F(Object obj) {
        C0011b c0011b = (C0011b) obj;
        return com.github.catvod.spider.merge.N.a.b(com.github.catvod.spider.merge.N.a.p(com.github.catvod.spider.merge.N.a.o(7, c0011b.a.b), c0011b.c), 2);
    }
}
