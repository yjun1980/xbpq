/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u078f;
import com.github.catvod.spider.merge.\u0792;
import com.github.catvod.spider.merge.\u0796;
import com.github.catvod.spider.merge.\u0797;

public class \u0794 {
    public \u0792 \u037f;
    public \u078f \u0528;

    public \u0794(\u0792 \u07922, \u078f \u078f2) {
        this.\u037f = \u07922;
        this.\u0528 = \u078f2;
    }

    public \u0797 \u037f() {
        return this.\u0528(false);
    }

    public \u0797 \u0528(boolean bl) {
        \u0797 \u07972 = \u0796.\u052a(this.\u037f.\u037f, this.\u0528.\u037f());
        \u07972.\u052a(\u0796.\u052a(this.\u037f.\u0528, this.\u0528.\u037f()).\u037f());
        if (bl) {
            \u07972.\u0529(0, new byte[]{0, 4});
        }
        return \u07972;
    }
}

