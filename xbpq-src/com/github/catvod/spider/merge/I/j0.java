/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnDismissListener
 */
package com.github.catvod.spider.merge.I;

import android.content.DialogInterface;
import com.github.catvod.spider.merge.I.L0;
import com.github.catvod.spider.merge.I.s0;

public final class j0
implements DialogInterface.OnDismissListener {
    public final int a;
    public final Object b;

    public /* synthetic */ j0(Object object, int n2) {
        this.a = n2;
        this.b = object;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                s0.i((s0)this.b);
                return;
            }
        }
        L0.j((L0)this.b);
    }
}

