package com.github.catvod.spider.merge.p0;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
public final class f {
    private static e a;
    private static boolean b;

    private f() {
    }

    public static Class<?> a() {
        int i;
        e eVar = a;
        if (eVar == null) {
            if (b) {
                eVar = null;
            } else {
                try {
                    eVar = new e();
                } catch (SecurityException unused) {
                    eVar = null;
                }
                a = eVar;
                b = true;
            }
        }
        if (eVar == null) {
            return null;
        }
        Class<?>[] classContext = eVar.getClassContext();
        String name = f.class.getName();
        int i2 = 0;
        while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
            i2++;
        }
        if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
            throw new IllegalStateException(cYh.d("2131283D323E47242E7131330934613E253D49232D3763304938243D273F15236F0423330B702E2377331323613236360B3533713E344724293477291331223A6C7A1338282277290F3F343D337A093F35713F3B1720243F"));
        }
        return classContext[i];
    }

    public static final void b(String str) {
        System.err.println(cYh.d("341C07651D6047") + str);
    }

    public static final void c(String str, Throwable th) {
        System.err.println(str);
        System.err.println(cYh.d("3535313E252E023461342F390220353838345D"));
        th.printStackTrace();
    }
}
