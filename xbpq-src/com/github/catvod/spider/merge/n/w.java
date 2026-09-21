/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.n.a;
import com.github.catvod.spider.merge.n.u;
import com.github.catvod.spider.merge.n.x;
import java.util.Set;

final class w
extends a {
    w() {
        super((u)null);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    final void d(x x2, Set set) {
        synchronized (x2) {
            if (x.w(x2) == null) {
                x.x(x2, set);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final int e(x<?> x2) {
        synchronized (x2) {
            return x.y(x2);
        }
    }
}

