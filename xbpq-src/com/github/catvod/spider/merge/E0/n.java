/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.N;
import com.github.catvod.spider.merge.E0.d;
import com.github.catvod.spider.merge.E0.h;
import com.github.catvod.spider.merge.E0.i;
import com.github.catvod.spider.merge.E0.k;
import com.github.catvod.spider.merge.E0.l;
import com.github.catvod.spider.merge.E0.m;
import com.github.catvod.spider.merge.E0.o;
import com.github.catvod.spider.merge.I.r;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

public abstract class n
implements Iterable<Byte>,
Serializable {
    public static final n b = new l(N.b);
    private static final k c;
    private int a = 0;

    static {
        k k2 = d.b() ? new m() : new i();
        c = k2;
    }

    n() {
    }

    static int c(int n2, int n3, int n4) {
        int n5 = n3 - n2;
        if ((n2 | n3 | n5 | n4 - n3) < 0) {
            if (n2 >= 0) {
                if (n3 < n2) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Beginning index larger than ending index: ");
                    stringBuilder.append(n2);
                    stringBuilder.append(", ");
                    stringBuilder.append(n3);
                    throw new IndexOutOfBoundsException(stringBuilder.toString());
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("End index: ");
                stringBuilder.append(n3);
                stringBuilder.append(" >= ");
                stringBuilder.append(n4);
                throw new IndexOutOfBoundsException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Beginning index: ");
            stringBuilder.append(n2);
            stringBuilder.append(" < 0");
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
        return n5;
    }

    public static n d(byte[] byArray, int n2, int n3) {
        n.c(n2, n2 + n3, byArray.length);
        return new l(c.a(byArray, n2, n3));
    }

    public abstract byte a(int var1);

    public abstract boolean equals(Object var1);

    abstract byte f(int var1);

    protected abstract int g(int var1, int var2);

    public final int hashCode() {
        int n2;
        int n3 = n2 = this.a;
        if (n2 == 0) {
            n3 = this.size();
            n3 = n2 = this.g(n3, n3);
            if (n2 == 0) {
                n3 = 1;
            }
            this.a = n3;
        }
        return n3;
    }

    protected final int i() {
        return this.a;
    }

    @Override
    public Iterator iterator() {
        return new h(this);
    }

    public abstract n j(int var1);

    public abstract int size();

    public final String toString() {
        Locale locale = Locale.ROOT;
        String string = Integer.toHexString(System.identityHashCode(this));
        int n2 = this.size();
        String string2 = this.size() <= 50 ? o.a(this) : r.c(new StringBuilder(), o.a(this.j(47)), "...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", string, n2, string2);
    }
}

