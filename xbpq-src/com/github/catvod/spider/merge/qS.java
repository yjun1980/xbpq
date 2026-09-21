/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import java.nio.charset.Charset;
import java.util.regex.Pattern;

public final class qS {
    public static final Charset S;
    static final String T4;
    private static final char[] b;
    private static final Pattern l8;

    static {
        Charset charset;
        l8 = Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");
        S = charset = Charset.forName("UTF-8");
        T4 = charset.name();
        b = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    }
}

