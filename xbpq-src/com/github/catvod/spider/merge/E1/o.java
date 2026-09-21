/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E1;

import com.github.catvod.spider.merge.E1.G;
import com.github.catvod.spider.merge.F0.e;
import com.github.catvod.spider.merge.K1.p;
import java.util.function.Predicate;

public final class o
implements Predicate {
    public static final o b = new o(0);
    public static final o c = new o(1);
    public final int a;

    public /* synthetic */ o(int n2) {
        this.a = n2;
    }

    public final boolean test(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                return p.l((e)object) ^ true;
            }
        }
        object = (e)object;
        int n2 = G.f;
        return "LIVE".equals(((e)object).g("thumbnailOverlayTimeStatusRenderer").i("style", null));
    }
}

