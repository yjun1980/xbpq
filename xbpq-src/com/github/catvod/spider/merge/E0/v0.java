/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.D0;
import com.github.catvod.spider.merge.E0.F0;
import com.github.catvod.spider.merge.E0.I;
import com.github.catvod.spider.merge.E0.L;
import com.github.catvod.spider.merge.E0.d;
import java.util.List;
import java.util.RandomAccess;

final class v0 {
    private static final Class<?> a;
    private static final D0<?, ?> b;
    private static final D0<?, ?> c;
    public static final int d = 0;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object;
        block7: {
            int n2 = com.github.catvod.spider.merge.E0.d.c;
            Object var2_1 = null;
            try {
                object = Class.forName("com.google.protobuf.GeneratedMessage");
            }
            catch (Throwable throwable) {
                object = null;
            }
            a = object;
            try {
                n2 = com.github.catvod.spider.merge.E0.d.c;
            }
            catch (Throwable throwable) {
                object = var2_1;
                break block7;
            }
            try {
                object = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
            }
            catch (Throwable throwable) {
                object = null;
            }
            object = object == null ? var2_1 : (D0)((Class)object).getConstructor(new Class[0]).newInstance(new Object[0]);
        }
        b = object;
        c = new F0();
    }

    static <UT, UB> UB a(Object object, int n2, List<Integer> object2, L l2, UB UB, D0<UT, UB> d02) {
        UB UB2;
        if (l2 == null) {
            return UB;
        }
        if (object2 instanceof RandomAccess) {
            int n3 = object2.size();
            int n4 = 0;
            for (int i2 = 0; i2 < n3; ++i2) {
                int n5 = (Integer)object2.get(i2);
                if (l2.a()) {
                    if (i2 != n4) {
                        object2.set(n4, n5);
                    }
                    ++n4;
                    continue;
                }
                UB = v0.d(object, n2, n5, UB, d02);
            }
            UB2 = UB;
            if (n4 != n3) {
                object2.subList(n4, n3).clear();
                UB2 = UB;
            }
        } else {
            object2 = object2.iterator();
            while (true) {
                UB2 = UB;
                if (!object2.hasNext()) break;
                int n6 = (Integer)object2.next();
                if (l2.a()) continue;
                UB = v0.d(object, n2, n6, UB, d02);
                object2.remove();
            }
        }
        return UB2;
    }

    public static void b(Class<?> clazz) {
        if (!I.class.isAssignableFrom(clazz)) {
            int n2 = com.github.catvod.spider.merge.E0.d.c;
            Class<?> clazz2 = a;
            if (clazz2 != null && !clazz2.isAssignableFrom(clazz)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
        }
    }

    static boolean c(Object object, Object object2) {
        boolean bl = object == object2 || object != null && object.equals(object2);
        return bl;
    }

    static <UT, UB> UB d(Object object, int n2, int n3, UB UB, D0<UT, UB> d02) {
        UB UB2 = UB;
        if (UB == null) {
            UB2 = d02.b(object);
        }
        d02.a(UB2, n2, n3);
        return UB2;
    }

    public static D0<?, ?> e() {
        return b;
    }

    public static D0<?, ?> f() {
        return c;
    }
}

