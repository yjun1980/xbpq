/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 *  android.widget.Button
 *  android.widget.TextView
 */
package com.github.catvod.spider.merge.KT;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.github.catvod.spider.merge.KT.t;

public final class k
implements View.OnFocusChangeListener {
    public final int a;
    public final Activity b;
    public final boolean c;
    public final TextView d;

    public /* synthetic */ k(Activity activity, TextView textView, boolean bl, int n2) {
        this.a = n2;
        this.b = activity;
        this.d = textView;
        this.c = bl;
    }

    public final void onFocusChange(View view, boolean bl) {
        switch (this.a) {
            default: {
                t.v(this.b, this.d, this.c, bl);
                return;
            }
            case 0: 
        }
        t.t(this.b, (Button)this.d, this.c, bl);
    }
}

