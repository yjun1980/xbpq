/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Y;

import java.util.TimeZone;

final class r {
    final TimeZone a;
    final int b;

    r(TimeZone timeZone, boolean bl) {
        this.a = timeZone;
        int n2 = bl ? timeZone.getDSTSavings() : 0;
        this.b = n2;
    }
}

