/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.c0;

import com.github.catvod.spider.merge.Z.a;
import com.github.catvod.spider.merge.c0.g;
import com.github.catvod.spider.merge.c0.r;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.O;
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
            throw new a(iOException);
        }
    }

    @Override
    public final void b(r r2, int n2) {
        if (!r2.t().equals(cYh.d("4424242923"))) {
            try {
                r2.x(this.a, n2, this.b);
            }
            catch (IOException iOException) {
                throw new a(iOException);
            }
        }
    }
}

