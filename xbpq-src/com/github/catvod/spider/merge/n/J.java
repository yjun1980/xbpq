/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.n.L;
import com.github.catvod.spider.merge.n.W;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;

final class J
extends AbstractOwnableSynchronizer
implements Runnable {
    private final L<?> c;

    J(L l2, W w2) {
        this.c = l2;
    }

    static void a(J j2, Thread thread) {
        j2.setExclusiveOwnerThread(thread);
    }

    @Override
    public final void run() {
    }

    public final String toString() {
        return this.c.toString();
    }
}

