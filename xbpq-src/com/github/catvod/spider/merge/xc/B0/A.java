/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.B0;

import com.github.catvod.spider.merge.xc.B0.C;
import com.github.catvod.spider.merge.xc.B0.s;
import java.util.Calendar;

public final class A
implements s {
    public static final A b = new A(0);
    public static final A c = new A(1);
    public static final A d = new A(2);
    public final int a;

    public /* synthetic */ A(int n2) {
        this.a = n2;
    }

    @Override
    public final void a(StringBuilder stringBuilder, Calendar calendar) {
        switch (this.a) {
            default: {
                this.b(stringBuilder, calendar.get(2) + 1);
                return;
            }
            case 1: {
                this.b(stringBuilder, calendar.get(1) % 100);
                return;
            }
            case 0: 
        }
        C.a(stringBuilder, calendar.get(2) + 1);
    }

    @Override
    public final void b(StringBuilder stringBuilder, int n2) {
        switch (this.a) {
            default: {
                if (n2 < 10) {
                    stringBuilder.append((char)(n2 + 48));
                } else {
                    C.a(stringBuilder, n2);
                }
                return;
            }
            case 1: {
                C.a(stringBuilder, n2 % 100);
                return;
            }
            case 0: 
        }
        C.a(stringBuilder, n2);
    }

    @Override
    public final int c() {
        switch (this.a) {
            default: {
                return 2;
            }
            case 1: {
                return 2;
            }
            case 0: 
        }
        return 2;
    }
}

