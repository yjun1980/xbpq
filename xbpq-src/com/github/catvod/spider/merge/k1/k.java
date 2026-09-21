/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.k1;

import com.github.catvod.spider.merge.k1.e;
import com.github.catvod.spider.merge.k1.f;
import com.github.catvod.spider.merge.k1.g;
import com.github.catvod.spider.merge.l1.b;
import com.github.catvod.spider.merge.q1.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class k
extends g<e, f> {
    private final c e;
    private final com.github.catvod.spider.merge.l1.c f;
    private final c g;

    public k(int n2) {
        super(n2);
        this.e = new c(n2, 1);
        this.f = new com.github.catvod.spider.merge.l1.c(n2);
        this.g = new c(n2, 0);
    }

    @Override
    public final Object a(Object object) {
        block5: {
            block3: {
                block4: {
                    block2: {
                        if (!((object = (f)object) instanceof com.github.catvod.spider.merge.H1.k)) break block2;
                        object = this.e.i((com.github.catvod.spider.merge.H1.k)object);
                        break block3;
                    }
                    if (!(object instanceof b)) break block4;
                    object = this.f.h((b)object);
                    break block3;
                }
                if (!(object instanceof com.github.catvod.spider.merge.q1.b)) break block5;
                object = this.g.j((com.github.catvod.spider.merge.q1.b)object);
            }
            return object;
        }
        throw new IllegalArgumentException(com.github.catvod.spider.merge.B.e.c("Invalid extractor type: ", String.valueOf(object)));
    }

    @Override
    public final List<Throwable> e() {
        ArrayList<Throwable> arrayList = new ArrayList<Throwable>(super.e());
        arrayList.addAll(this.e.e());
        arrayList.addAll(this.f.e());
        arrayList.addAll(this.g.e());
        return Collections.unmodifiableList(arrayList);
    }
}

