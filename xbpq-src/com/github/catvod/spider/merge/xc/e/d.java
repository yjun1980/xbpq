/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.e;

import com.github.catvod.spider.merge.xc.e.a;
import com.github.catvod.spider.merge.xc.e.c;
import com.github.catvod.spider.merge.xc.e.e;
import java.util.Iterator;

public final class d
implements Iterator,
e {
    public c a;
    public boolean b;
    public final a c;

    public d(a a2) {
        this.c = a2;
        this.b = true;
    }

    @Override
    public final void a(c c2) {
        c c3 = this.a;
        if (c2 == c3) {
            this.a = c2 = c3.d;
            boolean bl = c2 == null;
            this.b = bl;
        }
    }

    @Override
    public final boolean hasNext() {
        boolean bl = this.b;
        boolean bl2 = false;
        boolean bl3 = false;
        if (bl) {
            if (this.c.a != null) {
                bl3 = true;
            }
            return bl3;
        }
        c c2 = this.a;
        bl3 = bl2;
        if (c2 != null) {
            bl3 = bl2;
            if (c2.c != null) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public final Object next() {
        if (this.b) {
            this.b = false;
            this.a = this.c.a;
        } else {
            c c2 = this.a;
            c2 = c2 != null ? c2.c : null;
            this.a = c2;
        }
        return this.a;
    }
}

