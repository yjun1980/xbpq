/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.I0;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public final class a {
    private byte[] a;

    public a(byte[] byArray) {
        this.a = byArray;
    }

    public final byte[] a() {
        byte[] byArray = this.a;
        return Arrays.copyOf(byArray, byArray.length);
    }

    public final short b() {
        return (short)(this.a[0] & 0xFF);
    }

    public final void c(int n2, byte[] byArray) {
        int n3 = byArray.length;
        byte[] byArray2 = this.a;
        byte[] byArray3 = new byte[n3 + byArray2.length];
        System.arraycopy(byArray2, 0, byArray3, 0, n2);
        System.arraycopy(byArray, 0, byArray3, n2, byArray.length);
        byArray2 = this.a;
        if (n2 < byArray2.length) {
            System.arraycopy(byArray2, n2, byArray3, byArray.length + n2, byArray2.length - n2);
        }
        this.a = byArray3;
    }

    public final void d(byte[] byArray) {
        this.c(this.a.length, byArray);
    }

    public final int e() {
        return this.a.length;
    }

    public final String toString() {
        Object object = this.a;
        if (((byte[])object).length == 0) {
            return "";
        }
        try {
            object = new String((byte[])object, "ASCII");
            return object;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException();
        }
    }
}

