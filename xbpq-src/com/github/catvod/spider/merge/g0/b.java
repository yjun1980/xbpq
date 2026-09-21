/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g0;

import com.github.catvod.spider.ConfigCenter;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.TgYunDouBanPan;
import com.github.catvod.spider.merge.I.H0;
import com.github.catvod.spider.merge.I.L0;
import com.github.catvod.spider.merge.I.X;
import com.github.catvod.spider.merge.i0.m;
import java.util.Objects;

public final class b
implements Runnable {
    public static final b b = new b(0);
    public static final b c = new b(1);
    public static final b d = new b(2);
    public final int a;

    public /* synthetic */ b(int n2) {
        this.a = n2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                String string = ConfigCenter.n;
                X.n().e.a();
                m.y("\u5df2\u6e05\u9664\u5149\u9e2d\u672c\u5730\u6388\u6743");
                return;
            }
            case 0: {
                Object object = ConfigCenter.n;
                object = L0.s();
                Objects.requireNonNull(object);
                Init.run(new H0((L0)object, 1));
                return;
            }
        }
        String string = ConfigCenter.n;
        new TgYunDouBanPan().startTgFlow();
    }
}

