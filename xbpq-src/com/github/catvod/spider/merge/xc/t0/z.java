/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.t0;

import com.github.catvod.spider.merge.xc.KW.a;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class z {
    private volatile AtomicReferenceArray<Object> array;

    public z(int n2) {
        this.array = new AtomicReferenceArray(n2);
    }

    public final int a() {
        return this.array.length();
    }

    public final Object b(int n2) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        atomicReferenceArray = n2 < atomicReferenceArray.length() ? atomicReferenceArray.get(n2) : null;
        return atomicReferenceArray;
    }

    public final void c(int n2, a a2) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int n3 = atomicReferenceArray.length();
        if (n2 < n3) {
            atomicReferenceArray.set(n2, a2);
            return;
        }
        int n4 = n2 + 1;
        int n5 = n3 * 2;
        int n6 = n4;
        if (n4 < n5) {
            n6 = n5;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<Object>(n6);
        for (n6 = 0; n6 < n3; ++n6) {
            atomicReferenceArray2.set(n6, atomicReferenceArray.get(n6));
        }
        atomicReferenceArray2.set(n2, a2);
        this.array = atomicReferenceArray2;
    }
}

