/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.C;

import com.github.catvod.spider.merge.B.b;
import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.C.v;
import com.github.catvod.spider.merge.y.d;
import com.github.catvod.spider.merge.y.f;
import java.lang.reflect.Type;

public final class p
implements v {
    @Override
    public final <T> T c(b object, Type object2, Object object3) {
        int n2;
        com.github.catvod.spider.merge.B.f f2 = (com.github.catvod.spider.merge.B.f)((b)object).f;
        object3 = f2.E(((b)object).b);
        f2.nextToken();
        int n3 = n2 = f2.p();
        object2 = object3;
        if (n2 == 25) {
            object2 = f2.E(((b)object).b);
            object3 = e.c((String)object3, ".");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object3);
            stringBuilder.append((String)object2);
            object2 = stringBuilder.toString();
            f2.nextToken();
            n3 = f2.p();
        }
        object2 = new f((String)object2);
        if (n3 == 10) {
            do {
                f2.nextToken();
                ((f)object2).b(((b)object).o(null));
            } while ((n3 = f2.p()) == 16);
            if (n3 == 11) {
                f2.nextToken();
                if (f2.p() == 24) {
                    f2.nextToken();
                }
                return (T)object2;
            }
            object = a.c("illegal jsonp : ");
            ((StringBuilder)object).append(f2.f());
            throw new d(((StringBuilder)object).toString());
        }
        object = a.c("illegal jsonp : ");
        ((StringBuilder)object).append(f2.f());
        throw new d(((StringBuilder)object).toString());
    }

    @Override
    public final int e() {
        return 0;
    }
}

