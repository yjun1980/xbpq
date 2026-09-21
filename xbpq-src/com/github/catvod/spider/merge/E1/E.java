/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E1;

import com.github.catvod.spider.merge.E1.G;
import com.github.catvod.spider.merge.E1.M;
import com.github.catvod.spider.merge.F0.e;
import java.util.function.Function;

public final class E
implements Function {
    public static final E b = new E(0);
    public static final E c = new E(1);
    public final int a;

    public /* synthetic */ E(int n2) {
        this.a = n2;
    }

    public final Object apply(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                object = (e)object;
                int n2 = G.f;
                return ((e)object).g("thumbnailOverlayTimeStatusRenderer");
            }
        }
        object = (e)object;
        int n3 = M.i;
        return ((e)object).g("thumbnailOverlayBadgeViewModel").b("thumbnailBadges").c();
    }
}

