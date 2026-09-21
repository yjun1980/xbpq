/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.d0;

import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.D0.b;

public abstract class g
extends b {
    public static final void S(Object[] objectArray, Object[] objectArray2, int n2, int n3, int n4) {
        i.e(objectArray, "<this>");
        i.e(objectArray2, "destination");
        System.arraycopy(objectArray, n3, objectArray2, n2, n4 - n3);
    }
}

