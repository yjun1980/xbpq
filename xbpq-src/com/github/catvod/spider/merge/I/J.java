/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.I;

import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.M;
import com.github.catvod.spider.merge.I.X;
import com.github.catvod.spider.merge.O.b;

public final class J
implements Runnable {
    public final int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ J(Object object, Object object2, int n2) {
        this.a = n2;
        this.b = object;
        this.c = object2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                X.d((X)this.b, (String)this.c);
                return;
            }
            case 0: {
                M.e((M)this.b, (b)this.c);
                return;
            }
        }
        Init.c((Init)this.b, (Boolean)this.c);
    }
}

