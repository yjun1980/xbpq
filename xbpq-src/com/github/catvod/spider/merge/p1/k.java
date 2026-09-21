/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.p1;

import com.github.catvod.spider.merge.I1.a;
import com.github.catvod.spider.merge.I1.c;
import com.github.catvod.spider.merge.p1.e;
import com.github.catvod.spider.merge.p1.j;
import java.time.LocalDateTime;

public final class k {
    public static j a(e object) {
        LocalDateTime localDateTime = LocalDateTime.now();
        String string = ((e)object).b();
        object = (object = ((e)object).a()) != null && !((String)object).isEmpty() ? com.github.catvod.spider.merge.B.e.c("_", (String)object) : "";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append((String)object);
        object = a.a(stringBuilder.toString());
        object = object == null ? null : new j((c)object, localDateTime);
        return object;
    }
}

