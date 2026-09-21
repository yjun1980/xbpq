/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.v0;

import com.github.catvod.spider.merge.u0.a;
import com.github.catvod.spider.merge.y.e;
import java.util.ArrayList;

public final class c
extends a {
    public c(e e2) {
        super(e2);
        if (!((ArrayList)this.h()).isEmpty()) {
            this.f = ((String)((ArrayList)this.h()).get(0)).contains("/hqdefault_live.jpg?");
        }
        if (e2.containsKey("index")) {
            e2.u("index").r("simpleText");
        }
        e2.p("isPlayable");
    }
}

