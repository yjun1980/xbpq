/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Q1;

import com.github.catvod.spider.merge.Q1.c;
import java.util.zip.CRC32;

public final class a
extends c {
    private final CRC32 c = new CRC32();

    public a() {
        this.a = 4;
        this.b = "CRC32";
    }

    @Override
    public final byte[] a() {
        long l2 = this.c.getValue();
        byte by = (byte)l2;
        byte by2 = (byte)(l2 >>> 8);
        byte by3 = (byte)(l2 >>> 16);
        byte by4 = (byte)(l2 >>> 24);
        this.c.reset();
        return new byte[]{by, by2, by3, by4};
    }

    @Override
    public final void d(byte[] byArray, int n2, int n3) {
        this.c.update(byArray, n2, n3);
    }
}

