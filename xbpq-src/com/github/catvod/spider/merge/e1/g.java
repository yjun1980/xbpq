/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e1;

import com.github.catvod.spider.merge.c1.c;
import com.github.catvod.spider.merge.e1.n;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Objects;

public final class g
implements Cloneable {
    private n a = n.f;
    private Charset b = com.github.catvod.spider.merge.c1.c.b;
    private final ThreadLocal<CharsetEncoder> c = new ThreadLocal();
    int d;
    private boolean e = true;
    private int f = 1;
    private int g = 30;
    private int h = 1;

    public final g a(Charset charset) {
        this.b = charset;
        return this;
    }

    public final Charset b() {
        return this.b;
    }

    public final g c() {
        String string;
        g g2;
        try {
            g2 = (g)super.clone();
            string = this.b.name();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
        Objects.requireNonNull(g2);
        g2.b = Charset.forName(string);
        g2.a = n.valueOf(this.a.name());
        return g2;
    }

    final CharsetEncoder d() {
        CharsetEncoder charsetEncoder = this.c.get();
        if (charsetEncoder == null) {
            charsetEncoder = this.h();
        }
        return charsetEncoder;
    }

    public final n e() {
        return this.a;
    }

    public final int f() {
        return this.f;
    }

    public final int g() {
        return this.g;
    }

    final CharsetEncoder h() {
        CharsetEncoder charsetEncoder = this.b.newEncoder();
        this.c.set(charsetEncoder);
        String string = charsetEncoder.charset().name();
        int n2 = string.equals("US-ASCII") ? 1 : (string.startsWith("UTF-") ? 2 : 3);
        this.d = n2;
        return charsetEncoder;
    }

    public final boolean i() {
        return this.e;
    }

    public final int j() {
        return this.h;
    }
}

