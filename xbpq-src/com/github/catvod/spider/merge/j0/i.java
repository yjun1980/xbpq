/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.j0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.h0.b;
import com.github.catvod.spider.merge.h0.d;
import com.github.catvod.spider.merge.h0.e;
import java.util.LinkedList;
import java.util.List;

public final class i
implements b {
    @Override
    public final String a() {
        return cYh.d("1424202323294A2728253F");
    }

    @Override
    public final e b(d object, List<e> list) {
        object = (LinkedList)list;
        return new e(((e)((LinkedList)object).get(0)).g().startsWith(((e)((LinkedList)object).get(1)).g()));
    }
}

