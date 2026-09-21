/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e1;

import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.d1.c;
import com.github.catvod.spider.merge.e1.g;
import com.github.catvod.spider.merge.e1.q;
import com.github.catvod.spider.merge.e1.s;

public final class i
extends q {
    public i(String string, String string2, String string3) {
        block4: {
            block3: {
                block2: {
                    com.github.catvod.spider.merge.c1.d.j(string);
                    com.github.catvod.spider.merge.c1.d.j(string2);
                    com.github.catvod.spider.merge.c1.d.j(string3);
                    super.H("name", string);
                    super.H("publicId", string2);
                    super.H("systemId", string3);
                    if (!this.K("publicId")) break block2;
                    string = "PUBLIC";
                    break block3;
                }
                if (!this.K("systemId")) break block4;
                string = "SYSTEM";
            }
            super.H("pubSysKey", string);
        }
    }

    private boolean K(String string) {
        return com.github.catvod.spider.merge.d1.c.d(super.c(string)) ^ true;
    }

    public final void L(String string) {
        if (string != null) {
            super.H("pubSysKey", string);
        }
    }

    @Override
    public final s l() {
        return this;
    }

    @Override
    public final String s() {
        return "#doctype";
    }

    @Override
    final void v(Appendable appendable, int n2, g object) {
        if (this.b > 0 && ((g)object).i()) {
            appendable.append('\n');
        }
        object = ((g)object).j() == 1 && !this.K("publicId") && !this.K("systemId") ? "<!doctype" : "<!DOCTYPE";
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
    final void w(Appendable appendable, int n2, g g2) {
    }
}

