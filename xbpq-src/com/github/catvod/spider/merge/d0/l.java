/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.github.catvod.spider.merge.d0;

import android.content.Context;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.BaseApi$Task;
import com.github.catvod.en.NetPan;
import com.github.catvod.en.NetPan$TermuxService;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.d0.n;
import java.io.File;
import java.util.regex.Pattern;

public final class l
implements BaseApi$Task {
    public final File a;
    public final Context b;
    public final NetPan$TermuxService c;
    public final Boolean d;

    public /* synthetic */ l(File file, Context context, NetPan$TermuxService netPan$TermuxService, Boolean bl) {
        this.a = file;
        this.b = context;
        this.c = netPan$TermuxService;
        this.d = bl;
    }

    @Override
    public final void execute(String string) {
        File file = this.a;
        Context context = this.b;
        NetPan$TermuxService netPan$TermuxService = this.c;
        Boolean bl = this.d;
        Pattern pattern = NetPan.a;
        BaseApi.get().dismiss();
        Init.execute(new n(file, string, context, netPan$TermuxService, bl));
    }
}

