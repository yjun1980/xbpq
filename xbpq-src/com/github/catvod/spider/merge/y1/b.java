/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y1;

import com.github.catvod.spider.merge.F0.e;
import com.github.catvod.spider.merge.H1.q;
import com.github.catvod.spider.merge.k1.i;
import java.util.function.Function;

public final class b
implements Function {
    public static final b a = new b();

    private /* synthetic */ b() {
    }

    public final Object apply(Object object) {
        e e2 = (e)object;
        object = new q();
        ((q)object).d(String.valueOf(e2.e("id", -1)));
        ((q)object).b(e2.i("playlistUrl", ""), true);
        ((q)object).e(false);
        ((q)object).i("");
        ((q)object).h(i.d);
        ((q)object).c(3);
        return ((q)object).a();
    }
}

