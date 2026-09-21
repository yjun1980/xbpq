/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 */
package com.github.catvod.spider.merge.d0;

import android.content.Context;
import android.content.DialogInterface;
import com.github.catvod.en.NetPan;
import com.github.catvod.en.NetPan$TermuxService;
import com.github.catvod.spider.Init;
import java.util.regex.Pattern;

public final class k
implements DialogInterface.OnClickListener {
    public final Context a;
    public final NetPan$TermuxService b;
    public final Boolean c;

    public /* synthetic */ k(Context context, NetPan$TermuxService netPan$TermuxService, Boolean bl) {
        this.a = context;
        this.b = netPan$TermuxService;
        this.c = bl;
    }

    public final void onClick(DialogInterface object, int n2) {
        Context context = this.a;
        NetPan$TermuxService netPan$TermuxService = this.b;
        object = this.c;
        Pattern pattern = NetPan.a;
        Init.execute(new com.github.catvod.spider.merge.I.k(context, netPan$TermuxService, object, 3));
    }
}

