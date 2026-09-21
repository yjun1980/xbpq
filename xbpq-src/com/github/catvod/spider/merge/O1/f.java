/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.O1;

import com.github.catvod.spider.merge.O1.e;
import java.io.PrintStream;

public final class f {
    private static e a;
    private static boolean b;

    private f() {
    }

    public static Class<?> a() {
        int n2;
        Object object = a;
        if (object == null) {
            if (b) {
                object = null;
            } else {
                try {
                    object = new e();
                }
                catch (SecurityException securityException) {
                    object = null;
                }
                a = object;
                b = true;
            }
        }
        if (object == null) {
            return null;
        }
        Class<?>[] classArray = ((e)object).getClassContext();
        object = f.class.getName();
        for (n2 = 0; n2 < classArray.length && !((String)object).equals(classArray[n2].getName()); ++n2) {
        }
        if (n2 < classArray.length && (n2 += 2) < classArray.length) {
            return classArray[n2];
        }
        throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
    }

    public static final void b(String string) {
        PrintStream printStream = System.err;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SLF4J: ");
        stringBuilder.append(string);
        printStream.println(stringBuilder.toString());
    }

    public static final void c(String string, Throwable throwable) {
        System.err.println(string);
        System.err.println("Reported exception:");
        throwable.printStackTrace();
    }
}

