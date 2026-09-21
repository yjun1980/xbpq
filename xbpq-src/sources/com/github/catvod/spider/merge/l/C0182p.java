package com.github.catvod.spider.merge.l;

import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge.l.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0182p implements Iterable<String> {
    final /* synthetic */ CharSequence c;
    final /* synthetic */ C0184r d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0182p(C0184r c0184r, CharSequence charSequence) {
        this.d = c0184r;
        this.c = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return C0184r.a(this.d, this.c);
    }

    public final String toString() {
        C0174h b = C0174h.b();
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        StringBuilder a = b.a(sb, this);
        a.append(']');
        return a.toString();
    }
}
