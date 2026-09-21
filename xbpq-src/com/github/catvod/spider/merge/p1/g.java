/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.p1;

import com.github.catvod.spider.merge.p1.j;
import java.util.function.Predicate;

public final class g
implements Predicate {
    public final j a;
    public final String b;

    public /* synthetic */ g(j j2, String string) {
        this.a = j2;
        this.b = string;
    }

    public final boolean test(Object object) {
        return j.a(this.a, this.b, (String)object);
    }
}

