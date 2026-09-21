/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.y.G;
import com.github.catvod.spider.merge.y.H;
import com.github.catvod.spider.merge.y.K;
import com.github.catvod.spider.merge.y.N;
import com.github.catvod.spider.merge.y.O;
import com.github.catvod.spider.merge.y.i;

abstract class A
implements i {
    static long d = com.github.catvod.spider.merge.H.A.z("type");
    protected final String a;
    protected final long b;
    protected G c;

    protected A(String object, boolean bl) {
        block4: {
            long l2;
            this.a = object;
            this.b = l2 = com.github.catvod.spider.merge.H.A.z((String)object);
            if (!bl) break block4;
            if (l2 == d) {
                object = K.a;
            } else {
                if (l2 != 5614464919154503228L) {
                    throw new O(e.c("unsupported funciton : ", (String)object));
                }
                object = H.a;
            }
            this.c = object;
        }
    }

    protected final Object b(N n2, Object object, Object object2) {
        G g2 = this.c;
        if (g2 != null) {
            return g2.a(n2, object, object2);
        }
        return n2.k(object2, this.a, this.b);
    }
}

