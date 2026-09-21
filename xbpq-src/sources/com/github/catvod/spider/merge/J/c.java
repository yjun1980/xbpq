package com.github.catvod.spider.merge.J;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.y.C0258f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class c extends f {
    public static b a(Iterator it) {
        com.github.catvod.spider.merge.E.f.e(it, cYh.d("5B2429382464"));
        e eVar = new e(it);
        return eVar instanceof a ? eVar : new a(eVar);
    }

    public static List b(b bVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return C0258f.b(arrayList);
    }
}
