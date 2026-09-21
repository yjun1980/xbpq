/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.I;

import com.github.catvod.spider.TgYunDouBanPan;
import com.github.catvod.spider.merge.I.M;
import com.github.catvod.spider.merge.O.b;

public final class I
implements Runnable {
    public final int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ I(Object object, Object object2, int n2) {
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
            case 0: {
                M.a((M)this.b, (b)this.c);
                return;
            }
        }
        TgYunDouBanPan.r((TgYunDouBanPan)((Object)this.b));
    }
}

