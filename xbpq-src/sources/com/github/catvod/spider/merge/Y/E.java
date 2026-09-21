package com.github.catvod.spider.merge.Y;

import java.util.Calendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class E implements z {
    static final E b = new E(true);
    static final E c = new E(false);
    final boolean a;

    E(boolean z) {
        this.a = z;
    }

    @Override // com.github.catvod.spider.merge.Y.z
    public final int b() {
        return 5;
    }

    @Override // com.github.catvod.spider.merge.Y.z
    public final void c(Appendable appendable, Calendar calendar) {
        int i = calendar.get(16) + calendar.get(15);
        if (i < 0) {
            ((StringBuilder) appendable).append('-');
            i = -i;
        } else {
            ((StringBuilder) appendable).append('+');
        }
        int i2 = i / 3600000;
        N.a(appendable, i2);
        if (this.a) {
            ((StringBuilder) appendable).append(':');
        }
        N.a(appendable, (i / 60000) - (i2 * 60));
    }
}
