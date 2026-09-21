/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package com.github.catvod.spider.merge.ai;

import android.app.Activity;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Market;

public final class s
implements Runnable {
    public final int a;
    public final Market b;

    public /* synthetic */ s(Market market, int n2) {
        this.a = n2;
        this.b = market;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 2: {
                Market.d(this.b);
                return;
            }
            case 1: {
                Market market = this.b;
                ((Object)((Object)market)).getClass();
                Init.run(new s(market, 3));
                return;
            }
            case 0: {
                ((Object)((Object)this.b)).getClass();
                Activity activity = Init.getActivity();
                if (activity == null) return;
                try {
                    activity.finish();
                    return;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
                return;
            }
        }
        Market.b(this.b);
    }
}

