/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnDismissListener
 */
package com.github.catvod.spider.merge.I;

import android.content.DialogInterface;
import com.github.catvod.spider.merge.I.M;

public final class F
implements DialogInterface.OnDismissListener {
    public final M a;

    public /* synthetic */ F(M m2) {
        this.a = m2;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        M.f(this.a);
    }
}

