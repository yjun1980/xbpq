package com.github.catvod.spider.merge.v;

/* renamed from: com.github.catvod.spider.merge.v.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0240d {
    private final int a;
    private final C0239c[] b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0240d(int i, C0239c... c0239cArr) {
        this.a = i;
        this.b = c0239cArr;
    }

    public final C0239c[] a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final int c() {
        int i = 0;
        for (C0239c c0239c : this.b) {
            i += c0239c.a();
        }
        return i;
    }

    public final int d() {
        int i = this.a;
        int i2 = 0;
        for (C0239c c0239c : this.b) {
            i2 += c0239c.a();
        }
        return i * i2;
    }
}
