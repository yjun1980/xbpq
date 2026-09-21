/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Em;

import com.github.catvod.spider.merge.Dw.r;
import com.github.catvod.spider.merge.Em.g;
import com.github.catvod.spider.merge.Em.u;
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
        return "#cdata";
    }

    @Override
    final void w(Appendable appendable, int n2, g g2) {
        appendable.append("<![CDATA[").append(this.I());
    }

    @Override
    final void x(Appendable appendable, int n2, g g2) {
        try {
            appendable.append("]]>");
            return;
        }
        catch (IOException iOException) {
            throw new r(iOException);
        }
    }
}

