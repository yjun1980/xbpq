package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
public final class c extends a {
    static {
        new c(1, 0);
    }

    public c(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // com.github.catvod.spider.merge.H.a
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (a() != cVar.a() || b() != cVar.b()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.github.catvod.spider.merge.H.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (a() * 31) + b();
    }

    @Override // com.github.catvod.spider.merge.H.a
    public final boolean isEmpty() {
        return a() > b();
    }

    @Override // com.github.catvod.spider.merge.H.a
    public final String toString() {
        return a() + cYh.d("497E") + b();
    }
}
