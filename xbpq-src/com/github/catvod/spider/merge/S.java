/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import java.nio.charset.Charset;

public class S {
    public static final Charset OL;
    public static final Charset S;
    public static final Charset T4;
    public static final Charset b;
    public static final Charset l;
    public static final Charset l8;

    static {
        l8 = Charset.forName("ISO-8859-1");
        S = Charset.forName("US-ASCII");
        T4 = Charset.forName("UTF-16");
        b = Charset.forName("UTF-16BE");
        OL = Charset.forName("UTF-16LE");
        l = Charset.forName("UTF-8");
    }
}

