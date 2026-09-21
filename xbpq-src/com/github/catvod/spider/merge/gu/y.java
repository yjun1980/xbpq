/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.spider.merge.gu.a
 */
package com.github.catvod.spider.merge.gu;

import com.github.catvod.spider.merge.Dw.k;
import com.github.catvod.spider.merge.Nx.f;
import com.github.catvod.spider.merge.gu.B;
import com.github.catvod.spider.merge.gu.a;
import com.github.catvod.spider.merge.gu.w;
import com.github.catvod.spider.merge.gu.z;
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
        throw new NullPointerException("delegates");
    }

    public final void a(B<?, ?> b2, Object object, int n2, int n3, String string, z z2) {
        Iterator<? extends a> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(b2, object, n2, n3, string, z2);
        }
    }

    public final void b(w w2, k k2, int n2, int n3, BitSet bitSet, f f2) {
        Iterator<? extends a> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().b(w2, k2, n2, n3, bitSet, f2);
        }
    }

    public final void c(w w2, k k2, int n2, int n3, BitSet bitSet, f f2) {
        Iterator<? extends a> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().c(w2, k2, n2, n3, bitSet, f2);
        }
    }

    public final void d(w w2, k k2, int n2, int n3, int n4, f f2) {
        Iterator<? extends a> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().d(w2, k2, n2, n3, n4, f2);
        }
    }
}

