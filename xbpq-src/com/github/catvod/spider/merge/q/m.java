/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.q;

import com.github.catvod.spider.merge.q.i;
import com.github.catvod.spider.merge.q.j;
import com.github.catvod.spider.merge.q.l;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

abstract class m<K, V> {
    i a;
    j b;
    l c;

    m() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static <T> boolean j(Set<T> set, Object object) {
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

    protected abstract void a();

    protected abstract Object b(int var1, int var2);

    protected abstract Map<K, V> c();

    protected abstract int d();

    protected abstract int e(Object var1);

    protected abstract int f(Object var1);

    protected abstract void g(K var1, V var2);

    protected abstract void h(int var1);

    protected abstract V i(int var1, V var2);

    public final <T> T[] k(T[] TArray, int n2) {
        int n3 = this.d();
        Object[] objectArray = TArray;
        if (TArray.length < n3) {
            objectArray = (Object[])Array.newInstance(TArray.getClass().getComponentType(), n3);
        }
        for (int i2 = 0; i2 < n3; ++i2) {
            objectArray[i2] = this.b(i2, n2);
        }
        if (objectArray.length > n3) {
            objectArray[n3] = null;
        }
        return objectArray;
    }
}

