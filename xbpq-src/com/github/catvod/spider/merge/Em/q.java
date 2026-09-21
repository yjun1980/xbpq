/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Em;

import com.github.catvod.spider.merge.Em.g;
import com.github.catvod.spider.merge.Em.r;
import com.github.catvod.spider.merge.ej.O;
import java.io.IOException;

final class q
implements O {
    private final Appendable a;
    private final g b;

    q(Appendable appendable, g g2) {
        this.a = appendable;
        this.b = g2;
        g2.e();
    }

    @Override
    public final void a(r r2, int n2) {
        try {
            r2.w(this.a, n2, this.b);
            return;
        }
        catch (IOException iOException) {
            throw new com.github.catvod.spider.merge.Dw.q((Throwable)iOException);
        }
    }

    @Override
    public final void b(r r2, int n2) {
        if (!r2.t().equals("#text")) {
            try {
                r2.x(this.a, n2, this.b);
            }
            catch (IOException iOException) {
                throw new com.github.catvod.spider.merge.Dw.q((Throwable)iOException);
            }
        }
    }
}

