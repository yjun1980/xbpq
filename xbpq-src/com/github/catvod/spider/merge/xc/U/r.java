/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.github.catvod.spider.merge.xc.U;

import android.view.View;
import com.github.catvod.spider.merge.xc.a.a;

public final class r
implements View.OnClickListener {
    public final int a;
    public final Runnable b;

    public /* synthetic */ r(Runnable runnable, int n2) {
        this.a = n2;
        this.b = runnable;
    }

    public final void onClick(View object) {
        switch (this.a) {
            default: {
                object = this.b;
                if (object != null) {
                    object.run();
                }
                com.github.catvod.spider.merge.xc.a.a.i();
                return;
            }
            case 0: 
        }
        this.b.run();
    }
}

