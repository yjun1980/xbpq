/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  com.github.catvod.demo.MainActivity
 */
package com.github.catvod.spider.merge.c0;

import android.view.View;
import com.github.catvod.demo.MainActivity;

public final class c
implements View.OnClickListener {
    public final MainActivity a;

    public /* synthetic */ c(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    public final void onClick(View view) {
        MainActivity.d((MainActivity)this.a);
    }
}

