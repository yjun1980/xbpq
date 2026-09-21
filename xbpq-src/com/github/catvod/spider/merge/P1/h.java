/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.P1;

import com.github.catvod.spider.merge.P1.a;
import com.github.catvod.spider.merge.P1.i;
import com.github.catvod.spider.merge.P1.j;
import com.github.catvod.spider.merge.P1.k;
import com.github.catvod.spider.merge.P1.r;
import java.io.InputStream;

final class h
implements k,
j {
    private final int a;

    h(byte[] byArray) {
        if (byArray.length == 1) {
            this.a = (byArray[0] & 0xFF) + 1;
            return;
        }
        throw new r("Unsupported Delta filter properties");
    }

    @Override
    public final InputStream b(InputStream inputStream, a a2) {
        return new i(inputStream, this.a);
    }

    @Override
    public final int e() {
        return 1;
    }
}

