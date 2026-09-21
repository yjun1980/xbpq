/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.n.a;
import com.github.catvod.spider.merge.n.j;
import com.github.catvod.spider.merge.n.v;
import com.github.catvod.spider.merge.n.w;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class x<OutputT>
extends j<OutputT> {
    private static final a l;
    private static final Logger m;
    private volatile Set<Throwable> j = null;
    private volatile int k;

    static {
        Throwable throwable;
        a a2;
        m = Logger.getLogger(x.class.getName());
        try {
            a2 = new v(AtomicReferenceFieldUpdater.newUpdater(x.class, Set.class, cYh.d("0D")), AtomicIntegerFieldUpdater.newUpdater(x.class, cYh.d("0C")));
            throwable = null;
        }
        catch (Throwable throwable2) {
            a2 = new w();
        }
        l = a2;
        if (throwable != null) {
            m.log(Level.SEVERE, cYh.d("34312734162E083D28321F3F0B2024237733147023233831023E60"), throwable);
        }
    }

    x(int n2) {
        this.k = n2;
    }

    static /* synthetic */ Set w(x x2) {
        return x2.j;
    }

    static /* synthetic */ Set x(x x2, Set set) {
        x2.j = set;
        return set;
    }

    static /* synthetic */ int y(x x2) {
        int n2;
        x2.k = n2 = x2.k - 1;
        return n2;
    }

    final void A() {
        this.j = null;
    }

    final int B() {
        return l.e(this);
    }

    final Set<Throwable> C() {
        Set<Throwable> set = this.j;
        Set<Throwable> set2 = set;
        if (set == null) {
            set2 = Collections.newSetFromMap(new ConcurrentHashMap());
            this.z(set2);
            l.d(this, set2);
            set2 = this.j;
            set2.getClass();
        }
        return set2;
    }

    abstract void z(Set<Throwable> var1);
}

