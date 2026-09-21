/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Em;

import com.github.catvod.spider.merge.Dw.e;
import com.github.catvod.spider.merge.Em.g;
import com.github.catvod.spider.merge.Em.p;
import com.github.catvod.spider.merge.Em.r;

public final class i
extends p {
    public i(String string, String string2, String string3) {
        block4: {
            block3: {
                block2: {
                    com.github.catvod.spider.merge.Dw.i.k(string);
                    com.github.catvod.spider.merge.Dw.i.k(string2);
                    com.github.catvod.spider.merge.Dw.i.k(string3);
                    super.b("name", string);
                    super.b("publicId", string2);
                    super.b("systemId", string3);
                    if (!this.K("publicId")) break block2;
                    string = "PUBLIC";
                    break block3;
                }
                if (!this.K("systemId")) break block4;
                string = "SYSTEM";
            }
            super.b("pubSysKey", string);
        }
    }

    private boolean K(String string) {
        return com.github.catvod.spider.merge.Dw.e.c(super.c(string)) ^ true;
    }

    public final void L(String string) {
        if (string != null) {
            super.b("pubSysKey", string);
        }
    }

    @Override
    public final r m() {
        return this;
    }

    @Override
    public final String t() {
        return "#doctype";
    }

    @Override
    final void w(Appendable appendable, int n2, g object) {
        object = ((g)object).g() == 1 && !this.K("publicId") && !this.K("systemId") ? "<!doctype" : "<!DOCTYPE";
        appendable.append((CharSequence)object);
        if (this.K("name")) {
            appendable.append(" ").append(super.c("name"));
        }
        if (this.K("pubSysKey")) {
            appendable.append(" ").append(super.c("pubSysKey"));
        }
        if (this.K("publicId")) {
            appendable.append(" \"").append(super.c("publicId")).append('\"');
        }
        if (this.K("systemId")) {
            appendable.append(" \"").append(super.c("systemId")).append('\"');
        }
        appendable.append('>');
    }

    @Override
    final void x(Appendable appendable, int n2, g g2) {
    }
}

