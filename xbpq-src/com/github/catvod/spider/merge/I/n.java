/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 */
package com.github.catvod.spider.merge.I;

import android.content.DialogInterface;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.merge.I.u;

public final class n
implements DialogInterface.OnClickListener {
    public final int a;
    public final Object b;

    public /* synthetic */ n(Object object, int n2) {
        this.a = n2;
        this.b = object;
    }

    public final void onClick(DialogInterface dialogInterface, int n2) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                u.h((u)this.b);
                return;
            }
        }
        ((BaseApi)this.b).onClashUiNeutral();
    }
}

