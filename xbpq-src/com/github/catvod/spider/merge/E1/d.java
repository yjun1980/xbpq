/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E1;

import com.github.catvod.spider.merge.E1.G;
import com.github.catvod.spider.merge.F0.e;
import java.util.AbstractMap;
import java.util.function.Predicate;

public final class d
implements Predicate {
    public static final d b = new d(0);
    public static final d c = new d(1);
    public static final d d = new d(2);
    public static final d e = new d(3);
    public final int a;

    public /* synthetic */ d(int n2) {
        this.a = n2;
    }

    public final boolean test(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 2: {
                object = (e)object;
                int n2 = G.f;
                object = ((e)object).g("metadataBadgeRenderer");
                boolean bl = "BADGE_STYLE_TYPE_LIVE_NOW".equals(((e)object).i("style", null)) || "LIVE NOW".equals(((e)object).i("label", null));
                return bl;
            }
            case 1: {
                return "engagement-panel-macro-markers-description-chapters".equals(((e)object).g("engagementPanelSectionListRenderer").i("panelIdentifier", null));
            }
            case 0: {
                return ((AbstractMap)((e)object)).containsKey("thumbnailOverlayBadgeViewModel");
            }
        }
        object = (e)object;
        int n3 = G.f;
        return "Premium".equals(((e)object).g("metadataBadgeRenderer").i("label", null));
    }
}

