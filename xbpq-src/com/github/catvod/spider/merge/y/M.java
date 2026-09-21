/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.y.G;
import com.github.catvod.spider.merge.y.N;
import java.util.ArrayList;

final class M
implements G {
    public static final M b = new M(false);
    public static final M c = new M(true);
    public static final M d = new M(true);
    private boolean a;

    private M(boolean bl) {
        this.a = bl;
    }

    @Override
    public final Object a(N n2, Object arrayList, Object object) {
        if (!this.a) {
            return n2.l(object);
        }
        arrayList = new ArrayList<Object>();
        n2.d(object, arrayList);
        return arrayList;
    }
}

