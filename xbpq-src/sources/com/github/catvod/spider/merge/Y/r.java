package com.github.catvod.spider.merge.Y;

import java.util.TimeZone;

/* loaded from: classes.dex */
final class r {
    final TimeZone a;
    final int b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(TimeZone timeZone, boolean z) {
        this.a = timeZone;
        this.b = z ? timeZone.getDSTSavings() : 0;
    }
}
