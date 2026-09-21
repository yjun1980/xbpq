/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.x;

import com.github.catvod.spider.merge.D.a;
import com.github.catvod.spider.merge.E.f;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.x.c;
import com.github.catvod.spider.merge.x.i;
import java.io.Serializable;

final class h<T>
implements c<T>,
Serializable {
    private a<? extends T> c;
    private volatile Object d;
    private final Object e;

    public h(a a2) {
        this.c = a2;
        this.d = i.a;
        this.e = this;
    }

    @Override
    public final T getValue() {
        a<T> a2 = this.d;
        i i2 = i.a;
        if (a2 != i2) {
            return (T)a2;
        }
        Object object = this.e;
        synchronized (object) {
            block5: {
                a2 = this.d;
                if (a2 != i2) break block5;
                a2 = this.c;
                f.b(a2);
                a2.a();
                this.d = null;
                this.c = null;
                a2 = null;
            }
            return (T)a2;
        }
    }

    public final String toString() {
        boolean bl = this.d != i.a;
        String string = bl ? String.valueOf(this.getValue()) : cYh.d("2B313B28772C063C343477340824613839331339203D3E2002346128322E49");
        return string;
    }
}

