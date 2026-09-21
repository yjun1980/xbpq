/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.I;

import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.s0;
import com.github.catvod.spider.merge.i0.c;
import java.util.Objects;

public final class l0
implements Runnable {
    public final int a;
    public final s0 b;
    public final String c;

    public /* synthetic */ l0(s0 s02, String string, int n2) {
        this.a = n2;
        this.b = s02;
        this.c = string;
    }

    @Override
    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                s0.g(this.b, this.c);
                return;
            }
        }
        s0 s02 = this.b;
        CharSequence charSequence = this.c;
        Objects.requireNonNull(s02);
        try {
            s02.m.d = Integer.parseInt((String)charSequence);
            s02.m.i();
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("\u5938\u514b\u7ebf\u7a0b\u8bbe\u7f6e\u6210\u529f \u5f53\u524d\u4e3a");
            ((StringBuilder)charSequence).append(s02.m.d);
            com.github.catvod.spider.merge.i0.c.b(((StringBuilder)charSequence).toString());
        }
        catch (Exception exception) {
            Init.show("\u8acb\u8f38\u5165\u6b63\u78ba\u7684\u6578\u5b57");
        }
    }
}

