/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.demo.MainActivity
 */
package com.github.catvod.spider.merge.I;

import com.github.catvod.demo.MainActivity;
import com.github.catvod.spider.merge.I.X;
import com.github.catvod.spider.merge.I.e1;
import com.github.catvod.spider.merge.I.s0;
import com.github.catvod.spider.merge.I.t;
import com.github.catvod.spider.merge.L.m;
import com.github.catvod.spider.merge.S.e;
import com.github.catvod.spider.merge.b0.c;
import com.github.catvod.spider.merge.c.b;
import java.util.Objects;

public final class S
implements Runnable {
    public final int a;
    public final Object b;

    public /* synthetic */ S(Object object, int n2) {
        this.a = n2;
        this.b = object;
    }

    @Override
    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 4: {
                c c2 = (c)this.b;
                Objects.requireNonNull(c2);
                Objects.requireNonNull(e1.a);
                com.github.catvod.spider.merge.c.b.f(com.github.catvod.spider.merge.c.b.e("115_user"), c2.toString());
                return;
            }
            case 3: {
                e.a((e)this.b);
                return;
            }
            case 2: {
                m m2 = (m)this.b;
                Objects.requireNonNull(m2);
                Objects.requireNonNull(t.a);
                com.github.catvod.spider.merge.c.b.f(com.github.catvod.spider.merge.c.b.e("aliyundrive_user"), m2.toString());
                return;
            }
            case 1: {
                s0.j((s0)this.b);
                return;
            }
            case 0: {
                X.e((X)this.b);
                return;
            }
        }
        ((MainActivity)this.b).h();
    }
}

