package com.github.catvod.spider.merge.Y;

import java.util.Calendar;

/* loaded from: classes.dex */
final class A implements z {
    private final String a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A(String str) {
        this.a = str;
    }

    @Override // com.github.catvod.spider.merge.Y.z
    public final int b() {
        return this.a.length();
    }

    @Override // com.github.catvod.spider.merge.Y.z
    public final void c(Appendable appendable, Calendar calendar) {
        ((StringBuilder) appendable).append((CharSequence) this.a);
    }
}
