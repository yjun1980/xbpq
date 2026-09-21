/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.github.catvod.spider.merge.d0;

import android.content.Context;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.en.NetPan$TermuxService;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.d0.k;
import com.github.catvod.spider.merge.d0.l;
import java.io.File;
import java.util.List;
import java.util.regex.Pattern;

public final class m
implements Runnable {
    public final Context a;
    public final NetPan$TermuxService b;
    public final Boolean c;
    public final File d;
    public final List e;
    public final String f;

    public /* synthetic */ m(Context context, NetPan$TermuxService netPan$TermuxService, Boolean bl, File file, List list, String string) {
        this.a = context;
        this.b = netPan$TermuxService;
        this.c = bl;
        this.d = file;
        this.e = list;
        this.f = string;
    }

    @Override
    public final void run() {
        Context context = this.a;
        NetPan$TermuxService netPan$TermuxService = this.b;
        Boolean bl = this.c;
        File file = this.d;
        List list = this.e;
        String string = this.f;
        Pattern pattern = NetPan.a;
        BaseApi.get().showInputWithOption("\u6d4b\u8bd5\u7248\u672c", new k(context, netPan$TermuxService, bl), new l(file, context, netPan$TermuxService, bl), r.c(new StringBuilder(), netPan$TermuxService.b, " \u8fd0\u884c\u547d\u4ee4"), "\u8bf7\u8f93\u5165\u8fd0\u884c\u547d\u4ee4", list, string);
    }
}

