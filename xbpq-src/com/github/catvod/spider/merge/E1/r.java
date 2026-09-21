/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E1;

import com.github.catvod.spider.merge.E1.G;
import com.github.catvod.spider.merge.E1.M;
import com.github.catvod.spider.merge.F0.e;
import java.util.function.Predicate;

public final class r
implements Predicate {
    public static final r b = new r(0);
    public static final r c = new r(1);
    public static final r d = new r(2);
    public final int a;

    public /* synthetic */ r(int n2) {
        this.a = n2;
    }

    public final boolean test(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                object = (e)object;
                int n2 = G.f;
                return "BADGE_STYLE_TYPE_MEMBERS_ONLY".equals(((e)object).g("metadataBadgeRenderer").i("style", null));
            }
            case 0: {
                return "PRIVACY_UNLISTED".equals(((e)object).g("metadataBadgeRenderer").g("icon").i("iconType", null));
            }
        }
        return M.t((e)object);
    }
}

