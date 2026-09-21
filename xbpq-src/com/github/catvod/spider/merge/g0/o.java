/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 */
package com.github.catvod.spider.merge.g0;

import android.content.DialogInterface;
import com.github.catvod.spider.TgYunDouBanPan;

public final class o
implements DialogInterface.OnCancelListener {
    public final TgYunDouBanPan a;

    public /* synthetic */ o(TgYunDouBanPan tgYunDouBanPan) {
        this.a = tgYunDouBanPan;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        TgYunDouBanPan.q(this.a);
    }
}

