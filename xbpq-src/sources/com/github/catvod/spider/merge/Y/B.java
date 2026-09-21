package com.github.catvod.spider.merge.Y;

import java.util.Calendar;

/* loaded from: classes.dex */
final class B implements z {
    private final int a;
    private final String[] b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B(int i, String[] strArr) {
        this.a = i;
        this.b = strArr;
    }

    @Override // com.github.catvod.spider.merge.Y.z
    public final int b() {
        int length = this.b.length;
        int i = 0;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            int length2 = this.b[length].length();
            if (length2 > i) {
                i = length2;
            }
        }
    }

    @Override // com.github.catvod.spider.merge.Y.z
    public final void c(Appendable appendable, Calendar calendar) {
        ((StringBuilder) appendable).append((CharSequence) this.b[calendar.get(this.a)]);
    }
}
