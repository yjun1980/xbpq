/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnDismissListener
 */
package com.github.catvod.spider.merge.I;

import android.content.DialogInterface;
import com.github.catvod.spider.merge.I.X;

public final class Q
implements DialogInterface.OnDismissListener {
    public final X a;

    public /* synthetic */ Q(X x2) {
        this.a = x2;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        X.b(this.a);
    }
}

