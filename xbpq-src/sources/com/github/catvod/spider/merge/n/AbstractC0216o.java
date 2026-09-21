package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.o.AbstractC0224a;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.github.catvod.spider.merge.n.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0216o<V> extends AbstractC0224a implements M<V> {
    static final boolean f;
    private static final Logger g;
    private static final AbstractC0202a h;
    private static final Object i;
    private volatile Object c;
    private volatile C0206e d;
    private volatile C0215n e;

    static {
        boolean z;
        AbstractC0202a c0209h;
        try {
            z = Boolean.parseBoolean(System.getProperty(cYh.d("002520273674043F2F32222815352F25793D023E2423362E020F22303939023C2D302333083E1E32362F1435"), cYh.d("01312D2232")));
        } catch (SecurityException unused) {
            z = false;
        }
        f = z;
        g = Logger.getLogger(AbstractC0216o.class.getName());
        Throwable th = null;
        try {
            c0209h = new C0214m();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            try {
                c0209h = new C0207f(AtomicReferenceFieldUpdater.newUpdater(C0215n.class, Thread.class, cYh.d("06")), AtomicReferenceFieldUpdater.newUpdater(C0215n.class, C0215n.class, cYh.d("05")), AtomicReferenceFieldUpdater.newUpdater(AbstractC0216o.class, C0215n.class, cYh.d("02")), AtomicReferenceFieldUpdater.newUpdater(AbstractC0216o.class, C0206e.class, cYh.d("03")), AtomicReferenceFieldUpdater.newUpdater(AbstractC0216o.class, Object.class, cYh.d("04")));
            } catch (Throwable th3) {
                th = th3;
                c0209h = new C0209h();
            }
        }
        h = c0209h;
        if (th != null) {
            Logger logger = g;
            Level level = Level.SEVERE;
            logger.log(level, cYh.d("323E3230313F26242E3C3E392F352D213228473932713528083B243F76"), th);
            logger.log(level, cYh.d("34312734162E083D28321F3F0B2024237733147023233831023E60"), th);
        }
        i = new Object();
    }

    private void j(StringBuilder sb) {
        String d = cYh.d("3A");
        try {
            Object p = p(this);
            sb.append(cYh.d("340502121209347C61233229123C356C0C"));
            l(sb, p);
            sb.append(d);
        } catch (CancellationException unused) {
            d = cYh.d("24110F1212162B1505");
            sb.append(d);
        } catch (RuntimeException e) {
            sb.append(cYh.d("321E0A1F180D297C6132362F14357C0A"));
            sb.append(e.getClass());
            d = cYh.d("47242923382D097027233837473724257F733A");
            sb.append(d);
        } catch (ExecutionException e2) {
            sb.append(cYh.d("2111081D0208227C6132362F14357C0A"));
            sb.append(e2.getCause());
            sb.append(d);
        }
    }

    private void l(StringBuilder sb, Object obj) {
        String hexString;
        if (obj == null) {
            hexString = cYh.d("09252D3D");
        } else if (obj == this) {
            hexString = cYh.d("13382822773C1224342332");
        } else {
            sb.append(obj.getClass().getName());
            sb.append(cYh.d("27"));
            hexString = Integer.toHexString(System.identityHashCode(obj));
        }
        sb.append(hexString);
    }

    private static void m(AbstractC0216o<?> abstractC0216o) {
        abstractC0216o.getClass();
        for (C0215n g2 = h.g(abstractC0216o); g2 != null; g2 = g2.b) {
            Thread thread = g2.a;
            if (thread != null) {
                g2.a = null;
                LockSupport.unpark(thread);
            }
        }
        abstractC0216o.k();
        C0206e f2 = h.f(abstractC0216o);
        C0206e c0206e = null;
        while (f2 != null) {
            C0206e c0206e2 = f2.c;
            f2.c = c0206e;
            c0206e = f2;
            f2 = c0206e2;
        }
        while (c0206e != null) {
            C0206e c0206e3 = c0206e.c;
            Runnable runnable = c0206e.a;
            runnable.getClass();
            if (runnable instanceof RunnableC0208g) {
                throw null;
            }
            Executor executor = c0206e.b;
            executor.getClass();
            n(runnable, executor);
            c0206e = c0206e3;
        }
    }

    private static void n(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = g;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 57);
            sb.append(cYh.d("35252F253E3702153932322A13392E3F772D0F392D34773F1F35222423330937612322340931233D327A"));
            sb.append(valueOf);
            sb.append(cYh.d("472728253F7A02282432222E082261"));
            sb.append(valueOf2);
            logger.log(level, sb.toString(), (Throwable) e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V o(Object obj) {
        if (obj instanceof C0203b) {
            Throwable th = ((C0203b) obj).b;
            CancellationException cancellationException = new CancellationException(cYh.d("3331323A772D06236132363404352D3D323E49"));
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C0205d) {
            throw new ExecutionException(((C0205d) obj).a);
        }
        if (obj == i) {
            return null;
        }
        return obj;
    }

    private static <V> V p(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    private void s(C0215n c0215n) {
        c0215n.a = null;
        while (true) {
            C0215n c0215n2 = this.e;
            if (c0215n2 == C0215n.c) {
                return;
            }
            C0215n c0215n3 = null;
            while (c0215n2 != null) {
                C0215n c0215n4 = c0215n2.b;
                if (c0215n2.a != null) {
                    c0215n3 = c0215n2;
                } else if (c0215n3 != null) {
                    c0215n3.b = c0215n4;
                    if (c0215n3.a == null) {
                        break;
                    }
                } else if (!h.c(this, c0215n2, c0215n4)) {
                    break;
                }
                c0215n2 = c0215n4;
            }
            return;
        }
    }

    public void a(Runnable runnable, Executor executor) {
        C0206e c0206e;
        if (executor == null) {
            throw new NullPointerException(cYh.d("22282432222E082261263629473E343D3B74"));
        }
        if (!isDone() && (c0206e = this.d) != C0206e.d) {
            C0206e c0206e2 = new C0206e(runnable, executor);
            do {
                c0206e2.c = c0206e;
                if (h.a(this, c0206e, c0206e2)) {
                    return;
                } else {
                    c0206e = this.d;
                }
            } while (c0206e != C0206e.d);
        }
        n(runnable, executor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.catvod.spider.merge.o.AbstractC0224a
    public final Throwable b() {
        if (!(this instanceof InterfaceC0210i)) {
            return null;
        }
        Object obj = this.c;
        if (obj instanceof C0205d) {
            return ((C0205d) obj).a;
        }
        return null;
    }

    public boolean cancel(boolean z) {
        C0203b c0203b;
        Object obj = this.c;
        if ((obj == null) | (obj instanceof RunnableC0208g)) {
            if (f) {
                c0203b = new C0203b(z, new CancellationException(cYh.d("21253524253F4933203F343F0B786871203B147022303B3602346F")));
            } else {
                c0203b = z ? C0203b.c : C0203b.d;
                c0203b.getClass();
            }
            while (!h.b(this, obj, c0203b)) {
                obj = this.c;
                if (!(obj instanceof RunnableC0208g)) {
                }
            }
            if (z) {
                q();
            }
            m(this);
            if (!(obj instanceof RunnableC0208g)) {
                return true;
            }
            ((RunnableC0208g) obj).getClass();
            throw null;
        }
        return false;
    }

    public V get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.c;
        if ((obj2 != null) && (!(obj2 instanceof RunnableC0208g))) {
            return o(obj2);
        }
        C0215n c0215n = this.e;
        if (c0215n != C0215n.c) {
            C0215n c0215n2 = new C0215n();
            do {
                h.h(c0215n2, c0215n);
                if (h.c(this, c0215n, c0215n2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            s(c0215n2);
                            throw new InterruptedException();
                        }
                        obj = this.c;
                    } while (!((obj != null) & (!(obj instanceof RunnableC0208g))));
                    return o(obj);
                }
                c0215n = this.e;
            } while (c0215n != C0215n.c);
        }
        Object obj3 = this.c;
        obj3.getClass();
        return o(obj3);
    }

    public boolean isCancelled() {
        return this.c instanceof C0203b;
    }

    public boolean isDone() {
        return (!(r0 instanceof RunnableC0208g)) & (this.c != null);
    }

    protected void k() {
    }

    protected void q() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public String r() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append(cYh.d("15352C303E340E3E2671333F0B31386C0C"));
        sb.append(delay);
        sb.append(cYh.d("473D320C"));
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean t(V v) {
        if (v == null) {
            v = (V) i;
        }
        if (!h.b(this, null, v)) {
            return false;
        }
        m(this);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r7.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "043F2C7F303508372D347939083D2C3E39741224283D7939083E22242528023E357F"
            java.lang.String r2 = com.github.catvod.spider.merge.cYh.d(r2)
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L22
            java.lang.Class r1 = r7.getClass()
            java.lang.String r1 = r1.getSimpleName()
            goto L2a
        L22:
            java.lang.Class r1 = r7.getClass()
            java.lang.String r1 = r1.getName()
        L2a:
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r7)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "3C233530232F146D"
            java.lang.String r1 = com.github.catvod.spider.merge.cYh.d(r1)
            r0.append(r1)
            boolean r1 = r7.isCancelled()
            java.lang.String r2 = "3A"
            java.lang.String r2 = com.github.catvod.spider.merge.cYh.d(r2)
            if (r1 == 0) goto L5d
            java.lang.String r1 = "24110F1212162B1505"
            java.lang.String r1 = com.github.catvod.spider.merge.cYh.d(r1)
            r0.append(r1)
            goto Lec
        L5d:
            boolean r1 = r7.isDone()
            if (r1 == 0) goto L68
            r7.j(r0)
            goto Lec
        L68:
            int r1 = r0.length()
            java.lang.String r3 = "37150F151E1420"
            java.lang.String r3 = com.github.catvod.spider.merge.cYh.d(r3)
            r0.append(r3)
            java.lang.Object r3 = r7.c
            boolean r4 = r3 instanceof com.github.catvod.spider.merge.n.RunnableC0208g
            java.lang.String r5 = "22282234272E0E3F2F712332153F363F773C153F2C713E37173C243C32341331353838345D70"
            java.lang.String r5 = com.github.catvod.spider.merge.cYh.d(r5)
            if (r4 == 0) goto La2
            java.lang.String r4 = "4B703234231C1224342332673C"
            java.lang.String r4 = com.github.catvod.spider.merge.cYh.d(r4)
            r0.append(r4)
            com.github.catvod.spider.merge.n.g r3 = (com.github.catvod.spider.merge.n.RunnableC0208g) r3
            r3.getClass()
            r3 = 0
            r0.append(r3)     // Catch: java.lang.StackOverflowError -> L94 java.lang.RuntimeException -> L96
            goto Ld9
        L94:
            r3 = move-exception
            goto L97
        L96:
            r3 = move-exception
        L97:
            r0.append(r5)
            java.lang.Class r3 = r3.getClass()
            r0.append(r3)
            goto Ld9
        La2:
            java.lang.String r3 = r7.r()     // Catch: java.lang.StackOverflowError -> Lab java.lang.RuntimeException -> Lad
            java.lang.String r3 = com.github.catvod.spider.merge.l.C0185s.a(r3)     // Catch: java.lang.StackOverflowError -> Lab java.lang.RuntimeException -> Lad
            goto Lcb
        Lab:
            r3 = move-exception
            goto Lae
        Lad:
            r3 = move-exception
        Lae:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r4 = r3.length()
            int r4 = r4 + 38
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            r6.append(r5)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
        Lcb:
            if (r3 == 0) goto Ldc
            java.lang.String r4 = "4B70283F31355A0B"
            java.lang.String r4 = com.github.catvod.spider.merge.cYh.d(r4)
            r0.append(r4)
            r0.append(r3)
        Ld9:
            r0.append(r2)
        Ldc:
            boolean r3 = r7.isDone()
            if (r3 == 0) goto Lec
            int r3 = r0.length()
            r0.delete(r1, r3)
            r7.j(r0)
        Lec:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.n.AbstractC0216o.toString():java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean u(Throwable th) {
        th.getClass();
        if (!h.b(this, null, new C0205d(th))) {
            return false;
        }
        m(this);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean v() {
        Object obj = this.c;
        return (obj instanceof C0203b) && ((C0203b) obj).a;
    }

    public V get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.c;
        if ((obj != null) && (!(obj instanceof RunnableC0208g))) {
            return o(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C0215n c0215n = this.e;
            if (c0215n != C0215n.c) {
                C0215n c0215n2 = new C0215n();
                do {
                    h.h(c0215n2, c0215n);
                    if (h.c(this, c0215n, c0215n2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                s(c0215n2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.c;
                            if ((obj2 != null) && (!(obj2 instanceof RunnableC0208g))) {
                                return o(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        s(c0215n2);
                    } else {
                        c0215n = this.e;
                    }
                } while (c0215n != C0215n.c);
            }
            Object obj3 = this.c;
            obj3.getClass();
            return o(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.c;
            if ((obj4 != null) && (!(obj4 instanceof RunnableC0208g))) {
                return o(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String abstractC0216o = toString();
        String obj5 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj5.toLowerCase(locale);
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
        sb.append(cYh.d("30312825323E47"));
        sb.append(j);
        String d = cYh.d("47");
        sb.append(d);
        sb.append(lowerCase2);
        String sb2 = sb.toString();
        if (nanos + 1000 < 0) {
            String concat = String.valueOf(sb2).concat(cYh.d("4778313D222947"));
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            boolean z = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String valueOf = String.valueOf(concat);
                StringBuilder sb3 = new StringBuilder(String.valueOf(lowerCase).length() + valueOf.length() + 21);
                sb3.append(valueOf);
                sb3.append(convert);
                sb3.append(d);
                sb3.append(lowerCase);
                String sb4 = sb3.toString();
                if (z) {
                    sb4 = String.valueOf(sb4).concat(cYh.d("4B"));
                }
                concat = String.valueOf(sb4).concat(d);
            }
            if (z) {
                String valueOf2 = String.valueOf(concat);
                StringBuilder sb5 = new StringBuilder(valueOf2.length() + 33);
                sb5.append(valueOf2);
                sb5.append(nanos2);
                sb5.append(cYh.d("473E203F382902332E3F332947"));
                concat = sb5.toString();
            }
            sb2 = String.valueOf(concat).concat(cYh.d("03352D302E73"));
        }
        if (isDone()) {
            throw new TimeoutException(String.valueOf(sb2).concat(cYh.d("47323425773C12243423327A043F2C213B3F1335257136294724283C3235122461342F2A0E222435")));
        }
        StringBuilder sb6 = new StringBuilder(String.valueOf(abstractC0216o).length() + String.valueOf(sb2).length() + 5);
        sb6.append(sb2);
        sb6.append(cYh.d("47362E2377"));
        sb6.append(abstractC0216o);
        throw new TimeoutException(sb6.toString());
    }
}
