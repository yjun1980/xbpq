/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.y.G;
import com.github.catvod.spider.merge.y.N;
import java.util.ArrayList;

final class w
implements G {
    private final String[] a;
    private final long[] b;

    public w(String[] stringArray) {
        long[] lArray;
        this.a = stringArray;
        this.b = new long[stringArray.length];
        for (int i2 = 0; i2 < (lArray = this.b).length; ++i2) {
            lArray[i2] = A.z(stringArray[i2]);
        }
    }

    @Override
    public final Object a(N n2, Object stringArray, Object object) {
        ArrayList<Object> arrayList = new ArrayList<Object>(this.a.length);
        for (int i2 = 0; i2 < (stringArray = this.a).length; ++i2) {
            arrayList.add(n2.k(object, stringArray[i2], this.b[i2]));
        }
        return arrayList;
    }
}

