/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.f;

import com.github.catvod.spider.merge.xc.f.b;
import com.github.catvod.spider.merge.xc.f.c;
import com.github.catvod.spider.merge.xc.f.h;
import com.github.catvod.spider.merge.xc.f.j;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public final class a {
    public h a;
    public h b;
    public j c;
    public final int d;
    public final Object e;

    public a(int n2, Object object) {
        this.d = n2;
        this.e = object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean j(Set set, Object object) {
        boolean bl = true;
        if (set == object) {
            return true;
        }
        if (!(object instanceof Set)) return false;
        object = (Set)object;
        try {
            if (set.size() != object.size()) return false;
            boolean bl2 = set.containsAll((Collection<?>)object);
            if (!bl2) return false;
            return bl;
        }
        catch (ClassCastException | NullPointerException runtimeException) {
            return false;
        }
    }

    public final void a() {
        switch (this.d) {
            default: {
                ((c)this.e).clear();
                return;
            }
            case 0: 
        }
        ((b)this.e).clear();
    }

    public final Object b(int n2, int n3) {
        switch (this.d) {
            default: {
                return ((c)this.e).b[n2];
            }
            case 0: 
        }
        return ((b)this.e).b[(n2 << 1) + n3];
    }

    public final Map c() {
        switch (this.d) {
            default: {
                throw new UnsupportedOperationException("not a map");
            }
            case 0: 
        }
        return (b)this.e;
    }

    public final int d() {
        switch (this.d) {
            default: {
                return ((c)this.e).c;
            }
            case 0: 
        }
        return ((b)this.e).c;
    }

    public final int e(Object object) {
        switch (this.d) {
            default: {
                return ((c)this.e).indexOf(object);
            }
            case 0: 
        }
        return ((b)this.e).d(object);
    }

    public final int f(Object object) {
        switch (this.d) {
            default: {
                return ((c)this.e).indexOf(object);
            }
            case 0: 
        }
        return ((b)this.e).f(object);
    }

    public final void g(Object object, Object object2) {
        switch (this.d) {
            default: {
                ((c)this.e).add(object);
                return;
            }
            case 0: 
        }
        ((b)this.e).put(object, object2);
    }

    public final void h(int n2) {
        switch (this.d) {
            default: {
                ((c)this.e).e(n2);
                return;
            }
            case 0: 
        }
        ((b)this.e).g(n2);
    }

    public final Object i(int n2, Object object) {
        switch (this.d) {
            default: {
                throw new UnsupportedOperationException("not a map");
            }
            case 0: 
        }
        n2 = (n2 << 1) + 1;
        Object[] objectArray = ((b)this.e).b;
        Object object2 = objectArray[n2];
        objectArray[n2] = object;
        return object2;
    }

    public final Object[] k(Object[] objectArray, int n2) {
        int n3 = this.d();
        Object[] objectArray2 = objectArray;
        if (objectArray.length < n3) {
            objectArray2 = (Object[])Array.newInstance(objectArray.getClass().getComponentType(), n3);
        }
        for (int i2 = 0; i2 < n3; ++i2) {
            objectArray2[i2] = this.b(i2, n2);
        }
        if (objectArray2.length > n3) {
            objectArray2[n3] = null;
        }
        return objectArray2;
    }
}

