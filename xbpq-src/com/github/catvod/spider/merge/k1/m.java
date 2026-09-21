/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.k1;

import com.github.catvod.spider.merge.A1.b;
import com.github.catvod.spider.merge.D1.B;
import com.github.catvod.spider.merge.k1.p;
import com.github.catvod.spider.merge.r1.a;
import com.github.catvod.spider.merge.x1.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class m {
    public static final b a;
    public static final c b;
    private static final List<p> c;

    static {
        c c2;
        b b2;
        B b3 = new B();
        a = b2 = new b();
        com.github.catvod.spider.merge.u1.a a2 = new com.github.catvod.spider.merge.u1.a();
        b = c2 = new c();
        a a3 = new a();
        ArrayList<Object> arrayList = new ArrayList<Object>(5);
        for (int i2 = 0; i2 < 5; ++i2) {
            Object object = (new Object[]{b3, b2, a2, c2, a3})[i2];
            Objects.requireNonNull(object);
            arrayList.add(object);
        }
        c = Collections.unmodifiableList(arrayList);
    }

    public static List<p> a() {
        return c;
    }
}

