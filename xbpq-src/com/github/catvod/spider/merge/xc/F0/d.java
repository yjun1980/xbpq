/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.F0;

import com.github.catvod.spider.merge.xc.C0.a;
import com.github.catvod.spider.merge.xc.F0.g;
import com.github.catvod.spider.merge.xc.F0.q;
import com.github.catvod.spider.merge.xc.F0.s;
import java.io.IOException;

public final class d
extends s {
    public d(String string) {
        super(string);
    }

    @Override
    public final s A() {
        return (d)super.A();
    }

    @Override
    public final Object clone() {
        return (d)super.A();
    }

    @Override
    public final q g() {
        return (d)super.A();
    }

    @Override
    public final String o() {
        return "#cdata";
    }

    @Override
    public final void q(Appendable appendable, int n2, g g2) {
        appendable.append("<![CDATA[").append(this.y());
    }

    @Override
    public final void r(Appendable appendable, int n2, g g2) {
        try {
            appendable.append("]]>");
            return;
        }
        catch (IOException iOException) {
            throw new a(iOException);
        }
    }
}

