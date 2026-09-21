/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.k0;

import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.h0.c;
import com.github.catvod.spider.merge.h0.d;
import java.util.AbstractCollection;
import java.util.LinkedList;

public final class e
implements c {
    @Override
    public final String a() {
        return cYh.d("082535342512133D2D");
    }

    @Override
    public final com.github.catvod.spider.merge.h0.e b(d object) {
        LinkedList<String> linkedList = new LinkedList<String>();
        object = ((AbstractCollection)((d)object).a()).iterator();
        while (object.hasNext()) {
            linkedList.add(((l)object.next()).u());
        }
        return new com.github.catvod.spider.merge.h0.e(linkedList);
    }
}

