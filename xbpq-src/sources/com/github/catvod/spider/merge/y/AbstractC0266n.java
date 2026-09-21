package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.cYh;
import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge.y.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0266n implements Iterator<Integer> {
    public abstract int a();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException(cYh.d("28202423362E0E3F2F713E29473E2E2577291220313E252E023461373828472224303377083E2D287739083C2D34342E0E3F2F"));
    }
}
