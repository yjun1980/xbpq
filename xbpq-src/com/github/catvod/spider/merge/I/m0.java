/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.github.catvod.demo.MainActivity
 */
package com.github.catvod.spider.merge.I;

import android.content.Context;
import com.github.catvod.demo.MainActivity;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.ConfigCenter;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Notice;
import com.github.catvod.spider.TgYunDouBanPan;
import com.github.catvod.spider.merge.I.L0;
import com.github.catvod.spider.merge.I.s0;

public final class m0
implements Runnable {
    public final int a;
    public final Object b;

    public /* synthetic */ m0(Object object, int n2) {
        this.a = n2;
        this.b = object;
    }

    @Override
    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 4: {
                Notice.a((Notice)((Object)this.b));
                return;
            }
            case 3: {
                String string = (String)this.b;
                String string2 = ConfigCenter.n;
                NetPan.showTermuxServiceInput((Context)Init.context(), string, Boolean.TRUE);
                return;
            }
            case 2: {
                ((MainActivity)this.b).m();
                return;
            }
            case 1: {
                L0.h((L0)this.b);
                return;
            }
            case 0: {
                s0.a((s0)this.b);
                return;
            }
        }
        TgYunDouBanPan.s((TgYunDouBanPan)((Object)this.b));
    }
}

