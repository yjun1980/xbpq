/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.m.f;
import com.github.catvod.spider.merge.n.M;
import com.github.catvod.spider.merge.n.z;
import java.util.concurrent.Callable;

public final class G<V> {
    private final f<M<? extends V>> a;

    G(f f2) {
        this.a = f2;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public final M a(Callable callable) {
        return new z(this.a, callable);
    }
}

