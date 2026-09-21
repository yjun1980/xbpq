/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 */
package com.github.catvod.spider.merge.b;

import android.content.DialogInterface;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.b.c;
import com.github.catvod.spider.merge.b.p;

public final class e
implements DialogInterface.OnCancelListener {
    public final p a;
    public final com.github.catvod.spider.merge.d.c b;

    public /* synthetic */ e(p p2, com.github.catvod.spider.merge.d.c c2) {
        this.a = p2;
        this.b = c2;
    }

    public final void onCancel(DialogInterface object) {
        object = this.a;
        com.github.catvod.spider.merge.d.c c2 = this.b;
        object.getClass();
        Init.execute(new c((p)object, c2));
    }
}

