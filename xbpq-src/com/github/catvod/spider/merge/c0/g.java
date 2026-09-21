/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.c0;

import com.github.catvod.spider.merge.a0.b;
import com.github.catvod.spider.merge.c0.m;
import com.github.catvod.spider.merge.cYh;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public final class g
implements Cloneable {
    private m c = m.h;
    private Charset d = b.a;
    private final ThreadLocal<CharsetEncoder> e = new ThreadLocal();
    int f;
    private boolean g = true;
    private int h = 1;
    private int i = 1;

    public final g a() {
        String string;
        g g2;
        try {
            g2 = (g)super.clone();
            string = this.d.name();
            g2.getClass();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
        g2.d = Charset.forName(string);
        g2.c = m.valueOf(this.c.name());
        return g2;
    }

    final CharsetEncoder b() {
        CharsetEncoder charsetEncoder = this.e.get();
        if (charsetEncoder == null) {
            charsetEncoder = this.e();
        }
        return charsetEncoder;
    }

    public final m c() {
        return this.c;
    }

    public final int d() {
        return this.h;
    }

    final CharsetEncoder e() {
        CharsetEncoder charsetEncoder = this.d.newEncoder();
        this.e.set(charsetEncoder);
        String string = charsetEncoder.charset().name();
        int n2 = string.equals(cYh.d("32036C1004192E19")) ? 1 : (string.startsWith(cYh.d("3204077C")) ? 2 : 3);
        this.f = n2;
        return charsetEncoder;
    }

    public final boolean f() {
        return this.g;
    }

    public final int g() {
        return this.i;
    }
}

