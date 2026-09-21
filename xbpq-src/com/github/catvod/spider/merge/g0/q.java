/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnDismissListener
 */
package com.github.catvod.spider.merge.g0;

import android.content.DialogInterface;
import com.github.catvod.spider.TgYunDouBanPan;

public final class q
implements DialogInterface.OnDismissListener {
    public final TgYunDouBanPan a;

    public /* synthetic */ q(TgYunDouBanPan tgYunDouBanPan) {
        this.a = tgYunDouBanPan;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        TgYunDouBanPan.o(this.a);
    }
}

