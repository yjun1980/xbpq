package com.github.catvod.spider.merge.Y;

import java.util.Calendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class J implements x {
    static final J a = new J();

    J() {
    }

    @Override // com.github.catvod.spider.merge.Y.x
    public final void a(Appendable appendable, int i) {
        N.a(appendable, i % 100);
    }

    @Override // com.github.catvod.spider.merge.Y.z
    public final int b() {
        return 2;
    }

    @Override // com.github.catvod.spider.merge.Y.z
    public final void c(Appendable appendable, Calendar calendar) {
        a(appendable, calendar.get(1) % 100);
    }
}
