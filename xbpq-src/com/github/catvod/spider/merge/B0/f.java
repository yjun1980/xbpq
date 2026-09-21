/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.B0;

import com.github.catvod.spider.merge.B0.c;
import com.github.catvod.spider.merge.C0.b;
import com.github.catvod.spider.merge.y.e;

public class f
extends c {
    private final int i;
    private final Integer j;
    private final Integer k;
    private final b l;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public f(e e2, boolean bl, String object) {
        super(e2, bl);
        void var3_11;
        Object var4_13;
        void var3_8;
        this.i = e2.s("fps");
        e2.x("qualityLabel");
        if (e2.containsKey("size")) {
            String[] stringArray = e2.x("size").split("x");
            this.j = Integer.parseInt(stringArray[0]);
            Integer n2 = Integer.parseInt(stringArray[1]);
        } else {
            this.j = e2.s("width");
            Integer n3 = e2.s("height");
        }
        this.k = var3_8;
        Object var3_9 = var4_13 = null;
        if (e2.containsKey("quality")) {
            try {
                b b2 = com.github.catvod.spider.merge.C0.b.valueOf(e2.x("quality"));
            }
            catch (IllegalArgumentException illegalArgumentException) {
                Object var3_12 = var4_13;
            }
        }
        this.l = var3_11;
    }

    public final int i() {
        return this.i;
    }

    public final Integer j() {
        return this.k;
    }

    public final b k() {
        b b2 = this.l;
        if (b2 == null) {
            b2 = this.b.j();
        }
        return b2;
    }

    public final Integer l() {
        return this.j;
    }
}

