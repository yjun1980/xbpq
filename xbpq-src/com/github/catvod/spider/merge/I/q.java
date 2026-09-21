/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnDismissListener
 */
package com.github.catvod.spider.merge.I;

import android.content.DialogInterface;
import com.github.catvod.spider.merge.I.u;

public final class q
implements DialogInterface.OnDismissListener {
    public final u a;

    public /* synthetic */ q(u u2) {
        this.a = u2;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        u.f(this.a);
    }
}

