/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ArrayListMultimap
 *  com.google.common.collect.Multimap
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.B.b;
import com.github.catvod.spider.merge.C.v;
import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.X;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class F
implements X,
v {
    public static F a = new F();

    @Override
    public final <T> T c(b object, Type type, Object object2) {
        object2 = type;
        if (type instanceof ParameterizedType) {
            object2 = ((ParameterizedType)type).getRawType();
        }
        if (object2 == ArrayListMultimap.class) {
            type = ArrayListMultimap.create();
            for (Map.Entry<String, Object> entry : ((b)((Object)object)).s().entrySet()) {
                object2 = entry.getValue();
                boolean bl = object2 instanceof Collection;
                String entry2 = entry.getKey();
                if (bl) {
                    type.putAll(entry2, (List)object2);
                    continue;
                }
                type.put(entry2, object2);
            }
            return (T)type;
        }
        return null;
    }

    @Override
    public final void d(L l2, Object object, Object object2, Type type, int n2) {
        object2 = l2.j;
        if (object instanceof Multimap) {
            l2.u(((Multimap)object).asMap());
        }
    }

    @Override
    public final int e() {
        return 0;
    }
}

