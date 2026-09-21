/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.L0;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

abstract class K0 {
    Unsafe a;

    K0(Unsafe unsafe) {
        this.a = unsafe;
    }

    public final int a(Class<?> clazz) {
        return this.a.arrayBaseOffset(clazz);
    }

    public final int b(Class<?> clazz) {
        return this.a.arrayIndexScale(clazz);
    }

    public abstract boolean c(Object var1, long var2);

    public abstract byte d(Object var1, long var2);

    public abstract double e(Object var1, long var2);

    public abstract float f(Object var1, long var2);

    public final int g(Object object, long l2) {
        return this.a.getInt(object, l2);
    }

    public final long h(Object object, long l2) {
        return this.a.getLong(object, l2);
    }

    public final Object i(Object object, long l2) {
        return this.a.getObject(object, l2);
    }

    public final long j(Field field) {
        return this.a.objectFieldOffset(field);
    }

    public abstract void k(Object var1, long var2, boolean var4);

    public abstract void l(Object var1, long var2, double var4);

    public abstract void m(Object var1, long var2, float var4);

    public final void n(Object object, long l2, int n2) {
        this.a.putInt(object, l2, n2);
    }

    public final void o(Object object, long l2, long l3) {
        this.a.putLong(object, l2, l3);
    }

    public final void p(Object object, long l2, Object object2) {
        this.a.putObject(object, l2, object2);
    }

    public boolean q() {
        Object object = this.a;
        if (object == null) {
            return false;
        }
        try {
            Class<?> clazz = object.getClass();
            clazz.getMethod("objectFieldOffset", Field.class);
            clazz.getMethod("arrayBaseOffset", Class.class);
            clazz.getMethod("arrayIndexScale", Class.class);
            object = Long.TYPE;
            clazz.getMethod("getInt", new Class[]{Object.class, object});
            clazz.getMethod("putInt", new Class[]{Object.class, object, Integer.TYPE});
            clazz.getMethod("getLong", new Class[]{Object.class, object});
            clazz.getMethod("putLong", new Class[]{Object.class, object, object});
            clazz.getMethod("getObject", new Class[]{Object.class, object});
            clazz.getMethod("putObject", new Class[]{Object.class, object, Object.class});
            return true;
        }
        catch (Throwable throwable) {
            L0.a(throwable);
            return false;
        }
    }

    public abstract boolean r();
}

