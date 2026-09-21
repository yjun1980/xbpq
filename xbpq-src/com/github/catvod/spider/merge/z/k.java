/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.z;

import com.github.catvod.spider.merge.D.c;
import com.github.catvod.spider.merge.z.h;
import com.github.catvod.spider.merge.z.i;

public interface k {
    public <R> R fold(R var1, c<? super R, ? super h, ? extends R> var2);

    public <E extends h> E get(i<E> var1);

    public k minusKey(i<?> var1);
}

