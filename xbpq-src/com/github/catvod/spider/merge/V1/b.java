/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.V1;

import com.github.catvod.spider.merge.V1.g;

abstract class b {
    final int a;
    final int[] b = new int[4];
    final g c = new g();
    final short[][] d = new short[12][16];
    final short[] e = new short[12];
    final short[] f = new short[12];
    final short[] g = new short[12];
    final short[] h = new short[12];
    final short[][] i = new short[12][16];
    final short[][] j = new short[4][64];
    final short[][] k = new short[][]{new short[2], new short[2], new short[4], new short[4], new short[8], new short[8], new short[16], new short[16], new short[32], new short[32]};
    final short[] l = new short[16];

    b(int n2) {
        this.a = (1 << n2) - 1;
    }
}

