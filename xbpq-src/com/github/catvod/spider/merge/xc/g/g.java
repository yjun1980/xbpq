/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.core.content.a
 */
package com.github.catvod.spider.merge.xc.g;

import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.xc.g.a;
import com.github.catvod.spider.merge.xc.g.b;
import com.github.catvod.spider.merge.xc.g.c;
import com.github.catvod.spider.merge.xc.g.d;
import com.github.catvod.spider.merge.xc.g.e;
import com.github.catvod.spider.merge.xc.g.f;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class g
implements com.github.catvod.spider.merge.xc.W.a {
    public static final boolean d;
    public static final Logger e;
    public static final com.github.catvod.spider.merge.xc.D0.b f;
    public static final Object g;
    public volatile Object a;
    public volatile c b;
    public volatile f c;

    static {
        Object var1_1;
        com.github.catvod.spider.merge.xc.D0.b b2;
        d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        e = Logger.getLogger(g.class.getName());
        try {
            b2 = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "a"));
            var1_1 = null;
        }
        catch (Throwable throwable) {
            b2 = new e();
        }
        f = b2;
        if (var1_1 != null) {
            e.log(Level.SEVERE, "SafeAtomicHelper is broken!", (Throwable)var1_1);
        }
        g = new Object();
    }

    public static void b(g object) {
        Object object2;
        Object var3_3;
        Object object3;
        while (!f.k((g)object, (f)(object3 = ((g)object).c), com.github.catvod.spider.merge.xc.g.f.c)) {
        }
        while (true) {
            var3_3 = null;
            if (object3 == null) break;
            object2 = ((f)object3).a;
            if (object2 != null) {
                ((f)object3).a = null;
                LockSupport.unpark((Thread)object2);
            }
            object3 = ((f)object3).b;
        }
        while (!f.i((g)object, (c)(object2 = ((g)object).b), com.github.catvod.spider.merge.xc.g.c.d)) {
        }
        object3 = var3_3;
        object = object2;
        while (true) {
            object2 = object3;
            object3 = object;
            object = object2;
            if (object3 == null) break;
            object = ((c)object3).c;
            ((c)object3).c = object2;
        }
        while (object != null) {
            object3 = ((c)object).c;
            object2 = ((c)object).a;
            object = ((c)object).b;
            com.github.catvod.spider.merge.xc.g.g.c((androidx.core.content.a)object2, (ExecutorService)object);
            object = object3;
        }
    }

    public static void c(androidx.core.content.a object, ExecutorService executorService) {
        try {
            executorService.execute((Runnable)object);
        }
        catch (RuntimeException runtimeException) {
            Level level = Level.SEVERE;
            StringBuilder stringBuilder = new StringBuilder("RuntimeException while executing runnable ");
            stringBuilder.append(object);
            stringBuilder.append(" with executor ");
            stringBuilder.append(executorService);
            object = stringBuilder.toString();
            e.log(level, (String)object, runtimeException);
        }
    }

    public static Object d(Object object) {
        if (!(object instanceof a)) {
            if (!(object instanceof b)) {
                Object object2 = object;
                if (object == g) {
                    object2 = null;
                }
                return object2;
            }
            ((b)object).getClass();
            throw new ExecutionException(null);
        }
        object = ((a)object).a;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause((Throwable)object);
        throw cancellationException;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(StringBuilder var1_1) {
        block11: {
            block10: {
                var2_2 = false;
                while (true) {
                    try {
                        var3_4 = this.get();
                        if (var2_2) {
                            break;
                        }
                        ** GOTO lbl13
                    }
                    catch (InterruptedException var3_3) {
                        var2_2 = true;
                        continue;
                    }
                    break;
                }
                try {
                    Thread.currentThread().interrupt();
lbl13:
                    // 2 sources

                    var1_1.append("SUCCESS, result=[");
                    var3_4 = var3_4 == this ? "this future" : String.valueOf(var3_4);
                }
                catch (RuntimeException var3_5) {
                    break block10;
                }
                catch (ExecutionException var3_6) {
                    break block11;
                }
                catch (CancellationException var3_8) {
                    var1_1.append("CANCELLED");
                    return;
                }
                var1_1.append((String)var3_4);
                var1_1.append("]");
                return;
                catch (Throwable var3_7) {
                    if (var2_2 == false) throw var3_7;
                    Thread.currentThread().interrupt();
                    throw var3_7;
                }
            }
            var1_1.append("UNKNOWN, cause=[");
            var1_1.append(var3_5.getClass());
            var1_1.append(" thrown from get()]");
            return;
        }
        var1_1.append("FAILURE, cause=[");
        var1_1.append(var3_6.getCause());
        var1_1.append("]");
    }

    @Override
    public final boolean cancel(boolean bl) {
        boolean bl2;
        Object object = this.a;
        boolean bl3 = bl2 = false;
        if (object == null) {
            a a2 = d ? new a(bl, new CancellationException("Future.cancel() was called.")) : (bl ? com.github.catvod.spider.merge.xc.g.a.b : com.github.catvod.spider.merge.xc.g.a.c);
            bl3 = bl2;
            if (f.j(this, object, a2)) {
                com.github.catvod.spider.merge.xc.g.g.b(this);
                bl3 = true;
            }
        }
        return bl3;
    }

    /*
     * Unable to fully structure code
     */
    public final void e(f var1_1) {
        var1_1.a = null;
        block0: while (true) {
            if ((var1_1 = this.c) == com.github.catvod.spider.merge.xc.g.f.c) {
                return;
            }
            var2_2 = null;
            while (var1_1 != null) {
                var4_4 = var1_1.b;
                if (var1_1.a != null) {
                    var3_3 = var1_1;
                } else if (var2_2 != null) {
                    var2_2.b = var4_4;
                    var3_3 = var2_2;
                    if (var2_2.a == null) {
                        continue block0;
                    }
                } else {
                    var3_3 = var2_2;
                    if (com.github.catvod.spider.merge.xc.g.g.f.k(this, var1_1, var4_4)) ** break;
                    continue block0;
                }
                var1_1 = var4_4;
                var2_2 = var3_3;
            }
            break;
        }
    }

    public final Object get() {
        if (!Thread.interrupted()) {
            Object object = this.a;
            if (object != null) {
                return com.github.catvod.spider.merge.xc.g.g.d(object);
            }
            object = this.c;
            f f2 = com.github.catvod.spider.merge.xc.g.f.c;
            if (object != f2) {
                Object object2;
                f f4 = new f();
                do {
                    object2 = f;
                    ((com.github.catvod.spider.merge.xc.D0.b)object2).G(f4, (f)object);
                    if (((com.github.catvod.spider.merge.xc.D0.b)object2).k(this, (f)object, f4)) {
                        block6: {
                            do {
                                LockSupport.park(this);
                                if (Thread.interrupted()) break block6;
                            } while ((object = this.a) == null);
                            return com.github.catvod.spider.merge.xc.g.g.d(object);
                        }
                        this.e(f4);
                        throw new InterruptedException();
                    }
                    object = object2 = this.c;
                } while (object2 != f2);
            }
            return com.github.catvod.spider.merge.xc.g.g.d(this.a);
        }
        InterruptedException interruptedException = new InterruptedException();
        throw interruptedException;
    }

    public final Object get(long l2, TimeUnit object) {
        long l3 = ((TimeUnit)((Object)object)).toNanos(l2);
        if (!Thread.interrupted()) {
            Object object2;
            Object object3;
            Object object4;
            long l4;
            long l5;
            Object object5;
            block17: {
                object5 = this.a;
                if (object5 != null) {
                    return com.github.catvod.spider.merge.xc.g.g.d(object5);
                }
                l5 = l3 > 0L ? System.nanoTime() + l3 : 0L;
                l4 = l3;
                if (l3 >= 1000L) {
                    object5 = this.c;
                    object4 = com.github.catvod.spider.merge.xc.g.f.c;
                    if (object5 != object4) {
                        object3 = new f();
                        do {
                            object2 = f;
                            ((com.github.catvod.spider.merge.xc.D0.b)object2).G((f)object3, (f)object5);
                            if (((com.github.catvod.spider.merge.xc.D0.b)object2).k(this, (f)object5, (f)object3)) {
                                block16: {
                                    do {
                                        LockSupport.parkNanos(this, l3);
                                        if (Thread.interrupted()) break block16;
                                        object5 = this.a;
                                        if (object5 != null) {
                                            return com.github.catvod.spider.merge.xc.g.g.d(object5);
                                        }
                                        l3 = l4 = l5 - System.nanoTime();
                                    } while (l4 >= 1000L);
                                    this.e((f)object3);
                                    break block17;
                                }
                                this.e((f)object3);
                                throw new InterruptedException();
                            }
                            object5 = object2 = this.c;
                        } while (object2 != object4);
                    }
                    return com.github.catvod.spider.merge.xc.g.g.d(this.a);
                }
            }
            while (l4 > 0L) {
                object5 = this.a;
                if (object5 != null) {
                    return com.github.catvod.spider.merge.xc.g.g.d(object5);
                }
                if (!Thread.interrupted()) {
                    l4 = l5 - System.nanoTime();
                    continue;
                }
                throw new InterruptedException();
            }
            object3 = this.toString();
            object2 = object.toString();
            object5 = Locale.ROOT;
            object4 = ((String)object2).toLowerCase((Locale)object5);
            object2 = new StringBuilder("Waited ");
            ((StringBuilder)object2).append(l2);
            ((StringBuilder)object2).append(" ");
            ((StringBuilder)object2).append(object.toString().toLowerCase((Locale)object5));
            object5 = object2 = ((StringBuilder)object2).toString();
            if (l4 + 1000L < 0L) {
                object5 = m.f((String)object2, " (plus ");
                l4 = -l4;
                l2 = ((TimeUnit)((Object)object)).convert(l4, TimeUnit.NANOSECONDS);
                boolean bl = l2 == 0L || (l4 -= ((TimeUnit)((Object)object)).toNanos(l2)) > 1000L;
                object = object5;
                if (l2 > 0L) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append((String)object5);
                    ((StringBuilder)object).append(l2);
                    ((StringBuilder)object).append(" ");
                    ((StringBuilder)object).append((String)object4);
                    object = object5 = ((StringBuilder)object).toString();
                    if (bl) {
                        object = m.f((String)object5, ",");
                    }
                    object = m.f((String)object, " ");
                }
                object5 = object;
                if (bl) {
                    object5 = new StringBuilder();
                    ((StringBuilder)object5).append((String)object);
                    ((StringBuilder)object5).append(l4);
                    ((StringBuilder)object5).append(" nanoseconds ");
                    object5 = ((StringBuilder)object5).toString();
                }
                object5 = m.f((String)object5, "delay)");
            }
            if (this.isDone()) {
                throw new TimeoutException(m.f((String)object5, " but future completed as timeout expired"));
            }
            throw new TimeoutException(m.g((String)object5, " for ", (String)object3));
        }
        object = new InterruptedException();
        throw object;
    }

    @Override
    public final boolean isCancelled() {
        return this.a instanceof a;
    }

    @Override
    public final boolean isDone() {
        boolean bl = this.a != null;
        return bl;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("[status=");
        if (this.a instanceof a) {
            stringBuilder.append("CANCELLED");
        } else if (this.isDone()) {
            this.a(stringBuilder);
        } else {
            CharSequence charSequence;
            try {
                if (this instanceof ScheduledFuture) {
                    charSequence = new StringBuilder("remaining delay=[");
                    ((StringBuilder)charSequence).append(((ScheduledFuture)((Object)this)).getDelay(TimeUnit.MILLISECONDS));
                    ((StringBuilder)charSequence).append(" ms]");
                    charSequence = ((StringBuilder)charSequence).toString();
                } else {
                    charSequence = null;
                }
            }
            catch (RuntimeException runtimeException) {
                StringBuilder stringBuilder2 = new StringBuilder("Exception thrown from implementation: ");
                stringBuilder2.append(runtimeException.getClass());
                charSequence = stringBuilder2.toString();
            }
            if (charSequence != null && !((String)charSequence).isEmpty()) {
                stringBuilder.append("PENDING, info=[");
                stringBuilder.append((String)charSequence);
                stringBuilder.append("]");
            } else if (this.isDone()) {
                this.a(stringBuilder);
            } else {
                stringBuilder.append("PENDING");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

