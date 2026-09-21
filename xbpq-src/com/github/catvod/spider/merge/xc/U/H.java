/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.github.catvod.spider.merge.xc.U;

import android.app.AlertDialog;
import android.view.View;

public final class H
implements View.OnClickListener {
    public final int a;
    public final AlertDialog b;
    public final Runnable c;

    public /* synthetic */ H(AlertDialog alertDialog, Runnable runnable, int n2) {
        this.a = n2;
        this.b = alertDialog;
        this.c = runnable;
    }

    public final void onClick(View view) {
        switch (this.a) {
            default: {
                this.b.dismiss();
                this.c.run();
                return;
            }
            case 3: {
                this.b.dismiss();
                this.c.run();
                return;
            }
            case 2: {
                this.b.dismiss();
                this.c.run();
                return;
            }
            case 1: {
                this.b.dismiss();
                this.c.run();
                return;
            }
            case 0: 
        }
        this.b.dismiss();
        this.c.run();
    }
}

