/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.widget.EditText
 */
package com.github.catvod.spider.merge.I;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.spider.merge.I.u;

public final class o
implements DialogInterface.OnClickListener {
    public final u a;
    public final EditText b;

    public /* synthetic */ o(u u2, EditText editText) {
        this.a = u2;
        this.b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int n2) {
        u.g(this.a, this.b);
    }
}

