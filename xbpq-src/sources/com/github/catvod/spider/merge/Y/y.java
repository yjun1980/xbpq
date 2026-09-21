package com.github.catvod.spider.merge.Y;

import java.util.Calendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y implements x {
    private final int a;
    private final int b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(int i, int i2) {
        if (i2 < 3) {
            throw new IllegalArgumentException();
        }
        this.a = i;
        this.b = i2;
    }

    @Override // com.github.catvod.spider.merge.Y.x
    public final void a(Appendable appendable, int i) {
        N.b(appendable, i, this.b);
    }

    @Override // com.github.catvod.spider.merge.Y.z
    public final int b() {
        return this.b;
    }

    @Override // com.github.catvod.spider.merge.Y.z
    public final void c(Appendable appendable, Calendar calendar) {
        a(appendable, calendar.get(this.a));
    }
}
