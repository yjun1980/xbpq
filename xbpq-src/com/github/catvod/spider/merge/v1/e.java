/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.v1;

import com.github.catvod.spider.merge.H1.a;
import com.github.catvod.spider.merge.k1.i;
import com.github.catvod.spider.merge.v1.j;
import java.util.function.Function;

public final class e
implements Function {
    public static final e a = new e();

    private /* synthetic */ e() {
    }

    public final Object apply(Object object) {
        object = (j)object;
        a a2 = new a();
        a2.u(((j)object).c.i("tech", " "));
        a2.s(((j)object).c.i("url", null), true);
        a2.r(-1);
        if ("hls".equals(((j)object).b)) {
            a2.t(3);
        } else {
            a2.x(i.b(((j)object).b));
        }
        return a2.m();
    }
}

