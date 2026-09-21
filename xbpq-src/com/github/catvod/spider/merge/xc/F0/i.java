/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.F0;

import com.github.catvod.spider.merge.xc.E0.b;
import com.github.catvod.spider.merge.xc.F0.g;
import com.github.catvod.spider.merge.xc.F0.p;

public final class i
extends p {
    public i(String string, String string2, String string3) {
        com.github.catvod.spider.merge.xc.D0.b.A(string);
        com.github.catvod.spider.merge.xc.D0.b.A(string2);
        com.github.catvod.spider.merge.xc.D0.b.A(string3);
        this.x("name", string);
        this.x("publicId", string2);
        this.x("systemId", string3);
        if (this.A("publicId")) {
            this.x("pubSysKey", "PUBLIC");
        } else if (this.A("systemId")) {
            this.x("pubSysKey", "SYSTEM");
        }
    }

    public final boolean A(String string) {
        return com.github.catvod.spider.merge.xc.E0.b.d(this.c(string)) ^ true;
    }

    @Override
    public final String o() {
        return "#doctype";
    }

    @Override
    public final void q(Appendable appendable, int n2, g g2) {
        if (this.b > 0 && g2.e) {
            appendable.append('\n');
        }
        if (g2.h == 1 && !this.A("publicId") && !this.A("systemId")) {
            appendable.append("<!doctype");
        } else {
            appendable.append("<!DOCTYPE");
        }
        if (this.A("name")) {
            appendable.append(" ").append(this.c("name"));
        }
        if (this.A("pubSysKey")) {
            appendable.append(" ").append(this.c("pubSysKey"));
        }
        if (this.A("publicId")) {
            appendable.append(" \"").append(this.c("publicId")).append('\"');
        }
        if (this.A("systemId")) {
            appendable.append(" \"").append(this.c("systemId")).append('\"');
        }
        appendable.append('>');
    }

    @Override
    public final void r(Appendable appendable, int n2, g g2) {
    }
}

