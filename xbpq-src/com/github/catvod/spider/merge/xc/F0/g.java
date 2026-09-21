/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.F0;

import com.github.catvod.spider.merge.xc.D0.a;
import com.github.catvod.spider.merge.xc.F0.m;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public final class g
implements Cloneable {
    public m a = m.f;
    public Charset b = com.github.catvod.spider.merge.xc.D0.a.a;
    public final ThreadLocal c = new ThreadLocal();
    public int d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;

    public g() {
        this.e = true;
        this.f = 1;
        this.g = 30;
        this.h = 1;
    }

    public final g a() {
        String string;
        g g2;
        try {
            g2 = (g)super.clone();
            string = this.b.name();
            g2.getClass();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
        g2.b = Charset.forName(string);
        g2.a = m.valueOf(this.a.name());
        return g2;
    }

    public final CharsetEncoder b() {
        CharsetEncoder charsetEncoder = this.b.newEncoder();
        this.c.set(charsetEncoder);
        String string = charsetEncoder.charset().name();
        int n2 = string.equals("US-ASCII") ? 1 : (string.startsWith("UTF-") ? 2 : 3);
        this.d = n2;
        return charsetEncoder;
    }
}

