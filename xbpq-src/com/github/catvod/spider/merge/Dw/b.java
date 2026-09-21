/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Dw;

import java.nio.charset.Charset;
import java.util.regex.Pattern;

public final class b {
    public static final Charset a;

    static {
        Charset charset;
        Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");
        a = charset = Charset.forName("UTF-8");
        charset.name();
        "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    }
}

