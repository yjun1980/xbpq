/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.Y.z;
import java.util.Calendar;

final class B
implements z {
    private final int a;
    private final String[] b;

    B(int n2, String[] stringArray) {
        this.a = n2;
        this.b = stringArray;
    }

    @Override
    public final int b() {
        int n2;
        int n3 = this.b.length;
        int n4 = 0;
        while ((n2 = n3 - 1) >= 0) {
            int n5 = this.b[n2].length();
            n3 = n2;
            if (n5 <= n4) continue;
            n4 = n5;
            n3 = n2;
        }
        return n4;
    }

    @Override
    public final void c(Appendable appendable, Calendar object) {
        object = this.b[((Calendar)object).get(this.a)];
        ((StringBuilder)appendable).append((CharSequence)object);
    }
}

