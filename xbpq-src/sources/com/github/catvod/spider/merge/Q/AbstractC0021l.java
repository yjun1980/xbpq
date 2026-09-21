package com.github.catvod.spider.merge.Q;

import java.util.UUID;

/* renamed from: com.github.catvod.spider.merge.Q.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0021l {
    public static final com.github.catvod.spider.merge.R.e c;
    public final C0010a a;
    protected final Y b;

    static {
        UUID uuid = C0020k.f;
        UUID uuid2 = C0020k.f;
        com.github.catvod.spider.merge.R.e eVar = new com.github.catvod.spider.merge.R.e(new C0015f(true));
        c = eVar;
        eVar.a = Integer.MAX_VALUE;
    }

    public AbstractC0021l(C0010a c0010a, Y y) {
        this.a = c0010a;
        this.b = y;
    }

    public abstract void a();
}
