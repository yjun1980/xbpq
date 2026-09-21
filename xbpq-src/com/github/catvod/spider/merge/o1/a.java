/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.o1;

import com.github.catvod.spider.merge.K1.p;
import java.io.Serializable;

public class a
implements Serializable {
    protected final String a;
    protected final String b;
    protected final String c;

    public a(String string, String string2, String string3) {
        this.a = string;
        this.b = string2;
        this.c = string3;
    }

    public final String a() {
        return p.e(this.b);
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }
}

