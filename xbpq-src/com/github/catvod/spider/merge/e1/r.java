/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e1;

import com.github.catvod.spider.merge.b1.a;
import com.github.catvod.spider.merge.e1.g;
import com.github.catvod.spider.merge.e1.s;
import com.github.catvod.spider.merge.g1.O;
import java.io.IOException;

final class r
implements O {
    private final Appendable a;
    private final g b;

    r(Appendable appendable, g g2) {
        this.a = appendable;
        this.b = g2;
        g2.h();
    }

    @Override
    public final void a(s s2, int n2) {
        try {
            s2.v(this.a, n2, this.b);
            return;
        }
        catch (IOException iOException) {
            throw new a(iOException);
        }
    }

    @Override
    public final void b(s s2, int n2) {
        if (!s2.s().equals("#text")) {
            try {
                s2.w(this.a, n2, this.b);
            }
            catch (IOException iOException) {
                throw new a(iOException);
            }
        }
    }
}

