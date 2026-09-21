/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.y.G;
import com.github.catvod.spider.merge.y.N;
import java.util.Collection;

final class t
implements G {
    public static final t a = new t();

    t() {
    }

    @Override
    public final Object a(N object, Object object2, Object iterator) {
        if (iterator instanceof Collection) {
            iterator = ((Collection)((Object)iterator)).iterator();
            object = null;
            while (iterator.hasNext()) {
                object2 = iterator.next();
                if (object2 == null || object != null && N.b(object, object2) >= 0) continue;
                object = object2;
            }
            return object;
        }
        throw new UnsupportedOperationException();
    }
}

