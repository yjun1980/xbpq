/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.github.catvod.crawler.SpiderDebug
 */
package com.github.catvod.spider.merge.I;

import android.content.Context;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.NetPan;
import com.github.catvod.en.NetPan$TermuxService;
import com.github.catvod.spider.TgYunDouBanPan;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.M;
import com.github.catvod.spider.merge.I.s0;
import com.github.catvod.spider.merge.R0.e;
import com.github.catvod.spider.merge.c.b;

public final class K
implements Runnable {
    public final int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ K(Object object, Object object2, int n2) {
        this.a = n2;
        this.b = object;
        this.c = object2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 2: {
                NetPan$TermuxService netPan$TermuxService = (NetPan$TermuxService)this.b;
                Context context = (Context)this.c;
                Object object = NetPan.a;
                object = new StringBuilder();
                ((StringBuilder)object).append("Auto-starting service: ");
                ((StringBuilder)object).append(netPan$TermuxService.b);
                SpiderDebug.log((String)((StringBuilder)object).toString());
                object = new StringBuilder();
                ((StringBuilder)object).append("termux_command_");
                ((StringBuilder)object).append(netPan$TermuxService.a);
                CharSequence charSequence = com.github.catvod.spider.merge.c.b.d(com.github.catvod.spider.merge.c.b.e(((StringBuilder)object).toString()));
                object = charSequence;
                try {
                    if (e.b(charSequence)) {
                        object = netPan$TermuxService.f;
                    }
                    NetPan.runTermuxServiceCommand(context, netPan$TermuxService, (String)object, Boolean.FALSE);
                }
                catch (Exception exception) {
                    charSequence = com.github.catvod.spider.merge.C.a.c("Failed to auto-start service ");
                    charSequence.append(netPan$TermuxService.b);
                    charSequence.append(": ");
                    charSequence.append(exception.getMessage());
                    SpiderDebug.log((String)charSequence.toString());
                }
                return;
            }
            case 1: {
                s0.h((s0)this.b, (String)this.c);
                return;
            }
            case 0: {
                M.c((M)this.b, (com.github.catvod.spider.merge.O.b)this.c);
                return;
            }
        }
        TgYunDouBanPan.u((TgYunDouBanPan)((Object)this.b), (String)this.c);
    }
}

