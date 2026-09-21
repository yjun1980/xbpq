/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.P;

import com.github.catvod.spider.merge.P.B;
import com.github.catvod.spider.merge.P.a;
import com.github.catvod.spider.merge.P.w;
import com.github.catvod.spider.merge.P.z;
import com.github.catvod.spider.merge.Q.f;
import com.github.catvod.spider.merge.R.b;
import com.github.catvod.spider.merge.cYh;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;

public final class y
implements a {
    private final Collection<? extends a> a;

    public y(Collection<? extends a> collection) {
        if (collection != null) {
            this.a = collection;
            return;
        }
        throw new NullPointerException(cYh.d("03352D34303B133532"));
    }

    @Override
    public final void a(B<?, ?> b2, Object object, int n2, int n3, String string, z z2) {
        Iterator<? extends a> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(b2, object, n2, n3, string, z2);
        }
    }

    @Override
    public final void b(w w2, b b2, int n2, int n3, BitSet bitSet, f f2) {
        Iterator<? extends a> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().b(w2, b2, n2, n3, bitSet, f2);
        }
    }

    @Override
    public final void c(w w2, b b2, int n2, int n3, BitSet bitSet, f f2) {
        Iterator<? extends a> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().c(w2, b2, n2, n3, bitSet, f2);
        }
    }

    @Override
    public final void d(w w2, b b2, int n2, int n3, int n4, f f2) {
        Iterator<? extends a> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().d(w2, b2, n2, n3, n4, f2);
        }
    }
}

