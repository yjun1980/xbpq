/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.a1;

import com.github.catvod.spider.merge.a1.a;
import com.github.catvod.spider.merge.a1.c;
import com.github.catvod.spider.merge.a1.i;
import java.io.InputStream;

final class l {
    int A;
    int B;
    int C;
    int D;
    int E;
    int F;
    byte[] G;
    int H;
    int I;
    int J;
    int K;
    int L;
    int M;
    int N;
    int O;
    int P = 0;
    long Q = 0L;
    byte[] R;
    int S = 0;
    int T;
    int U;
    int V;
    int W;
    int X;
    byte[] Y;
    int a = 0;
    int b;
    final a c = new a();
    byte[] d;
    final int[] e = new int[3240];
    final int[] f = new int[3240];
    int g;
    boolean h;
    boolean i;
    boolean j;
    final i k = new i();
    final i l = new i();
    final i m = new i();
    final int[] n = new int[3];
    final int[] o = new int[3];
    final int[] p = new int[6];
    final int[] q = new int[]{16, 15, 11, 4};
    int r = 0;
    int s = 0;
    int t = 0;
    boolean u = false;
    int v;
    int w;
    int x;
    byte[] y;
    byte[] z;

    l() {
        this.R = new byte[0];
    }

    static void a(l l2, InputStream object) {
        if (l2.a == 0) {
            int n2;
            com.github.catvod.spider.merge.a1.a.e(l2.c, (InputStream)object);
            object = l2.c;
            if (com.github.catvod.spider.merge.a1.a.h((a)object, 1) == 0) {
                n2 = 16;
            } else {
                int n3 = com.github.catvod.spider.merge.a1.a.h((a)object, 3);
                n2 = 17;
                if (n3 != 0) {
                    n2 = 17 + n3;
                } else {
                    n3 = com.github.catvod.spider.merge.a1.a.h((a)object, 3);
                    if (n3 != 0) {
                        n2 = n3 + 8;
                    }
                }
            }
            if (n2 != 9) {
                l2.O = n2 = 1 << n2;
                l2.N = n2 - 16;
                l2.a = 1;
                return;
            }
            throw new c("Invalid 'windowBits' code");
        }
        throw new IllegalStateException("State MUST be uninitialized");
    }
}

