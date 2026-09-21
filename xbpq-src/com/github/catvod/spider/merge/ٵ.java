/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

public final class \u0675 {
    private static final Pattern \u037f;
    public static final Charset \u0528;
    static final String \u0529;
    private static final char[] \u052a;

    static {
        Charset charset;
        \u037f = Pattern.compile(SOY.d("526D385F2815193A300407120E6F0D055E5F45680A54532A536D792D2A2B097E6A54532A507B"));
        \u0528 = charset = Charset.forName(SOY.d("2F06175B4C"));
        \u0529 = charset.name();
        \u052a = SOY.d("570D604447434F64664E4D471B30321211111D3A381C1F1B173C3E06050509262400030F0328103437333F14163E3D3D311E1C383B272B00022221212D0A082C").toCharArray();
    }
}

