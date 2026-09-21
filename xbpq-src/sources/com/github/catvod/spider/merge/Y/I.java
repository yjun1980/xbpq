package com.github.catvod.spider.merge.Y;

import java.util.Calendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class I implements x {
    private final int a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public I(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.Y.x
    public final void a(Appendable appendable, int i) {
        if (i < 100) {
            N.a(appendable, i);
        } else {
            N.b(appendable, i, 2);
        }
    }

    @Override // com.github.catvod.spider.merge.Y.z
    public final int b() {
        return 2;
    }

    @Override // com.github.catvod.spider.merge.Y.z
    public final void c(Appendable appendable, Calendar calendar) {
        a(appendable, calendar.get(this.a));
    }
}
