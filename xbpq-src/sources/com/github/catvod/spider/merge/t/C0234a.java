package com.github.catvod.spider.merge.t;

import com.github.catvod.spider.merge.cYh;

/* renamed from: com.github.catvod.spider.merge.t.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0234a {
    public static final C0234a g = new C0234a(4201, 4096, 1);
    public static final C0234a h = new C0234a(1033, 1024, 1);
    public static final C0234a i = new C0234a(67, 64, 1);
    public static final C0234a j = new C0234a(19, 16, 1);
    public static final C0234a k = new C0234a(285, 256, 0);
    public static final C0234a l = new C0234a(301, 256, 1);
    private final int[] a;
    private final int[] b;
    private final C0235b c;
    private final int d;
    private final int e;
    private final int f;

    public C0234a(int i2, int i3, int i4) {
        this.e = i2;
        this.d = i3;
        this.f = i4;
        this.a = new int[i3];
        this.b = new int[i3];
        int i5 = 1;
        for (int i6 = 0; i6 < i3; i6++) {
            this.a[i6] = i5;
            i5 <<= 1;
            if (i5 >= i3) {
                i5 = (i5 ^ i2) & (i3 - 1);
            }
        }
        for (int i7 = 0; i7 < i3 - 1; i7++) {
            this.b[this.a[i7]] = i7;
        }
        this.c = new C0235b(this, new int[]{0});
        new C0235b(this, new int[]{1});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C0235b a(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        if (i3 == 0) {
            return this.c;
        }
        int[] iArr = new int[i2 + 1];
        iArr[0] = i3;
        return new C0235b(this, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(int i2) {
        return this.a[i2];
    }

    public final int c() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C0235b d() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int e(int i2) {
        if (i2 != 0) {
            return this.a[(this.d - this.b[i2]) - 1];
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int f(int i2) {
        if (i2 != 0) {
            return this.b[i2];
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int g(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return 0;
        }
        int[] iArr = this.a;
        int[] iArr2 = this.b;
        return iArr[(iArr2[i2] + iArr2[i3]) % (this.d - 1)];
    }

    public final String toString() {
        return cYh.d("201669612F") + Integer.toHexString(this.e) + ',' + this.d + ')';
    }
}
