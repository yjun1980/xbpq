/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u1061;
import java.util.HashMap;
import java.util.Map;

public class \u1065 {
    protected final Map<\u1061, \u1061> \u037f = new HashMap<\u1061, \u1061>();

    public \u1061 \u037f(\u1061 \u10612) {
        \u1061 \u10613 = \u1061.\u037f;
        if (\u10612 == \u10613) {
            return \u10613;
        }
        \u10613 = this.\u037f.get(\u10612);
        if (\u10613 != null) {
            return \u10613;
        }
        this.\u037f.put(\u10612, \u10612);
        return \u10612;
    }

    public \u1061 \u0528(\u1061 \u10612) {
        return this.\u037f.get(\u10612);
    }
}

