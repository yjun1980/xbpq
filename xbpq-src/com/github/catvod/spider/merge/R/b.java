/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.R;

import com.github.catvod.spider.merge.R.a;
import com.github.catvod.spider.merge.i0.m;
import java.util.Comparator;

public final class b
implements Comparator<a> {
    @Override
    public final int compare(Object object, Object object2) {
        int n2;
        object = (a)object;
        object2 = (a)object2;
        try {
            n2 = Integer.compare(Integer.parseInt(m.z(((a)object).m()).replaceAll("\\D+", "")), Integer.parseInt(m.z(((a)object2).m()).replaceAll("\\D+", "")));
        }
        catch (NumberFormatException numberFormatException) {
            n2 = ((a)object).j().compareToIgnoreCase(((a)object2).j());
        }
        return n2;
    }
}

