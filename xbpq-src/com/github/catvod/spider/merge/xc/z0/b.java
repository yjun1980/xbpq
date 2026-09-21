/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.z0;

import java.util.Arrays;

public final class b {
    public int a;
    public byte[] b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public int g;

    public final String toString() {
        String string = b.class.getSimpleName();
        String string2 = Arrays.toString(this.b);
        int n2 = this.f;
        boolean bl = this.e;
        int n3 = this.a;
        int n4 = this.g;
        int n5 = this.c;
        int n6 = this.d;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("[buffer=");
        stringBuilder.append(string2);
        stringBuilder.append(", currentLinePos=");
        stringBuilder.append(n2);
        stringBuilder.append(", eof=");
        stringBuilder.append(bl);
        stringBuilder.append(", ibitWorkArea=");
        stringBuilder.append(n3);
        stringBuilder.append(", lbitWorkArea=0, modulus=");
        stringBuilder.append(n4);
        stringBuilder.append(", pos=");
        stringBuilder.append(n5);
        stringBuilder.append(", readPos=");
        stringBuilder.append(n6);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

