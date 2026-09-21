/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  com.github.catvod.spider.InitOrigin
 */
package com.github.catvod.spider.merge.xc.U;

import android.content.DialogInterface;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.UY.L;
import com.github.catvod.spider.merge.UY.M;
import com.github.catvod.spider.merge.xc.U.G;

public final class x
implements DialogInterface.OnClickListener {
    public final int a;

    public /* synthetic */ x(int n2) {
        this.a = n2;
    }

    public final void onClick(DialogInterface object, int n2) {
        switch (this.a) {
            default: {
                object = M.r;
                L.a.i = true;
                return;
            }
            case 0: 
        }
        InitOrigin.execute((Runnable)new G(n2));
    }
}

