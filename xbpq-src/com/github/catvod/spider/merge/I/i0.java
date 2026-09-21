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
import com.github.catvod.spider.merge.I.s0;

public final class i0
implements DialogInterface.OnClickListener {
    public final int a;
    public final Object b;

    public /* synthetic */ i0(Object object, int n2) {
        this.a = n2;
        this.b = object;
    }

    public final void onClick(DialogInterface dialogInterface, int n2) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                s0.b((s0)this.b);
                return;
            }
        }
        L0.i((EditText)this.b);
    }
}

