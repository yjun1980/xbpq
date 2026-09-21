package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.l.C0176j;
import com.github.catvod.spider.merge.l.C0177k;
import com.github.catvod.spider.merge.o.AbstractC0224a;
import com.github.catvod.spider.merge.o.C0225b;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: com.github.catvod.spider.merge.n.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC0196F<V> implements Runnable {
    final Future<V> c;
    final InterfaceC0195E<? super V> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0196F(Future<V> future, InterfaceC0195E<? super V> interfaceC0195E) {
        this.c = future;
        this.d = interfaceC0195E;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable a;
        Future<V> future = this.c;
        if ((future instanceof AbstractC0224a) && (a = C0225b.a((AbstractC0224a) future)) != null) {
            this.d.onFailure(a);
            return;
        }
        try {
            this.d.onSuccess(C0198H.c(this.c));
        } catch (Error e) {
            e = e;
            this.d.onFailure(e);
        } catch (RuntimeException e2) {
            e = e2;
            this.d.onFailure(e);
        } catch (ExecutionException e3) {
            this.d.onFailure(e3.getCause());
        }
    }

    public final String toString() {
        C0176j a = C0177k.a(this);
        a.a(this.d);
        return a.toString();
    }
}
