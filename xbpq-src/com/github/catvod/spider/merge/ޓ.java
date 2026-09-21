/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u078f;
import com.github.catvod.spider.merge.\u0791;
import com.github.catvod.spider.merge.\u0794;
import com.github.catvod.spider.merge.\u0799;
import java.math.BigInteger;

public class \u0793 {
    public \u078f \u037f;
    public BigInteger \u0528;

    public \u0793() {
        this(\u078f.\u037f, null);
        this.\u0528 = \u0799.\u037f(BigInteger.ONE, this.\u037f.\u052d);
    }

    public \u0793(\u078f \u078f2, BigInteger bigInteger) {
        this.\u037f = \u078f2;
        this.\u0528 = bigInteger;
    }

    public \u0794 \u037f() {
        \u078f \u078f2 = this.\u037f;
        return new \u0794(\u0791.\u052c(\u078f2.\u052e, this.\u0528, \u078f2.\u052d, \u078f2.\u052a, \u078f2.\u052c), \u078f2);
    }
}

