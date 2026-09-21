package com.github.catvod.spider.merge.O;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.l.C0167a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class b implements Executor, Closeable {
    private volatile int _isTerminated;
    public final e c;
    volatile long controlState;
    public final e d;
    public final AtomicReferenceArray<a> e;
    public final int f;
    public final int g;
    public final long h;
    public final String i;
    private volatile long parkedWorkersStack;
    public static final com.github.catvod.spider.merge.N.g m = new com.github.catvod.spider.merge.N.g(cYh.d("291F150E1E14380315101411"));
    private static final AtomicLongFieldUpdater j = AtomicLongFieldUpdater.newUpdater(b.class, cYh.d("1731333A323E303F333A3228140335303431"));
    static final AtomicLongFieldUpdater k = AtomicLongFieldUpdater.newUpdater(b.class, cYh.d("043F2F2525350B033530233F"));
    private static final AtomicIntegerFieldUpdater l = AtomicIntegerFieldUpdater.newUpdater(b.class, cYh.d("3839320532280A392F30233F03"));

    public b(int i, int i2, long j2, String str) {
        this.f = i;
        this.g = i2;
        this.h = j2;
        this.i = str;
        if (!(i >= 1)) {
            throw new IllegalArgumentException((cYh.d("243F3334772A083F2D7124331D3561") + i + cYh.d("4723293E223603702334773B13702D343629137070")).toString());
        }
        boolean z = i2 >= i;
        String d = cYh.d("2A3139712735083C61223E200270");
        if (!z) {
            throw new IllegalArgumentException((d + i2 + cYh.d("4723293E223603702334773D15352025322847242930397A08226134262F063C3271233547332E23327A173F2E3D77290E2A2471") + i).toString());
        }
        if (!(i2 <= 2097150)) {
            throw new IllegalArgumentException((d + i2 + cYh.d("4723293E223603702F3E237A02282234323E473D20293E37063C6122222A173F3325323E473E343C353F15702E37772E0F222430332947627168606B5260")).toString());
        }
        if (!(j2 > 0)) {
            throw new IllegalArgumentException((cYh.d("2E342D34772D08222A34257A0C352421773B0B393734772E0E3D2471") + j2 + cYh.d("473D3422237A0535612138290E24282732")).toString());
        }
        this.c = new e();
        this.d = new e();
        this.parkedWorkersStack = 0L;
        this.e = new AtomicReferenceArray<>(i2 + 1);
        this.controlState = i << 42;
        this._isTerminated = 0;
    }

    private final int a() {
        int i;
        synchronized (this.e) {
            if (isTerminated()) {
                i = -1;
            } else {
                long j2 = this.controlState;
                int i2 = (int) (j2 & 2097151);
                int i3 = i2 - ((int) ((j2 & 4398044413952L) >> 21));
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i3 >= this.f) {
                    return 0;
                }
                if (i2 >= this.g) {
                    return 0;
                }
                int i4 = ((int) (this.controlState & 2097151)) + 1;
                if (!(i4 > 0 && this.e.get(i4) == null)) {
                    throw new IllegalArgumentException(cYh.d("2131283D323E47222420223315352C34392E49").toString());
                }
                a aVar = new a(this, i4);
                this.e.set(i4, aVar);
                if (!(i4 == ((int) (2097151 & k.incrementAndGet(this))))) {
                    throw new IllegalArgumentException(cYh.d("2131283D323E47222420223315352C34392E49").toString());
                }
                aVar.start();
                i = i3 + 1;
            }
            return i;
        }
    }

    private final a c() {
        Thread currentThread = Thread.currentThread();
        if (!(currentThread instanceof a)) {
            currentThread = null;
        }
        a aVar = (a) currentThread;
        if (aVar == null || !com.github.catvod.spider.merge.E.f.a(aVar.i, this)) {
            return null;
        }
        return aVar;
    }

    private final int e(a aVar) {
        int b;
        do {
            Object c = aVar.c();
            if (c == m) {
                return -1;
            }
            if (c == null) {
                return 0;
            }
            aVar = (a) c;
            b = aVar.b();
        } while (b == 0);
        return b;
    }

    private final boolean i(long j2) {
        int i = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        if (i < this.f) {
            int a = a();
            if (a == 1 && this.f > 1) {
                a();
            }
            if (a > 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean j() {
        while (true) {
            long j2 = this.parkedWorkersStack;
            a aVar = this.e.get((int) (2097151 & j2));
            if (aVar != null) {
                long j3 = (2097152 + j2) & (-2097152);
                int e = e(aVar);
                if (e >= 0 && j.compareAndSet(this, j2, e | j3)) {
                    aVar.g(m);
                }
            } else {
                aVar = null;
            }
            if (aVar == null) {
                return false;
            }
            if (a.j.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final i b(Runnable runnable, j jVar) {
        l.e.getClass();
        long nanoTime = System.nanoTime();
        if (!(runnable instanceof i)) {
            return new k(runnable, nanoTime, jVar);
        }
        i iVar = (i) runnable;
        iVar.c = nanoTime;
        iVar.d = jVar;
        return iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        if (r1 != null) goto L26;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = com.github.catvod.spider.merge.O.b.l
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r7, r1, r2)
            if (r0 != 0) goto Lc
            goto L8d
        Lc:
            com.github.catvod.spider.merge.O.a r0 = r7.c()
            java.util.concurrent.atomic.AtomicReferenceArray<com.github.catvod.spider.merge.O.a> r1 = r7.e
            monitor-enter(r1)
            long r3 = r7.controlState     // Catch: java.lang.Throwable -> L8e
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r3 = r3 & r5
            int r4 = (int) r3
            monitor-exit(r1)
            if (r2 > r4) goto L46
            r1 = 1
        L1e:
            java.util.concurrent.atomic.AtomicReferenceArray<com.github.catvod.spider.merge.O.a> r3 = r7.e
            java.lang.Object r3 = r3.get(r1)
            com.github.catvod.spider.merge.E.f.b(r3)
            com.github.catvod.spider.merge.O.a r3 = (com.github.catvod.spider.merge.O.a) r3
            if (r3 == r0) goto L41
        L2b:
            boolean r5 = r3.isAlive()
            if (r5 == 0) goto L3a
            java.util.concurrent.locks.LockSupport.unpark(r3)
            r5 = 10000(0x2710, double:4.9407E-320)
            r3.join(r5)
            goto L2b
        L3a:
            com.github.catvod.spider.merge.O.n r3 = r3.c
            com.github.catvod.spider.merge.O.e r5 = r7.d
            r3.d(r5)
        L41:
            if (r1 == r4) goto L46
            int r1 = r1 + 1
            goto L1e
        L46:
            com.github.catvod.spider.merge.O.e r1 = r7.d
            r1.b()
            com.github.catvod.spider.merge.O.e r1 = r7.c
            r1.b()
        L50:
            if (r0 == 0) goto L59
            com.github.catvod.spider.merge.O.i r1 = r0.a(r2)
            if (r1 == 0) goto L59
            goto L61
        L59:
            com.github.catvod.spider.merge.O.e r1 = r7.c
            java.lang.Object r1 = r1.d()
            com.github.catvod.spider.merge.O.i r1 = (com.github.catvod.spider.merge.O.i) r1
        L61:
            if (r1 == 0) goto L64
            goto L6c
        L64:
            com.github.catvod.spider.merge.O.e r1 = r7.d
            java.lang.Object r1 = r1.d()
            com.github.catvod.spider.merge.O.i r1 = (com.github.catvod.spider.merge.O.i) r1
        L6c:
            if (r1 == 0) goto L81
            r1.run()     // Catch: java.lang.Throwable -> L72
            goto L50
        L72:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L7f
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> L7f
            r4.uncaughtException(r3, r1)     // Catch: java.lang.Throwable -> L7f
            goto L50
        L7f:
            r0 = move-exception
            throw r0
        L81:
            if (r0 == 0) goto L87
            r1 = 5
            r0.h(r1)
        L87:
            r0 = 0
            r7.parkedWorkersStack = r0
            r7.controlState = r0
        L8d:
            return
        L8e:
            r0 = move-exception
            monitor-exit(r1)
            goto L92
        L91:
            throw r0
        L92:
            goto L91
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.O.b.close():void");
    }

    public final void d(Runnable runnable, j jVar, boolean z) {
        i iVar;
        i b = b(runnable, jVar);
        a c = c();
        if (c == null || c.d == 5 || (b.d.a() == 0 && c.d == 2)) {
            iVar = b;
        } else {
            c.h = true;
            iVar = c.c.a(b, z);
        }
        if (iVar != null) {
            if (!(iVar.d.a() == 1 ? this.d : this.c).a(iVar)) {
                throw new RejectedExecutionException(com.github.catvod.spider.merge.b.n.b(new StringBuilder(), this.i, cYh.d("47272022772E02222C38393B133525")));
            }
        }
        boolean z2 = z && c != null;
        if (b.d.a() == 0) {
            if (z2 || j() || i(this.controlState)) {
                return;
            }
            j();
            return;
        }
        long addAndGet = k.addAndGet(this, 2097152L);
        if (z2 || j() || i(addAndGet)) {
            return;
        }
        j();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        d(runnable, h.c, false);
    }

    public final boolean f(a aVar) {
        long j2;
        int b;
        if (aVar.c() != m) {
            return false;
        }
        do {
            j2 = this.parkedWorkersStack;
            b = aVar.b();
            aVar.g(this.e.get((int) (2097151 & j2)));
        } while (!j.compareAndSet(this, j2, ((2097152 + j2) & (-2097152)) | b));
        return true;
    }

    public final void g(a aVar, int i, int i2) {
        while (true) {
            long j2 = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (i3 == i) {
                i3 = i2 == 0 ? e(aVar) : i2;
            }
            if (i3 >= 0 && j.compareAndSet(this, j2, j3 | i3)) {
                return;
            }
        }
    }

    public final void h() {
        if (j() || i(this.controlState)) {
            return;
        }
        j();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final String toString() {
        StringBuilder sb;
        String d;
        ArrayList arrayList = new ArrayList();
        int length = this.e.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < length; i6++) {
            a aVar = this.e.get(i6);
            if (aVar != null) {
                int c = aVar.c.c();
                int a = C0167a.a(aVar.d);
                if (a == 0) {
                    i++;
                    sb = new StringBuilder();
                    sb.append(String.valueOf(c));
                    d = cYh.d("04");
                } else if (a == 1) {
                    i2++;
                    sb = new StringBuilder();
                    sb.append(String.valueOf(c));
                    d = cYh.d("05");
                } else if (a == 2) {
                    i3++;
                } else if (a == 3) {
                    i4++;
                    if (c > 0) {
                        sb = new StringBuilder();
                        sb.append(String.valueOf(c));
                        d = cYh.d("03");
                    }
                } else if (a == 4) {
                    i5++;
                }
                sb.append(d);
                arrayList.add(sb.toString());
            }
        }
        long j2 = this.controlState;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.i);
        sb2.append('@');
        sb2.append(com.github.catvod.spider.merge.L.h.d(this));
        sb2.append('[');
        sb2.append(cYh.d("373F2E3D77090E2A24712C"));
        sb2.append(cYh.d("043F3334776747"));
        sb2.append(this.f);
        String d2 = cYh.d("4B70");
        sb2.append(d2);
        sb2.append(cYh.d("0A3139716A7A"));
        sb2.append(this.g);
        String d3 = cYh.d("1A7C61");
        sb2.append(d3);
        sb2.append(cYh.d("303F333A322847033530233F14703A"));
        sb2.append(cYh.d("240014716A7A"));
        sb2.append(i);
        sb2.append(d2);
        sb2.append(cYh.d("053C2E323C330937616C77"));
        sb2.append(i2);
        sb2.append(d2);
        sb2.append(cYh.d("1731333A323E476D61"));
        sb2.append(i3);
        sb2.append(d2);
        sb2.append(cYh.d("033F333C363413707C71"));
        sb2.append(i4);
        sb2.append(d2);
        sb2.append(cYh.d("1335333C3E3406242435776747"));
        sb2.append(i5);
        sb2.append(d3);
        sb2.append(cYh.d("15252F3F3E340070363E253102223271262F02252422776747"));
        sb2.append(arrayList);
        sb2.append(d2);
        sb2.append(cYh.d("003C2E33363647131104772B1235343477290E2A24716A7A"));
        sb2.append(this.c.c());
        sb2.append(d2);
        sb2.append(cYh.d("003C2E33363647322D3E34310E3E2671262F0225247124331D35616C77"));
        sb2.append(this.d.c());
        sb2.append(d2);
        sb2.append(cYh.d("243F2F2525350B701225362E02703A"));
        sb2.append(cYh.d("04222430233F0370363E25310222326C77"));
        sb2.append((int) (2097151 & j2));
        sb2.append(d2);
        sb2.append(cYh.d("053C2E323C330937612536290C23616C77"));
        sb2.append((int) ((4398044413952L & j2) >> 21));
        sb2.append(d2);
        sb2.append(cYh.d("24001422773B04213438253F03707C71"));
        sb2.append(this.f - ((int) ((9223367638808264704L & j2) >> 42)));
        sb2.append(cYh.d("1A0D"));
        return sb2.toString();
    }
}
