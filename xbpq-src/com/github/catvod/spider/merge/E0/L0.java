/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.G0;
import com.github.catvod.spider.merge.E0.H0;
import com.github.catvod.spider.merge.E0.I0;
import com.github.catvod.spider.merge.E0.J0;
import com.github.catvod.spider.merge.E0.K0;
import com.github.catvod.spider.merge.E0.d;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class L0 {
    private static final Unsafe a;
    private static final Class<?> b;
    private static final K0 c;
    private static final boolean d;
    private static final boolean e;
    static final long f;
    static final boolean g;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block6: {
            block7: {
                var2 = L0.s();
                L0.a = var2;
                L0.b = com.github.catvod.spider.merge.E0.d.a();
                var0_1 = L0.k(Long.TYPE);
                var1_2 = L0.k(Integer.TYPE);
                if (var2 == null) ** GOTO lbl-1000
                if (!com.github.catvod.spider.merge.E0.d.b()) break block7;
                if (var0_1) {
                    var2 = new I0((Unsafe)var2);
                    break block6;
                } else if (var1_2) {
                    var2 = new H0((Unsafe)var2);
                    break block6;
                } else lbl-1000:
                // 2 sources

                {
                    var2 = null;
                }
                break block6;
            }
            var2 = new J0((Unsafe)var2);
        }
        L0.c = var2;
        var1_2 = false;
        var0_1 = var2 == null ? false : var2.r();
        L0.d = var0_1;
        var0_1 = var2 == null ? false : var2.q();
        L0.e = var0_1;
        L0.f = L0.h(byte[].class);
        L0.h(boolean[].class);
        L0.i(boolean[].class);
        L0.h(int[].class);
        L0.i(int[].class);
        L0.h(long[].class);
        L0.i(long[].class);
        L0.h(float[].class);
        L0.i(float[].class);
        L0.h(double[].class);
        L0.i(double[].class);
        L0.h(Object[].class);
        L0.i(Object[].class);
        var3_3 = L0.j();
        if (var3_3 != null && var2 != null) {
            var2.j(var3_3);
        }
        var0_1 = var1_2;
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            var0_1 = true;
        }
        L0.g = var0_1;
    }

    private L0() {
    }

    static void A(Object object, long l2, int n2) {
        c.n(object, l2, n2);
    }

    static void B(Object object, long l2, long l3) {
        c.o(object, l2, l3);
    }

    static void C(Object object, long l2, Object object2) {
        c.p(object, l2, object2);
    }

    static void a(Throwable throwable) {
        Logger logger = Logger.getLogger(L0.class.getName());
        Level level = Level.WARNING;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("platform method missing - proto runtime falling back to safer methods: ");
        stringBuilder.append(throwable);
        logger.log(level, stringBuilder.toString());
    }

    static /* synthetic */ Field b() {
        return L0.j();
    }

    static boolean c(Object object, long l2) {
        boolean bl = (byte)(L0.p(object, 0xFFFFFFFFFFFFFFFCL & l2) >>> (int)(((l2 ^ 0xFFFFFFFFFFFFFFFFL) & 3L) << 3) & 0xFF) != 0;
        return bl;
    }

    static boolean d(Object object, long l2) {
        boolean bl = (byte)(L0.p(object, 0xFFFFFFFFFFFFFFFCL & l2) >>> (int)((l2 & 3L) << 3) & 0xFF) != 0;
        return bl;
    }

    static void e(Object object, long l2, boolean bl) {
        L0.w(object, l2, (byte)(bl ? 1 : 0));
    }

    static void f(Object object, long l2, boolean bl) {
        L0.x(object, l2, (byte)(bl ? 1 : 0));
    }

    static <T> T g(Class<T> object) {
        try {
            object = a.allocateInstance((Class<?>)object);
        }
        catch (InstantiationException instantiationException) {
            throw new IllegalStateException(instantiationException);
        }
        return (T)object;
    }

    private static int h(Class<?> clazz) {
        int n2 = e ? c.a(clazz) : -1;
        return n2;
    }

    private static int i(Class<?> clazz) {
        int n2 = e ? c.b(clazz) : -1;
        return n2;
    }

    private static Field j() {
        Field field;
        boolean bl = com.github.catvod.spider.merge.E0.d.b();
        Field field2 = null;
        if (bl) {
            try {
                field = Buffer.class.getDeclaredField("effectiveDirectAddress");
            }
            catch (Throwable throwable) {
                field = null;
            }
            if (field != null) {
                return field;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        }
        catch (Throwable throwable) {
            field = null;
        }
        Field field3 = field2;
        if (field != null) {
            field3 = field2;
            if (field.getType() == Long.TYPE) {
                field3 = field;
            }
        }
        return field3;
    }

    static boolean k(Class<?> clazz) {
        if (!com.github.catvod.spider.merge.E0.d.b()) {
            return false;
        }
        try {
            Class<?> clazz2 = b;
            Class<Boolean> clazz3 = Boolean.TYPE;
            clazz2.getMethod("peekLong", clazz, clazz3);
            clazz2.getMethod("pokeLong", clazz, Long.TYPE, clazz3);
            Class<Integer> clazz4 = Integer.TYPE;
            clazz2.getMethod("pokeInt", clazz, clazz4, clazz3);
            clazz2.getMethod("peekInt", clazz, clazz3);
            clazz2.getMethod("pokeByte", clazz, Byte.TYPE);
            clazz2.getMethod("peekByte", clazz);
            clazz2.getMethod("pokeByteArray", clazz, byte[].class, clazz4, clazz4);
            clazz2.getMethod("peekByteArray", clazz, byte[].class, clazz4, clazz4);
            return true;
        }
        catch (Throwable throwable) {
            return false;
        }
    }

    static boolean l(Object object, long l2) {
        return c.c(object, l2);
    }

    static byte m(byte[] byArray, long l2) {
        return c.d(byArray, f + l2);
    }

    static double n(Object object, long l2) {
        return c.e(object, l2);
    }

    static float o(Object object, long l2) {
        return c.f(object, l2);
    }

    static int p(Object object, long l2) {
        return c.g(object, l2);
    }

    static long q(Object object, long l2) {
        return c.h(object, l2);
    }

    static Object r(Object object, long l2) {
        return c.i(object, l2);
    }

    static Unsafe s() {
        Object object;
        try {
            object = new G0();
            object = AccessController.doPrivileged(object);
        }
        catch (Throwable throwable) {
            object = null;
        }
        return object;
    }

    static boolean t() {
        return e;
    }

    static boolean u() {
        return d;
    }

    static void v(Object object, long l2, boolean bl) {
        c.k(object, l2, bl);
    }

    private static void w(Object object, long l2, byte by) {
        long l3 = 0xFFFFFFFFFFFFFFFCL & l2;
        int n2 = L0.p(object, l3);
        int n3 = (~((int)l2) & 3) << 3;
        L0.A(object, l3, (0xFF & by) << n3 | n2 & ~(255 << n3));
    }

    private static void x(Object object, long l2, byte by) {
        long l3 = 0xFFFFFFFFFFFFFFFCL & l2;
        int n2 = L0.p(object, l3);
        int n3 = ((int)l2 & 3) << 3;
        L0.A(object, l3, (0xFF & by) << n3 | n2 & ~(255 << n3));
    }

    static void y(Object object, long l2, double d2) {
        c.l(object, l2, d2);
    }

    static void z(Object object, long l2, float f2) {
        c.m(object, l2, f2);
    }
}

