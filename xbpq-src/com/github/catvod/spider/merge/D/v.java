/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.B.h;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.M;
import com.github.catvod.spider.merge.D.X;
import com.github.catvod.spider.merge.D.c0;
import com.github.catvod.spider.merge.D.h0;
import com.github.catvod.spider.merge.D.i0;
import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.y.b;
import com.github.catvod.spider.merge.y.d;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public final class v
implements X,
com.github.catvod.spider.merge.C.v {
    public static final v a = new v();

    @Override
    public final <T> T c(com.github.catvod.spider.merge.B.b b2, Type object, Object object2) {
        Object object3;
        if (b2.f.p() == 8) {
            b2.f.o(16);
            return null;
        }
        if (object == b.class) {
            object = new b();
            b2.q((Collection)object, null);
            return (T)object;
        }
        if (b2.f.p() == 21) {
            b2.f.nextToken();
            Class<AbstractSet> clazz = A.W((Type)object);
            if (clazz != AbstractCollection.class && clazz != Collection.class) {
                if (clazz.isAssignableFrom(HashSet.class)) {
                    object3 = new HashSet();
                } else if (clazz.isAssignableFrom(LinkedHashSet.class)) {
                    object3 = new LinkedHashSet();
                } else if (clazz.isAssignableFrom(TreeSet.class)) {
                    object3 = new TreeSet();
                } else if (clazz.isAssignableFrom(EnumSet.class)) {
                    object3 = object instanceof ParameterizedType ? ((ParameterizedType)object).getActualTypeArguments()[0] : Object.class;
                    object3 = EnumSet.noneOf((Class)object3);
                } else {
                    try {
                        object3 = (Set)clazz.newInstance();
                    }
                    catch (Exception exception) {
                        throw new d(h.e(clazz, com.github.catvod.spider.merge.C.a.c("create instance error, class ")));
                    }
                }
            } else {
                object3 = new HashSet();
            }
        } else {
            object3 = A.x((Type)object);
        }
        b2.p(A.L((Type)object), (Collection)object3, object2);
        return (T)object3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void d(L l2, Object object, Object iterator, Type object2, int n2) {
        Collection collection;
        int n3;
        int n4;
        Object object3;
        Type type;
        h0 h02;
        block22: {
            block24: {
                block23: {
                    h02 = l2.j;
                    if (object == null) {
                        h02.u(i0.h);
                        return;
                    }
                    type = null;
                    object3 = i0.o;
                    boolean bl = h02.g((i0)((Object)object3));
                    n4 = 0;
                    if (bl || (n3 = (((i0)((Object)object3)).a & n2) != 0 ? 1 : 0) != 0) {
                        type = A.L((Type)object2);
                    }
                    collection = (Collection)object;
                    object2 = l2.p;
                    l2.s((c0)object2, object, iterator);
                    if (!h02.g((i0)((Object)object3))) break block22;
                    if (!HashSet.class.isAssignableFrom(collection.getClass())) break block23;
                    object = "Set";
                    break block24;
                }
                if (TreeSet.class != collection.getClass()) break block22;
                object = "TreeSet";
            }
            h02.b((CharSequence)object);
        }
        try {
            h02.write(91);
            iterator = collection.iterator();
            n3 = n4;
            while (iterator.hasNext()) {
                object = iterator.next();
                n4 = n3 + 1;
                if (n3 != 0) {
                    h02.write(44);
                }
                if (object == null) {
                    h02.s();
                } else {
                    object3 = object.getClass();
                    if (object3 == Integer.class) {
                        h02.q((Integer)object);
                    } else if (object3 == Long.class) {
                        h02.r((Long)object);
                        if (h02.g(i0.o)) {
                            h02.write(76);
                        }
                    } else {
                        object3 = l2.n((Class<?>)object3);
                        if (i0.e(n2, i0.o) && object3 instanceof M) {
                            ((M)object3).v(l2, object, n4 - 1, type, n2);
                        } else {
                            object3.d(l2, object, n4 - 1, type, n2);
                        }
                    }
                }
                n3 = n4;
            }
            h02.write(93);
            l2.p = object2;
            return;
        }
        catch (Throwable throwable) {
            l2.p = object2;
            throw throwable;
        }
    }

    @Override
    public final int e() {
        return 14;
    }
}

