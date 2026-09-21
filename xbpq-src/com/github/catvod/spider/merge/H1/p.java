/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H1;

import com.github.catvod.spider.merge.H1.f;
import com.github.catvod.spider.merge.H1.n;
import com.github.catvod.spider.merge.K1.g;
import com.github.catvod.spider.merge.k1.i;
import java.util.Locale;

public final class p
extends f {
    private final boolean e;
    private final String f;

    p(String object, String string, boolean bl, i i2, String string2, boolean bl2) {
        super(string, bl, i2, 1);
        object = (Locale)g.a(string2).orElseThrow(new n(string2));
        this.f = string2;
        this.e = bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean b(f f2) {
        if (!super.b(f2)) return false;
        if (!(f2 instanceof p)) return false;
        String string = this.f;
        f2 = (p)f2;
        if (!string.equals(((p)f2).f)) return false;
        if (this.e != ((p)f2).e) return false;
        return true;
    }
}

