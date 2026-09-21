/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D1;

import java.util.function.Function;

public final class f
implements Function {
    public final int a;
    public final Object b;

    public /* synthetic */ f(Object object, int n2) {
        this.a = n2;
        this.b = object;
    }

    public final Object apply(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                String string = (String)this.b;
                object = (String)object;
                return string;
            }
        }
        return (String)((Class)this.b).cast(object);
    }
}

