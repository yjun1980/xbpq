package com.github.catvod.spider.merge.n;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.n.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0200J extends AbstractOwnableSynchronizer implements Runnable {
    private final L<?> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0200J(L l, W w) {
        this.c = l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(RunnableC0200J runnableC0200J, Thread thread) {
        runnableC0200J.setExclusiveOwnerThread(thread);
    }

    @Override // java.lang.Runnable
    public final void run() {
    }

    public final String toString() {
        return this.c.toString();
    }
}
