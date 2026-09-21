/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.Y.N;
import com.github.catvod.spider.merge.Y.z;
import com.github.catvod.spider.merge.cYh;
import java.util.Calendar;

final class w
implements z {
    static final w b = new w(3);
    static final w c = new w(5);
    static final w d = new w(6);
    final int a;

    w(int n2) {
        this.a = n2;
    }

    @Override
    public final int b() {
        return this.a;
    }

    @Override
    public final void c(Appendable appendable, Calendar calendar) {
        int n2 = calendar.get(15);
        n2 = calendar.get(16) + n2;
        if (n2 == 0) {
            ((StringBuilder)appendable).append((CharSequence)cYh.d("3D"));
            return;
        }
        if (n2 < 0) {
            ((StringBuilder)appendable).append('-');
            n2 = -n2;
        } else {
            ((StringBuilder)appendable).append('+');
        }
        int n3 = n2 / 3600000;
        N.a(appendable, n3);
        int n4 = this.a;
        if (n4 < 5) {
            return;
        }
        if (n4 == 6) {
            ((StringBuilder)appendable).append(':');
        }
        N.a(appendable, n2 / 60000 - n3 * 60);
    }
}

