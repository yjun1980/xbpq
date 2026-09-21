/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.g;

import com.github.catvod.spider.merge.xc.g.g;
import java.util.concurrent.CancellationException;

public final class a {
    public static final a b;
    public static final a c;
    public final Throwable a;

    static {
        if (g.d) {
            c = null;
            b = null;
        } else {
            c = new a(false, null);
            b = new a(true, null);
        }
    }

    public a(boolean bl, CancellationException cancellationException) {
        this.a = cancellationException;
    }
}

