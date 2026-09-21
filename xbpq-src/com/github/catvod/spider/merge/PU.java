/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.DQ;
import com.github.catvod.spider.merge.VU;
import com.github.catvod.spider.merge.g9;
import java.io.IOException;

public class PU
extends DQ {
    public PU(String string) {
        super(string);
    }

    @Override
    public String Q() {
        return "#cdata";
    }

    @Override
    void R(Appendable appendable, int n2, g9.aA aA2) {
        try {
            appendable.append("]]>");
            return;
        }
        catch (IOException iOException) {
            throw new VU(iOException);
        }
    }

    public PU U() {
        return (PU)super.x();
    }

    @Override
    void r1(Appendable appendable, int n2, g9.aA aA2) {
        appendable.append("<![CDATA[").append(this.FG());
    }
}

