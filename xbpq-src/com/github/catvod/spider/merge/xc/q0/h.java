/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.q0;

import com.github.catvod.spider.merge.xc.a.a;
import com.github.catvod.spider.merge.xc.d0.q;
import com.github.catvod.spider.merge.xc.q0.e;
import com.github.catvod.spider.merge.xc.q0.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class h
extends j {
    public static List S(e e2) {
        Iterator iterator = e2.iterator();
        if (!iterator.hasNext()) {
            return q.a;
        }
        e2 = iterator.next();
        if (!iterator.hasNext()) {
            return com.github.catvod.spider.merge.xc.a.a.o(e2);
        }
        ArrayList<e> arrayList = new ArrayList<e>();
        arrayList.add(e2);
        while (iterator.hasNext()) {
            arrayList.add((e)iterator.next());
        }
        return arrayList;
    }
}

