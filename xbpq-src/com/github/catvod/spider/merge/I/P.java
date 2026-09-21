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
import com.github.catvod.spider.merge.I.X;

public final class P
implements DialogInterface.OnClickListener {
    public final X a;
    public final EditText b;

    public /* synthetic */ P(X x2, EditText editText) {
        this.a = x2;
        this.b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int n2) {
        X.g(this.a, this.b);
    }
}

