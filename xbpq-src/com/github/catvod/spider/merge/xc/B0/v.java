/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.B0;

import com.github.catvod.spider.merge.xc.B0.u;
import java.util.Calendar;

public final class v
implements u {
    public final String a;

    public v(String string) {
        this.a = string;
    }

    @Override
    public final void a(StringBuilder stringBuilder, Calendar calendar) {
        stringBuilder.append((CharSequence)this.a);
    }

    @Override
    public final int c() {
        return this.a.length();
    }
}

