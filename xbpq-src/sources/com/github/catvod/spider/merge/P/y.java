package com.github.catvod.spider.merge.P;

import com.github.catvod.spider.merge.Q.C0015f;
import com.github.catvod.spider.merge.cYh;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class y implements InterfaceC0000a {
    private final Collection<? extends InterfaceC0000a> a;

    public y(Collection<? extends InterfaceC0000a> collection) {
        if (collection == null) {
            throw new NullPointerException(cYh.d("03352D34303B133532"));
        }
        this.a = collection;
    }

    @Override // com.github.catvod.spider.merge.P.InterfaceC0000a
    public final void a(B<?, ?> b, Object obj, int i, int i2, String str, z zVar) {
        Iterator<? extends InterfaceC0000a> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a(b, obj, i, i2, str, zVar);
        }
    }

    @Override // com.github.catvod.spider.merge.P.InterfaceC0000a
    public final void b(w wVar, com.github.catvod.spider.merge.R.b bVar, int i, int i2, BitSet bitSet, C0015f c0015f) {
        Iterator<? extends InterfaceC0000a> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().b(wVar, bVar, i, i2, bitSet, c0015f);
        }
    }

    @Override // com.github.catvod.spider.merge.P.InterfaceC0000a
    public final void c(w wVar, com.github.catvod.spider.merge.R.b bVar, int i, int i2, BitSet bitSet, C0015f c0015f) {
        Iterator<? extends InterfaceC0000a> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().c(wVar, bVar, i, i2, bitSet, c0015f);
        }
    }

    @Override // com.github.catvod.spider.merge.P.InterfaceC0000a
    public final void d(w wVar, com.github.catvod.spider.merge.R.b bVar, int i, int i2, int i3, C0015f c0015f) {
        Iterator<? extends InterfaceC0000a> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().d(wVar, bVar, i, i2, i3, c0015f);
        }
    }
}
