/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 */
package com.github.catvod.spider.merge.g0;

import android.content.DialogInterface;
import com.github.catvod.spider.TgYunDouBanPan;

public final class p
implements DialogInterface.OnClickListener {
    public final TgYunDouBanPan a;

    public /* synthetic */ p(TgYunDouBanPan tgYunDouBanPan) {
        this.a = tgYunDouBanPan;
    }

    public final void onClick(DialogInterface dialogInterface, int n2) {
        TgYunDouBanPan.p(this.a);
    }
}

