/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.I;

import com.github.catvod.en.NetPan;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.TgYunDouBanPan;
import com.github.catvod.spider.merge.I.K;
import com.github.catvod.spider.merge.I.s0;
import com.github.catvod.spider.merge.I.u;
import com.github.catvod.spider.merge.P.a;
import com.github.catvod.spider.merge.R0.e;
import com.github.catvod.spider.merge.c.b;
import com.github.catvod.spider.merge.f0.d;
import com.github.catvod.spider.merge.i0.m;
import java.util.Objects;

public final class c
implements Runnable {
    public final int a;
    public final Object b;

    public /* synthetic */ c(Object object, int n2) {
        this.a = n2;
        this.b = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 3: {
                TgYunDouBanPan tgYunDouBanPan = (TgYunDouBanPan)((Object)this.b);
                int n2 = TgYunDouBanPan.u;
                Objects.requireNonNull(tgYunDouBanPan);
                try {
                    String string = d.k("http://127.0.0.1:9999/login");
                    if (string.contains("\u5df2\u767b\u5f55")) {
                        m.y("tg\u5df2\u767b\u5f55");
                        return;
                    }
                    boolean bl = e.b(string);
                    if (bl) {
                        m.y("\u6b63\u5728\u5f3a\u5236\u542f\u52a8tgsou \u7a0d\u7b49\u91cd\u8bd5");
                        NetPan.initTg(true, NetPan.k);
                        return;
                    }
                    if (string.contains("tg://")) {
                        K k2 = new K((Object)tgYunDouBanPan, string, 3);
                        Init.run(k2);
                        return;
                    }
                    m.y("\u6b63\u5728\u5f3a\u5236\u542f\u52a8tgsou \u7a0d\u7b49\u91cd\u8bd5");
                    return;
                }
                catch (Exception exception) {
                    throw new RuntimeException(exception);
                }
            }
            case 2: {
                a a2 = (a)this.b;
                Objects.requireNonNull(a2);
                com.github.catvod.spider.merge.c.b.f(com.github.catvod.spider.merge.c.b.e("guangya_user"), a2.toString());
                return;
            }
            case 1: {
                s0.a((s0)this.b);
                return;
            }
            case 0: {
                u.a((u)this.b);
                return;
            }
        }
        com.github.catvod.spider.merge.i0.c.a((String)this.b);
    }
}

