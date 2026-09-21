/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnDismissListener
 */
package com.github.catvod.spider.merge.dp;

import android.content.DialogInterface;
import com.github.catvod.spider.merge.dp.p;

public final class h
implements DialogInterface.OnDismissListener {
    public final p a;

    public /* synthetic */ h(p p2) {
        this.a = p2;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        p.i(this.a);
    }
}

