/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.c0;

import com.github.catvod.spider.merge.Z.b;
import com.github.catvod.spider.merge.c0.g;
import com.github.catvod.spider.merge.c0.u;
import com.github.catvod.spider.merge.cYh;
import java.io.IOException;

public final class d
extends u {
    public d(String string) {
        super(string);
    }

    public final d N() {
        return (d)super.K();
    }

    @Override
    public final String t() {
        return cYh.d("44332530233B");
    }

    @Override
    final void w(Appendable appendable, int n2, g g2) {
        appendable.append(cYh.d("5B711A12131B33111A")).append(this.I());
    }

    @Override
    final void x(Appendable appendable, int n2, g g2) {
        try {
            appendable.append(cYh.d("3A0D7F"));
            return;
        }
        catch (IOException iOException) {
            throw new b(iOException);
        }
    }
}

