/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 */
package com.github.catvod.spider.merge.j;

import android.content.DialogInterface;
import com.github.catvod.spider.merge.j.j;
import com.github.catvod.spider.merge.j.k;

public final class c
implements DialogInterface.OnClickListener {
    public final String a;
    public final j b;

    public /* synthetic */ c(String string, j j2) {
        this.a = string;
        this.b = j2;
    }

    public final void onClick(DialogInterface dialogInterface, int n2) {
        k.b(this.a, this.b, dialogInterface);
    }
}

