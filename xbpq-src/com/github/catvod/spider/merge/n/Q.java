/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.l.t;
import com.github.catvod.spider.merge.n.j;

final class Q
extends j<Void>
implements Runnable {
    private final Runnable j;

    public Q(Runnable runnable) {
        runnable.getClass();
        this.j = runnable;
    }

    @Override
    protected final String r() {
        String string = String.valueOf(this.j);
        StringBuilder stringBuilder = new StringBuilder(string.length() + 7);
        stringBuilder.append(cYh.d("1331323A6A01"));
        stringBuilder.append(string);
        stringBuilder.append(cYh.d("3A"));
        return stringBuilder.toString();
    }

    @Override
    public final void run() {
        try {
            this.j.run();
            return;
        }
        catch (Throwable throwable) {
            this.u(throwable);
            int n2 = t.b;
            if (!(throwable instanceof RuntimeException)) {
                if (!(throwable instanceof Error)) {
                    throw new RuntimeException(throwable);
                }
                throw (Error)throwable;
            }
            throw (RuntimeException)throwable;
        }
    }
}

