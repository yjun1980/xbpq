/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.I;

import com.github.catvod.spider.TgYunDouBanPan;
import com.github.catvod.spider.merge.I.L0;
import com.github.catvod.spider.merge.I.s0;
import com.github.catvod.spider.merge.I.u;
import com.github.catvod.spider.merge.L.c;
import com.github.catvod.spider.merge.f0.d;
import com.github.catvod.spider.merge.j0.b;
import java.io.PipedOutputStream;
import java.util.Map;
import java.util.Objects;

public final class i
implements Runnable {
    public final int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ i(Object object, Object object2, int n2) {
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
            case 3: {
                TgYunDouBanPan.r((TgYunDouBanPan)((Object)this.b));
                return;
            }
            case 2: {
                L0 l02 = (L0)this.b;
                String string = (String)this.c;
                Objects.requireNonNull(l02);
                String string2 = string;
                if (string.startsWith("http")) {
                    string2 = d.k(string);
                }
                l02.P(string2, true);
                return;
            }
            case 1: {
                s0.h((s0)this.b, (String)this.c);
                return;
            }
            case 0: {
                u u2 = (u)this.b;
                Object object = (Map)this.c;
                Objects.requireNonNull(u2);
                object = com.github.catvod.spider.merge.L.c.g(d.g("https://passport.aliyundrive.com/newlogin/qrcode/query.do?appName=aliyun_drive&fromSite=52&_bx-v=2.2.3", (Map<String, String>)object, null, null)).b().c();
                if (((c)object).f()) {
                    u2.a0(((c)object).e());
                }
                return;
            }
        }
        com.github.catvod.spider.merge.j0.b.c((b)this.b, (PipedOutputStream)this.c);
    }
}

