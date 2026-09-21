/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.H.f;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Map;

final class w
implements f<Map<String, Class<?>>, Void> {
    w() {
    }

    @Override
    public final Object apply(Object object) {
        Map map = (Map)object;
        for (int i2 = 0; i2 < 3; ++i2) {
            object = (new Class[]{Time.class, Date.class, Timestamp.class})[i2];
            if (object == null) continue;
            map.put(((Class)object).getName(), object);
        }
        return null;
    }
}

