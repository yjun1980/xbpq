/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.L;

import com.github.catvod.spider.merge.L.f;
import com.github.catvod.spider.merge.i0.m;
import java.util.Comparator;

public final class l
implements Comparator<f> {
    @Override
    public final int compare(Object object, Object object2) {
        int n2;
        object = (f)object;
        f f2 = (f)object2;
        try {
            n2 = Integer.compare(Integer.parseInt(m.z(((f)object).k()).replaceAll("\\D+", "")), Integer.parseInt(m.z(f2.k()).replaceAll("\\D+", "")));
        }
        catch (NumberFormatException numberFormatException) {
            n2 = ((f)object).f().compareToIgnoreCase(f2.f());
        }
        return n2;
    }
}

