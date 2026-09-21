/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u0674;
import com.github.catvod.spider.merge.\u08b0;
import com.github.catvod.spider.merge.\u107d;

public class \u1077
extends \u107d {
    public final \u0674 \u052a;

    public \u1077(\u08b0 object, \u0674 \u06742) {
        super((\u08b0)object);
        object = \u06742;
        if (\u06742 == null) {
            object = \u0674.\u0620(0);
        }
        this.\u052a = object;
    }

    public String toString() {
        return this.\u052a.toString();
    }

    @Override
    public int \u037f() {
        return 7;
    }

    @Override
    public \u0674 \u0529() {
        return this.\u052a;
    }

    @Override
    public boolean \u052a(int n2, int n3, int n4) {
        return this.\u052a.\u052e(n2);
    }
}

