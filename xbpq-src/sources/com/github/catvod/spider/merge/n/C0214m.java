package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.l.C0186t;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* renamed from: com.github.catvod.spider.merge.n.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0214m extends AbstractC0202a {
    static final Unsafe a;
    static final long b;
    static final long c;
    static final long d;
    static final long e;
    static final long f;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException(cYh.d("243F343D337A093F35713E340E2428303B331D356138392E15392F223E3914"), e2.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new C0213l());
        }
        try {
            c = unsafe.objectFieldOffset(AbstractC0216o.class.getDeclaredField(cYh.d("02")));
            b = unsafe.objectFieldOffset(AbstractC0216o.class.getDeclaredField(cYh.d("03")));
            d = unsafe.objectFieldOffset(AbstractC0216o.class.getDeclaredField(cYh.d("04")));
            e = unsafe.objectFieldOffset(C0215n.class.getDeclaredField(cYh.d("06")));
            f = unsafe.objectFieldOffset(C0215n.class.getDeclaredField(cYh.d("05")));
            a = unsafe;
        } catch (Exception e3) {
            int i = C0186t.b;
            if (e3 instanceof RuntimeException) {
                throw ((RuntimeException) e3);
            }
            if (!(e3 instanceof Error)) {
                throw new RuntimeException(e3);
            }
            throw ((Error) e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0214m() {
        super((W) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.n.AbstractC0202a
    public final boolean a(AbstractC0216o<?> abstractC0216o, C0206e c0206e, C0206e c0206e2) {
        return C0212k.a(a, abstractC0216o, b, c0206e, c0206e2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.n.AbstractC0202a
    public final boolean b(AbstractC0216o<?> abstractC0216o, Object obj, Object obj2) {
        return C0212k.a(a, abstractC0216o, d, obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.n.AbstractC0202a
    public final boolean c(AbstractC0216o<?> abstractC0216o, C0215n c0215n, C0215n c0215n2) {
        return C0212k.a(a, abstractC0216o, c, c0215n, c0215n2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.n.AbstractC0202a
    public final C0206e f(AbstractC0216o abstractC0216o) {
        C0206e c0206e;
        C0206e c0206e2 = C0206e.d;
        do {
            c0206e = abstractC0216o.d;
            if (c0206e2 == c0206e) {
                return c0206e;
            }
        } while (!C0212k.a(a, abstractC0216o, b, c0206e, c0206e2));
        return c0206e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.n.AbstractC0202a
    public final C0215n g(AbstractC0216o abstractC0216o) {
        C0215n c0215n;
        C0215n c0215n2 = C0215n.c;
        do {
            c0215n = abstractC0216o.e;
            if (c0215n2 == c0215n) {
                return c0215n;
            }
        } while (!c(abstractC0216o, c0215n, c0215n2));
        return c0215n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.n.AbstractC0202a
    public final void h(C0215n c0215n, C0215n c0215n2) {
        a.putObject(c0215n, f, c0215n2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.n.AbstractC0202a
    public final void i(C0215n c0215n, Thread thread) {
        a.putObject(c0215n, e, thread);
    }
}
