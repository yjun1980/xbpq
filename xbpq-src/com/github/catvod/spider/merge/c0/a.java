/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.view.View
 *  android.view.View$OnClickListener
 *  com.github.catvod.demo.MainActivity
 */
package com.github.catvod.spider.merge.c0;

import android.app.Activity;
import android.view.View;
import com.github.catvod.demo.MainActivity;
import com.github.catvod.en.BaseApi;

public final class a
implements View.OnClickListener {
    public final int a;
    public final Activity b;

    public /* synthetic */ a(Activity activity, int n2) {
        this.a = n2;
        this.b = activity;
    }

    public final void onClick(View view) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                MainActivity.c((MainActivity)((MainActivity)this.b));
                return;
            }
        }
        BaseApi.d(this.b);
    }
}

