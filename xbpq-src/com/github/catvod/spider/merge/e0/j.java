/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.N.a;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.N;

public abstract class j
extends N {
    String a;
    String b;

    public j(String string, String string2, boolean bl) {
        com.github.catvod.spider.merge.N.a.i(string);
        com.github.catvod.spider.merge.N.a.i(string2);
        this.a = com.github.catvod.spider.merge.x.a.d(string);
        string = cYh.d("40");
        boolean bl2 = string2.startsWith(string) && string2.endsWith(string) || string2.startsWith(string = cYh.d("45")) && string2.endsWith(string);
        string = string2;
        if (bl2) {
            string = string2.substring(1, string2.length() - 1);
        }
        string = bl ? com.github.catvod.spider.merge.x.a.d(string) : (bl2 ? com.github.catvod.spider.merge.x.a.c(string) : com.github.catvod.spider.merge.x.a.d(string));
        this.b = string;
    }
}

