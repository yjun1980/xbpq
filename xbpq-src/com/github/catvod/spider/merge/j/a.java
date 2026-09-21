/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 */
package com.github.catvod.spider.merge.j;

import android.content.DialogInterface;
import com.github.catvod.spider.merge.j.j;
import com.github.catvod.spider.merge.j.k;

public final class a
implements DialogInterface.OnCancelListener {
    public final j a;

    public /* synthetic */ a(j j2) {
        this.a = j2;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        k.c(this.a, dialogInterface);
    }
}

