/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u02c6;
import com.github.catvod.spider.merge.\u0864;
import com.github.catvod.spider.merge.\u0cf1;
import com.github.catvod.spider.merge.\u0d29;

public final class \u0d4e
implements \u0cf1 {
    private final int \u037f;
    private final int \u0528;

    public \u0d4e(int n2, int n3) {
        this.\u037f = n2;
        this.\u0528 = n3;
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (object == this) {
            return true;
        }
        if (!(object instanceof \u0d4e)) {
            return false;
        }
        object = (\u0d4e)object;
        if (this.\u037f != ((\u0d4e)object).\u037f || this.\u0528 != ((\u0d4e)object).\u0528) {
            bl = false;
        }
        return bl;
    }

    public int hashCode() {
        return \u02c6.\u037f(\u02c6.\u052b(\u02c6.\u052b(\u02c6.\u052b(\u02c6.\u0529(), this.\u0529().ordinal()), this.\u037f), this.\u0528), 3);
    }

    @Override
    public boolean \u037f() {
        return true;
    }

    @Override
    public void \u0528(\u0864 \u08642) {
        \u08642.\u052c(null, this.\u037f, this.\u0528);
    }

    public \u0d29 \u0529() {
        return \u0d29.\u0528;
    }
}

