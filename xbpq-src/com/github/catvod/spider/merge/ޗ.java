/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class \u0797 {
    private byte[] \u037f;

    public \u0797(byte[] byArray) {
        this.\u037f = byArray;
    }

    public String toString() {
        if (this.\u037f.length == 0) {
            return "";
        }
        try {
            String string = new String(this.\u037f, SOY.d("3B01123F3D"));
            return string;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException();
        }
    }

    public byte[] \u037f() {
        byte[] byArray = this.\u037f;
        return Arrays.copyOf(byArray, byArray.length);
    }

    public short \u0528(int n2) {
        return (short)(this.\u037f[n2] & 0xFF);
    }

    public void \u0529(int n2, byte[] byArray) {
        int n3 = byArray.length;
        byte[] byArray2 = this.\u037f;
        byte[] byArray3 = new byte[n3 + byArray2.length];
        System.arraycopy(byArray2, 0, byArray3, 0, n2);
        System.arraycopy(byArray, 0, byArray3, n2, byArray.length);
        byArray2 = this.\u037f;
        if (n2 < byArray2.length) {
            System.arraycopy(byArray2, n2, byArray3, byArray.length + n2, byArray2.length - n2);
        }
        this.\u037f = byArray3;
    }

    public void \u052a(byte[] byArray) {
        this.\u0529(this.\u037f.length, byArray);
    }

    public int \u052b() {
        return this.\u037f.length;
    }
}

