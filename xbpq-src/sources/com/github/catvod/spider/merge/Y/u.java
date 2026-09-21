package com.github.catvod.spider.merge.Y;

import java.util.Calendar;

/* loaded from: classes.dex */
final class u implements z {
    private final char a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(char c) {
        this.a = c;
    }

    @Override // com.github.catvod.spider.merge.Y.z
    public final int b() {
        return 1;
    }

    @Override // com.github.catvod.spider.merge.Y.z
    public final void c(Appendable appendable, Calendar calendar) {
        ((StringBuilder) appendable).append(this.a);
    }
}
