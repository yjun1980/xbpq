/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u0674;
import com.github.catvod.spider.merge.\u0863;
import com.github.catvod.spider.merge.\u0868;
import com.github.catvod.spider.merge.\u08a0;
import com.github.catvod.spider.merge.\u08a1;
import com.github.catvod.spider.merge.\u08a3;

public class \u086a
extends RuntimeException {
    private final \u08a0<?, ?> \u037f;
    private final \u08a1 \u0528;
    private final \u0863 \u0529;
    private \u08a3 \u052a;
    private int \u052b = -1;

    public \u086a(\u08a0<?, ?> \u08a02, \u0863 \u08632, \u0868 \u08682) {
        this.\u037f = \u08a02;
        this.\u0529 = \u08632;
        this.\u0528 = \u08682;
        if (\u08a02 != null) {
            this.\u052b = \u08a02.\u0780();
        }
    }

    public \u0674 \u037f() {
        \u08a0<?, ?> \u08a02 = this.\u037f;
        if (\u08a02 != null) {
            return \u08a02.\u052d().\u052a(this.\u052b, this.\u0528);
        }
        return null;
    }

    public \u0863 \u0528() {
        return this.\u0529;
    }

    public \u08a3 \u0529() {
        return this.\u052a;
    }

    protected final void \u052a(int n2) {
        this.\u052b = n2;
    }

    protected final void \u052b(\u08a3 \u08a32) {
        this.\u052a = \u08a32;
    }
}

