/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u02b6;
import com.github.catvod.spider.merge.\u0374;
import java.io.Writer;

@Deprecated
public class \u02b0
extends \u02b6 {
    private final \u02b6[] \u0528;

    public \u02b0(\u02b6 ... \u02b6Array) {
        this.\u0528 = \u0374.\u037f(\u02b6Array);
    }

    @Override
    public int \u0528(CharSequence charSequence, int n2, Writer writer) {
        \u02b6[] \u02b6Array = this.\u0528;
        int n3 = \u02b6Array.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4 = \u02b6Array[i2].\u0528(charSequence, n2, writer);
            if (n4 == 0) continue;
            return n4;
        }
        return 0;
    }
}

