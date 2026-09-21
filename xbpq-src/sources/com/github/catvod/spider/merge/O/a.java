package com.github.catvod.spider.merge.O;

import com.github.catvod.spider.merge.cYh;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class a extends Thread {
    static final AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(a.class, cYh.d("103F333A322824242D"));
    public final n c;
    public int d;
    private long e;
    private long f;
    private int g;
    public boolean h;
    final /* synthetic */ b i;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    volatile int workerCtl;

    public a(b bVar, int i) {
        com.github.catvod.spider.merge.F.e eVar;
        this.i = bVar;
        setDaemon(true);
        this.c = new n();
        this.d = 4;
        this.workerCtl = 0;
        this.nextParkedWorker = b.m;
        com.github.catvod.spider.merge.F.d dVar = com.github.catvod.spider.merge.F.e.c;
        eVar = com.github.catvod.spider.merge.F.e.d;
        this.g = eVar.b();
        f(i);
    }

    private final i e() {
        e eVar;
        if (d(2) == 0) {
            i d = this.i.c.d();
            if (d != null) {
                return d;
            }
            eVar = this.i.d;
        } else {
            i d2 = this.i.d.d();
            if (d2 != null) {
                return d2;
            }
            eVar = this.i.c;
        }
        return eVar.d();
    }

    private final i i(boolean z) {
        int i = (int) (this.i.controlState & 2097151);
        if (i < 2) {
            return null;
        }
        int d = d(i);
        long j2 = Long.MAX_VALUE;
        for (int i2 = 0; i2 < i; i2++) {
            d++;
            if (d > i) {
                d = 1;
            }
            a aVar = this.i.e.get(d);
            if (aVar != null && aVar != this) {
                n nVar = this.c;
                n nVar2 = aVar.c;
                long g = z ? nVar.g(nVar2) : nVar.h(nVar2);
                if (g == -1) {
                    return this.c.e();
                }
                if (g > 0) {
                    j2 = Math.min(j2, g);
                }
            }
        }
        if (j2 == Long.MAX_VALUE) {
            j2 = 0;
        }
        this.f = j2;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.github.catvod.spider.merge.O.i a(boolean r10) {
        /*
            r9 = this;
            int r0 = r9.d
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L7
            goto L2e
        L7:
            com.github.catvod.spider.merge.O.b r0 = r9.i
        L9:
            long r5 = r0.controlState
            r3 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r3 = r3 & r5
            r7 = 42
            long r3 = r3 >> r7
            int r4 = (int) r3
            if (r4 != 0) goto L19
            r0 = 0
            goto L2a
        L19:
            r3 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r7 = r5 - r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = com.github.catvod.spider.merge.O.b.k
            r4 = r0
            boolean r3 = r3.compareAndSet(r4, r5, r7)
            if (r3 == 0) goto L9
            r0 = 1
        L2a:
            if (r0 == 0) goto L30
            r9.d = r2
        L2e:
            r0 = 1
            goto L31
        L30:
            r0 = 0
        L31:
            if (r0 == 0) goto L6a
            if (r10 == 0) goto L5e
            com.github.catvod.spider.merge.O.b r10 = r9.i
            int r10 = r10.f
            int r10 = r10 * 2
            int r10 = r9.d(r10)
            if (r10 != 0) goto L42
            goto L43
        L42:
            r2 = 0
        L43:
            if (r2 == 0) goto L4c
            com.github.catvod.spider.merge.O.i r10 = r9.e()
            if (r10 == 0) goto L4c
            goto L69
        L4c:
            com.github.catvod.spider.merge.O.n r10 = r9.c
            com.github.catvod.spider.merge.O.i r10 = r10.e()
            if (r10 == 0) goto L55
            goto L69
        L55:
            if (r2 != 0) goto L65
            com.github.catvod.spider.merge.O.i r10 = r9.e()
            if (r10 == 0) goto L65
            goto L69
        L5e:
            com.github.catvod.spider.merge.O.i r10 = r9.e()
            if (r10 == 0) goto L65
            goto L69
        L65:
            com.github.catvod.spider.merge.O.i r10 = r9.i(r1)
        L69:
            return r10
        L6a:
            if (r10 == 0) goto L75
            com.github.catvod.spider.merge.O.n r10 = r9.c
            com.github.catvod.spider.merge.O.i r10 = r10.e()
            if (r10 == 0) goto L75
            goto L7f
        L75:
            com.github.catvod.spider.merge.O.b r10 = r9.i
            com.github.catvod.spider.merge.O.e r10 = r10.d
            java.lang.Object r10 = r10.d()
            com.github.catvod.spider.merge.O.i r10 = (com.github.catvod.spider.merge.O.i) r10
        L7f:
            if (r10 == 0) goto L82
            goto L86
        L82:
            com.github.catvod.spider.merge.O.i r10 = r9.i(r2)
        L86:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.O.a.a(boolean):com.github.catvod.spider.merge.O.i");
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.g;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.g = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.i.i);
        sb.append(cYh.d("4A272E233C3F157D"));
        sb.append(i == 0 ? cYh.d("3315131C1E1426040415") : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i) {
        int i2 = this.d;
        boolean z = i2 == 1;
        if (z) {
            b.k.addAndGet(this.i, 4398046511104L);
        }
        if (i2 != i) {
            this.d = i;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0000 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0052 A[SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.O.a.run():void");
    }
}
