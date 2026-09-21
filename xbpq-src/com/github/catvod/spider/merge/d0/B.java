/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

public final class B {
    private int a;
    private String b;

    B(int n2, String string) {
        this.a = n2;
        this.b = string;
    }

    B(int n2, String string, Object ... objectArray) {
        this.b = String.format(string, objectArray);
        this.a = n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append(cYh.d("5D70"));
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}

