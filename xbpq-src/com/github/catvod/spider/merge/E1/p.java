/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E1;

import com.github.catvod.spider.merge.E1.G;
import com.github.catvod.spider.merge.F0.e;
import com.github.catvod.spider.merge.k1.f;
import java.util.function.Predicate;

public final class p
implements Predicate {
    public static final p b = new p(0);
    public static final p c = new p(1);
    public final int a;

    public /* synthetic */ p(int n2) {
        this.a = n2;
    }

    public final boolean test(Object object) {
        boolean bl;
        block8: {
            block7: {
                int n2 = this.a;
                boolean bl2 = false;
                bl = false;
                switch (n2) {
                    default: {
                        break;
                    }
                    case 0: {
                        if ((f)object != null) {
                            bl = true;
                        }
                        return bl;
                    }
                }
                object = (e)object;
                n2 = G.f;
                if (((e)object).i("style", "").equalsIgnoreCase("SHORTS")) break block7;
                bl = bl2;
                if (!((e)object).g("icon").i("iconType", "").toLowerCase().contains("shorts")) break block8;
            }
            bl = true;
        }
        return bl;
    }
}

