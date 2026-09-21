/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.N.d;
import com.github.catvod.spider.merge.N.g;
import com.github.catvod.spider.merge.cYh;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class e<E> {
    private static final AtomicReferenceFieldUpdater e;
    private static final AtomicLongFieldUpdater f;
    public static final g g;
    private volatile Object _next;
    private volatile long _state;
    private final int a;
    private AtomicReferenceArray b;
    private final int c;
    private final boolean d;

    static {
        g = new g(cYh.d("35150C1E011F3816131E0D1F29"));
        e = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, cYh.d("383E242923"));
        f = AtomicLongFieldUpdater.newUpdater(e.class, cYh.d("38233530233F"));
    }

    public e(int n2, boolean bl) {
        int n3;
        this.c = n2;
        this.d = bl;
        this.a = n3 = n2 - 1;
        this._next = null;
        this._state = 0L;
        this.b = new AtomicReferenceArray(n2);
        boolean bl2 = false;
        boolean bl3 = n3 <= 0x3FFFFFFF;
        String string = cYh.d("243824323C7A0131283D323E49");
        if (bl3) {
            bl3 = bl2;
            if ((n2 & n3) == 0) {
                bl3 = true;
            }
            if (bl3) {
                return;
            }
            throw new IllegalStateException(string.toString());
        }
        throw new IllegalStateException(string.toString());
    }

    public final int a(E e2) {
        int n2;
        int n3;
        while (true) {
            long l2 = this._state;
            int n4 = 1;
            if ((0x3000000000000000L & l2) != 0L) {
                if ((0x2000000000000000L & l2) != 0L) {
                    n4 = 2;
                }
                return n4;
            }
            n3 = (int)((0xFFFFFFFC0000000L & l2) >> 30);
            n2 = this.a;
            n4 = (int)((0x3FFFFFFFL & l2) >> 0);
            if ((n3 + 2 & n2) == (n4 & n2)) {
                return 1;
            }
            if (!this.d && this.b.get(n3 & n2) != null) {
                n2 = this.c;
                if (n2 >= 1024 && (n3 - n4 & 0x3FFFFFFF) <= n2 >> 1) continue;
                return 1;
            }
            if (f.compareAndSet(this, l2, 0xF00000003FFFFFFFL & l2 | (long)(n3 + 1 & 0x3FFFFFFF) << 30)) break;
        }
        this.b.set(n3 & n2, e2);
        e<E> e3 = this;
        while ((e3._state & 0x1000000000000000L) != 0L) {
            e3 = e3.e();
            Object e4 = e3.b.get(e3.a & n3);
            if (e4 instanceof d && ((d)e4).a == n3) {
                e3.b.set(e3.a & n3, e2);
            } else {
                e3 = null;
            }
            if (e3 != null) continue;
        }
        return 0;
    }

    public final boolean b() {
        long l2;
        do {
            if (((l2 = this._state) & 0x2000000000000000L) != 0L) {
                return true;
            }
            if ((0x1000000000000000L & l2) == 0L) continue;
            return false;
        } while (!f.compareAndSet(this, l2, l2 | 0x2000000000000000L));
        return true;
    }

    public final int c() {
        long l2 = this._state;
        int n2 = (int)((0x3FFFFFFFL & l2) >> 0);
        return 0x3FFFFFFF & (int)((l2 & 0xFFFFFFFC0000000L) >> 30) - n2;
    }

    public final boolean d() {
        long l2 = this._state;
        boolean bl = false;
        if ((int)((0x3FFFFFFFL & l2) >> 0) == (int)((l2 & 0xFFFFFFFC0000000L) >> 30)) {
            bl = true;
        }
        return bl;
    }

    public final e<E> e() {
        long l2;
        while (((l2 = this._state) & 0x1000000000000000L) == 0L) {
            long l3 = l2 | 0x1000000000000000L;
            if (!f.compareAndSet(this, l2, l3)) continue;
            l2 = l3;
            break;
        }
        Object object;
        while ((object = (e)this._next) == null) {
            int n2;
            int n3;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            e<E> e2 = new e<E>(this.c * 2, this.d);
            int n4 = (int)((0x3FFFFFFFL & l2) >> 0);
            int n5 = (int)((0xFFFFFFFC0000000L & l2) >> 30);
            while ((n3 = n4 & (n2 = this.a)) != (n2 & n5)) {
                object = this.b.get(n3);
                if (object == null) {
                    object = new d(n4);
                }
                e2.b.set(e2.a & n4, object);
                ++n4;
            }
            e2._state = 0xEFFFFFFFFFFFFFFFL & l2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, e2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
        return object;
    }

    /*
     * Unable to fully structure code
     */
    public final Object f() {
        do lbl-1000:
        // 3 sources

        {
            block7: {
                if (((var6_5 = this._state) & 0x1000000000000000L) != 0L) {
                    return com.github.catvod.spider.merge.N.e.g;
                }
                var2_2 = (int)((0xFFFFFFFC0000000L & var6_5) >> 30);
                var1_1 = this.a;
                var3_3 = (int)((var6_5 & 0x3FFFFFFFL) >> 0);
                if ((var2_2 & var1_1) == (var3_3 & var1_1)) {
                    return null;
                }
                var9_7 = this.b.get(var1_1 & var3_3);
                if (var9_7 != null) break block7;
                if (!this.d) ** GOTO lbl-1000
                return null;
            }
            if (var9_7 instanceof d) {
                return null;
            }
            var8_6 = com.github.catvod.spider.merge.N.e.f;
            var4_4 = (long)(var3_3 + 1 & 0x3FFFFFFF) << 0;
            if (!var8_6.compareAndSet(this, var6_5, var6_5 & -1073741824L | var4_4)) continue;
            this.b.set(this.a & var3_3, null);
            return var9_7;
        } while (!this.d);
        var8_6 = this;
        while (true) {
            var6_5 = var8_6._state;
            var1_1 = (int)((var6_5 & 0x3FFFFFFFL) >> 0);
            if ((var6_5 & 0x1000000000000000L) != 0L) {
                var8_6 = var8_6.e();
            } else {
                if (!com.github.catvod.spider.merge.N.e.f.compareAndSet(var8_6, var6_5, var6_5 & -1073741824L | var4_4)) continue;
                var8_6.b.set(var8_6.a & var1_1, null);
                var8_6 = null;
            }
            if (var8_6 == null) break;
        }
        return var9_7;
    }
}

