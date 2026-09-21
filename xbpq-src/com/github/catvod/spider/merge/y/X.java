/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.H.n;
import com.github.catvod.spider.merge.y.W;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class X<T> {
    static ConcurrentMap<Type, Type> b = new ConcurrentHashMap<Type, Type>(16, 0.75f, 1);
    protected final Type a;

    static {
        new W();
    }

    protected X() {
        Type type;
        Type type2 = ((ParameterizedType)this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        Type type3 = type = (Type)((ConcurrentHashMap)b).get(type2);
        if (type == null) {
            ((ConcurrentHashMap)b).putIfAbsent(type2, type2);
            type3 = (Type)((ConcurrentHashMap)b).get(type2);
        }
        this.a = type3;
    }

    public static Type a(n n2) {
        Type type;
        Type type2 = type = (Type)((ConcurrentHashMap)b).get(n2);
        if (type == null) {
            ((ConcurrentHashMap)b).putIfAbsent(n2, n2);
            type2 = (Type)((ConcurrentHashMap)b).get(n2);
        }
        return type2;
    }
}

