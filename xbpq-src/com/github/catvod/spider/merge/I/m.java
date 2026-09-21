/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 */
package com.github.catvod.spider.merge.I;

import android.content.DialogInterface;
import com.github.catvod.spider.merge.I.u;

public final class m
implements DialogInterface.OnCancelListener {
    public final u a;

    public /* synthetic */ m(u u2) {
        this.a = u2;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        u.c(this.a);
    }
}

