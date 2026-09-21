package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.cYh;
import java.util.Calendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class w implements z {
    static final w b = new w(3);
    static final w c = new w(5);
    static final w d = new w(6);
    final int a;

    w(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.Y.z
    public final int b() {
        return this.a;
    }

    @Override // com.github.catvod.spider.merge.Y.z
    public final void c(Appendable appendable, Calendar calendar) {
        int i = calendar.get(16) + calendar.get(15);
        if (i == 0) {
            ((StringBuilder) appendable).append((CharSequence) cYh.d("3D"));
            return;
        }
        if (i < 0) {
            ((StringBuilder) appendable).append('-');
            i = -i;
        } else {
            ((StringBuilder) appendable).append('+');
        }
        int i2 = i / 3600000;
        N.a(appendable, i2);
        int i3 = this.a;
        if (i3 < 5) {
            return;
        }
        if (i3 == 6) {
            ((StringBuilder) appendable).append(':');
        }
        N.a(appendable, (i / 60000) - (i2 * 60));
    }
}
