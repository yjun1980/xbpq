/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.KT;

public final class A {
    public final String a;
    public final String b;
    public final long c;
    public String d;

    public A(String string, String string2, long l2, String string3) {
        string = string == null ? "" : string.trim();
        this.a = string;
        string = string2 == null ? "" : string2.trim();
        this.b = string;
        this.c = l2;
        string = string3;
        if (string3 == null) {
            string = "";
        }
        this.d = string;
    }
}

