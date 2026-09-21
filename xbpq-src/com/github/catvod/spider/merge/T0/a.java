/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.T0;

import com.github.catvod.spider.merge.T0.b;
import java.io.Writer;

@Deprecated
public final class a
extends b {
    private final b[] b;

    public a(b ... bArray) {
        this.b = (b[])((Object[])bArray.clone());
    }

    @Override
    public final int a(CharSequence charSequence, int n2, Writer writer) {
        b[] bArray = this.b;
        int n3 = bArray.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4 = bArray[i2].a(charSequence, n2, writer);
            if (n4 == 0) continue;
            return n4;
        }
        return 0;
    }
}

