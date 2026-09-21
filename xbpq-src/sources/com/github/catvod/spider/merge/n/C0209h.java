package com.github.catvod.spider.merge.n;

/* renamed from: com.github.catvod.spider.merge.n.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0209h extends AbstractC0202a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0209h() {
        super((W) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.n.AbstractC0202a
    public final boolean a(AbstractC0216o<?> abstractC0216o, C0206e c0206e, C0206e c0206e2) {
        C0206e c0206e3;
        synchronized (abstractC0216o) {
            c0206e3 = ((AbstractC0216o) abstractC0216o).d;
            if (c0206e3 != c0206e) {
                return false;
            }
            ((AbstractC0216o) abstractC0216o).d = c0206e2;
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.n.AbstractC0202a
    public final boolean b(AbstractC0216o<?> abstractC0216o, Object obj, Object obj2) {
        Object obj3;
        synchronized (abstractC0216o) {
            obj3 = ((AbstractC0216o) abstractC0216o).c;
            if (obj3 != obj) {
                return false;
            }
            ((AbstractC0216o) abstractC0216o).c = obj2;
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.n.AbstractC0202a
    public final boolean c(AbstractC0216o<?> abstractC0216o, C0215n c0215n, C0215n c0215n2) {
        C0215n c0215n3;
        synchronized (abstractC0216o) {
            c0215n3 = ((AbstractC0216o) abstractC0216o).e;
            if (c0215n3 != c0215n) {
                return false;
            }
            ((AbstractC0216o) abstractC0216o).e = c0215n2;
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.n.AbstractC0202a
    public final C0206e f(AbstractC0216o abstractC0216o) {
        C0206e c0206e;
        C0206e c0206e2 = C0206e.d;
        synchronized (abstractC0216o) {
            c0206e = abstractC0216o.d;
            if (c0206e != c0206e2) {
                abstractC0216o.d = c0206e2;
            }
        }
        return c0206e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.n.AbstractC0202a
    public final C0215n g(AbstractC0216o abstractC0216o) {
        C0215n c0215n;
        C0215n c0215n2 = C0215n.c;
        synchronized (abstractC0216o) {
            c0215n = abstractC0216o.e;
            if (c0215n != c0215n2) {
                abstractC0216o.e = c0215n2;
            }
        }
        return c0215n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.n.AbstractC0202a
    public final void h(C0215n c0215n, C0215n c0215n2) {
        c0215n.b = c0215n2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.n.AbstractC0202a
    public final void i(C0215n c0215n, Thread thread) {
        c0215n.a = thread;
    }
}
