/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.k1;

import com.github.catvod.spider.merge.F0.e;
import com.github.catvod.spider.merge.k1.i;
import java.util.function.Predicate;

public final class h
implements Predicate {
    public final int a;
    public final String b;

    public /* synthetic */ h(String string, int n2) {
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
                return ((i)((Object)object)).b.equals(string);
            }
        }
        return this.b.equals(((e)object).i("type", null));
    }
}

