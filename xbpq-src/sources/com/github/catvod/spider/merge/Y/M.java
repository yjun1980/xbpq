package com.github.catvod.spider.merge.Y;

import java.util.Calendar;

/* loaded from: classes.dex */
final class M implements x {
    private final x a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public M(x xVar) {
        this.a = xVar;
    }

    @Override // com.github.catvod.spider.merge.Y.x
    public final void a(Appendable appendable, int i) {
        this.a.a(appendable, i);
    }

    @Override // com.github.catvod.spider.merge.Y.z
    public final int b() {
        return this.a.b();
    }

    @Override // com.github.catvod.spider.merge.Y.z
    public final void c(Appendable appendable, Calendar calendar) {
        this.a.a(appendable, calendar.getWeekYear());
    }
}
