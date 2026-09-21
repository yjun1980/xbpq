/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.f;

import com.github.catvod.spider.merge.xc.f.a;
import com.github.catvod.spider.merge.xc.f.h;
import com.github.catvod.spider.merge.xc.f.j;
import com.github.catvod.spider.merge.xc.f.k;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Set;

public final class b
extends k
implements Map {
    public a h;

    public final Set entrySet() {
        if (this.h == null) {
            this.h = new a(0, this);
        }
        a a2 = this.h;
        if (a2.a == null) {
            a2.a = new h(a2, 0);
        }
        return a2.a;
    }

    public final Set keySet() {
        if (this.h == null) {
            this.h = new a(0, this);
        }
        a a2 = this.h;
        if (a2.b == null) {
            a2.b = new h(a2, 1);
        }
        return a2.b;
    }

    public final void putAll(Map object) {
        int n2 = this.c;
        n2 = object.size() + n2;
        int n3 = this.c;
        Object object2 = this.a;
        if (((int[])object2).length < n2) {
            Object[] objectArray = this.b;
            this.a(n2);
            if (this.c > 0) {
                System.arraycopy(object2, 0, this.a, 0, n3);
                System.arraycopy(objectArray, 0, this.b, 0, n3 << 1);
            }
            k.b(object2, objectArray, n3);
        }
        if (this.c == n3) {
            object2 = object.entrySet().iterator();
            while (object2.hasNext()) {
                object = (Map.Entry)object2.next();
                this.put(object.getKey(), object.getValue());
            }
            return;
        }
        object = new ConcurrentModificationException();
        throw object;
    }

    public final Collection values() {
        if (this.h == null) {
            this.h = new a(0, this);
        }
        a a2 = this.h;
        if (a2.c == null) {
            a2.c = new j(a2);
        }
        return a2.c;
    }
}

