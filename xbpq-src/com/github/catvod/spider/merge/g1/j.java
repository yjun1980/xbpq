/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g1;

import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.g1.N;

public abstract class j
extends N {
    String a;
    String b;

    public j(String string, String string2, boolean bl) {
        d.h(string);
        d.h(string2);
        this.a = com.github.catvod.spider.merge.K1.d.i(string);
        boolean bl2 = string2.startsWith("'") && string2.endsWith("'") || string2.startsWith("\"") && string2.endsWith("\"");
        string = string2;
        if (bl2) {
            string = string2.substring(1, string2.length() - 1);
        }
        string = bl ? com.github.catvod.spider.merge.K1.d.i(string) : (bl2 ? com.github.catvod.spider.merge.K1.d.e(string) : com.github.catvod.spider.merge.K1.d.i(string));
        this.b = string;
    }
}

