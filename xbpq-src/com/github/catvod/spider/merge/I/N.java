/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 */
package com.github.catvod.spider.merge.I;

import android.content.DialogInterface;
import com.github.catvod.spider.merge.I.X;

public final class N
implements DialogInterface.OnCancelListener {
    public final X a;

    public /* synthetic */ N(X x2) {
        this.a = x2;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        X.f(this.a);
    }
}

