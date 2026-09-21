/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.B0;

import com.github.catvod.spider.merge.xc.B0.D;
import com.github.catvod.spider.merge.xc.B0.c;
import java.io.Serializable;
import java.util.Locale;

public abstract class a {
    public static final int a = 0;

    static {
        Serializable serializable = D.a;
        c.a("yyyy-MM-dd'T'HH:mm:ss");
        c.a("yyyy-MM-dd'T'HH:mm:ssZZ");
        c.a("yyyy-MM-dd");
        c.a("yyyy-MM-ddZZ");
        c.a("'T'HH:mm:ss");
        c.a("'T'HH:mm:ssZZ");
        c.a("HH:mm:ss");
        c.a("HH:mm:ssZZ");
        serializable = Locale.US;
        serializable = (c)c.c.a("EEE, dd MMM yyyy HH:mm:ss Z", (Locale)serializable);
    }
}

