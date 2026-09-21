/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.U;

public final class l
implements Runnable {
    public final int a;
    public final int[] b;
    public final int c;
    public final Runnable[] d;

    public /* synthetic */ l(int[] nArray, int n2, Runnable[] runnableArray, int n3) {
        this.a = n3;
        this.b = nArray;
        this.c = n2;
        this.d = runnableArray;
    }

    @Override
    public final void run() {
        switch (this.a) {
            default: {
                this.b[0] = this.c;
                this.d[0].run();
                return;
            }
            case 2: {
                this.b[0] = this.c;
                this.d[0].run();
                return;
            }
            case 1: {
                this.b[0] = this.c;
                this.d[0].run();
                return;
            }
            case 0: 
        }
        this.b[0] = this.c;
        this.d[0].run();
    }
}

