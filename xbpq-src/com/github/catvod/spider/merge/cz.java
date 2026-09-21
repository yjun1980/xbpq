/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

public class cz {
    private String S;
    private int l8;

    cz(int n2, String string) {
        this.l8 = n2;
        this.S = string;
    }

    cz(int n2, String string, Object ... objectArray) {
        this.S = String.format(string, objectArray);
        this.l8 = n2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.l8);
        stringBuilder.append(": ");
        stringBuilder.append(this.S);
        return stringBuilder.toString();
    }
}

