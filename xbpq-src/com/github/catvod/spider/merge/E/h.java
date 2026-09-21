/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E;

import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.E.i;
import com.github.catvod.spider.merge.I.a;
import com.github.catvod.spider.merge.cYh;

public final class h {
    private static final i a;
    private static final a[] b;

    static {
        i i2 = null;
        try {
            i i3;
            i2 = i3 = (i)Class.forName(cYh.d("0C3F353D3E34492224373B3F04246F3B213749392F25322809312D7F053F013C24322333083E0730342E082238183A2A0B")).newInstance();
        }
        catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException exception) {
            // empty catch block
        }
        if (i2 == null) {
            i2 = new i();
        }
        a = i2;
        b = new a[0];
    }

    public static String a(g object) {
        a.getClass();
        String string = object.getClass().getGenericInterfaces()[0].toString();
        object = string;
        if (string.startsWith(cYh.d("0C3F353D3E34493A373C793C123E22253E3509236F"))) {
            object = string.substring(21);
        }
        return object;
    }
}

