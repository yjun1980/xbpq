/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.D.J;
import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.X;
import java.lang.reflect.Type;

public final class K
implements X {
    public static K a = new K();

    @Override
    public final void d(L l2, Object object, Object object2, Type type, int n2) {
        if ((object = (J)object) == null) {
            l2.w();
            return;
        }
        object.a(l2, n2);
    }
}

