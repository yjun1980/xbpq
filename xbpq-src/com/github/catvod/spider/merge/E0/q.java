/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.O;
import com.github.catvod.spider.merge.E0.o;
import com.github.catvod.spider.merge.E0.p;

public abstract class q {
    int a = 100;

    private q() {
    }

    /* synthetic */ q(o o2) {
        this();
    }

    public static int a(int n2) {
        return -(n2 & 1) ^ n2 >>> 1;
    }

    public static long b(long l2) {
        return -(l2 & 1L) ^ l2 >>> 1;
    }

    static q c(byte[] object, int n2, int n3, boolean bl) {
        object = new p((byte[])object, n2, n3, bl);
        try {
            ((p)object).d(n3);
            return object;
        }
        catch (O o2) {
            throw new IllegalArgumentException(o2);
        }
    }
}

