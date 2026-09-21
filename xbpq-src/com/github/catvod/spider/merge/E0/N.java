/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.q;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class N {
    static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] byArray = new byte[]{};
        b = byArray;
        ByteBuffer.wrap(byArray);
        q.c(byArray, 0, byArray.length, false);
    }

    public static int a(boolean bl) {
        int n2 = bl ? 1231 : 1237;
        return n2;
    }

    public static int b(long l2) {
        return (int)(l2 ^ l2 >>> 32);
    }
}

