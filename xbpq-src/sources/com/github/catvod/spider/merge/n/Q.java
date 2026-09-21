package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.l.C0186t;

/* loaded from: classes.dex */
final class Q extends AbstractC0211j<Void> implements Runnable {
    private final Runnable j;

    public Q(Runnable runnable) {
        runnable.getClass();
        this.j = runnable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.catvod.spider.merge.n.AbstractC0216o
    public final String r() {
        String valueOf = String.valueOf(this.j);
        StringBuilder sb = new StringBuilder(valueOf.length() + 7);
        sb.append(cYh.d("1331323A6A01"));
        sb.append(valueOf);
        sb.append(cYh.d("3A"));
        return sb.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.j.run();
        } catch (Throwable th) {
            u(th);
            int i = C0186t.b;
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }
}
