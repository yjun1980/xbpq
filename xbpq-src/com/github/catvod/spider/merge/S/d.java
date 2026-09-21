/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.S;

import com.github.catvod.spider.merge.S.a;
import com.github.catvod.spider.merge.i0.m;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class d
implements Comparator<a> {
    public static void a(List<a> list) {
        Collections.sort(list, new d());
    }

    @Override
    public final int compare(Object object, Object object2) {
        int n2;
        object = (a)object;
        a a2 = (a)object2;
        try {
            n2 = Integer.compare(Integer.parseInt(m.z(((a)object).n()).replaceAll("\\D+", "")), Integer.parseInt(m.z(a2.n()).replaceAll("\\D+", "")));
        }
        catch (NumberFormatException numberFormatException) {
            n2 = ((a)object).k().compareToIgnoreCase(a2.k());
        }
        return n2;
    }
}

