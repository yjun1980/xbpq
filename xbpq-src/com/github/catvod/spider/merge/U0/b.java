/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.U0.a;

public class b {
    protected byte[] a;
    protected int b;
    protected boolean c;
    protected a d;

    protected b() {
    }

    public final int a() {
        return this.d.b();
    }

    public final void b() {
        byte[] byArray;
        for (int i2 = 0; i2 < (byArray = this.a).length; ++i2) {
            byArray[i2] = 0;
        }
        this.b = 0;
        this.d.reset();
    }
}

