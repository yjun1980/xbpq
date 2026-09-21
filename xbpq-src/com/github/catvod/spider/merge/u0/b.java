/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.u0;

import com.github.catvod.spider.merge.g.a;
import com.github.catvod.spider.merge.y.e;
import java.util.ArrayList;
import java.util.List;

public abstract class b {
    protected String a;
    private List<String> b;
    protected int c;
    protected String d;
    protected String e;
    protected boolean f;

    public b() {
    }

    public b(e e2) {
        this.a = e2.x("videoId");
        if (e2.containsKey("lengthSeconds")) {
            this.c = e2.r("lengthSeconds");
        }
        this.b = (ArrayList)com.github.catvod.spider.merge.g.a.c(e2.u("thumbnail"));
    }

    public boolean b() {
        return this.f;
    }

    public final String c() {
        return this.d;
    }

    public final int e() {
        return this.c;
    }

    public final List<String> h() {
        return this.b;
    }

    public final String i() {
        return this.a;
    }
}

