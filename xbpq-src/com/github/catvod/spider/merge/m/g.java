/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.m;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.l.m;
import com.github.catvod.spider.merge.m.b;
import com.github.catvod.spider.merge.m.c;
import com.github.catvod.spider.merge.m.f;
import com.github.catvod.spider.merge.m.i;
import com.github.catvod.spider.merge.m.j;
import com.github.catvod.spider.merge.m.k;
import com.github.catvod.spider.merge.m.l;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public abstract class g<E>
extends c<E>
implements Set<E> {
    private transient f<E> d;

    g() {
    }

    static int g(int n2) {
        int n3 = Math.max(n2, 2);
        boolean bl = true;
        if (n3 < 0x2CCCCCCC) {
            n2 = Integer.highestOneBit(n3 - 1) << 1;
            while (true) {
                double d2 = n2;
                Double.isNaN(d2);
                if (!(d2 * 0.7 < (double)n3)) break;
                n2 <<= 1;
            }
            return n2;
        }
        if (n3 >= 0x40000000) {
            bl = false;
        }
        m.b(bl, cYh.d("043F2D3D323913392E3F772E083F613D36280035"));
        return 0x40000000;
    }

    private static <E> g<E> h(int n2, Object ... object) {
        if (n2 != 0) {
            int n3 = 0;
            if (n2 != 1) {
                Object[] objectArray;
                int n4;
                int n5 = g.g(n2);
                Object[] objectArray2 = new Object[n5];
                int n6 = n5 - 1;
                int n7 = 0;
                int n8 = 0;
                block0: for (n4 = 0; n4 < n2; ++n4) {
                    Object object2 = object[n4];
                    i.a(object2, n4);
                    int n9 = object2.hashCode();
                    int n10 = b.a(n9);
                    while (true) {
                        int n11;
                        if ((objectArray = objectArray2[n11 = n10 & n6]) == null) {
                            object[n8] = object2;
                            objectArray2[n11] = object2;
                            n7 += n9;
                            ++n8;
                            continue block0;
                        }
                        if (objectArray.equals(object2)) {
                            continue block0;
                        }
                        ++n10;
                    }
                }
                Arrays.fill((Object[])object, n8, n2, null);
                if (n8 == 1) {
                    object = object[0];
                    object.getClass();
                    return new l<Object>(object);
                }
                if (g.g(n8) < n5 / 2) {
                    return g.h(n8, (Object[])object);
                }
                n4 = ((Object)object).length;
                n2 = n3;
                if (n8 < (n4 >> 1) + (n4 >> 2)) {
                    n2 = 1;
                }
                objectArray = object;
                if (n2 != 0) {
                    objectArray = Arrays.copyOf(object, n8);
                }
                return new k(objectArray, n7, objectArray2, n6, n8);
            }
            object = object[0];
            object.getClass();
            return new l<Object>(object);
        }
        return k.k;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public static g j() {
        return g.h(4, cYh.d("0522"), cYh.d("0335273D362E02"), cYh.d("002A2821"), cYh.d("1F7D262B3E2A"));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean equals(Object object) {
        boolean bl = true;
        if (object == this) {
            return true;
        }
        if (object instanceof g && this instanceof k) {
            g g2 = (g)object;
            g2.getClass();
            if (g2 instanceof k && this.hashCode() != object.hashCode()) {
                return false;
            }
        }
        if (this == object) return bl;
        if (!(object instanceof Set)) return false;
        object = (Set)object;
        try {
            if (this.size() != object.size()) return false;
            boolean bl2 = this.containsAll((Collection<?>)object);
            if (!bl2) return false;
            return bl;
        }
        catch (ClassCastException | NullPointerException runtimeException) {
            return false;
        }
    }

    public final f<E> f() {
        f<E> f2;
        f<E> f3 = f2 = this.d;
        if (f2 == null) {
            this.d = f3 = this.i();
        }
        return f3;
    }

    @Override
    public int hashCode() {
        Iterator iterator = this.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            Object e2 = iterator.next();
            int n3 = e2 != null ? e2.hashCode() : 0;
            n2 = ~(~(n2 + n3));
        }
        return n2;
    }

    f<E> i() {
        Object object = this.toArray();
        int n2 = f.e;
        n2 = ((Object[])object).length;
        object = n2 == 0 ? j.h : new j((Object[])object, n2);
        return object;
    }
}

