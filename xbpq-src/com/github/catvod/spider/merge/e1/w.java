/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e1;

import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.e1.a;
import com.github.catvod.spider.merge.e1.c;
import com.github.catvod.spider.merge.e1.g;
import com.github.catvod.spider.merge.e1.o;
import com.github.catvod.spider.merge.e1.q;
import com.github.catvod.spider.merge.e1.s;
import java.util.Objects;

public final class w
extends q {
    private final boolean e;

    public w(String string, boolean bl) {
        com.github.catvod.spider.merge.c1.d.j(string);
        this.d = string;
        this.e = bl;
    }

    public final String K() {
        return this.I();
    }

    @Override
    public final Object clone() {
        return (w)super.i();
    }

    @Override
    public final s i() {
        return (w)super.i();
    }

    @Override
    public final s l() {
        return this;
    }

    @Override
    public final String s() {
        return "#declaration";
    }

    @Override
    public final String toString() {
        return this.t();
    }

    @Override
    final void v(Appendable appendable, int n2, g object) {
        Object object2 = appendable.append("<");
        boolean bl = this.e;
        String string = "!";
        String string2 = bl ? "!" : "?";
        object2.append(string2).append(this.I());
        object2 = this.d();
        Objects.requireNonNull(object2);
        n2 = 0;
        while (true) {
            if (n2 < com.github.catvod.spider.merge.e1.c.a((c)object2) && com.github.catvod.spider.merge.e1.c.c((c)object2, ((c)object2).b[n2])) {
                ++n2;
                continue;
            }
            boolean bl2 = n2 < com.github.catvod.spider.merge.e1.c.a((c)object2);
            if (!bl2) break;
            Object object3 = new a(((c)object2).b[n2], (String)((c)object2).c[n2], (c)object2);
            string2 = ((a)object3).a();
            object3 = ((a)object3).c();
            if (!string2.equals("#declaration")) {
                appendable.append(' ');
                appendable.append(string2);
                if (!((String)object3).isEmpty()) {
                    appendable.append("=\"");
                    o.e(appendable, (String)object3, (g)object, true, false, false, false);
                    appendable.append('\"');
                }
            }
            ++n2;
        }
        object = this.e ? string : "?";
        appendable.append((CharSequence)object).append(">");
    }

    @Override
    final void w(Appendable appendable, int n2, g g2) {
    }
}

