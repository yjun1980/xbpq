/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.SpiderDebug
 */
package com.github.catvod.spider.merge.I;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.f1;
import com.github.catvod.spider.merge.I.u;
import com.github.catvod.spider.merge.R0.e;
import com.github.catvod.spider.merge.b0.c;
import com.github.catvod.spider.merge.f0.d;
import com.github.catvod.spider.merge.i0.m;
import java.util.Objects;

public final class g
implements Runnable {
    public final int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ g(Object object, Object object2, int n2) {
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
            case 1: {
                f1 f12 = (f1)this.b;
                Object object = (String)this.c;
                Objects.requireNonNull(f12);
                if (((String)object).startsWith("http")) {
                    f12.l(d.k((String)object), true);
                } else {
                    e.c(f12.c.b);
                    CharSequence charSequence = new StringBuilder();
                    charSequence.append("set new Cookie:");
                    charSequence.append((String)object);
                    SpiderDebug.log((String)charSequence.toString());
                    charSequence = object;
                    if (((String)object).startsWith("http")) {
                        charSequence = d.k((String)object).trim();
                    }
                    if (e.d(charSequence)) {
                        object = f12.c;
                        ((c)object).b = charSequence;
                        ((c)object).c();
                        object = new StringBuilder();
                        ((StringBuilder)object).append("115\u5b89\u5168\u5220\u9664\u7801 \u8bbe\u4e3a");
                        ((StringBuilder)object).append((String)charSequence);
                        m.y(((StringBuilder)object).toString());
                    }
                }
                return;
            }
            case 0: {
                u.b((u)this.b, (com.github.catvod.spider.merge.L.c)this.c);
                return;
            }
        }
        Init.d((Init)this.b, (Boolean)this.c);
    }
}

