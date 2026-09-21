/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.I;

import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.A;
import com.github.catvod.spider.merge.I.L0;
import com.github.catvod.spider.merge.I.M;
import com.github.catvod.spider.merge.I.X;
import com.github.catvod.spider.merge.O.b;
import com.github.catvod.spider.merge.i0.c;
import java.util.Objects;

public final class x
implements Runnable {
    public final int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ x(Object object, Object object2, int n2) {
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
                X.c((X)this.b, (String)this.c);
                return;
            }
            case 1: {
                M.e((M)this.b, (b)this.c);
                return;
            }
            case 0: {
                A a2 = (A)this.b;
                CharSequence charSequence = (String)this.c;
                Objects.requireNonNull(a2);
                try {
                    a2.b.c = Integer.parseInt((String)charSequence);
                    a2.b.c();
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("\u6446\u6e21\u7ebf\u7a0b\u8bbe\u7f6e\u6210\u529f \u5f53\u524d\u4e3a");
                    ((StringBuilder)charSequence).append(a2.b.c);
                    com.github.catvod.spider.merge.i0.c.b(((StringBuilder)charSequence).toString());
                }
                catch (Exception exception) {
                    Init.show("\u8acb\u8f38\u5165\u6b63\u78ba\u7684\u6578\u5b57");
                }
                return;
            }
        }
        L0 l02 = (L0)this.b;
        CharSequence charSequence = (String)this.c;
        Objects.requireNonNull(l02);
        try {
            l02.n.p((String)charSequence);
            l02.n.j();
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("uc ut\u8bbe\u7f6e\u6210\u529f \u5f53\u524d\u4e3a");
            ((StringBuilder)charSequence).append(l02.n.h());
            com.github.catvod.spider.merge.i0.c.b(((StringBuilder)charSequence).toString());
        }
        catch (Exception exception) {
            Init.show("\u8acb\u8f38\u5165\u6b63\u78ba\u7684\u5b57\u7b26\u4e32");
        }
    }
}

