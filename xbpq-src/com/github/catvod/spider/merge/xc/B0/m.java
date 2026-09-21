/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.B0;

import java.util.TimeZone;

public final class m {
    public final TimeZone a;
    public final int b;

    public m(TimeZone timeZone, boolean bl) {
        this.a = timeZone;
        int n2 = bl ? timeZone.getDSTSavings() : 0;
        this.b = n2;
    }
}

