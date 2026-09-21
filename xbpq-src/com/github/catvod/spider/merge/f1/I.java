/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.P;

class I
extends P {
    private String d;

    I() {
        this.a = 5;
    }

    @Override
    final P h() {
        super.h();
        this.d = null;
        return this;
    }

    final I k(String string) {
        this.d = string;
        return this;
    }

    final String l() {
        return this.d;
    }

    public String toString() {
        return this.d;
    }
}

