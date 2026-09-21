/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E1;

import com.github.catvod.spider.merge.E1.M;
import com.github.catvod.spider.merge.F0.e;
import java.util.AbstractMap;
import java.util.function.Predicate;

public final class c
implements Predicate {
    public static final c b = new c(0);
    public static final c c = new c(1);
    public final int a;

    public /* synthetic */ c(int n2) {
        this.a = n2;
    }

    public final boolean test(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                return ((AbstractMap)((e)object)).containsKey("thumbnailBadgeViewModel");
            }
        }
        object = (e)object;
        int n2 = M.i;
        return "THUMBNAIL_OVERLAY_BADGE_STYLE_LIVE".equals(((e)object).i("badgeStyle", null));
    }
}

