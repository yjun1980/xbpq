/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.I;

import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.j;
import com.github.catvod.spider.merge.I.u;
import com.github.catvod.spider.merge.L.c;
import com.github.catvod.spider.merge.f0.d;
import java.util.Objects;

public final class b
implements Runnable {
    public final int a;
    public final u b;

    public /* synthetic */ b(u u2, int n2) {
        this.a = n2;
        this.b = u2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                u.e(this.b);
                return;
            }
            case 0: {
                u.a(this.b);
                return;
            }
        }
        u u2 = this.b;
        Objects.requireNonNull(u2);
        String string = d.k("https://passport.aliyundrive.com/newlogin/qrcode/generate.do?appName=aliyun_drive&fromSite=52&appName=aliyun_drive&appEntrance=web&isMobile=false&lang=zh_CN&returnUrl=&bizParams=&_bx-v=2.2.3");
        Init.run(new j(u2, string, c.g(string).b().c(), 0));
    }
}

