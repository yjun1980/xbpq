package com.github.catvod.spider.merge.d0;

/* loaded from: classes.dex */
abstract class O {
    int a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        return this.a == 5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        return this.a == 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        return this.a == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        return this.a == 6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e() {
        return this.a == 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f() {
        return this.a == 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract O g();
}
