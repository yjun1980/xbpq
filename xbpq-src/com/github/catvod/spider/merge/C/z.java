/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.C;

import com.github.catvod.spider.merge.C.n;
import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.y.b;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class z
extends n {
    private final int c;
    private final List d;
    private final com.github.catvod.spider.merge.B.b e;
    private final Object f;
    private final Map g;
    private final Collection h;

    public z(com.github.catvod.spider.merge.B.b b2, List list, int n2) {
        super(null, null);
        this.e = b2;
        this.c = n2;
        this.d = list;
        this.f = null;
        this.g = null;
        this.h = null;
    }

    public z(Collection collection) {
        super(null, null);
        this.e = null;
        this.c = -1;
        this.d = null;
        this.f = null;
        this.g = null;
        this.h = collection;
    }

    public z(Map map, Object object) {
        super(null, null);
        this.e = null;
        this.c = -1;
        this.d = null;
        this.f = object;
        this.g = map;
        this.h = null;
    }

    @Override
    public final void d(com.github.catvod.spider.merge.B.b b2, Object object, Type type, Map<String, Object> map) {
    }

    @Override
    public final void e(Object object, Object object2) {
        b b2;
        Object object3;
        object = this.g;
        if (object != null) {
            object.put(this.f, object2);
            return;
        }
        object = this.h;
        if (object != null) {
            object.add(object2);
            return;
        }
        this.d.set(this.c, object2);
        object = this.d;
        if (object instanceof b && (object3 = (b2 = (b)object).q()) != null && Array.getLength(object3) > this.c) {
            object = object2;
            if (b2.o() != null) {
                object = A.f(object2, b2.o(), this.e.e());
            }
            Array.set(object3, this.c, object);
        }
    }
}

