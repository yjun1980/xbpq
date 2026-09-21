/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J0;

import com.github.catvod.spider.merge.J0.o;
import java.util.HashMap;
import java.util.Map;

final class k
extends HashMap<String, String> {
    final o a;

    k(o o2) {
        this.a = o2;
    }

    @Override
    public final Object put(Object object, Object object2) {
        String string = (String)object;
        object2 = (String)object2;
        Map map = o.a(this.a);
        object = string == null ? string : string.toLowerCase();
        ((HashMap)map).put(object, object2);
        return (String)super.put(string, object2);
    }
}

