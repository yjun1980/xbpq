package com.github.catvod.spider.merge.x;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0059d;
import java.io.Serializable;

/* renamed from: com.github.catvod.spider.merge.x.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0248f implements Serializable {
    public final Throwable c;

    public C0248f(Throwable th) {
        this.c = th;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0248f) && com.github.catvod.spider.merge.E.f.a(this.c, ((C0248f) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        StringBuilder b = C0059d.b(cYh.d("2131283D22280278"));
        b.append(this.c);
        b.append(')');
        return b.toString();
    }
}
