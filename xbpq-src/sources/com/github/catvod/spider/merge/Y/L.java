package com.github.catvod.spider.merge.Y;

import java.util.Calendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class L implements x {
    private final int a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public L(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.Y.x
    public final void a(Appendable appendable, int i) {
        if (i < 10) {
            ((StringBuilder) appendable).append((char) (i + 48));
        } else if (i < 100) {
            N.a(appendable, i);
        } else {
            N.b(appendable, i, 1);
        }
    }

    @Override // com.github.catvod.spider.merge.Y.z
    public final int b() {
        return 4;
    }

    @Override // com.github.catvod.spider.merge.Y.z
    public final void c(Appendable appendable, Calendar calendar) {
        a(appendable, calendar.get(this.a));
    }
}
