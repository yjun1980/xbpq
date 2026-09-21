/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.i0.m;
import java.util.Comparator;
import java.util.Map;

public final class h
implements Comparator<Map<String, Object>> {
    @Override
    public final int compare(Object object, Object object2) {
        int n2;
        object = (Map)object;
        object2 = (Map)object2;
        try {
            n2 = Integer.compare(Integer.parseInt(m.z(m.x((String)object.get("pname"))).replaceAll("\\D+", "")), Integer.parseInt(m.z(m.x((String)object2.get("pname"))).replaceAll("\\D+", "")));
        }
        catch (NumberFormatException numberFormatException) {
            n2 = 0;
        }
        return n2;
    }
}

