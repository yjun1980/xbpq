package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.cYh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.y.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0258f extends C0263k {
    public static List a(Object... objArr) {
        com.github.catvod.spider.merge.E.f.e(objArr, cYh.d("023C243C32341323"));
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C0254b(objArr, true));
    }

    public static List b(List list) {
        int size = list.size();
        if (size == 0) {
            return C0265m.c;
        }
        if (size != 1) {
            return list;
        }
        List singletonList = Collections.singletonList(list.get(0));
        com.github.catvod.spider.merge.E.f.d(singletonList, cYh.d("14392F363B3F133F2F1D3E291378243D3237023E3578"));
        return singletonList;
    }
}
