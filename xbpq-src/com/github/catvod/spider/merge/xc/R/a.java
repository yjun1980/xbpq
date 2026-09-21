/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  com.github.catvod.debug.MainActivity
 */
package com.github.catvod.spider.merge.xc.R;

import android.view.View;
import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.merge.xc.R.b;

public final class a
implements View.OnClickListener {
    public final int a;
    public final MainActivity b;

    public /* synthetic */ a(MainActivity mainActivity, int n2) {
        this.a = n2;
        this.b = mainActivity;
    }

    public final void onClick(View view) {
        switch (this.a) {
            default: {
                view = this.b;
                view.a.execute(new b((MainActivity)view, 2));
                return;
            }
            case 4: {
                view = this.b;
                view.a.execute(new b((MainActivity)view, 4));
                return;
            }
            case 3: {
                view = this.b;
                view.a.execute(new b((MainActivity)view, 0));
                return;
            }
            case 2: {
                view = this.b;
                view.a.execute(new b((MainActivity)view, 1));
                return;
            }
            case 1: {
                view = this.b;
                view.a.execute(new b((MainActivity)view, 5));
                return;
            }
            case 0: 
        }
        view = this.b;
        view.a.execute(new b((MainActivity)view, 6));
    }
}

