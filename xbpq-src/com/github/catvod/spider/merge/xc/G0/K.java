/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.xc.G0.M;

public final class K
extends M {
    public K() {
        this.a = 3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("</");
        String string = this.b;
        if (string == null) {
            string = "[unset]";
        }
        return m.h(stringBuilder, string, ">");
    }
}

