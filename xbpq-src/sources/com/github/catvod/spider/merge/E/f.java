package com.github.catvod.spider.merge.E;

import com.github.catvod.spider.merge.b.n;
import com.github.catvod.spider.merge.cYh;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f {
    private f() {
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        g(nullPointerException);
        throw nullPointerException;
    }

    public static void c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        g(nullPointerException);
        throw nullPointerException;
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(n.a(str, cYh.d("473D3422237A093F3571353F473E343D3B")));
        g(nullPointerException);
        throw nullPointerException;
    }

    public static void e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        NullPointerException nullPointerException = new NullPointerException(cYh.d("373133303A3F13353371242A023328373E3F037020227734083E6C3F22360B7028227734123C2D6B77370224293E337A") + stackTraceElement.getClassName() + cYh.d("49") + stackTraceElement.getMethodName() + cYh.d("4B703130253B0A353534257A") + str);
        g(nullPointerException);
        throw nullPointerException;
    }

    public static int f(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends Throwable> T g(T t) {
        String name = f.class.getName();
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (name.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }
}
