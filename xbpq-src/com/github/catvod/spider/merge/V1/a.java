/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.V1;

abstract class a {
    private final int a;
    private final int b;

    a(int n2, int n3) {
        this.a = n2;
        this.b = (1 << n3) - 1;
    }

    final int a(int n2, int n3) {
        int n4 = this.a;
        return (n2 >> 8 - n4) + ((n3 & this.b) << n4);
    }
}

