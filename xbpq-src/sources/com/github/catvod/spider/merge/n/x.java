package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.cYh;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class x<OutputT> extends AbstractC0211j<OutputT> {
    private static final AbstractC0202a l;
    private static final Logger m = Logger.getLogger(x.class.getName());
    private volatile Set<Throwable> j = null;
    private volatile int k;

    static {
        Throwable th;
        AbstractC0202a c0223w;
        try {
            c0223w = new C0222v(AtomicReferenceFieldUpdater.newUpdater(x.class, Set.class, cYh.d("0D")), AtomicIntegerFieldUpdater.newUpdater(x.class, cYh.d("0C")));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            c0223w = new C0223w();
        }
        l = c0223w;
        if (th != null) {
            m.log(Level.SEVERE, cYh.d("34312734162E083D28321F3F0B2024237733147023233831023E60"), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(int i) {
        this.k = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int y(x xVar) {
        int i = xVar.k - 1;
        xVar.k = i;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void A() {
        this.j = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int B() {
        return l.e(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<Throwable> C() {
        Set<Throwable> set = this.j;
        if (set != null) {
            return set;
        }
        Set<Throwable> newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        z(newSetFromMap);
        l.d(this, newSetFromMap);
        Set<Throwable> set2 = this.j;
        set2.getClass();
        return set2;
    }

    abstract void z(Set<Throwable> set);
}
