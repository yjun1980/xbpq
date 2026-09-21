/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.s0;

import com.github.catvod.spider.merge.s0.a;
import com.github.catvod.spider.merge.s0.b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public final class c<T>
implements a<T> {
    private Future<T> a;
    private Throwable b;

    private c(Future<T> future, Throwable throwable) {
        this.a = future;
        this.b = throwable;
    }

    public static <T> c<T> b(Throwable throwable) {
        return new c<T>(null, throwable);
    }

    public static <T> c<T> d(T t2) {
        return c.e(new b(t2));
    }

    public static <T> c<T> e(Future<T> future) {
        return new c<T>(future, null);
    }

    /*
     * WARNING - void declaration
     */
    public final T a() {
        Future<T> future = this.a;
        if (future != null) {
            void var1_4;
            try {
                future = future.get();
            }
            catch (ExecutionException executionException) {
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
            return (T)future;
            this.b = var1_4;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public final Throwable c() {
        block4: {
            Future<T> future = this.a;
            if (future != null) {
                void var1_4;
                try {
                    future.get();
                    break block4;
                }
                catch (ExecutionException executionException) {
                }
                catch (InterruptedException interruptedException) {
                    // empty catch block
                }
                this.b = var1_4;
                return var1_4;
            }
        }
        return this.b;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean f() {
        if (this.b != null) {
            return false;
        }
        try {
            this.a.get();
            return true;
        }
        catch (Exception exception) {
            this.b = exception;
            return false;
        }
        catch (CancellationException cancellationException) {
            return false;
        }
    }
}

