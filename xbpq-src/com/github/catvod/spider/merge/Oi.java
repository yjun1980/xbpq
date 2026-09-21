/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.FR;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.g9;
import com.github.catvod.spider.merge.tv;

public class Oi
extends FR {
    public Oi(String string, String string2, String string3) {
        Rc.HM(string);
        Rc.HM(string2);
        Rc.HM(string3);
        this.b("name", string);
        this.b("publicId", string2);
        this.b("systemId", string3);
        this.B();
    }

    private void B() {
        if (this.x("publicId")) {
            this.b("pubSysKey", "PUBLIC");
        } else if (this.x("systemId")) {
            this.b("pubSysKey", "SYSTEM");
        }
    }

    private boolean x(String string) {
        return tv.l(this.T4(string)) ^ true;
    }

    public void FG(String string) {
        if (string != null) {
            this.b("pubSysKey", string);
        }
    }

    @Override
    public String Q() {
        return "#doctype";
    }

    @Override
    void R(Appendable appendable, int n2, g9.aA aA2) {
    }

    @Override
    void r1(Appendable appendable, int n2, g9.aA aA2) {
        if (aA2.n() == g9.aA.aA.l8 && !this.x("publicId") && !this.x("systemId")) {
            appendable.append("<!doctype");
        } else {
            appendable.append("<!DOCTYPE");
        }
        if (this.x("name")) {
            appendable.append(" ").append(this.T4("name"));
        }
        if (this.x("pubSysKey")) {
            appendable.append(" ").append(this.T4("pubSysKey"));
        }
        if (this.x("publicId")) {
            appendable.append(" \"").append(this.T4("publicId")).append('\"');
        }
        if (this.x("systemId")) {
            appendable.append(" \"").append(this.T4("systemId")).append('\"');
        }
        appendable.append('>');
    }
}

