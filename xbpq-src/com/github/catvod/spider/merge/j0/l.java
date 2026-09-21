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

public final class l
implements b {
    @Override
    public final String a() {
        return cYh.d("1425232223280E3E267C363C133533");
    }

    @Override
    public final e b(d object, List<e> object2) {
        object2 = (LinkedList)object2;
        object = ((e)((LinkedList)object2).get(0)).g();
        object2 = ((e)((LinkedList)object2).get(1)).g();
        if (!h.c((CharSequence)object)) {
            int n2;
            object = object2 == null || (n2 = ((String)object).indexOf((String)object2)) == -1 ? "" : ((String)object).substring(((String)object2).length() + n2);
        }
        return new e(object);
    }
}

