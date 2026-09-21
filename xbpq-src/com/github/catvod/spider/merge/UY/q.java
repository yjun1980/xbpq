/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.UY;

public final class q {
    public final String a;
    public final String b;
    public final String c;

    public q(int n2, String string, String string2) {
        this.a = string;
        this.b = "0";
        this.c = string2;
    }

    public q(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    public q(String string, String string2, String string3) {
        this.a = string;
        string = string2;
        if (string2 == null) {
            string = "";
        }
        this.b = string;
        this.c = string3;
    }
}

