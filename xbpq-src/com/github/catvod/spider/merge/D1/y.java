/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D1;

import com.github.catvod.spider.merge.D1.A;
import com.github.catvod.spider.merge.F0.e;
import java.util.function.Predicate;

public final class y
implements Predicate {
    public static final y a = new y();

    private /* synthetic */ y() {
    }

    public final boolean test(Object object) {
        object = (e)object;
        int n2 = A.j;
        boolean bl = "BADGE_STYLE_TYPE_VERIFIED".equals(object = ((e)object).g("metadataBadgeRenderer").i("style", null)) || "BADGE_STYLE_TYPE_VERIFIED_ARTIST".equals(object);
        return bl;
    }
}

