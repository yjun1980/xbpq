/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.S;

import com.github.catvod.spider.merge.O.m;

public final class k
extends m {
    public static final k a = new k();

    @Override
    public final boolean E(Object object, Object object2) {
        if (object == null) {
            boolean bl = object2 == null;
            return bl;
        }
        return object.equals(object2);
    }

    @Override
    public final int F(Object object) {
        if (object == null) {
            return 0;
        }
        return object.hashCode();
    }
}

