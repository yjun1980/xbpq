/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.C;
import com.github.catvod.spider.merge.E0.C0;
import com.github.catvod.spider.merge.E0.E0;
import com.github.catvod.spider.merge.E0.H;
import com.github.catvod.spider.merge.E0.L0;
import com.github.catvod.spider.merge.E0.M;
import com.github.catvod.spider.merge.E0.O;
import com.github.catvod.spider.merge.E0.b;
import com.github.catvod.spider.merge.E0.e;
import com.github.catvod.spider.merge.E0.i0;
import com.github.catvod.spider.merge.E0.j0;
import com.github.catvod.spider.merge.E0.l0;
import com.github.catvod.spider.merge.E0.r0;
import com.github.catvod.spider.merge.E0.s0;
import com.github.catvod.spider.merge.E0.t0;
import com.github.catvod.spider.merge.E0.u;
import com.github.catvod.spider.merge.E0.u0;
import com.github.catvod.spider.merge.I.r;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public abstract class I<MessageType extends I<MessageType, BuilderType>, BuilderType extends C<MessageType, BuilderType>>
extends b<MessageType, BuilderType> {
    private static Map<Class<?>, I<?, ?>> d = new ConcurrentHashMap();
    private int b = -1;
    protected E0 c = E0.b();

    static /* synthetic */ boolean e(I i2) {
        return I.k(i2, false);
    }

    protected static <E> M<E> g() {
        return s0.c();
    }

    static <T extends I<?, ?>> T h(Class<T> clazz) {
        I i2;
        I i4 = i2 = (I)((ConcurrentHashMap)d).get(clazz);
        if (i2 == null) {
            try {
                Class.forName(clazz.getName(), true, clazz.getClassLoader());
            }
            catch (ClassNotFoundException classNotFoundException) {
                throw new IllegalStateException("Class initialization cannot fail.", classNotFoundException);
            }
            i4 = (I)((ConcurrentHashMap)d).get(clazz);
        }
        i2 = i4;
        if (i4 == null) {
            i2 = ((I)L0.g(clazz)).i();
            if (i2 != null) {
                ((ConcurrentHashMap)d).put(clazz, i2);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T)i2;
    }

    static Object j(Method object, Object object2, Object ... objectArray) {
        try {
            object = ((Method)object).invoke(object2, objectArray);
            return object;
        }
        catch (InvocationTargetException invocationTargetException) {
            Throwable throwable = invocationTargetException.getCause();
            if (!(throwable instanceof RuntimeException)) {
                if (throwable instanceof Error) {
                    throw (Error)throwable;
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", throwable);
            }
            throw (RuntimeException)throwable;
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", illegalAccessException);
        }
    }

    private static final <T extends I<T, ?>> boolean k(T t2, boolean bl) {
        byte by = (Byte)t2.f(H.a);
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        r0 r02 = r0.a();
        Objects.requireNonNull(r02);
        boolean bl2 = r02.b(t2.getClass()).b(t2);
        if (bl) {
            t2.f(H.b);
        }
        return bl2;
    }

    protected static Object p(j0 j02, String string, Object[] objectArray) {
        return new t0(j02, string, objectArray);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected static <T extends I<T, ?>> T r(T t2, byte[] object) {
        int n2 = ((Object)object).length;
        u u2 = u.b();
        if (n2 != 0) {
            t2 = t2.q();
            try {
                u0<T> u02 = r0.a().c(t2);
                e e2 = new e(u2);
                u02.c(t2, (byte[])object, 0, n2 + 0, e2);
                u02.f(t2);
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                O o2 = O.g();
                o2.f(t2);
                throw o2;
            }
            catch (IOException iOException) {
                if (iOException.getCause() instanceof O) {
                    throw (O)iOException.getCause();
                }
                O o3 = new O(iOException);
                o3.f(t2);
                throw o3;
            }
            catch (C0 c02) {
                O o4 = c02.a();
                o4.f(t2);
                throw o4;
            }
            catch (O o5) {
                o5.f(t2);
                throw o5;
            }
        }
        if (t2 == null) return t2;
        if (I.k(t2, true)) {
            return t2;
        }
        object = new C0().a();
        ((O)object).f(t2);
        throw object;
    }

    protected static <T extends I<?, ?>> void s(Class<T> clazz, T t2) {
        t2.n();
        ((ConcurrentHashMap)d).put(clazz, t2);
    }

    @Override
    public i0 c() {
        C c2 = (C)this.f(H.e);
        c2.g(this);
        return c2;
    }

    @Override
    public final boolean d() {
        return I.k(this, true);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        r0 r02 = r0.a();
        Objects.requireNonNull(r02);
        return r02.b(this.getClass()).d(this, (I)object);
    }

    protected abstract Object f(H var1);

    public final int hashCode() {
        if (this.l()) {
            r0 r02 = r0.a();
            Objects.requireNonNull(r02);
            return r02.b(this.getClass()).g(this);
        }
        boolean bl = this.a == 0;
        if (bl) {
            r0 r03 = r0.a();
            Objects.requireNonNull(r03);
            this.a = r03.b(this.getClass()).g(this);
        }
        return this.a;
    }

    public final MessageType i() {
        return (MessageType)((I)this.f(H.f));
    }

    final boolean l() {
        boolean bl = (this.b & Integer.MIN_VALUE) != 0;
        return bl;
    }

    protected final void m() {
        r0 r02 = r0.a();
        Objects.requireNonNull(r02);
        r02.b(this.getClass()).f(this);
        this.n();
    }

    final void n() {
        this.b &= Integer.MAX_VALUE;
    }

    public final BuilderType o() {
        return (BuilderType)((C)this.f(H.e));
    }

    final MessageType q() {
        return (MessageType)((I)this.f(H.d));
    }

    final void t(int n2) {
        if (n2 >= 0) {
            this.b = n2 & Integer.MAX_VALUE | this.b & Integer.MIN_VALUE;
            return;
        }
        throw new IllegalStateException(r.a("serialized size must be non-negative, was ", n2));
    }

    public final String toString() {
        return l0.d(this, super.toString());
    }
}

