package com.github.catvod.spider.merge.v;

/* renamed from: com.github.catvod.spider.merge.v.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0238b {
    /* JADX INFO: Fake field, exist only in values array */
    EF0(new int[]{0, 0, 0}, 0),
    e(new int[]{10, 12, 14}, 1),
    f(new int[]{9, 11, 13}, 2),
    /* JADX INFO: Fake field, exist only in values array */
    EF5(new int[]{0, 0, 0}, 3),
    g(new int[]{8, 16, 16}, 4),
    h(new int[]{0, 0, 0}, 7),
    i(new int[]{8, 10, 12}, 8),
    /* JADX INFO: Fake field, exist only in values array */
    EF145(new int[]{0, 0, 0}, 5),
    /* JADX INFO: Fake field, exist only in values array */
    EF163(new int[]{0, 0, 0}, 9),
    /* JADX INFO: Fake field, exist only in values array */
    EF181(new int[]{8, 10, 12}, 13);

    private final int[] c;
    private final int d;

    EnumC0238b(int[] iArr, int i2) {
        this.c = iArr;
        this.d = i2;
    }

    public final int a() {
        return this.d;
    }

    public final int b(C0241e c0241e) {
        int f2 = c0241e.f();
        return this.c[f2 <= 9 ? (char) 0 : f2 <= 26 ? (char) 1 : (char) 2];
    }
}
