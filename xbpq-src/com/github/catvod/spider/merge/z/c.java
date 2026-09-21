/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.z;

import com.github.catvod.spider.merge.E.f;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.z.h;

final class c
extends g
implements com.github.catvod.spider.merge.D.c<String, h, String> {
    public static final c c = new c();

    c() {
    }

    @Override
    public final Object b(Object object, Object object2) {
        object = (String)object;
        object2 = (h)object2;
        f.e(object, cYh.d("063322"));
        f.e(object2, cYh.d("023C243C323413"));
        boolean bl = ((String)object).length() == 0;
        if (bl) {
            object = object2.toString();
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object);
            stringBuilder.append(cYh.d("4B70"));
            stringBuilder.append(object2);
            object = stringBuilder.toString();
        }
        return object;
    }
}

