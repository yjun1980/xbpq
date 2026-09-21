/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.F;

import java.util.Random;

public final class b
extends ThreadLocal<Random> {
    b() {
    }

    @Override
    public final Object initialValue() {
        return new Random();
    }
}

