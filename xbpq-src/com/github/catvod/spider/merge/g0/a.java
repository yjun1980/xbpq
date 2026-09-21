/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g0;

import com.github.catvod.spider.ConfigCenter;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.G0;
import com.github.catvod.spider.merge.I.L0;
import com.github.catvod.spider.merge.I.U;
import com.github.catvod.spider.merge.I.X;
import com.github.catvod.spider.merge.g0.j;
import java.util.Objects;

public final class a
implements Runnable {
    public static final a b = new a(0);
    public static final a c = new a(1);
    public static final a d = new a(2);
    public final int a;

    public /* synthetic */ a(int n2) {
        this.a = n2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                Object object = ConfigCenter.n;
                object = X.n();
                Objects.requireNonNull(object);
                Init.run(new U(object, 0));
                return;
            }
            case 0: {
                Object object = ConfigCenter.n;
                object = L0.s();
                Objects.requireNonNull(object);
                Init.run(new G0((L0)object, 1));
                return;
            }
        }
        String string = ConfigCenter.n;
        new Thread(j.e).start();
    }
}

