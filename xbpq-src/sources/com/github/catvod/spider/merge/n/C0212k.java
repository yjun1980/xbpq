package com.github.catvod.spider.merge.n;

import sun.misc.Unsafe;

/* renamed from: com.github.catvod.spider.merge.n.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0212k {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
