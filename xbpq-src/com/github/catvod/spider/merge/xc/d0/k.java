/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.d0;

import com.github.catvod.spider.merge.xc.d0.j;
import java.util.Collection;

public abstract class k
extends j {
    public static int H(Iterable iterable) {
        int n2 = iterable instanceof Collection ? ((Collection)iterable).size() : 10;
        return n2;
    }
}

