/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.b0;

import com.github.catvod.spider.merge.b0.a;
import com.github.catvod.spider.merge.i0.m;
import java.util.Comparator;

public final class b
implements Comparator<a> {
    @Override
    public final int compare(Object object, Object object2) {
        int n2;
        object = (a)object;
        a a2 = (a)object2;
        try {
            n2 = Integer.compare(Integer.parseInt(m.z(((a)object).p()).replaceAll("\\D+", "")), Integer.parseInt(m.z(a2.p()).replaceAll("\\D+", "")));
        }
        catch (NumberFormatException numberFormatException) {
            n2 = ((a)object).k().compareToIgnoreCase(a2.k());
        }
        return n2;
    }
}

