/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.K0;
import com.github.catvod.spider.merge.E0.L0;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

final class J0
extends K0 {
    J0(Unsafe unsafe) {
        super(unsafe);
    }

    @Override
    public final boolean c(Object object, long l2) {
        return this.a.getBoolean(object, l2);
    }

    @Override
    public final byte d(Object object, long l2) {
        return this.a.getByte(object, l2);
    }

    @Override
    public final double e(Object object, long l2) {
        return this.a.getDouble(object, l2);
    }

    @Override
    public final float f(Object object, long l2) {
        return this.a.getFloat(object, l2);
    }

    @Override
    public final void k(Object object, long l2, boolean bl) {
        this.a.putBoolean(object, l2, bl);
    }

    @Override
    public final void l(Object object, long l2, double d2) {
        this.a.putDouble(object, l2, d2);
    }

    @Override
    public final void m(Object object, long l2, float f2) {
        this.a.putFloat(object, l2, f2);
    }

    @Override
    public final boolean q() {
        if (!super.q()) {
            return false;
        }
        try {
            Class<?> clazz = this.a.getClass();
            Class<Long> clazz2 = Long.TYPE;
            clazz.getMethod("getByte", Object.class, clazz2);
            clazz.getMethod("putByte", Object.class, clazz2, Byte.TYPE);
            clazz.getMethod("getBoolean", Object.class, clazz2);
            clazz.getMethod("putBoolean", Object.class, clazz2, Boolean.TYPE);
            clazz.getMethod("getFloat", Object.class, clazz2);
            clazz.getMethod("putFloat", Object.class, clazz2, Float.TYPE);
            clazz.getMethod("getDouble", Object.class, clazz2);
            clazz.getMethod("putDouble", Object.class, clazz2, Double.TYPE);
            return true;
        }
        catch (Throwable throwable) {
            L0.a(throwable);
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean r() {
        boolean bl;
        Object object;
        block6: {
            block5: {
                object = this.a;
                if (object == null) return false;
                try {
                    object = object.getClass();
                    ((Class)object).getMethod("objectFieldOffset", Field.class);
                    ((Class)object).getMethod("getLong", Object.class, Long.TYPE);
                    object = L0.b();
                    if (object == null) break block5;
                    bl = true;
                    break block6;
                }
                catch (Throwable throwable) {
                    L0.a(throwable);
                }
            }
            return false;
        }
        if (!bl) {
            return false;
        }
        try {
            Class<?> clazz = this.a.getClass();
            object = Long.TYPE;
            clazz.getMethod("getByte", new Class[]{object});
            clazz.getMethod("putByte", new Class[]{object, Byte.TYPE});
            clazz.getMethod("getInt", new Class[]{object});
            clazz.getMethod("putInt", new Class[]{object, Integer.TYPE});
            clazz.getMethod("getLong", new Class[]{object});
            clazz.getMethod("putLong", new Class[]{object, object});
            clazz.getMethod("copyMemory", new Class[]{object, object, object});
            clazz.getMethod("copyMemory", new Class[]{Object.class, object, Object.class, object, object});
            return true;
        }
        catch (Throwable throwable) {
            L0.a(throwable);
            return false;
        }
    }
}

