/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.f;

import com.github.catvod.spider.merge.xc.f.a;
import com.github.catvod.spider.merge.xc.f.g;
import com.github.catvod.spider.merge.xc.f.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class h
implements Set {
    public final int a;
    public final a b;

    public /* synthetic */ h(a a2, int n2) {
        this.a = n2;
        this.b = a2;
    }

    @Override
    public final boolean add(Object object) {
        switch (this.a) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 0: 
        }
        object = (Map.Entry)object;
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(Collection object) {
        switch (this.a) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 0: 
        }
        a a2 = this.b;
        int n2 = a2.d();
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            object = (Map.Entry)iterator.next();
            a2.g(object.getKey(), object.getValue());
        }
        boolean bl = n2 != a2.d();
        return bl;
    }

    @Override
    public final void clear() {
        switch (this.a) {
            default: {
                this.b.a();
                return;
            }
            case 0: 
        }
        this.b.a();
    }

    @Override
    public final boolean contains(Object object) {
        boolean bl;
        block6: {
            block8: {
                int n2;
                Object object2;
                a a2;
                boolean bl2;
                block7: {
                    block5: {
                        switch (this.a) {
                            default: {
                                boolean bl3 = this.b.e(object) >= 0;
                                return bl3;
                            }
                            case 0: 
                        }
                        bl = object instanceof Map.Entry;
                        bl2 = false;
                        if (bl) break block5;
                        bl = bl2;
                        break block6;
                    }
                    a2 = this.b;
                    object2 = (object = (Map.Entry)object).getKey();
                    n2 = a2.e(object2);
                    if (n2 >= 0) break block7;
                    bl = bl2;
                    break block6;
                }
                object2 = a2.b(n2, 1);
                if (object2 == (object = object.getValue())) break block8;
                bl = bl2;
                if (object2 == null) break block6;
                bl = bl2;
                if (!object2.equals(object)) break block6;
            }
            bl = true;
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean containsAll(Collection iterator) {
        switch (this.a) {
            default: {
                Map map = this.b.c();
                iterator = iterator.iterator();
                do {
                    if (!iterator.hasNext()) return true;
                } while (map.containsKey(iterator.next()));
                return false;
            }
            case 0: 
        }
        iterator = iterator.iterator();
        do {
            if (!iterator.hasNext()) return true;
        } while (this.contains(iterator.next()));
        return false;
    }

    @Override
    public final boolean equals(Object object) {
        switch (this.a) {
            default: {
                return com.github.catvod.spider.merge.xc.f.a.j(this, object);
            }
            case 0: 
        }
        return com.github.catvod.spider.merge.xc.f.a.j(this, object);
    }

    @Override
    public final int hashCode() {
        switch (this.a) {
            default: {
                a a2 = this.b;
                int n2 = 0;
                for (int i2 = a2.d() - 1; i2 >= 0; --i2) {
                    Object object = a2.b(i2, 0);
                    int n3 = object == null ? 0 : object.hashCode();
                    n2 += n3;
                }
                return n2;
            }
            case 0: 
        }
        a a3 = this.b;
        int n4 = 0;
        for (int i4 = a3.d() - 1; i4 >= 0; --i4) {
            Object object = a3.b(i4, 0);
            Object object2 = a3.b(i4, 1);
            int n5 = object == null ? 0 : object.hashCode();
            int n6 = object2 == null ? 0 : object2.hashCode();
            n4 += n5 ^ n6;
        }
        return n4;
    }

    @Override
    public final boolean isEmpty() {
        switch (this.a) {
            default: {
                boolean bl = this.b.d() == 0;
                return bl;
            }
            case 0: 
        }
        boolean bl = this.b.d() == 0;
        return bl;
    }

    @Override
    public final Iterator iterator() {
        switch (this.a) {
            default: {
                return new g(this.b, 0);
            }
            case 0: 
        }
        return new i(this.b);
    }

    @Override
    public final boolean remove(Object object) {
        switch (this.a) {
            default: {
                boolean bl;
                a a2 = this.b;
                int n2 = a2.e(object);
                if (n2 >= 0) {
                    a2.h(n2);
                    bl = true;
                } else {
                    bl = false;
                }
                return bl;
            }
            case 0: 
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean removeAll(Collection iterator) {
        switch (this.a) {
            default: {
                Map map = this.b.c();
                int n2 = map.size();
                iterator = iterator.iterator();
                while (iterator.hasNext()) {
                    map.remove(iterator.next());
                }
                boolean bl = n2 != map.size();
                return bl;
            }
            case 0: 
        }
        iterator = new UnsupportedOperationException();
        throw iterator;
    }

    @Override
    public final boolean retainAll(Collection object) {
        switch (this.a) {
            default: {
                Map map = this.b.c();
                int n2 = map.size();
                Iterator iterator = map.keySet().iterator();
                while (iterator.hasNext()) {
                    if (object.contains(iterator.next())) continue;
                    iterator.remove();
                }
                boolean bl = n2 != map.size();
                return bl;
            }
            case 0: 
        }
        object = new UnsupportedOperationException();
        throw object;
    }

    @Override
    public final int size() {
        switch (this.a) {
            default: {
                return this.b.d();
            }
            case 0: 
        }
        return this.b.d();
    }

    @Override
    public final Object[] toArray() {
        switch (this.a) {
            default: {
                a a2 = this.b;
                int n2 = a2.d();
                Object[] objectArray = new Object[n2];
                for (int i2 = 0; i2 < n2; ++i2) {
                    objectArray[i2] = a2.b(i2, 0);
                }
                return objectArray;
            }
            case 0: 
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    @Override
    public final Object[] toArray(Object[] objectArray) {
        switch (this.a) {
            default: {
                return this.b.k(objectArray, 0);
            }
            case 0: 
        }
        throw new UnsupportedOperationException();
    }
}

