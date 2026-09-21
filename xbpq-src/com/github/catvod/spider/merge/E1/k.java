/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E1;

import com.github.catvod.spider.merge.E1.M;
import com.github.catvod.spider.merge.F0.e;
import java.util.function.Function;

public final class k
implements Function {
    public static final k b = new k(0);
    public static final k c = new k(1);
    public static final k d = new k(2);
    public final int a;

    public /* synthetic */ k(int n2) {
        this.a = n2;
    }

    public final Object apply(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                object = (e)object;
                int n2 = M.i;
                return ((e)object).g("badgeViewModel").i("badgeStyle", null);
            }
            case 0: {
                return ((e)object).i("text", "");
            }
        }
        return ((e)object).g("listItemViewModel");
    }
}

