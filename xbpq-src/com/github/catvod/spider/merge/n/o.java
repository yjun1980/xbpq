/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.l.s;
import com.github.catvod.spider.merge.n.M;
import com.github.catvod.spider.merge.n.a;
import com.github.catvod.spider.merge.n.b;
import com.github.catvod.spider.merge.n.d;
import com.github.catvod.spider.merge.n.e;
import com.github.catvod.spider.merge.n.f;
import com.github.catvod.spider.merge.n.g;
import com.github.catvod.spider.merge.n.h;
import com.github.catvod.spider.merge.n.i;
import com.github.catvod.spider.merge.n.m;
import com.github.catvod.spider.merge.n.n;
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

public abstract class o<V>
extends com.github.catvod.spider.merge.o.a
implements M<V> {
    static final boolean f;
    private static final Logger g;
    private static final a h;
    private static final Object i;
    private volatile Object c;
    private volatile e d;
    private volatile n e;

    static {
        Throwable throwable;
        Object object;
        boolean bl;
        try {
            bl = Boolean.parseBoolean(System.getProperty(cYh.d("002520273674043F2F32222815352F25793D023E2423362E020F22303939023C2D302333083E1E32362F1435"), cYh.d("01312D2232")));
        }
        catch (SecurityException securityException) {
            bl = false;
        }
        f = bl;
        g = Logger.getLogger(o.class.getName());
        Throwable throwable2 = null;
        try {
            object = new m();
            throwable = null;
        }
        catch (Throwable throwable3) {
            try {
                object = new f(AtomicReferenceFieldUpdater.newUpdater(n.class, Thread.class, cYh.d("06")), AtomicReferenceFieldUpdater.newUpdater(n.class, n.class, cYh.d("05")), AtomicReferenceFieldUpdater.newUpdater(o.class, n.class, cYh.d("02")), AtomicReferenceFieldUpdater.newUpdater(o.class, e.class, cYh.d("03")), AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, cYh.d("04")));
            }
            catch (Throwable throwable4) {
                object = new h();
            }
        }
        h = object;
        if (throwable2 != null) {
            Logger logger = g;
            object = Level.SEVERE;
            logger.log((Level)object, cYh.d("323E3230313F26242E3C3E392F352D213228473932713528083B243F76"), throwable);
            logger.log((Level)object, cYh.d("34312734162E083D28321F3F0B2024237733147023233831023E60"), throwable2);
        }
        i = new Object();
    }

    protected o() {
    }

    static /* synthetic */ Object d(o o2) {
        return o2.c;
    }

    static /* synthetic */ Object e(o o2, Object object) {
        o2.c = object;
        return object;
    }

    static /* synthetic */ e f(o o2) {
        return o2.d;
    }

    static /* synthetic */ e g(o o2, e e2) {
        o2.d = e2;
        return e2;
    }

    static /* synthetic */ n h(o o2) {
        return o2.e;
    }

    static /* synthetic */ n i(o o2, n n2) {
        o2.e = n2;
        return n2;
    }

    private void j(StringBuilder stringBuilder) {
        block4: {
            String string = cYh.d("3A");
            try {
                V v2 = o.p(this);
                stringBuilder.append(cYh.d("340502121209347C61233229123C356C0C"));
                this.l(stringBuilder, v2);
                stringBuilder.append(string);
                break block4;
            }
            catch (RuntimeException runtimeException) {
                stringBuilder.append(cYh.d("321E0A1F180D297C6132362F14357C0A"));
                stringBuilder.append(runtimeException.getClass());
                string = cYh.d("47242923382D097027233837473724257F733A");
            }
            catch (CancellationException cancellationException) {
                string = cYh.d("24110F1212162B1505");
            }
            catch (ExecutionException executionException) {
                stringBuilder.append(cYh.d("2111081D0208227C6132362F14357C0A"));
                stringBuilder.append(executionException.getCause());
            }
            stringBuilder.append(string);
        }
    }

    private void l(StringBuilder stringBuilder, Object object) {
        if (object == null) {
            object = cYh.d("09252D3D");
        } else if (object == this) {
            object = cYh.d("13382822773C1224342332");
        } else {
            stringBuilder.append(object.getClass().getName());
            stringBuilder.append(cYh.d("27"));
            object = Integer.toHexString(System.identityHashCode(object));
        }
        stringBuilder.append((String)object);
    }

    private static void m(o<?> object) {
        Object object2;
        object.getClass();
        Object object3 = h.g((o)object);
        while (object3 != null) {
            object2 = ((n)object3).a;
            if (object2 != null) {
                ((n)object3).a = null;
                LockSupport.unpark((Thread)object2);
            }
            object3 = ((n)object3).b;
        }
        ((o)object).k();
        object = h.f((o)object);
        object3 = null;
        while (true) {
            object2 = object3;
            if (object == null) break;
            object2 = ((e)object).c;
            ((e)object).c = object3;
            object3 = object;
            object = object2;
        }
        while (object2 != null) {
            object = ((e)object2).c;
            object3 = ((e)object2).a;
            object3.getClass();
            if (!(object3 instanceof g)) {
                object2 = ((e)object2).b;
                object2.getClass();
                o.n((Runnable)object3, (Executor)object2);
                object2 = object;
                continue;
            }
            object = (g)object3;
            throw null;
        }
    }

    private static void n(Runnable object, Executor object2) {
        try {
            object2.execute((Runnable)object);
        }
        catch (RuntimeException runtimeException) {
            Logger logger = g;
            Level level = Level.SEVERE;
            object = String.valueOf(object);
            object2 = String.valueOf(object2);
            int n2 = ((String)object).length();
            StringBuilder stringBuilder = new StringBuilder(((String)object2).length() + (n2 + 57));
            stringBuilder.append(cYh.d("35252F253E3702153932322A13392E3F772D0F392D34773F1F35222423330937612322340931233D327A"));
            stringBuilder.append((String)object);
            stringBuilder.append(cYh.d("472728253F7A02282432222E082261"));
            stringBuilder.append((String)object2);
            logger.log(level, stringBuilder.toString(), runtimeException);
        }
    }

    private V o(Object object) {
        if (!(object instanceof b)) {
            if (!(object instanceof d)) {
                Object object2 = object;
                if (object == i) {
                    object2 = null;
                }
                return (V)object2;
            }
            throw new ExecutionException(((d)object).a);
        }
        Throwable throwable = ((b)object).b;
        object = new CancellationException(cYh.d("3331323A772D06236132363404352D3D323E49"));
        ((Throwable)object).initCause(throwable);
        throw object;
    }

    private static <V> V p(Future<V> future) {
        boolean bl = false;
        while (true) {
            V v2;
            block5: {
                try {
                    v2 = future.get();
                    if (!bl) break block5;
                    Thread.currentThread().interrupt();
                }
                catch (Throwable throwable) {
                    if (bl) {
                        Thread.currentThread().interrupt();
                    }
                    throw throwable;
                }
                catch (InterruptedException interruptedException) {
                    bl = true;
                    continue;
                }
            }
            return v2;
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void s(n var1_1) {
        var1_1.a = null;
        block0: while (true) {
            if ((var1_1 = this.e) == n.c) {
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
                    if (o.h.c(this, var1_1, var4_4)) ** break;
                    continue block0;
                }
                var1_1 = var4_4;
                var2_2 = var3_3;
            }
            break;
        }
    }

    @Override
    public void a(Runnable object, Executor executor) {
        if (executor != null) {
            e e2;
            if (!this.isDone() && (e2 = this.d) != com.github.catvod.spider.merge.n.e.d) {
                e e3;
                e e4 = new e((Runnable)object, executor);
                do {
                    e4.c = e2;
                    if (h.a(this, e2, e4)) {
                        return;
                    }
                    e2 = e3 = this.d;
                } while (e3 != com.github.catvod.spider.merge.n.e.d);
            }
            o.n((Runnable)object, executor);
            return;
        }
        object = new NullPointerException(cYh.d("22282432222E082261263629473E343D3B74"));
        throw object;
    }

    @Override
    protected final Throwable b() {
        Object object;
        if (this instanceof i && (object = this.c) instanceof d) {
            return ((d)object).a;
        }
        return null;
    }

    @Override
    public boolean cancel(boolean bl) {
        block7: {
            Object object = this.c;
            boolean bl2 = true;
            boolean bl3 = object == null;
            if (bl3 | object instanceof g) {
                Object object2;
                b b2;
                if (f) {
                    b2 = new b(bl, new CancellationException(cYh.d("21253524253F4933203F343F0B786871203B147022303B3602346F")));
                    object2 = object;
                } else {
                    object2 = bl ? b.c : b.d;
                    object2.getClass();
                    b2 = object2;
                    object2 = object;
                }
                do {
                    if (h.b(this, object2, b2)) {
                        if (bl) {
                            this.q();
                        }
                        o.m(this);
                        if (!(object2 instanceof g)) {
                            bl = bl2;
                            break block7;
                        }
                        ((g)object2).getClass();
                        throw null;
                    }
                    object2 = object = this.c;
                } while (object instanceof g);
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public V get() {
        if (!Thread.interrupted()) {
            Object object = this.c;
            boolean bl = object != null;
            if (bl & (object instanceof g ^ true)) {
                return this.o(object);
            }
            object = this.e;
            if (object != n.c) {
                n n2;
                n n3 = new n();
                do {
                    o.h.h(n3, (n)object);
                    if (h.c(this, (n)object, n3)) {
                        block6: {
                            do {
                                LockSupport.park(this);
                                if (Thread.interrupted()) break block6;
                            } while (!((bl = (object = this.c) != null) & (object instanceof g ^ true)));
                            return this.o(object);
                        }
                        this.s(n3);
                        throw new InterruptedException();
                    }
                    n2 = this.e;
                    object = n2;
                } while (n2 != n.c);
            }
            object = this.c;
            object.getClass();
            return this.o(object);
        }
        InterruptedException interruptedException = new InterruptedException();
        throw interruptedException;
    }

    @Override
    public V get(long l2, TimeUnit object) {
        long l3 = ((TimeUnit)((Object)object)).toNanos(l2);
        if (!Thread.interrupted()) {
            Object object2;
            Object object3;
            long l4;
            long l5;
            int n2;
            Object object4;
            block17: {
                object4 = this.c;
                n2 = object4 != null ? 1 : 0;
                if (n2 & (object4 instanceof g ^ true)) {
                    return this.o(object4);
                }
                l5 = l3 > 0L ? System.nanoTime() + l3 : 0L;
                l4 = l3;
                if (l3 >= 1000L) {
                    object4 = this.e;
                    if (object4 != n.c) {
                        object3 = new n();
                        do {
                            o.h.h((n)object3, (n)object4);
                            if (h.c(this, (n)object4, (n)object3)) {
                                block16: {
                                    do {
                                        LockSupport.parkNanos(this, Math.min(l3, 2147483647999999999L));
                                        if (Thread.interrupted()) break block16;
                                        object4 = this.c;
                                        n2 = object4 != null ? 1 : 0;
                                        if (n2 & (object4 instanceof g ^ true)) {
                                            return this.o(object4);
                                        }
                                        l3 = l4 = l5 - System.nanoTime();
                                    } while (l4 >= 1000L);
                                    this.s((n)object3);
                                    break block17;
                                }
                                this.s((n)object3);
                                throw new InterruptedException();
                            }
                            object4 = object2 = this.e;
                        } while (object2 != n.c);
                    }
                    object = this.c;
                    object.getClass();
                    return this.o(object);
                }
            }
            while (l4 > 0L) {
                object4 = this.c;
                n2 = object4 != null ? 1 : 0;
                if (n2 & (object4 instanceof g ^ true)) {
                    return this.o(object4);
                }
                if (!Thread.interrupted()) {
                    l4 = l5 - System.nanoTime();
                    continue;
                }
                throw new InterruptedException();
            }
            object3 = this.toString();
            object2 = object.toString();
            object4 = Locale.ROOT;
            String string = ((String)object2).toLowerCase((Locale)object4);
            object2 = object.toString().toLowerCase((Locale)object4);
            object4 = new StringBuilder(String.valueOf(object2).length() + 28);
            ((StringBuilder)object4).append(cYh.d("30312825323E47"));
            ((StringBuilder)object4).append(l2);
            String string2 = cYh.d("47");
            ((StringBuilder)object4).append(string2);
            ((StringBuilder)object4).append((String)object2);
            object4 = object2 = ((StringBuilder)object4).toString();
            if (l4 + 1000L < 0L) {
                object4 = String.valueOf(object2).concat(cYh.d("4778313D222947"));
                l4 = -l4;
                l2 = ((TimeUnit)((Object)object)).convert(l4, TimeUnit.NANOSECONDS);
                n2 = l2 != 0L && (l4 -= ((TimeUnit)((Object)object)).toNanos(l2)) <= 1000L ? 0 : 1;
                object = object4;
                if (l2 > 0L) {
                    object4 = String.valueOf(object4);
                    int n3 = ((String)object4).length();
                    object = new StringBuilder(String.valueOf(string).length() + (n3 + 21));
                    ((StringBuilder)object).append((String)object4);
                    ((StringBuilder)object).append(l2);
                    ((StringBuilder)object).append(string2);
                    ((StringBuilder)object).append(string);
                    object = object4 = ((StringBuilder)object).toString();
                    if (n2 != 0) {
                        object = String.valueOf(object4).concat(cYh.d("4B"));
                    }
                    object = String.valueOf(object).concat(string2);
                }
                object4 = object;
                if (n2 != 0) {
                    object4 = String.valueOf(object);
                    object = new StringBuilder(((String)object4).length() + 33);
                    ((StringBuilder)object).append((String)object4);
                    ((StringBuilder)object).append(l4);
                    ((StringBuilder)object).append(cYh.d("473E203F382902332E3F332947"));
                    object4 = ((StringBuilder)object).toString();
                }
                object4 = String.valueOf(object4).concat(cYh.d("03352D302E73"));
            }
            if (this.isDone()) {
                throw new TimeoutException(String.valueOf(object4).concat(cYh.d("47323425773C12243423327A043F2C213B3F1335257136294724283C3235122461342F2A0E222435")));
            }
            n2 = String.valueOf(object4).length();
            object = new StringBuilder(String.valueOf(object3).length() + (n2 + 5));
            ((StringBuilder)object).append((String)object4);
            ((StringBuilder)object).append(cYh.d("47362E2377"));
            ((StringBuilder)object).append((String)object3);
            throw new TimeoutException(((StringBuilder)object).toString());
        }
        object = new InterruptedException();
        throw object;
    }

    @Override
    public boolean isCancelled() {
        return this.c instanceof b;
    }

    @Override
    public boolean isDone() {
        Object object = this.c;
        boolean bl = object != null;
        return (object instanceof g ^ true) & bl;
    }

    protected void k() {
    }

    protected void q() {
    }

    protected String r() {
        if (this instanceof ScheduledFuture) {
            long l2 = ((ScheduledFuture)((Object)this)).getDelay(TimeUnit.MILLISECONDS);
            StringBuilder stringBuilder = new StringBuilder(41);
            stringBuilder.append(cYh.d("15352C303E340E3E2671333F0B31386C0C"));
            stringBuilder.append(l2);
            stringBuilder.append(cYh.d("473D320C"));
            return stringBuilder.toString();
        }
        return null;
    }

    protected boolean t(V v2) {
        Object object = v2;
        if (v2 == null) {
            object = i;
        }
        if (h.b(this, null, object)) {
            o.m(this);
            return true;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public final String toString() {
        String string;
        StringBuilder stringBuilder;
        block13: {
            int n2;
            block16: {
                block10: {
                    Object object;
                    block11: {
                        String string2;
                        block15: {
                            void var3_5;
                            boolean bl;
                            block14: {
                                block12: {
                                    stringBuilder = new StringBuilder();
                                    object = this.getClass().getName().startsWith(cYh.d("043F2C7F303508372D347939083D2C3E39741224283D7939083E22242528023E357F")) ? this.getClass().getSimpleName() : this.getClass().getName();
                                    stringBuilder.append((String)object);
                                    stringBuilder.append('@');
                                    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
                                    stringBuilder.append(cYh.d("3C233530232F146D"));
                                    bl = this.isCancelled();
                                    string = cYh.d("3A");
                                    if (!bl) break block12;
                                    stringBuilder.append(cYh.d("24110F1212162B1505"));
                                    break block13;
                                }
                                if (!this.isDone()) break block14;
                                this.j(stringBuilder);
                                break block13;
                            }
                            n2 = stringBuilder.length();
                            stringBuilder.append(cYh.d("37150F151E1420"));
                            object = this.c;
                            bl = object instanceof g;
                            string2 = cYh.d("22282234272E0E3F2F712332153F363F773C153F2C713E37173C243C32341331353838345D70");
                            if (!bl) break block15;
                            stringBuilder.append(cYh.d("4B703234231C1224342332673C"));
                            ((g)object).getClass();
                            try {
                                stringBuilder.append((Object)null);
                                break block10;
                            }
                            catch (StackOverflowError stackOverflowError) {
                            }
                            catch (RuntimeException runtimeException) {
                                // empty catch block
                            }
                            stringBuilder.append(string2);
                            stringBuilder.append(var3_5.getClass());
                            break block10;
                        }
                        try {
                            object = s.a(this.r());
                            break block11;
                        }
                        catch (StackOverflowError stackOverflowError) {
                        }
                        catch (RuntimeException runtimeException) {
                            // empty catch block
                        }
                        object = String.valueOf(object.getClass());
                        StringBuilder stringBuilder2 = new StringBuilder(((String)object).length() + 38);
                        stringBuilder2.append(string2);
                        stringBuilder2.append((String)object);
                        object = stringBuilder2.toString();
                    }
                    if (object == null) break block16;
                    stringBuilder.append(cYh.d("4B70283F31355A0B"));
                    stringBuilder.append((String)object);
                }
                stringBuilder.append(string);
            }
            if (this.isDone()) {
                stringBuilder.delete(n2, stringBuilder.length());
                this.j(stringBuilder);
            }
        }
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    protected boolean u(Throwable object) {
        object.getClass();
        object = new d((Throwable)object);
        if (h.b(this, null, object)) {
            o.m(this);
            return true;
        }
        return false;
    }

    protected final boolean v() {
        Object object = this.c;
        boolean bl = object instanceof b && ((b)object).a;
        return bl;
    }
}

