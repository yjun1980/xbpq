/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import java.io.PrintStream;

public final class Pt {
    private static boolean S;
    private static ut l8;

    private Pt() {
    }

    private static ut OL() {
        try {
            ut ut2 = new ut();
            return ut2;
        }
        catch (SecurityException securityException) {
            return null;
        }
    }

    private static ut S() {
        ut ut2 = l8;
        if (ut2 != null) {
            return ut2;
        }
        if (S) {
            return null;
        }
        l8 = ut2 = Pt.OL();
        S = true;
        return ut2;
    }

    public static final void T4(String string) {
        PrintStream printStream = System.err;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SLF4J: ");
        stringBuilder.append(string);
        printStream.println(stringBuilder.toString());
    }

    public static final void b(String string, Throwable throwable) {
        System.err.println(string);
        System.err.println("Reported exception:");
        throwable.printStackTrace();
    }

    public static boolean l(String string) {
        if ((string = Pt.tT(string)) == null) {
            return false;
        }
        return string.equalsIgnoreCase("true");
    }

    public static Class<?> l8() {
        int n2;
        Object object = Pt.S();
        if (object == null) {
            return null;
        }
        object = object.getClassContext();
        String string = Pt.class.getName();
        for (n2 = 0; n2 < ((Class<?>[])object).length && !string.equals(object[n2].getName()); ++n2) {
        }
        if (n2 < ((Class<?>[])object).length && (n2 += 2) < ((Class<?>[])object).length) {
            return object[n2];
        }
        object = new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        throw object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String tT(String string) {
        if (string == null) throw new IllegalArgumentException("null input");
        Object var1_2 = null;
        try {
            return System.getProperty(string);
        }
        catch (SecurityException securityException) {
            return var1_2;
        }
    }

    private static final class ut
    extends SecurityManager {
        private ut() {
        }

        @Override
        protected Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }
}

