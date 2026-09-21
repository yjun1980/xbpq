/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.B0;

import com.github.catvod.spider.merge.xc.B0.u;
import java.util.Calendar;

public final class w
implements u {
    public final int a;
    public final String[] b;

    public w(String[] stringArray, int n2) {
        this.a = n2;
        this.b = stringArray;
    }

    @Override
    public final void a(StringBuilder stringBuilder, Calendar calendar) {
        int n2 = calendar.get(this.a);
        stringBuilder.append((CharSequence)this.b[n2]);
    }

    @Override
    public final int c() {
        int n2;
        String[] stringArray = this.b;
        int n3 = stringArray.length;
        int n4 = 0;
        while ((n2 = n3 - 1) >= 0) {
            int n5 = stringArray[n2].length();
            n3 = n2;
            if (n5 <= n4) continue;
            n4 = n5;
            n3 = n2;
        }
        return n4;
    }
}

