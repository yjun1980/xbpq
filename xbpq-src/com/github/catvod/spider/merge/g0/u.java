/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g0;

import com.github.catvod.spider.merge.B0.f;
import com.github.catvod.spider.merge.q1.c;
import java.util.List;
import java.util.function.Consumer;

public final class u
implements Consumer {
    public final int a;
    public final Object b;

    public /* synthetic */ u(Object object, int n2) {
        this.a = n2;
        this.b = object;
    }

    public final void accept(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                ((List)this.b).add((f)object);
                return;
            }
        }
        ((c)this.b).d((com.github.catvod.spider.merge.s1.f)object);
    }
}

