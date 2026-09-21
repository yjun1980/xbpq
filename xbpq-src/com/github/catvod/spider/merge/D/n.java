/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.B.b;
import com.github.catvod.spider.merge.C.v;
import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.X;
import com.github.catvod.spider.merge.D.h0;
import com.github.catvod.spider.merge.D.i0;
import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.y.d;
import java.lang.reflect.Type;
import java.math.BigInteger;

public final class n
implements X,
v {
    private static final BigInteger a = BigInteger.valueOf(-9007199254740991L);
    private static final BigInteger b = BigInteger.valueOf(0x1FFFFFFFFFFFFFL);
    public static final n c = new n();

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final <T> T c(b object, Type object2, Object object3) {
        object2 = ((b)object).f;
        if (object2.p() == 2) {
            object = object2.J();
            object2.o(16);
            if (((String)object).length() > 65535) throw new d("decimal overflow");
            object = new BigInteger((String)object);
            return (T)object;
        } else {
            object2 = null;
            object = (object = ((b)object).o(null)) == null ? object2 : A.h(object);
        }
        return (T)object;
    }

    @Override
    public final void d(L object, Object object2, Object object3, Type type, int n2) {
        object = ((L)object).j;
        if (object2 == null) {
            ((h0)object).u(i0.j);
            return;
        }
        object3 = ((BigInteger)(object2 = (BigInteger)object2)).toString();
        if (((String)object3).length() >= 16 && i0.b(n2, ((h0)object).c, i0.r) && (((BigInteger)object2).compareTo(a) < 0 || ((BigInteger)object2).compareTo(b) > 0)) {
            ((h0)object).v((String)object3);
            return;
        }
        ((h0)object).write((String)object3);
    }

    @Override
    public final int e() {
        return 2;
    }
}

