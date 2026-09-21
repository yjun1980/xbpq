/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.p0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.p0.e;
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
        object = object.getClassContext();
        String string = f.class.getName();
        for (n2 = 0; n2 < ((Class<?>[])object).length && !string.equals(object[n2].getName()); ++n2) {
        }
        if (n2 < ((Class<?>[])object).length && (n2 += 2) < ((Class<?>[])object).length) {
            return object[n2];
        }
        object = new IllegalStateException(cYh.d("2131283D323E47242E7131330934613E253D49232D3763304938243D273F15236F0423330B702E2377331323613236360B3533713E344724293477291331223A6C7A1338282277290F3F343D337A093F35713F3B1720243F"));
        throw object;
    }

    public static final void b(String string) {
        PrintStream printStream = System.err;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(cYh.d("341C07651D6047"));
        stringBuilder.append(string);
        printStream.println(stringBuilder.toString());
    }

    public static final void c(String string, Throwable throwable) {
        System.err.println(string);
        System.err.println(cYh.d("3535313E252E023461342F390220353838345D"));
        throwable.printStackTrace();
    }
}

