/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E1;

import com.github.catvod.spider.merge.E1.G;
import com.github.catvod.spider.merge.F0.e;
import com.github.catvod.spider.merge.K1.p;
import java.util.AbstractMap;
import java.util.function.Predicate;

public final class n
implements Predicate {
    public static final n b = new n(0);
    public static final n c = new n(1);
    public final int a;

    public /* synthetic */ n(int n2) {
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
        return ((AbstractMap)object).containsKey("thumbnailOverlayTimeStatusRenderer");
    }
}

