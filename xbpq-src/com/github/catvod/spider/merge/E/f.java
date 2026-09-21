/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E;

import com.github.catvod.spider.merge.b.n;
import com.github.catvod.spider.merge.cYh;
import java.util.Arrays;

public final class f {
    private f() {
    }

    public static boolean a(Object object, Object object2) {
        boolean bl = object == null ? object2 == null : object.equals(object2);
        return bl;
    }

    public static void b(Object object) {
        if (object != null) {
            return;
        }
        object = new NullPointerException();
        f.g(object);
        throw object;
    }

    public static void c(Object object, String string) {
        if (object != null) {
            return;
        }
        object = new NullPointerException(string);
        f.g(object);
        throw object;
    }

    public static void d(Object object, String string) {
        if (object != null) {
            return;
        }
        object = new NullPointerException(n.a(string, cYh.d("473D3422237A093F3571353F473E343D3B")));
        f.g(object);
        throw object;
    }

    public static void e(Object object, String string) {
        if (object != null) {
            return;
        }
        Object object2 = Thread.currentThread().getStackTrace()[4];
        object = ((StackTraceElement)object2).getClassName();
        object2 = ((StackTraceElement)object2).getMethodName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(cYh.d("373133303A3F13353371242A023328373E3F037020227734083E6C3F22360B7028227734123C2D6B77370224293E337A"));
        stringBuilder.append((String)object);
        stringBuilder.append(cYh.d("49"));
        stringBuilder.append((String)object2);
        stringBuilder.append(cYh.d("4B703130253B0A353534257A"));
        stringBuilder.append(string);
        object = new NullPointerException(stringBuilder.toString());
        f.g(object);
        throw object;
    }

    public static int f(int n2, int n3) {
        n2 = n2 < n3 ? -1 : (n2 == n3 ? 0 : 1);
        return n2;
    }

    private static <T extends Throwable> T g(T t2) {
        String string = f.class.getName();
        StackTraceElement[] stackTraceElementArray = t2.getStackTrace();
        int n2 = stackTraceElementArray.length;
        int n3 = -1;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!string.equals(stackTraceElementArray[i2].getClassName())) continue;
            n3 = i2;
        }
        t2.setStackTrace(Arrays.copyOfRange(stackTraceElementArray, n3 + 1, n2));
        return t2;
    }
}

