/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Dw;

import com.github.catvod.spider.merge.Dw.b;
import com.github.catvod.spider.merge.Dw.o;
import com.github.catvod.spider.merge.Dw.p;
import com.github.catvod.spider.merge.Em.r;
import com.github.catvod.spider.merge.ej.O;
import com.github.catvod.spider.merge.nz.a;
import java.io.Serializable;
import java.util.ArrayList;

public final class q
implements a {
    public static String b(Throwable object) {
        Object object2;
        Serializable serializable = new ArrayList<Throwable>();
        for (object2 = object; object2 != null && !((ArrayList)serializable).contains(object2); object2 = ((Throwable)object2).getCause()) {
            ((ArrayList)serializable).add(object2);
        }
        object2 = ((ArrayList)serializable).isEmpty() ? null : (Throwable)((ArrayList)serializable).get(((ArrayList)serializable).size() - 1);
        if (object2 != null) {
            object = object2;
        }
        int n2 = o.e;
        String string = o.a(object.getClass());
        object2 = ((Throwable)object).getMessage();
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append(string);
        ((StringBuilder)serializable).append(": ");
        n2 = p.a;
        object = object2;
        if (object2 == null) {
            object = "";
        }
        ((StringBuilder)serializable).append((String)object);
        return ((StringBuilder)serializable).toString();
    }

    public static void c(O o2, r r2) {
        r r3 = r2;
        int n2 = 0;
        while (r3 != null) {
            int n3;
            r r4 = r3.A();
            o2.a(r3, n2);
            r r5 = r3;
            if (r4 != null) {
                r5 = r3;
                if (!r3.q()) {
                    r5 = r4.g(r3.H());
                }
            }
            r3 = r5;
            if (r5.h() > 0) {
                r3 = r5.g(0);
                continue;
            }
            for (n3 = n2++; r3.s() == null && n3 > 0; --n3) {
                o2.b(r3, n3);
                r3 = r3.A();
            }
            o2.b(r3, n3);
            if (r3 == r2) break;
            r3 = r3.s();
            n2 = n3;
        }
    }

    @Override
    public com.github.catvod.spider.merge.nz.b a(String string) {
        return b.c;
    }
}

