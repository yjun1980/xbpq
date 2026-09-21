/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.d0.O;

class H
extends O {
    private String b;

    H() {
        this.a = 5;
    }

    @Override
    final O g() {
        this.b = null;
        return this;
    }

    final H i(String string) {
        this.b = string;
        return this;
    }

    final String j() {
        return this.b;
    }

    public String toString() {
        return this.b;
    }
}

