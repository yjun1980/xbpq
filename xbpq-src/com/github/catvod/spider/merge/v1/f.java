/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.v1;

import com.github.catvod.spider.merge.F0.c;
import com.github.catvod.spider.merge.H1.q;
import com.github.catvod.spider.merge.k1.i;
import com.github.catvod.spider.merge.v1.j;
import java.util.function.Function;

public final class f
implements Function {
    public static final f a = new f();

    private /* synthetic */ f() {
    }

    public final Object apply(Object object) {
        j j2 = (j)object;
        c c2 = j2.a.b("videoSize");
        object = new q();
        ((q)object).d(j2.c.i("tech", " "));
        ((q)object).b(j2.c.i("url", null), true);
        int n2 = 0;
        ((q)object).e(false);
        Object object2 = c2.get(0);
        int n3 = object2 instanceof Number ? ((Number)object2).intValue() : 0;
        object2 = c2.get(1);
        if (object2 instanceof Number) {
            n2 = ((Number)object2).intValue();
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append(n3);
        ((StringBuilder)object2).append("x");
        ((StringBuilder)object2).append(n2);
        ((q)object).i(((StringBuilder)object2).toString());
        if ("hls".equals(j2.b)) {
            ((q)object).c(3);
        } else {
            ((q)object).h(i.b(j2.b));
        }
        return ((q)object).a();
    }
}

