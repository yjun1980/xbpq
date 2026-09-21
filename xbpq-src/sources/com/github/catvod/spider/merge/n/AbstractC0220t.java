package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.l.C0179m;
import com.github.catvod.spider.merge.m.AbstractC0190c;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.n.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0220t<InputT, OutputT> extends x<OutputT> {
    private static final Logger q = Logger.getLogger(AbstractC0220t.class.getName());
    private AbstractC0190c<? extends M<? extends InputT>> n;
    private final boolean o;
    private final boolean p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0220t(AbstractC0190c abstractC0190c) {
        super(abstractC0190c.size());
        this.n = abstractC0190c;
        this.o = false;
        this.p = false;
    }

    public static void D(AbstractC0220t abstractC0220t, M m, int i) {
        abstractC0220t.getClass();
        try {
            if (m.isCancelled()) {
                abstractC0220t.n = null;
                abstractC0220t.cancel(false);
            } else {
                try {
                    C0198H.c(m);
                    abstractC0220t.F();
                } catch (ExecutionException e) {
                    th = e.getCause();
                    abstractC0220t.I(th);
                } catch (Throwable th) {
                    th = th;
                    abstractC0220t.I(th);
                }
            }
        } finally {
            abstractC0220t.G(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(AbstractC0190c<? extends Future<? extends InputT>> abstractC0190c) {
        int B = B();
        C0179m.g(B >= 0, cYh.d("2B353222772E0F312F71677A15352C303E340E3E2671312F1325333424"));
        if (B == 0) {
            if (abstractC0190c != null) {
                com.github.catvod.spider.merge.m.m<? extends Future<? extends InputT>> it = abstractC0190c.iterator();
                while (it.hasNext()) {
                    Future<? extends InputT> next = it.next();
                    if (!next.isCancelled()) {
                        try {
                            C0198H.c(next);
                            F();
                        } catch (ExecutionException e) {
                            th = e.getCause();
                            I(th);
                        } catch (Throwable th) {
                            th = th;
                            I(th);
                        }
                    }
                }
            }
            A();
            H();
            K(EnumC0219s.d);
        }
    }

    private void I(Throwable th) {
        boolean z;
        th.getClass();
        boolean z2 = this.o;
        String d = cYh.d("2E3E3124237A21253524253F473620383B3F037036382332471533233828");
        String d2 = cYh.d("203F35713A35153561253F3B09702E3F327A0E3E3124237A21253524253F473620383B2F15356F711B350037283F307A0131283D222802236130312E022261253F3F47362823242E");
        if (z2 && !u(th)) {
            Set<Throwable> C = C();
            Throwable th2 = th;
            while (true) {
                if (th2 == null) {
                    z = true;
                    break;
                } else {
                    if (!C.add(th2)) {
                        z = false;
                        break;
                    }
                    th2 = th2.getCause();
                }
            }
            if (z) {
                if (!(th instanceof Error)) {
                    d = d2;
                }
                q.log(Level.SEVERE, d, th);
                return;
            }
        }
        boolean z3 = th instanceof Error;
        if (z3) {
            if (!z3) {
                d = d2;
            }
            q.log(Level.SEVERE, d, th);
        }
    }

    abstract void F();

    abstract void H();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void J() {
        EnumC0191A enumC0191A = EnumC0191A.c;
        this.n.getClass();
        if (this.n.isEmpty()) {
            H();
            return;
        }
        if (!this.o) {
            final AbstractC0190c<? extends M<? extends InputT>> abstractC0190c = this.p ? this.n : null;
            Runnable runnable = new Runnable() { // from class: com.github.catvod.spider.merge.n.q
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC0220t.this.G(abstractC0190c);
                }
            };
            com.github.catvod.spider.merge.m.m<? extends M<? extends InputT>> it = this.n.iterator();
            while (it.hasNext()) {
                it.next().a(runnable, enumC0191A);
            }
            return;
        }
        final int i = 0;
        com.github.catvod.spider.merge.m.m<? extends M<? extends InputT>> it2 = this.n.iterator();
        while (it2.hasNext()) {
            final M<? extends InputT> next = it2.next();
            next.a(new Runnable() { // from class: com.github.catvod.spider.merge.n.r
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC0220t.D(AbstractC0220t.this, next, i);
                }
            }, enumC0191A);
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K(EnumC0219s enumC0219s) {
        this.n = null;
    }

    @Override // com.github.catvod.spider.merge.n.AbstractC0216o
    protected final void k() {
        AbstractC0190c<? extends M<? extends InputT>> abstractC0190c = this.n;
        K(EnumC0219s.c);
        if (isCancelled() && (abstractC0190c != null)) {
            boolean v = v();
            com.github.catvod.spider.merge.m.m<? extends M<? extends InputT>> it = abstractC0190c.iterator();
            while (it.hasNext()) {
                it.next().cancel(v);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.catvod.spider.merge.n.AbstractC0216o
    public final String r() {
        AbstractC0190c<? extends M<? extends InputT>> abstractC0190c = this.n;
        if (abstractC0190c == null) {
            return super.r();
        }
        String valueOf = String.valueOf(abstractC0190c);
        StringBuilder sb = new StringBuilder(valueOf.length() + 8);
        sb.append(cYh.d("01253524253F146D"));
        sb.append(valueOf);
        return sb.toString();
    }

    @Override // com.github.catvod.spider.merge.n.x
    final void z(Set<Throwable> set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable b = b();
        b.getClass();
        while (b != null && set.add(b)) {
            b = b.getCause();
        }
    }
}
