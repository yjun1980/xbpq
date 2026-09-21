/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.B0;

import com.github.catvod.spider.merge.xc.B0.C;
import com.github.catvod.spider.merge.xc.B0.s;
import java.util.Calendar;

public final class B
implements s {
    public final int a;
    public final int b;

    public /* synthetic */ B(int n2, int n3) {
        this.a = n3;
        this.b = n2;
    }

    @Override
    public final void a(StringBuilder stringBuilder, Calendar calendar) {
        switch (this.a) {
            default: {
                this.b(stringBuilder, calendar.get(this.b));
                return;
            }
            case 0: 
        }
        this.b(stringBuilder, calendar.get(this.b));
    }

    @Override
    public final void b(StringBuilder stringBuilder, int n2) {
        switch (this.a) {
            default: {
                if (n2 < 10) {
                    stringBuilder.append((char)(n2 + 48));
                } else if (n2 < 100) {
                    C.a(stringBuilder, n2);
                } else {
                    C.b(stringBuilder, n2, 1);
                }
                return;
            }
            case 0: 
        }
        if (n2 < 100) {
            C.a(stringBuilder, n2);
        } else {
            C.b(stringBuilder, n2, 2);
        }
    }

    @Override
    public final int c() {
        switch (this.a) {
            default: {
                return 4;
            }
            case 0: 
        }
        return 2;
    }
}

