/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.n;

import sun.misc.Unsafe;

public final class k {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object object, long l2, Object object2, Object object3) {
        do {
            if (!unsafe.compareAndSwapObject(object, l2, object2, object3)) continue;
            return true;
        } while (unsafe.getObject(object, l2) == object2);
        return false;
    }
}

