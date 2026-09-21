/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E1;

import com.github.catvod.spider.merge.E1.G;
import com.github.catvod.spider.merge.F0.e;
import com.github.catvod.spider.merge.K1.p;
import java.util.AbstractMap;
import java.util.function.Predicate;

public final class q
implements Predicate {
    public static final q b = new q(0);
    public static final q c = new q(1);
    public static final q d = new q(2);
    public final int a;

    public /* synthetic */ q(int n2) {
        this.a = n2;
    }

    public final boolean test(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                object = (String)object;
                boolean bl = !p.j((String)object) && ((String)object).contains("private");
                return bl;
            }
            case 0: {
                return ((String)object).contains("Age-restricted");
            }
        }
        object = (e)object;
        int n2 = G.f;
        return ((AbstractMap)object).containsKey("thumbnailOverlayTimeStatusRenderer");
    }
}

