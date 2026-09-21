/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.C;

import com.github.catvod.spider.merge.B.b;
import com.github.catvod.spider.merge.C.v;
import com.github.catvod.spider.merge.H.A;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

public final class r
implements v {
    public static final r a = new r();

    @Override
    public final <T> T c(b objectArray, Type object, Object arrayList) {
        if (object instanceof GenericArrayType) {
            arrayList = ((GenericArrayType)object).getGenericComponentType();
            object = arrayList;
            if (arrayList instanceof TypeVariable) {
                object = ((TypeVariable)((Object)arrayList)).getBounds()[0];
            }
            arrayList = new ArrayList();
            objectArray.p((Type)object, arrayList, null);
            objectArray = (Object[])Array.newInstance(A.W((Type)object), arrayList.size());
            arrayList.toArray(objectArray);
            return (T)objectArray;
        }
        if (object instanceof Class && object != Object.class && object != Serializable.class && object != Cloneable.class && object != Closeable.class && object != Comparable.class) {
            return objectArray.t((Type)object, null);
        }
        return (T)objectArray.o(arrayList);
    }

    @Override
    public final int e() {
        return 12;
    }
}

