/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Q1;

import com.github.catvod.spider.merge.Q1.c;
import java.security.MessageDigest;

public final class e
extends c {
    private final MessageDigest c;

    public e() {
        this.a = 32;
        this.b = "SHA-256";
        this.c = MessageDigest.getInstance("SHA-256");
    }

    @Override
    public final byte[] a() {
        byte[] byArray = this.c.digest();
        this.c.reset();
        return byArray;
    }

    @Override
    public final void d(byte[] byArray, int n2, int n3) {
        this.c.update(byArray, n2, n3);
    }
}

