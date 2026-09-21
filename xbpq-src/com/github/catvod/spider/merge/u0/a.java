/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.u0;

import com.github.catvod.spider.merge.u0.b;
import com.github.catvod.spider.merge.y.d;
import com.github.catvod.spider.merge.y.e;
import java.io.PrintStream;

public class a
extends b {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public a(e object) {
        super((e)object);
        try {
            this.e = com.github.catvod.spider.merge.g.a.b(((e)object).u("shortBylineText"));
            object = ((e)object).u("title");
            boolean bl = object == null;
            object = !bl ? (((e)object).containsKey("simpleText") ? ((e)object).x("simpleText") : com.github.catvod.spider.merge.g.a.b((e)object)) : this.e;
            this.d = object;
            return;
        }
        catch (d d2) {
            PrintStream printStream = System.out;
            object = com.github.catvod.spider.merge.C.a.c("JSON Parsing Error: ");
            ((StringBuilder)object).append(d2.getMessage());
            printStream.println(((StringBuilder)object).toString());
        }
    }
}

