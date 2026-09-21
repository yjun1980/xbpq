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

public final class b
implements DialogInterface.OnCancelListener {
    public final String a;
    public final j b;

    public /* synthetic */ b(String string, j j2) {
        this.a = string;
        this.b = j2;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        k.d(this.a, this.b, dialogInterface);
    }
}

