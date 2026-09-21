package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.cYh;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class e<E> {
    private volatile Object _next = null;
    private volatile long _state = 0;
    private final int a;
    private AtomicReferenceArray b;
    private final int c;
    private final boolean d;
    public static final g g = new g(cYh.d("35150C1E011F3816131E0D1F29"));
    private static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, cYh.d("383E242923"));
    private static final AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(e.class, cYh.d("38233530233F"));

    public e(int i, boolean z) {
        this.c = i;
        this.d = z;
        int i2 = i - 1;
        this.a = i2;
        this.b = new AtomicReferenceArray(i);
        boolean z2 = i2 <= 1073741823;
        String d = cYh.d("243824323C7A0131283D323E49");
        if (!z2) {
            throw new IllegalStateException(d.toString());
        }
        if (!((i & i2) == 0)) {
            throw new IllegalStateException(d.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0051, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(E r16) {
        /*
            r15 = this;
            r6 = r15
            r7 = r16
        L3:
            long r2 = r6._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r8 = 0
            r4 = 1
            int r5 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r5 == 0) goto L18
            r0 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r0 = r0 & r2
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 == 0) goto L17
            r4 = 2
        L17:
            return r4
        L18:
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r2
            r10 = 0
            long r0 = r0 >> r10
            int r1 = (int) r0
            r11 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r11 = r11 & r2
            r0 = 30
            long r11 = r11 >> r0
            int r12 = (int) r11
            int r11 = r6.a
            int r5 = r12 + 2
            r5 = r5 & r11
            r13 = r1 & r11
            if (r5 != r13) goto L33
            return r4
        L33:
            boolean r5 = r6.d
            r13 = 1073741823(0x3fffffff, float:1.9999999)
            if (r5 != 0) goto L52
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r6.b
            r14 = r12 & r11
            java.lang.Object r5 = r5.get(r14)
            if (r5 == 0) goto L52
            int r0 = r6.c
            r2 = 1024(0x400, float:1.435E-42)
            if (r0 < r2) goto L51
            int r12 = r12 - r1
            r1 = r12 & r13
            int r0 = r0 >> 1
            if (r1 <= r0) goto L3
        L51:
            return r4
        L52:
            int r1 = r12 + 1
            r1 = r1 & r13
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = com.github.catvod.spider.merge.N.e.f
            r13 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r13 = r13 & r2
            long r8 = (long) r1
            long r0 = r8 << r0
            long r8 = r13 | r0
            r0 = r4
            r1 = r15
            r4 = r8
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L3
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.b
            r1 = r12 & r11
            r0.set(r1, r7)
            r0 = r6
        L73:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L7f
            goto La3
        L7f:
            com.github.catvod.spider.merge.N.e r0 = r0.e()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.b
            int r2 = r0.a
            r2 = r2 & r12
            java.lang.Object r1 = r1.get(r2)
            boolean r2 = r1 instanceof com.github.catvod.spider.merge.N.d
            if (r2 == 0) goto L9f
            com.github.catvod.spider.merge.N.d r1 = (com.github.catvod.spider.merge.N.d) r1
            int r1 = r1.a
            if (r1 != r12) goto L9f
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.b
            int r2 = r0.a
            r2 = r2 & r12
            r1.set(r2, r7)
            goto La0
        L9f:
            r0 = 0
        La0:
            if (r0 == 0) goto La3
            goto L73
        La3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.N.e.a(java.lang.Object):int");
    }

    public final boolean b() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    public final int c() {
        long j = this._state;
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0)));
    }

    public final boolean d() {
        long j = this._state;
        return ((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e<E> e() {
        long j;
        while (true) {
            j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                break;
            }
            long j2 = j | 1152921504606846976L;
            if (f.compareAndSet(this, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            e<E> eVar = (e) this._next;
            if (eVar != null) {
                return eVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            e eVar2 = new e(this.c * 2, this.d);
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.a;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = this.b.get(i4);
                if (obj == null) {
                    obj = new d(i);
                }
                eVar2.b.set(eVar2.a & i, obj);
                i++;
            }
            eVar2._state = (-1152921504606846977L) & j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, eVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object f() {
        while (true) {
            long j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i = (int) ((j & 1073741823) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.a;
            if ((i2 & i3) == (i & i3)) {
                return null;
            }
            Object obj = this.b.get(i3 & i);
            if (obj == null) {
                if (this.d) {
                    return null;
                }
            } else {
                if (obj instanceof d) {
                    return null;
                }
                long j2 = ((i + 1) & 1073741823) << 0;
                if (f.compareAndSet(this, j, (j & (-1073741824)) | j2)) {
                    this.b.set(this.a & i, null);
                    return obj;
                }
                if (this.d) {
                    e<E> eVar = this;
                    while (true) {
                        long j3 = eVar._state;
                        int i4 = (int) ((j3 & 1073741823) >> 0);
                        if ((j3 & 1152921504606846976L) != 0) {
                            eVar = eVar.e();
                        } else {
                            if (f.compareAndSet(eVar, j3, (j3 & (-1073741824)) | j2)) {
                                eVar.b.set(eVar.a & i4, null);
                                eVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (eVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
