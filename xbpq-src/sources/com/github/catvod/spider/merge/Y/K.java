package com.github.catvod.spider.merge.Y;

import java.util.Calendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class K implements x {
    static final K a = new K();

    K() {
    }

    @Override // com.github.catvod.spider.merge.Y.x
    public final void a(Appendable appendable, int i) {
        if (i >= 10) {
            N.a(appendable, i);
        } else {
            ((StringBuilder) appendable).append((char) (i + 48));
        }
    }

    @Override // com.github.catvod.spider.merge.Y.z
    public final int b() {
        return 2;
    }

    @Override // com.github.catvod.spider.merge.Y.z
    public final void c(Appendable appendable, Calendar calendar) {
        a(appendable, calendar.get(2) + 1);
    }
}
