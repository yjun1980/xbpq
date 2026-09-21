/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.v1;

import com.github.catvod.spider.merge.D1.A;
import com.github.catvod.spider.merge.F0.e;
import java.util.AbstractMap;
import java.util.function.Predicate;

public final class g
implements Predicate {
    public final int a;
    public final String b;

    public /* synthetic */ g(String string, int n2) {
        this.a = n2;
        this.b = string;
    }

    public final boolean test(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                String string = this.b;
                return ((AbstractMap)((e)object)).containsKey(string);
            }
        }
        String string = this.b;
        object = (e)object;
        int n2 = A.j;
        return ((e)object).i("key", "").equals(string);
    }
}

