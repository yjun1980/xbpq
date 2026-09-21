/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.i0;

import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.g;
import com.github.catvod.spider.merge.h0.a;
import com.github.catvod.spider.merge.h0.e;
import java.util.AbstractCollection;
import java.util.LinkedList;
import java.util.List;

public final class b
implements a {
    @Override
    public final String a() {
        return cYh.d("063E2234242E0822");
    }

    @Override
    public final e b(g object) {
        LinkedList<l> linkedList = new LinkedList<l>();
        object = ((AbstractCollection)object).iterator();
        while (object.hasNext()) {
            linkedList.addAll(((l)object.next()).g0());
        }
        return new e(new g((List<l>)linkedList));
    }
}

