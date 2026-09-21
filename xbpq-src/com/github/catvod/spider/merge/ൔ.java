/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u02c6;
import com.github.catvod.spider.merge.\u0864;
import com.github.catvod.spider.merge.\u0cf1;

public final class \u0d54
implements \u0cf1 {
    private final int \u037f;
    private final \u0cf1 \u0528;

    public \u0d54(int n2, \u0cf1 \u0cf12) {
        this.\u037f = n2;
        this.\u0528 = \u0cf12;
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (object == this) {
            return true;
        }
        if (!(object instanceof \u0d54)) {
            return false;
        }
        object = (\u0d54)object;
        if (this.\u037f != ((\u0d54)object).\u037f || !this.\u0528.equals(((\u0d54)object).\u0528)) {
            bl = false;
        }
        return bl;
    }

    public int hashCode() {
        return \u02c6.\u037f(\u02c6.\u052c(\u02c6.\u052b(\u02c6.\u0529(), this.\u037f), this.\u0528), 2);
    }

    @Override
    public boolean \u037f() {
        return true;
    }

    @Override
    public void \u0528(\u0864 \u08642) {
        this.\u0528.\u0528(\u08642);
    }

    public \u0cf1 \u0529() {
        return this.\u0528;
    }

    public int \u052a() {
        return this.\u037f;
    }
}

