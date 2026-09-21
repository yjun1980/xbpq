/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.O;

import com.github.catvod.spider.merge.E.f;
import com.github.catvod.spider.merge.N.c;
import com.github.catvod.spider.merge.N.g;
import com.github.catvod.spider.merge.O.a;
import com.github.catvod.spider.merge.O.e;
import com.github.catvod.spider.merge.O.h;
import com.github.catvod.spider.merge.O.i;
import com.github.catvod.spider.merge.O.j;
import com.github.catvod.spider.merge.O.k;
import com.github.catvod.spider.merge.O.l;
import com.github.catvod.spider.merge.b.n;
import com.github.catvod.spider.merge.cYh;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;

public final class b
implements Executor,
Closeable {
    private static final AtomicLongFieldUpdater j;
    static final AtomicLongFieldUpdater k;
    private static final AtomicIntegerFieldUpdater l;
    public static final g m;
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

    static {
        m = new g(cYh.d("291F150E1E14380315101411"));
        j = AtomicLongFieldUpdater.newUpdater(b.class, cYh.d("1731333A323E303F333A3228140335303431"));
        k = AtomicLongFieldUpdater.newUpdater(b.class, cYh.d("043F2F2525350B033530233F"));
        l = AtomicIntegerFieldUpdater.newUpdater(b.class, cYh.d("3839320532280A392F30233F03"));
    }

    public b(int n2, int n3, long l2, String charSequence) {
        this.f = n2;
        this.g = n3;
        this.h = l2;
        this.i = charSequence;
        boolean bl = n2 >= 1;
        if (bl) {
            bl = n3 >= n2;
            charSequence = cYh.d("2A3139712735083C61223E200270");
            if (bl) {
                bl = n3 <= 0x1FFFFE;
                if (bl) {
                    bl = l2 > 0L;
                    if (bl) {
                        this.c = new e();
                        this.d = new e();
                        this.parkedWorkersStack = 0L;
                        this.e = new AtomicReferenceArray(n3 + 1);
                        this.controlState = (long)n2 << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(cYh.d("2E342D34772D08222A34257A0C352421773B0B393734772E0E3D2471"));
                    ((StringBuilder)charSequence).append(l2);
                    ((StringBuilder)charSequence).append(cYh.d("473D3422237A0535612138290E24282732"));
                    throw new IllegalArgumentException(((StringBuilder)charSequence).toString().toString());
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((String)charSequence);
                stringBuilder.append(n3);
                stringBuilder.append(cYh.d("4723293E223603702F3E237A02282234323E473D20293E37063C6122222A173F3325323E473E343C353F15702E37772E0F222430332947627168606B5260"));
                throw new IllegalArgumentException(stringBuilder.toString().toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)charSequence);
            stringBuilder.append(n3);
            stringBuilder.append(cYh.d("4723293E223603702334773D15352025322847242930397A08226134262F063C3271233547332E23327A173F2E3D77290E2A2471"));
            stringBuilder.append(n2);
            throw new IllegalArgumentException(stringBuilder.toString().toString());
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(cYh.d("243F3334772A083F2D7124331D3561"));
        ((StringBuilder)charSequence).append(n2);
        ((StringBuilder)charSequence).append(cYh.d("4723293E223603702334773B13702D343629137070"));
        throw new IllegalArgumentException(((StringBuilder)charSequence).toString().toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private final int a() {
        int n2;
        block15: {
            AtomicReferenceArray<a> atomicReferenceArray = this.e;
            // MONITORENTER : atomicReferenceArray
            boolean bl = this.isTerminated();
            if (!bl) break block15;
            n2 = -1;
            return n2;
        }
        long l2 = this.controlState;
        int n3 = (int)(l2 & 0x1FFFFFL);
        int n4 = n3 - (int)((l2 & 0x3FFFFE00000L) >> 21);
        int n5 = 0;
        n2 = n4;
        if (n4 < 0) {
            n2 = 0;
        }
        n4 = this.f;
        if (n2 >= n4) {
            return 0;
        }
        n4 = this.g;
        if (n3 >= n4) {
            return 0;
        }
        n3 = (int)(this.controlState & 0x1FFFFFL) + 1;
        n4 = n3 > 0 && this.e.get(n3) == null ? 1 : 0;
        if (n4 != 0) {
            Object object = new a(this, n3);
            this.e.set(n3, (a)object);
            n4 = n5;
            if (n3 == (int)(0x1FFFFFL & k.incrementAndGet(this))) {
                n4 = 1;
            }
            if (n4 != 0) {
                ((Thread)object).start();
                return ++n2;
            }
            object = cYh.d("2131283D323E47222420223315352C34392E49");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(object.toString());
            throw illegalArgumentException;
        }
        String string = cYh.d("2131283D323E47222420223315352C34392E49");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string.toString());
        throw illegalArgumentException;
    }

    private final a c() {
        Thread thread = Thread.currentThread();
        boolean bl = thread instanceof a;
        Object var3_3 = null;
        if (!bl) {
            thread = null;
        }
        a a2 = (a)thread;
        thread = var3_3;
        if (a2 != null) {
            thread = var3_3;
            if (com.github.catvod.spider.merge.E.f.a(a2.i, this)) {
                thread = a2;
            }
        }
        return thread;
    }

    private final int e(a object) {
        int n2;
        do {
            if ((object = ((a)object).c()) == m) {
                return -1;
            }
            if (object != null) continue;
            return 0;
        } while ((n2 = ((a)(object = (a)object)).b()) == 0);
        return n2;
    }

    private final boolean i(long l2) {
        int n2;
        int n3 = n2 = (int)(0x1FFFFFL & l2) - (int)((l2 & 0x3FFFFE00000L) >> 21);
        if (n2 < 0) {
            n3 = 0;
        }
        if (n3 < this.f) {
            n3 = this.a();
            if (n3 == 1 && this.f > 1) {
                this.a();
            }
            if (n3 > 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean j() {
        boolean bl;
        block3: {
            a a2;
            while (true) {
                long l2;
                int n2;
                if ((a2 = this.e.get(n2 = (int)(0x1FFFFFL & (l2 = this.parkedWorkersStack)))) != null) {
                    n2 = this.e(a2);
                    if (n2 < 0 || !j.compareAndSet(this, l2, (long)n2 | 0x200000L + l2 & 0xFFFFFFFFFFE00000L)) continue;
                    a2.g(m);
                } else {
                    a2 = null;
                }
                bl = false;
                if (a2 == null) break block3;
                if (a.j.compareAndSet(a2, -1, 0)) break;
            }
            LockSupport.unpark(a2);
            bl = true;
        }
        return bl;
    }

    public final i b(Runnable runnable, j j2) {
        com.github.catvod.spider.merge.O.l.e.getClass();
        long l2 = System.nanoTime();
        if (runnable instanceof i) {
            runnable = (i)runnable;
            ((i)runnable).c = l2;
            ((i)runnable).d = j2;
            return runnable;
        }
        return new k(runnable, l2, j2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void close() {
        Object object;
        a a2;
        block15: {
            if (!l.compareAndSet(this, 0, 1)) {
                return;
            }
            a2 = this.c();
            object = this.e;
            // MONITORENTER : object
            long l2 = this.controlState;
            int n2 = (int)(l2 & 0x1FFFFFL);
            // MONITOREXIT : object
            if (1 > n2) break block15;
            int n3 = 1;
            while (true) {
                object = this.e.get(n3);
                com.github.catvod.spider.merge.E.f.b(object);
                object = (a)object;
                if (object != a2) {
                    while (((Thread)object).isAlive()) {
                        LockSupport.unpark((Thread)object);
                        ((Thread)object).join(10000L);
                    }
                    ((a)object).c.d(this.d);
                }
                if (n3 == n2) break;
                ++n3;
            }
        }
        this.d.b();
        this.c.b();
        while (true) {
            if (a2 == null || (object = a2.a(true)) == null) {
                object = (i)this.c.d();
            }
            if (object == null) {
                object = (i)this.d.d();
            }
            if (object == null) break;
            try {
                object.run();
            }
            catch (Throwable throwable) {
                object = Thread.currentThread();
                ((Thread)object).getUncaughtExceptionHandler().uncaughtException((Thread)object, throwable);
            }
        }
        if (a2 != null) {
            a2.h(5);
        }
        this.parkedWorkersStack = 0L;
        this.controlState = 0L;
    }

    public final void d(Runnable runnable, j object, boolean bl) {
        boolean bl2;
        i i2 = this.b(runnable, (j)object);
        a a2 = this.c();
        boolean bl3 = true;
        if (a2 == null || a2.d == 5 || i2.d.a() == 0 && a2.d == 2) {
            runnable = i2;
        } else {
            a2.h = true;
            runnable = a2.c.a(i2, bl);
        }
        if (runnable != null && !((c)(object = (bl2 = ((i)runnable).d.a() == 1) ? this.d : this.c)).a(runnable)) {
            throw new RejectedExecutionException(n.b(new StringBuilder(), this.i, cYh.d("47272022772E02222C38393B133525")));
        }
        bl2 = bl && a2 != null ? bl3 : false;
        if (i2.d.a() == 0) {
            if (bl2) {
                return;
            }
            if (!this.j() && !this.i(this.controlState)) {
                this.j();
            }
        } else {
            long l2 = k.addAndGet(this, 0x200000L);
            if (!(bl2 || this.j() || this.i(l2))) {
                this.j();
            }
        }
    }

    @Override
    public final void execute(Runnable runnable) {
        this.d(runnable, com.github.catvod.spider.merge.O.h.c, false);
    }

    public final boolean f(a a2) {
        int n2;
        long l2;
        if (a2.c() != m) {
            return false;
        }
        do {
            l2 = this.parkedWorkersStack;
            int n3 = (int)(0x1FFFFFL & l2);
            n2 = a2.b();
            a2.g(this.e.get(n3));
        } while (!j.compareAndSet(this, l2, 0x200000L + l2 & 0xFFFFFFFFFFE00000L | (long)n2));
        return true;
    }

    public final void g(a a2, int n2, int n3) {
        long l2;
        int n4;
        do {
            int n5;
            l2 = this.parkedWorkersStack;
            n4 = n5 = (int)(0x1FFFFFL & l2);
            if (n5 != n2) continue;
            n4 = n3 == 0 ? this.e(a2) : n3;
        } while (n4 < 0 || !j.compareAndSet(this, l2, 0x200000L + l2 & 0xFFFFFFFFFFE00000L | (long)n4));
    }

    public final void h() {
        if (this.j()) {
            return;
        }
        if (this.i(this.controlState)) {
            return;
        }
        this.j();
    }

    public final boolean isTerminated() {
        return this._isTerminated != 0;
    }

    public final String toString() {
        String string;
        Object object;
        ArrayList<String> arrayList = new ArrayList<String>();
        int n2 = this.e.length();
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        for (int i2 = 1; i2 < n2; ++i2) {
            int n8;
            int n9;
            int n10;
            int n11;
            int n12;
            block3: {
                block8: {
                    int n13;
                    block4: {
                        block5: {
                            block6: {
                                block7: {
                                    object = this.e.get(i2);
                                    n12 = n3++;
                                    n11 = n4++;
                                    n10 = n5;
                                    n9 = n6;
                                    n8 = n7;
                                    if (object == null) break block3;
                                    n13 = ((a)object).c.c();
                                    n9 = com.github.catvod.spider.merge.l.a.a(((a)object).d);
                                    if (n9 == 0) break block4;
                                    if (n9 == 1) break block5;
                                    if (n9 == 2) break block6;
                                    if (n9 == 3) break block7;
                                    if (n9 != 4) {
                                        n12 = n3;
                                        n11 = n4;
                                        n10 = n5;
                                        n9 = n6;
                                        n8 = n7;
                                    } else {
                                        n8 = n7 + 1;
                                        n12 = n3;
                                        n11 = n4;
                                        n10 = n5;
                                        n9 = n6;
                                    }
                                    break block3;
                                }
                                n12 = n3;
                                n11 = n4;
                                n10 = n5;
                                n9 = ++n6;
                                n8 = n7;
                                if (n13 <= 0) break block3;
                                object = new StringBuilder();
                                ((StringBuilder)object).append(String.valueOf(n13));
                                string = cYh.d("03");
                                break block8;
                            }
                            n10 = n5 + 1;
                            n12 = n3;
                            n11 = n4;
                            n9 = n6;
                            n8 = n7;
                            break block3;
                        }
                        object = new StringBuilder();
                        ((StringBuilder)object).append(String.valueOf(n13));
                        string = cYh.d("05");
                        break block8;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append(String.valueOf(n13));
                    string = cYh.d("04");
                }
                ((StringBuilder)object).append(string);
                arrayList.add(((StringBuilder)object).toString());
                n8 = n7;
                n9 = n6;
                n10 = n5;
                n11 = n4;
                n12 = n3;
            }
            n3 = n12;
            n4 = n11;
            n5 = n10;
            n6 = n9;
            n7 = n8;
        }
        long l2 = this.controlState;
        object = new StringBuilder();
        ((StringBuilder)object).append(this.i);
        ((StringBuilder)object).append('@');
        ((StringBuilder)object).append(com.github.catvod.spider.merge.L.h.d(this));
        ((StringBuilder)object).append('[');
        ((StringBuilder)object).append(cYh.d("373F2E3D77090E2A24712C"));
        ((StringBuilder)object).append(cYh.d("043F3334776747"));
        ((StringBuilder)object).append(this.f);
        String string2 = cYh.d("4B70");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(cYh.d("0A3139716A7A"));
        ((StringBuilder)object).append(this.g);
        string = cYh.d("1A7C61");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(cYh.d("303F333A322847033530233F14703A"));
        ((StringBuilder)object).append(cYh.d("240014716A7A"));
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(cYh.d("053C2E323C330937616C77"));
        ((StringBuilder)object).append(n4);
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(cYh.d("1731333A323E476D61"));
        ((StringBuilder)object).append(n5);
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(cYh.d("033F333C363413707C71"));
        ((StringBuilder)object).append(n6);
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(cYh.d("1335333C3E3406242435776747"));
        ((StringBuilder)object).append(n7);
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(cYh.d("15252F3F3E340070363E253102223271262F02252422776747"));
        ((StringBuilder)object).append(arrayList);
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(cYh.d("003C2E33363647131104772B1235343477290E2A24716A7A"));
        ((StringBuilder)object).append(this.c.c());
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(cYh.d("003C2E33363647322D3E34310E3E2671262F0225247124331D35616C77"));
        ((StringBuilder)object).append(this.d.c());
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(cYh.d("243F2F2525350B701225362E02703A"));
        ((StringBuilder)object).append(cYh.d("04222430233F0370363E25310222326C77"));
        ((StringBuilder)object).append((int)(0x1FFFFFL & l2));
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(cYh.d("053C2E323C330937612536290C23616C77"));
        ((StringBuilder)object).append((int)((0x3FFFFE00000L & l2) >> 21));
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(cYh.d("24001422773B04213438253F03707C71"));
        ((StringBuilder)object).append(this.f - (int)((0x7FFFFC0000000000L & l2) >> 42));
        ((StringBuilder)object).append(cYh.d("1A0D"));
        return ((StringBuilder)object).toString();
    }
}

