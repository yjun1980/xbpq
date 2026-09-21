/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.github.catvod.spider.merge.d0;

import android.app.Activity;
import android.view.View;
import com.github.catvod.en.BaseApi;

public final class d
implements View.OnClickListener {
    public final Activity a;
    public final String b;

    public /* synthetic */ d(Activity activity, String string) {
        this.a = activity;
        this.b = string;
    }

    public final void onClick(View view) {
        BaseApi.b(this.a, this.b);
    }
}

