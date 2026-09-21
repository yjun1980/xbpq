/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Z;

import com.github.catvod.spider.merge.Z.b;
import com.github.catvod.spider.merge.i0.m;
import java.util.Comparator;

public final class f
implements Comparator<b> {
    @Override
    public final int compare(Object object, Object object2) {
        int n2;
        object = (b)object;
        object2 = (b)object2;
        try {
            n2 = Integer.compare(Integer.parseInt(m.z(m.x(((b)object).a())).replaceAll("\\D+", "")), Integer.parseInt(m.z(m.x(((b)object2).a())).replaceAll("\\D+", "")));
        }
        catch (NumberFormatException numberFormatException) {
            n2 = ((b)object).a().compareToIgnoreCase(((b)object2).a());
        }
        return n2;
    }
}

