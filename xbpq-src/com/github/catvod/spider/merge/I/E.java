/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 */
package com.github.catvod.spider.merge.I;

import android.content.DialogInterface;
import com.github.catvod.spider.merge.I.M;

public final class E
implements DialogInterface.OnCancelListener {
    public final M a;

    public /* synthetic */ E(M m2) {
        this.a = m2;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        M.b(this.a);
    }
}

