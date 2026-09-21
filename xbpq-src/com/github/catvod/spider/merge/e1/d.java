/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e1;

import com.github.catvod.spider.merge.b1.b;
import com.github.catvod.spider.merge.e1.g;
import com.github.catvod.spider.merge.e1.v;
import java.io.IOException;

public final class d
extends v {
    public d(String string) {
        super(string);
    }

    public final d N() {
        return (d)super.K();
    }

    @Override
    public final String s() {
        return "#cdata";
    }

    @Override
    final void v(Appendable appendable, int n2, g g2) {
        appendable.append("<![CDATA[").append(this.I());
    }

    @Override
    final void w(Appendable appendable, int n2, g g2) {
        try {
            appendable.append("]]>");
            return;
        }
        catch (IOException iOException) {
            throw new b(iOException);
        }
    }
}

