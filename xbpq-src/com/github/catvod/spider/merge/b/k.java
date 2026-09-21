/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.widget.Toast
 */
package com.github.catvod.spider.merge.b;

import android.content.Context;
import android.widget.Toast;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.b.p;

public final class k
implements Runnable {
    public final int c;
    public final Object d;

    public /* synthetic */ k(Object object, int n2) {
        this.c = n2;
        this.d = object;
    }

    @Override
    public final void run() {
        switch (this.c) {
            default: {
                break;
            }
            case 0: {
                p.d((p)this.d);
                return;
            }
        }
        String string = (String)this.d;
        Toast.makeText((Context)Init.context(), (CharSequence)string, (int)1).show();
    }
}

