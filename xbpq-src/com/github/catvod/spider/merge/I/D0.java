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
import com.github.catvod.spider.merge.I.L0;

public final class D0
implements DialogInterface.OnClickListener {
    public final L0 a;
    public final EditText b;

    public /* synthetic */ D0(L0 l02, EditText editText) {
        this.a = l02;
        this.b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int n2) {
        L0.l(this.a, this.b);
    }
}

