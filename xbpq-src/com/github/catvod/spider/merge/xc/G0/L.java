/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.xc.G0.M;

public final class L
extends M {
    public L() {
        this.a = 2;
    }

    @Override
    public final M p() {
        super.p();
        this.l = null;
        return this;
    }

    public final String toString() {
        boolean bl = this.l();
        String string = "[unset]";
        if (bl && this.l.a > 0) {
            StringBuilder stringBuilder = new StringBuilder("<");
            String string2 = this.b;
            if (string2 != null) {
                string = string2;
            }
            stringBuilder.append(string);
            stringBuilder.append(" ");
            stringBuilder.append(this.l.toString());
            stringBuilder.append(">");
            return stringBuilder.toString();
        }
        StringBuilder stringBuilder = new StringBuilder("<");
        String string3 = this.b;
        if (string3 != null) {
            string = string3;
        }
        return m.h(stringBuilder, string, ">");
    }
}

