/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J;

import com.github.catvod.spider.merge.J.a;
import com.github.catvod.spider.merge.J.b;
import com.github.catvod.spider.merge.J.e;
import com.github.catvod.spider.merge.J.f;
import com.github.catvod.spider.merge.cYh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c
extends f {
    public static b a(Iterator a2) {
        com.github.catvod.spider.merge.E.f.e(a2, cYh.d("5B2429382464"));
        a2 = new e((Iterator)((Object)a2));
        if (!(a2 instanceof a)) {
            a2 = new a(a2);
        }
        return a2;
    }

    public static List b(b object) {
        ArrayList arrayList = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            arrayList.add(object.next());
        }
        return com.github.catvod.spider.merge.y.f.b(arrayList);
    }
}

