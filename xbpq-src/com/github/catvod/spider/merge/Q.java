/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;

public class Q {
    public static final Charset S;
    public static final Charset T4;
    public static final Charset l8;

    static {
        Charset charset;
        l8 = StandardCharsets.ISO_8859_1;
        S = StandardCharsets.UTF_8;
        try {
            charset = Charset.forName("GBK");
        }
        catch (UnsupportedCharsetException unsupportedCharsetException) {
            charset = null;
        }
        T4 = charset;
    }
}

