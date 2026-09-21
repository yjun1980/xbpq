/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.P;

import com.github.catvod.spider.merge.P.D;
import com.github.catvod.spider.merge.P.E;
import com.github.catvod.spider.merge.P.F;
import com.github.catvod.spider.merge.P.d;
import com.github.catvod.spider.merge.P.k;

public final class l
implements E<k> {
    public static final E<k> a = new l();

    public final D a(com.github.catvod.spider.merge.S.l serializable, int n2, String string, int n3, int n4, int n5, int n6, int n7) {
        serializable = new k((com.github.catvod.spider.merge.S.l<F, d>)serializable, n2, n3, n4, n5);
        ((k)serializable).d = n6;
        ((k)serializable).e = n7;
        if (string != null) {
            ((k)serializable).h = string;
        }
        return serializable;
    }
}

