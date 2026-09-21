/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E1;

import com.github.catvod.spider.merge.k1.f;
import com.github.catvod.spider.merge.k1.k;
import java.util.List;
import java.util.function.Consumer;

public final class h
implements Consumer {
    public final int a;
    public final Object b;

    public /* synthetic */ h(Object object, int n2) {
        this.a = n2;
        this.b = object;
    }

    public final void accept(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                ((k)this.b).d((f)object);
                return;
            }
        }
        List list = (List)this.b;
        object = (com.github.catvod.spider.merge.H1.f)object;
        if (!com.github.catvod.spider.merge.H1.f.a((com.github.catvod.spider.merge.H1.f)object, list)) {
            list.add(object);
        }
    }
}

