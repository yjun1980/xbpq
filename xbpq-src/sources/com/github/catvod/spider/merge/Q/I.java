package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
public final class I implements C {
    private final int a;

    public I(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.Q.C
    public final void a(com.github.catvod.spider.merge.P.s sVar) {
        sVar.o = this.a;
    }

    @Override // com.github.catvod.spider.merge.Q.C
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof I) && this.a == ((I) obj).a;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.N.a.b(com.github.catvod.spider.merge.N.a.o(com.github.catvod.spider.merge.N.a.o(0, 2), this.a), 2);
    }

    public final String toString() {
        return String.format(cYh.d("0A3F25347F7F0379"), Integer.valueOf(this.a));
    }
}
