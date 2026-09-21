/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.O;
import com.github.catvod.spider.merge.E0.q;

final class p
extends q {
    private final byte[] b;
    private final boolean c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h = Integer.MAX_VALUE;

    p(byte[] byArray, int n2, int n3, boolean bl) {
        super(null);
        this.b = byArray;
        this.d = n3 + n2;
        this.f = n2;
        this.g = n2;
        this.c = bl;
    }

    private void e() {
        int n2;
        this.d = n2 = this.d + this.e;
        int n3 = n2 - this.g;
        int n4 = this.h;
        if (n3 > n4) {
            this.e = n3 -= n4;
            this.d = n2 - n3;
        } else {
            this.e = 0;
        }
    }

    public final int d(int n2) {
        if (n2 >= 0) {
            if ((n2 = this.f - this.g + n2) >= 0) {
                int n3 = this.h;
                if (n2 <= n3) {
                    this.h = n2;
                    this.e();
                    return n3;
                }
                throw O.g();
            }
            throw new O("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        throw O.c();
    }
}

