/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.B;

import com.github.catvod.spider.merge.H.f;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

final class m
implements f<Class<?>, Boolean> {
    m() {
    }

    @Override
    public final Object apply(Object object) {
        boolean bl = (object = (Class)object) == Date.class || object == Time.class || object == Timestamp.class;
        return bl;
    }
}

