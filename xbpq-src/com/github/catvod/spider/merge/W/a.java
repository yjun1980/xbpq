/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.W;

import com.github.catvod.spider.merge.U.b;
import com.github.catvod.spider.merge.U.h;
import com.github.catvod.spider.merge.c0.r;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.O;
import java.io.Serializable;
import java.util.ArrayList;

public final class a
implements com.github.catvod.spider.merge.n0.a {
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
        int n2 = b.e;
        String string = b.a(object.getClass());
        object2 = ((Throwable)object).getMessage();
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append(string);
        ((StringBuilder)serializable).append(cYh.d("5D70"));
        n2 = h.a;
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
    public com.github.catvod.spider.merge.n0.b a(String string) {
        return com.github.catvod.spider.merge.p0.b.c;
    }
}

