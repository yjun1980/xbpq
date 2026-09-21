package com.github.catvod.spider.merge.l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.l.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0183q implements Iterator<String> {
    private String b;
    final CharSequence c;
    final AbstractC0173g d;
    final boolean e;
    int g;
    private int a = 2;
    int f = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0183q(C0184r c0184r, CharSequence charSequence) {
        AbstractC0173g abstractC0173g;
        boolean z;
        int i;
        abstractC0173g = c0184r.a;
        this.d = abstractC0173g;
        z = c0184r.b;
        this.e = z;
        i = c0184r.d;
        this.g = i;
        this.c = charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        if (r3 >= r4) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        if (r9.d.b(r9.c.charAt(r3)) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        if (r4 <= r3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0066, code lost:
    
        r8 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        if (r9.d.b(r9.c.charAt(r8)) == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        r4 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007a, code lost:
    
        if (r9.e == false) goto L51;
     */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean hasNext() {
        /*
            r9 = this;
            int r0 = r9.a
            r1 = 0
            r2 = 1
            r3 = 4
            if (r0 == r3) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            com.github.catvod.spider.merge.l.C0179m.f(r0)
            int r0 = r9.a
            int r0 = com.github.catvod.spider.merge.l.C0167a.a(r0)
            if (r0 == 0) goto Lba
            r4 = 2
            if (r0 == r4) goto Lb9
            r0 = 3
            r9.a = r3
        L1b:
            int r3 = r9.f
        L1d:
            int r4 = r9.f
            r5 = -1
            if (r4 == r5) goto Lad
            r6 = r9
            com.github.catvod.spider.merge.l.n r6 = (com.github.catvod.spider.merge.l.C0180n) r6
            com.github.catvod.spider.merge.l.o r7 = r6.h
            com.github.catvod.spider.merge.l.g r7 = r7.a
            java.lang.CharSequence r6 = r6.c
            int r4 = r7.a(r6, r4)
            if (r4 != r5) goto L3a
            java.lang.CharSequence r4 = r9.c
            int r4 = r4.length()
            r9.f = r5
            goto L3e
        L3a:
            int r6 = r4 + 1
            r9.f = r6
        L3e:
            int r6 = r9.f
            if (r6 != r3) goto L51
            int r6 = r6 + 1
            r9.f = r6
            java.lang.CharSequence r4 = r9.c
            int r4 = r4.length()
            if (r6 <= r4) goto L1d
            r9.f = r5
            goto L1d
        L51:
            if (r3 >= r4) goto L64
            com.github.catvod.spider.merge.l.g r6 = r9.d
            java.lang.CharSequence r7 = r9.c
            char r7 = r7.charAt(r3)
            boolean r6 = r6.b(r7)
            if (r6 == 0) goto L64
            int r3 = r3 + 1
            goto L51
        L64:
            if (r4 <= r3) goto L78
            com.github.catvod.spider.merge.l.g r6 = r9.d
            java.lang.CharSequence r7 = r9.c
            int r8 = r4 + (-1)
            char r7 = r7.charAt(r8)
            boolean r6 = r6.b(r7)
            if (r6 == 0) goto L78
            r4 = r8
            goto L64
        L78:
            boolean r6 = r9.e
            if (r6 == 0) goto L7f
            if (r3 != r4) goto L7f
            goto L1b
        L7f:
            int r6 = r9.g
            if (r6 != r2) goto L9f
            java.lang.CharSequence r4 = r9.c
            int r4 = r4.length()
            r9.f = r5
        L8b:
            if (r4 <= r3) goto La2
            com.github.catvod.spider.merge.l.g r5 = r9.d
            java.lang.CharSequence r6 = r9.c
            int r7 = r4 + (-1)
            char r6 = r6.charAt(r7)
            boolean r5 = r5.b(r6)
            if (r5 == 0) goto La2
            r4 = r7
            goto L8b
        L9f:
            int r6 = r6 - r2
            r9.g = r6
        La2:
            java.lang.CharSequence r5 = r9.c
            java.lang.CharSequence r3 = r5.subSequence(r3, r4)
            java.lang.String r3 = r3.toString()
            goto Lb0
        Lad:
            r9.a = r0
            r3 = 0
        Lb0:
            r9.b = r3
            int r3 = r9.a
            if (r3 == r0) goto Lb9
            r9.a = r2
            r1 = 1
        Lb9:
            r2 = r1
        Lba:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.l.AbstractC0183q.hasNext():boolean");
    }

    @Override // java.util.Iterator
    public final String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = 2;
        String str = this.b;
        this.b = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
