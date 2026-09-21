/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.l.j;
import com.github.catvod.spider.merge.l.k;
import com.github.catvod.spider.merge.n.E;
import com.github.catvod.spider.merge.n.H;
import com.github.catvod.spider.merge.o.a;
import com.github.catvod.spider.merge.o.b;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

final class F<V>
implements Runnable {
    final Future<V> c;
    final E<? super V> d;

    F(Future<V> future, E<? super V> e2) {
        this.c = future;
        this.d = e2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        void var1_4;
        block5: {
            Future<V> future = this.c;
            if (future instanceof a && (future = b.a((a)((Object)future))) != null) {
                this.d.onFailure((Throwable)((Object)future));
                return;
            }
            try {
                future = H.c(this.c);
            }
            catch (Error error) {
                break block5;
            }
            catch (RuntimeException runtimeException) {
                // empty catch block
                break block5;
            }
            catch (ExecutionException executionException) {
                this.d.onFailure(executionException.getCause());
                return;
            }
            this.d.onSuccess(future);
            return;
        }
        this.d.onFailure((Throwable)var1_4);
    }

    public final String toString() {
        j j2 = k.a(this);
        j2.a(this.d);
        return j2.toString();
    }
}

