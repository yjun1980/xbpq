package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
public final class B {
    private int a;
    private String b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B(int i, String str) {
        this.a = i;
        this.b = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public B(int i, String str, Object... objArr) {
        this.b = String.format(str, objArr);
        this.a = i;
    }

    public final String toString() {
        return this.a + cYh.d("5D70") + this.b;
    }
}
