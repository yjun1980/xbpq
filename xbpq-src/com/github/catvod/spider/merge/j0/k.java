/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.j0;

import com.github.catvod.spider.merge.U.h;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.h0.b;
import com.github.catvod.spider.merge.h0.d;
import com.github.catvod.spider.merge.h0.e;
import java.util.LinkedList;
import java.util.List;

public final class k
implements b {
    @Override
    public final String a() {
        return cYh.d("1425232223280E3E26");
    }

    @Override
    public final e b(d object, List<e> object2) {
        object = (LinkedList)object2;
        object2 = ((e)((LinkedList)object).get(0)).g();
        int n2 = Math.max(((e)((LinkedList)object).get(1)).f().intValue() - 1, 0);
        if (((LinkedList)object).get(2) != null) {
            return new e(h.j((String)object2, n2, Math.max(Math.min(((e)((LinkedList)object).get(2)).f().intValue() + n2, ((String)object2).length()), 0)));
        }
        return new e(h.i((String)object2, n2));
    }
}

