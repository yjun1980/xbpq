/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.KT;

import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.KT.C;

public final class f {
    public final String a;
    public final String b;
    public final String c;

    public f(String string, String string2, String string3) {
        String string4 = string;
        if (string == null) {
            string4 = "";
        }
        this.a = string4;
        string = string2;
        if (string2 == null) {
            string = "";
        }
        this.b = string;
        string = string3;
        if (string3 == null) {
            string = "";
        }
        this.c = string;
    }

    public final String toString() {
        String string = this.b;
        string = C.B(string) ? "" : m.q("  ", string);
        return m.h(new StringBuilder(), this.a, string);
    }
}

