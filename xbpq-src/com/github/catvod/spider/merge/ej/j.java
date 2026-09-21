/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.ej;

import com.github.catvod.spider.merge.Dw.i;
import com.github.catvod.spider.merge.Dw.s;
import com.github.catvod.spider.merge.ej.N;

public abstract class j
extends N {
    String a;
    String b;

    public j(String string, String string2, boolean bl) {
        i.i(string);
        i.i(string2);
        this.a = s.d(string);
        boolean bl2 = string2.startsWith("'") && string2.endsWith("'") || string2.startsWith("\"") && string2.endsWith("\"");
        string = string2;
        if (bl2) {
            string = string2.substring(1, string2.length() - 1);
        }
        string = bl ? s.d(string) : (bl2 ? s.c(string) : s.d(string));
        this.b = string;
    }
}

