/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.y.b;
import com.github.catvod.spider.merge.y.k;
import com.github.catvod.spider.merge.y.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class f
extends k {
    public static List a(Object ... object) {
        com.github.catvod.spider.merge.E.f.e(object, cYh.d("023C243C32341323"));
        object = ((Object[])object).length == 0 ? new ArrayList() : new ArrayList<Object>(new b<Object>((T[])object, true));
        return object;
    }

    public static List b(List list) {
        int n2 = list.size();
        if (n2 != 0) {
            if (n2 == 1) {
                list = Collections.singletonList(list.get(0));
                com.github.catvod.spider.merge.E.f.d(list, cYh.d("14392F363B3F133F2F1D3E291378243D3237023E3578"));
            }
        } else {
            list = m.c;
        }
        return list;
    }
}

