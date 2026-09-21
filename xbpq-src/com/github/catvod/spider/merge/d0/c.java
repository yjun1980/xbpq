/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 */
package com.github.catvod.spider.merge.d0;

import android.content.DialogInterface;
import com.github.catvod.spider.merge.d0.h;

public final class c
implements DialogInterface.OnClickListener {
    public static final c a = new c();

    private /* synthetic */ c() {
    }

    public final void onClick(DialogInterface dialogInterface, int n2) {
        new Thread(h.a).start();
    }
}

