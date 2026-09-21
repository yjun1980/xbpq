/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 */
package com.github.catvod.spider.merge.UY;

import android.content.DialogInterface;
import com.github.catvod.spider.merge.UY.z;

public final class x
implements DialogInterface.OnCancelListener {
    public final int a;
    public final Object b;

    public /* synthetic */ x(int n2, Object object) {
        this.a = n2;
        this.b = object;
    }

    public final void onCancel(DialogInterface object) {
        switch (this.a) {
            default: {
                object = (Runnable)this.b;
                if (object != null) {
                    object.run();
                }
                return;
            }
            case 0: 
        }
        object = (z)this.b;
        ((z)object).i = true;
        object = ((z)object).h;
        if (object != null) {
            object.shutdownNow();
        }
    }
}

