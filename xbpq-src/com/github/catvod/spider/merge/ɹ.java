/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import java.io.PrintStream;

public final class \u0279 {
    private static \u0528 \u037f;
    private static boolean \u0528;

    private \u0279() {
    }

    public static Class<?> \u037f() {
        int n2;
        Object object = \u0279.\u0528();
        if (object == null) {
            return null;
        }
        Class<?>[] classArray = ((\u0528)object).getClassContext();
        object = \u0279.class.getName();
        for (n2 = 0; n2 < classArray.length && !((String)object).equals(classArray[n2].getName()); ++n2) {
        }
        if (n2 < classArray.length && (n2 += 2) < classArray.length) {
            return classArray[n2];
        }
        object = new IllegalStateException(SOY.d("3C33381A11135A263E56121E14367119061054213D10401D543A341A041208217F23001E16723E04541E0E217115151B163723561D195A26391354040E33321D4F570E3A38055404123D241A1057143D25561C160A223418"));
        throw object;
    }

    private static \u0528 \u0528() {
        \u0528 \u0529 = \u037f;
        if (\u0529 != null) {
            return \u0529;
        }
        if (\u0528) {
            return null;
        }
        \u037f = \u0529 = \u0279.\u052b();
        \u0528 = true;
        return \u0529;
    }

    public static final void \u0529(String string) {
        PrintStream printStream = System.err;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(SOY.d("291E17423E4D5A"));
        stringBuilder.append(string);
        printStream.println(stringBuilder.toString());
    }

    public static final void \u052a(String string, Throwable throwable) {
        System.err.println(string);
        System.err.println(SOY.d("2837211906031F3671130C141F22251F1B1940"));
        throwable.printStackTrace();
    }

    private static \u0528 \u052b() {
        try {
            \u0528 \u0529 = new \u0528();
            return \u0529;
        }
        catch (SecurityException securityException) {
            return null;
        }
    }

    public static boolean \u052c(String string) {
        if ((string = \u0279.\u052d(string)) == null) {
            return false;
        }
        return string.equalsIgnoreCase(SOY.d("0E202413"));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String \u052d(String string) {
        if (string == null) throw new IllegalArgumentException(SOY.d("14273D1A541E14222402"));
        Object var1_2 = null;
        try {
            return System.getProperty(string);
        }
        catch (SecurityException securityException) {
            return var1_2;
        }
    }

    private static final class \u0528
    extends SecurityManager {
        private \u0528() {
        }

        @Override
        protected Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }
}

