/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E1;

import com.github.catvod.spider.merge.F0.e;
import java.util.function.Function;

public final class v
implements Function {
    public final int a;
    public final Object b;

    public /* synthetic */ v(Object object, int n2) {
        this.a = n2;
        this.b = object;
    }

    public final Object apply(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                return (String)((Class)this.b).cast(object);
            }
        }
        String string = (String)this.b;
        return ((e)object).g(string);
    }
}

