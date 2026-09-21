/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 */
package com.github.catvod.spider.merge.UY;

import android.content.DialogInterface;
import com.github.catvod.spider.merge.UY.S;

public final class O
implements DialogInterface.OnCancelListener {
    public final int a;
    public final S b;

    public /* synthetic */ O(S s2, int n2) {
        this.a = n2;
        this.b = s2;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            default: {
                this.b.n();
                return;
            }
            case 0: 
        }
        this.b.n();
    }
}

