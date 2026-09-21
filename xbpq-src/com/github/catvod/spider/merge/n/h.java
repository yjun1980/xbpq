/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.n.W;
import com.github.catvod.spider.merge.n.a;
import com.github.catvod.spider.merge.n.e;
import com.github.catvod.spider.merge.n.n;
import com.github.catvod.spider.merge.n.o;

final class h
extends a {
    h() {
        super((W)null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final boolean a(o<?> o2, e e2, e e3) {
        synchronized (o2) {
            if (o.f(o2) == e2) {
                o.g(o2, e3);
                return true;
            }
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final boolean b(o<?> o2, Object object, Object object2) {
        synchronized (o2) {
            if (o.d(o2) == object) {
                o.e(o2, object2);
                return true;
            }
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final boolean c(o<?> o2, n n2, n n3) {
        synchronized (o2) {
            if (o.h(o2) == n2) {
                o.i(o2, n3);
                return true;
            }
            return false;
        }
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    final e f(o o2) {
        e e2 = e.d;
        synchronized (o2) {
            e e3 = o.f(o2);
            if (e3 != e2) {
                o.g(o2, e2);
            }
            return e3;
        }
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    final n g(o o2) {
        n n2 = n.c;
        synchronized (o2) {
            n n3 = o.h(o2);
            if (n3 != n2) {
                o.i(o2, n2);
            }
            return n3;
        }
    }

    @Override
    final void h(n n2, n n3) {
        n2.b = n3;
    }

    @Override
    final void i(n n2, Thread thread) {
        n2.a = thread;
    }
}

