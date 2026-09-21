/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.I;

import com.github.catvod.spider.merge.I.X;
import com.github.catvod.spider.merge.I.f1;
import com.github.catvod.spider.merge.I.u;
import com.github.catvod.spider.merge.L.c;
import com.github.catvod.spider.merge.f0.d;
import java.util.Objects;

public final class f
implements Runnable {
    public final int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ f(Object object, Object object2, int n2) {
        this.a = n2;
        this.b = object;
        this.c = object2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                X.j((X)this.b, (String)this.c);
                return;
            }
            case 0: {
                u.b((u)this.b, (c)this.c);
                return;
            }
        }
        f1 f12 = (f1)this.b;
        String string = (String)this.c;
        Objects.requireNonNull(f12);
        String string2 = string;
        if (string.startsWith("http")) {
            string2 = d.k(string);
        }
        f12.l(string2, true);
    }
}

