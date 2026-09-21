/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.B1;

import com.github.catvod.spider.merge.B1.b;
import com.github.catvod.spider.merge.D1.k;
import com.github.catvod.spider.merge.F0.e;
import java.util.List;
import java.util.function.Consumer;

public final class a
implements Consumer {
    public final int a;
    public final List b;
    public final Object c;

    public /* synthetic */ a(b b2, List list) {
        this.a = 0;
        this.c = b2;
        this.b = list;
    }

    public /* synthetic */ a(List list, List list2) {
        this.a = 1;
        this.b = list;
        this.c = list2;
    }

    public final void accept(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                com.github.catvod.spider.merge.B1.b.b0((b)this.c, this.b, (e)object);
                return;
            }
        }
        k.a(this.b, (List)this.c, (e)object);
    }
}

