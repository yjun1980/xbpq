package com.github.catvod.spider.merge.l;

import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge.l.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0184r {
    private final AbstractC0173g a;
    private final boolean b;
    private final C0181o c;
    private final int d;

    private C0184r(C0181o c0181o, boolean z, AbstractC0173g abstractC0173g, int i) {
        this.c = c0181o;
        this.b = z;
        this.a = abstractC0173g;
        this.d = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Iterator a(C0184r c0184r, CharSequence charSequence) {
        C0181o c0181o = c0184r.c;
        c0181o.getClass();
        return new C0180n(c0181o, c0184r, charSequence);
    }

    public static C0184r f() {
        return new C0184r(new C0181o(new C0169c()), false, C0171e.b, Integer.MAX_VALUE);
    }

    public final C0184r e() {
        return new C0184r(this.c, true, this.a, this.d);
    }

    public final Iterable<String> g(CharSequence charSequence) {
        charSequence.getClass();
        return new C0182p(this, charSequence);
    }

    public final C0184r h() {
        C0172f c0172f = C0172f.c;
        c0172f.getClass();
        return new C0184r(this.c, this.b, c0172f, this.d);
    }
}
