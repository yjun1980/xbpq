/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g0;

import com.github.catvod.spider.merge.F0.e;
import com.github.catvod.spider.merge.L.k;
import com.github.catvod.spider.\u7f51\u76d8\u96c6\u5408;
import java.util.AbstractMap;
import java.util.function.Predicate;

public final class S
implements Predicate {
    public final int a;
    public final Object b;

    public /* synthetic */ S(Object object, int n2) {
        this.a = n2;
        this.b = object;
    }

    public final boolean test(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 2: {
                return ((String)this.b).equals((String)object);
            }
            case 1: {
                String string = (String)this.b;
                return ((AbstractMap)((e)object)).containsKey(string);
            }
            case 0: {
                String string = (String)this.b;
                object = (k)object;
                int n2 = \u7f51\u76d8\u96c6\u5408.n;
                return ((k)object).h().equals(string);
            }
        }
        return ((Class)this.b).isInstance(object);
    }
}

