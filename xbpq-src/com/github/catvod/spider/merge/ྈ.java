/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u02c6;
import com.github.catvod.spider.merge.\u0864;
import com.github.catvod.spider.merge.\u0cf1;
import com.github.catvod.spider.merge.\u0d29;

public class \u0f88
implements \u0cf1 {
    private final int \u037f;

    public \u0f88(int n2) {
        this.\u037f = n2;
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (object == this) {
            return true;
        }
        if (!(object instanceof \u0f88)) {
            return false;
        }
        if (this.\u037f != ((\u0f88)object).\u037f) {
            bl = false;
        }
        return bl;
    }

    public int hashCode() {
        return \u02c6.\u037f(\u02c6.\u052b(\u02c6.\u052b(\u02c6.\u0529(), this.\u0529().ordinal()), this.\u037f), 2);
    }

    public String toString() {
        int n2 = this.\u037f;
        return String.format(SOY.d("0E2B21135C521E7B"), n2);
    }

    @Override
    public boolean \u037f() {
        return false;
    }

    @Override
    public void \u0528(\u0864 \u08642) {
        \u08642.\u0792(this.\u037f);
    }

    public \u0d29 \u0529() {
        return \u0d29.\u052e;
    }
}

