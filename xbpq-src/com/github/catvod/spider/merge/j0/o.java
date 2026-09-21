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

public final class o
implements b {
    @Override
    public final String a() {
        return cYh.d("1425232223280E3E267C353F013F33347A36062335");
    }

    @Override
    public final e b(d object, List<e> object2) {
        object = (LinkedList)object2;
        object2 = ((e)((LinkedList)object).get(0)).g();
        String string = ((e)((LinkedList)object).get(1)).g();
        object = object2;
        if (!h.c((CharSequence)object2)) {
            int n2;
            object = h.c(string) ? object2 : ((n2 = ((String)object2).lastIndexOf(string)) == -1 ? object2 : ((String)object2).substring(0, n2));
        }
        return new e(object);
    }
}

