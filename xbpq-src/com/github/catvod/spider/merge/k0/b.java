/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.k0;

import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.h0.c;
import com.github.catvod.spider.merge.h0.d;
import com.github.catvod.spider.merge.h0.e;
import java.util.AbstractCollection;
import java.util.LinkedList;

public final class b
implements c {
    @Override
    public final String a() {
        return cYh.d("0F242C3D");
    }

    @Override
    public final e b(d object) {
        LinkedList<String> linkedList = new LinkedList<String>();
        object = ((AbstractCollection)((d)object).a()).iterator();
        while (object.hasNext()) {
            linkedList.add(((l)object.next()).X());
        }
        return new e(linkedList);
    }
}

