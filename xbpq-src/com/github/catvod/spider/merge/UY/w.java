/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 */
package com.github.catvod.spider.merge.UY;

import android.content.DialogInterface;
import com.github.catvod.spider.merge.UY.z;

public final class w
implements DialogInterface.OnClickListener {
    public final z a;

    public /* synthetic */ w(z z2) {
        this.a = z2;
    }

    public final void onClick(DialogInterface object, int n2) {
        object = this.a;
        ((z)object).i = true;
        object = ((z)object).h;
        if (object != null) {
            object.shutdownNow();
        }
    }
}

