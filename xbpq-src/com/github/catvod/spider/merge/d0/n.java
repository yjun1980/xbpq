/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.github.catvod.crawler.SpiderDebug
 */
package com.github.catvod.spider.merge.d0;

import android.content.Context;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.NetPan;
import com.github.catvod.en.NetPan$TermuxService;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.c.b;
import com.github.catvod.spider.merge.i0.m;
import java.io.File;
import java.util.regex.Pattern;

public final class n
implements Runnable {
    public final File a;
    public final String b;
    public final Context c;
    public final NetPan$TermuxService d;
    public final Boolean e;

    public /* synthetic */ n(File file, String string, Context context, NetPan$TermuxService netPan$TermuxService, Boolean bl) {
        this.a = file;
        this.b = string;
        this.c = context;
        this.d = netPan$TermuxService;
        this.e = bl;
    }

    @Override
    public final void run() {
        File file = this.a;
        String string = this.b;
        Object object = this.c;
        NetPan$TermuxService netPan$TermuxService = this.d;
        Boolean bl = this.e;
        Pattern pattern = NetPan.a;
        try {
            com.github.catvod.spider.merge.c.b.f(file, string);
            NetPan.runTermuxServiceCommand((Context)object, netPan$TermuxService, string, bl);
        }
        catch (Exception exception) {
            object = com.github.catvod.spider.merge.C.a.c("Service run command fail: ");
            ((StringBuilder)object).append(exception.getMessage());
            SpiderDebug.log((String)((StringBuilder)object).toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("\u8fd0\u884c\u547d\u4ee4\u5931\u8d25: ");
            ((StringBuilder)object).append(exception.getMessage());
            m.y(((StringBuilder)object).toString());
        }
    }
}

