/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.core.util.Predicate
 */
package com.github.catvod.spider.merge.nU;

import androidx.core.util.Predicate;
import com.github.catvod.spider.merge.nU.a;
import com.github.catvod.spider.merge.xc.j.d;
import com.github.catvod.spider.merge.xc.j.e;

public abstract class b {
    public static Predicate a(Predicate predicate, Predicate predicate2) {
        predicate2.getClass();
        return new a(predicate, predicate2, 1);
    }

    public static Predicate b(Predicate predicate) {
        return new d(3, predicate);
    }

    public static Predicate c(Predicate predicate, Predicate predicate2) {
        predicate2.getClass();
        return new a(predicate, predicate2, 0);
    }

    public static /* synthetic */ boolean d(Predicate predicate, Predicate predicate2, Object object) {
        boolean bl = predicate.test(object) && predicate2.test(object);
        return bl;
    }

    public static /* synthetic */ boolean e(Predicate predicate, Object object) {
        return predicate.test(object) ^ true;
    }

    public static /* synthetic */ boolean f(Predicate predicate, Predicate predicate2, Object object) {
        boolean bl = predicate.test(object) || predicate2.test(object);
        return bl;
    }

    public static Predicate g(Object object) {
        object = object == null ? new e(11) : new d(2, object);
        return object;
    }

    public static /* synthetic */ boolean h(Object object) {
        boolean bl = object == null;
        return bl;
    }

    public static /* synthetic */ boolean i(Object object, Object object2) {
        return object.equals(object2);
    }

    public static Predicate j(Predicate predicate) {
        predicate.getClass();
        return predicate.negate();
    }
}

