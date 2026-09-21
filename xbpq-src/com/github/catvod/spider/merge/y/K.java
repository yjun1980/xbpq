/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.y.G;
import com.github.catvod.spider.merge.y.N;
import java.util.Collection;
import java.util.UUID;

final class K
implements G {
    public static final K a = new K();

    K() {
    }

    @Override
    public final Object a(N object, Object object2, Object object3) {
        object = object3 == null ? "null" : (object3 instanceof Collection ? "array" : (object3 instanceof Number ? "number" : (object3 instanceof Boolean ? "boolean" : (!(object3 instanceof String || object3 instanceof UUID || object3 instanceof Enum) ? "object" : "string"))));
        return object;
    }
}

