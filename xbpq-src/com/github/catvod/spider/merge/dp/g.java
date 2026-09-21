/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.widget.EditText
 */
package com.github.catvod.spider.merge.dp;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.spider.merge.dp.p;

public final class g
implements DialogInterface.OnClickListener {
    public final p a;
    public final EditText b;

    public /* synthetic */ g(p p2, EditText editText) {
        this.a = p2;
        this.b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int n2) {
        p.c(this.a, this.b);
    }
}

