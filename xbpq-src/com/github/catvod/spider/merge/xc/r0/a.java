/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.r0;

import com.github.catvod.spider.merge.mI.i;
import java.nio.charset.Charset;

public abstract class a {
    public static final Charset a;

    static {
        Charset charset = Charset.forName("UTF-8");
        i.d(charset, "forName(...)");
        a = charset;
        i.d(Charset.forName("UTF-16"), "forName(...)");
        i.d(Charset.forName("UTF-16BE"), "forName(...)");
        i.d(Charset.forName("UTF-16LE"), "forName(...)");
        i.d(Charset.forName("US-ASCII"), "forName(...)");
        i.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}

