/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  androidx.core.app.ActivityCompat
 */
package com.github.catvod.spider.merge.KT;

import android.app.Activity;
import androidx.core.app.ActivityCompat;
import com.github.catvod.spider.merge.KT.t;

public final class q
implements Runnable {
    public final int a;
    public final Activity b;

    public /* synthetic */ q(Activity activity, int n2) {
        this.a = n2;
        this.b = activity;
    }

    @Override
    public final void run() {
        switch (this.a) {
            default: {
                ActivityCompat.a((Activity)this.b);
                return;
            }
            case 1: {
                t.m(this.b);
                return;
            }
            case 0: 
        }
        t.m(this.b);
    }
}

