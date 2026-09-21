/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.xc.G0.G;

public final class F
extends G {
    public F(String string) {
        this.b = string;
    }

    @Override
    public final String toString() {
        return m.h(new StringBuilder("<![CDATA["), this.b, "]]>");
    }
}

