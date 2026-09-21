/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u108e;

public final class \u02c7
extends \u108e<Object> {
    public static final \u02c7 \u037f = new \u02c7();

    @Override
    public boolean \u037f(Object object, Object object2) {
        if (object == null) {
            boolean bl = object2 == null;
            return bl;
        }
        return object.equals(object2);
    }

    @Override
    public int \u0528(Object object) {
        if (object == null) {
            return 0;
        }
        return object.hashCode();
    }
}

