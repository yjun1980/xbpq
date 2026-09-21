/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.H.f;
import java.sql.Clob;

final class r
implements f<Class, Boolean> {
    r() {
    }

    @Override
    public final Object apply(Object object) {
        return Clob.class.isAssignableFrom((Class)object);
    }
}

