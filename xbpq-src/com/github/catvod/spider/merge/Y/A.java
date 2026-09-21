/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.Y.z;
import java.util.Calendar;

final class A
implements z {
    private final String a;

    A(String string) {
        this.a = string;
    }

    @Override
    public final int b() {
        return this.a.length();
    }

    @Override
    public final void c(Appendable appendable, Calendar object) {
        object = this.a;
        ((StringBuilder)appendable).append((CharSequence)object);
    }
}

