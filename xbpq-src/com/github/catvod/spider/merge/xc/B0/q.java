/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.B0;

import com.github.catvod.spider.merge.xc.B0.d;
import com.github.catvod.spider.merge.xc.B0.s;
import java.util.Calendar;

public final class q
implements s {
    public final int a;
    public final s b;

    public /* synthetic */ q(s s2, int n2) {
        this.a = n2;
        this.b = s2;
    }

    @Override
    public final void a(StringBuilder stringBuilder, Calendar calendar) {
        switch (this.a) {
            default: {
                this.b.b(stringBuilder, d.f(calendar));
                return;
            }
            case 2: {
                int n2;
                int n3 = n2 = calendar.get(11);
                if (n2 == 0) {
                    n3 = calendar.getMaximum(11) + 1;
                }
                this.b.b(stringBuilder, n3);
                return;
            }
            case 1: {
                int n4;
                int n5 = n4 = calendar.get(10);
                if (n4 == 0) {
                    n5 = calendar.getLeastMaximum(10) + 1;
                }
                this.b.b(stringBuilder, n5);
                return;
            }
            case 0: 
        }
        int n6 = 7;
        int n7 = calendar.get(7);
        if (n7 != 1) {
            n6 = n7 - 1;
        }
        this.b.b(stringBuilder, n6);
    }

    @Override
    public final void b(StringBuilder stringBuilder, int n2) {
        switch (this.a) {
            default: {
                this.b.b(stringBuilder, n2);
                return;
            }
            case 2: {
                this.b.b(stringBuilder, n2);
                return;
            }
            case 1: {
                this.b.b(stringBuilder, n2);
                return;
            }
            case 0: 
        }
        this.b.b(stringBuilder, n2);
    }

    @Override
    public final int c() {
        switch (this.a) {
            default: {
                return this.b.c();
            }
            case 2: {
                return this.b.c();
            }
            case 1: {
                return this.b.c();
            }
            case 0: 
        }
        return this.b.c();
    }
}

