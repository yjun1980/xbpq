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
import com.github.catvod.spider.merge.I.s0;

public final class O
implements DialogInterface.OnClickListener {
    public final int a;
    public final Object b;

    public /* synthetic */ O(Object object, int n2) {
        this.a = n2;
        this.b = object;
    }

    public final void onClick(DialogInterface dialogInterface, int n2) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                X.a((X)this.b);
                return;
            }
        }
        s0.c((EditText)this.b);
    }
}

