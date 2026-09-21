/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.K;

import com.github.catvod.spider.merge.H.c;
import com.github.catvod.spider.merge.K.b;
import com.github.catvod.spider.merge.cYh;

public final class a
extends b {
    public static int b(int n2) {
        Object object = new c(2, 36);
        boolean bl = ((com.github.catvod.spider.merge.H.a)object).a() <= n2 && n2 <= ((com.github.catvod.spider.merge.H.a)object).b();
        if (bl) {
            return n2;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(cYh.d("153125382F7A"));
        ((StringBuilder)object).append(n2);
        ((StringBuilder)object).append(cYh.d("47272022773408246138397A11312D38337A15312F36327A"));
        ((StringBuilder)object).append(new c(2, 36));
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }
}

