/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.k1;

import com.github.catvod.spider.merge.k1.c;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public abstract class e
implements Serializable {
    private final int a;
    private final int b;
    private final String c;
    private final String d;
    private List<c> e = Collections.emptyList();

    public e(int n2, int n3, String string, String string2) {
        this.a = n2;
        this.b = n3;
        this.c = string;
        this.d = string2;
    }

    public final int a() {
        return this.a;
    }

    public final String b() {
        return this.d;
    }

    public final int c() {
        return this.b;
    }

    public final List<c> d() {
        return this.e;
    }

    public final String e() {
        return this.c;
    }

    public final void f(List<c> list) {
        this.e = list;
    }

    public String toString() {
        String string = this.getClass().getSimpleName();
        String string2 = this.c;
        String string3 = this.d;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("[url=\"");
        stringBuilder.append(string2);
        stringBuilder.append("\", name=\"");
        stringBuilder.append(string3);
        stringBuilder.append("\"]");
        return stringBuilder.toString();
    }
}

