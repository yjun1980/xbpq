/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.t0;

import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.xc.s0.D;
import com.github.catvod.spider.merge.xc.t0.s;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class t {
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(t.class, Object.class, "_next$volatile");
    public static final AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(t.class, "_state$volatile");
    public static final A g = new A(5, "REMOVE_FROZEN");
    private volatile Object _next$volatile;
    private volatile long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final AtomicReferenceArray d;

    public t(int n2, boolean bl) {
        int n3;
        this.a = n2;
        this.b = bl;
        this.c = n3 = n2 - 1;
        this.d = new AtomicReferenceArray(n2);
        if (n3 <= 0x3FFFFFFF) {
            if ((n2 & n3) == 0) {
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final int a(Object object) {
        Object object2;
        int n2;
        int n3;
        int n4;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        while (true) {
            atomicLongFieldUpdater = f;
            long l2 = atomicLongFieldUpdater.get(this);
            n4 = 1;
            if ((0x3000000000000000L & l2) != 0L) {
                if ((0x2000000000000000L & l2) != 0L) {
                    n4 = 2;
                }
                return n4;
            }
            n4 = (int)((0xFFFFFFFC0000000L & l2) >> 30);
            n3 = this.c;
            n2 = (int)(0x3FFFFFFFL & l2);
            if ((n4 + 2 & n3) == (n2 & n3)) {
                return 1;
            }
            object2 = this.d;
            if (!this.b && ((AtomicReferenceArray)object2).get(n4 & n3) != null) {
                n3 = this.a;
                if (n3 >= 1024 && (n4 - n2 & 0x3FFFFFFF) <= n3 >> 1) continue;
                return 1;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, l2, 0xF00000003FFFFFFFL & l2 | (long)(n4 + 1 & 0x3FFFFFFF) << 30)) break;
        }
        ((AtomicReferenceArray)object2).set(n4 & n3, object);
        Object object3 = this;
        while ((atomicLongFieldUpdater.get(object3) & 0x1000000000000000L) != 0L) {
            object2 = ((t)object3).c();
            AtomicReferenceArray atomicReferenceArray = ((t)object2).d;
            n2 = ((t)object2).c & n4;
            object3 = atomicReferenceArray.get(n2);
            if (object3 instanceof s && ((s)object3).a == n4) {
                atomicReferenceArray.set(n2, object);
            } else {
                object2 = null;
            }
            object3 = object2;
            if (object2 != null) continue;
        }
        return 0;
    }

    public final boolean b() {
        long l2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        do {
            if (((l2 = (atomicLongFieldUpdater = f).get(this)) & 0x2000000000000000L) != 0L) {
                return true;
            }
            if ((0x1000000000000000L & l2) == 0L) continue;
            return false;
        } while (!atomicLongFieldUpdater.compareAndSet(this, l2, 0x2000000000000000L | l2));
        return true;
    }

    public final t c() {
        long l2;
        long l3;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        do {
            if (((l3 = (atomicLongFieldUpdater = f).get(this)) & 0x1000000000000000L) == 0L) continue;
            l2 = l3;
            break;
        } while (!atomicLongFieldUpdater.compareAndSet(this, l3, l2 = l3 | 0x1000000000000000L));
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object object;
        while ((object = (t)(atomicReferenceFieldUpdater = e).get(this)) == null) {
            int n2;
            int n3;
            t t2 = new t(this.a * 2, this.b);
            int n4 = (int)(0x3FFFFFFFL & l2);
            int n5 = (int)((0xFFFFFFFC0000000L & l2) >> 30);
            while ((n3 = n4 & (n2 = this.c)) != (n2 & n5)) {
                Object e2 = this.d.get(n3);
                object = e2;
                if (e2 == null) {
                    object = new s(n4);
                }
                t2.d.set(t2.c & n4, object);
                ++n4;
            }
            atomicLongFieldUpdater.set(t2, 0xEFFFFFFFFFFFFFFFL & l2);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, t2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
        return object;
    }

    /*
     * Unable to fully structure code
     */
    public final Object d() {
        do lbl-1000:
        // 3 sources

        {
            block7: {
                if (((var8_7 = (var10_8 = t.f).get(this)) & 0x1000000000000000L) != 0L) {
                    return t.g;
                }
                var1_1 = (int)((0xFFFFFFFC0000000L & var8_7) >> 30);
                var3_3 = this.c;
                var4_4 = (int)(var8_7 & 0x3FFFFFFFL);
                var2_2 = var4_4 & var3_3;
                if ((var1_1 & var3_3) == var2_2) {
                    return null;
                }
                var11_9 = this.d;
                var12_10 = var11_9.get(var2_2);
                var5_5 = this.b;
                if (var12_10 != null) break block7;
                if (!var5_5) ** GOTO lbl-1000
                return null;
            }
            if (var12_10 instanceof s) {
                return null;
            }
            var6_6 = var4_4 + 1 & 0x3FFFFFFF;
            if (!var10_8.compareAndSet(this, var8_7, var8_7 & -1073741824L | var6_6)) continue;
            var11_9.set(var2_2, null);
            return var12_10;
        } while (!var5_5);
        var11_9 = this;
        while (true) {
            var10_8 = t.f;
            var8_7 = var10_8.get(var11_9);
            var1_1 = (int)(var8_7 & 0x3FFFFFFFL);
            var5_5 = D.a;
            if ((var8_7 & 0x1000000000000000L) != 0L) {
                var10_8 = var11_9.c();
            } else {
                if (!var10_8.compareAndSet(var11_9, var8_7, var8_7 & -1073741824L | var6_6)) continue;
                var11_9.d.set(var11_9.c & var1_1, null);
                var10_8 = null;
            }
            var11_9 = var10_8;
            if (var10_8 == null) break;
        }
        return var12_10;
    }
}

