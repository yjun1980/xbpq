package com.github.catvod.spider.merge.t;

import com.github.catvod.spider.merge.cYh;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.t.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0236c {
    private final C0234a a;
    private final List<C0235b> b;

    public C0236c(C0234a c0234a) {
        this.a = c0234a;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(new C0235b(c0234a, new int[]{1}));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<com.github.catvod.spider.merge.t.b>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List<com.github.catvod.spider.merge.t.b>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List<com.github.catvod.spider.merge.t.b>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List<com.github.catvod.spider.merge.t.b>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List<com.github.catvod.spider.merge.t.b>, java.util.ArrayList] */
    public final void a(int[] iArr, int i) {
        if (i == 0) {
            throw new IllegalArgumentException(cYh.d("293F61342528082261323828153522253E3509702328233F14"));
        }
        int length = iArr.length - i;
        if (length <= 0) {
            throw new IllegalArgumentException(cYh.d("293F6135362E06702328233F14703123382C0E342435"));
        }
        if (i >= this.b.size()) {
            ?? r1 = this.b;
            C0235b c0235b = (C0235b) r1.get(r1.size() - 1);
            for (int size = this.b.size(); size <= i; size++) {
                C0234a c0234a = this.a;
                c0235b = c0235b.f(new C0235b(c0234a, new int[]{1, c0234a.b(c0234a.c() + (size - 1))}));
                this.b.add(c0235b);
            }
        }
        C0235b c0235b2 = (C0235b) this.b.get(i);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] d = new C0235b(this.a, iArr2).g(i, 1).b(c0235b2)[1].d();
        int length2 = i - d.length;
        for (int i2 = 0; i2 < length2; i2++) {
            iArr[length + i2] = 0;
        }
        System.arraycopy(d, 0, iArr, length + length2, d.length);
    }
}
