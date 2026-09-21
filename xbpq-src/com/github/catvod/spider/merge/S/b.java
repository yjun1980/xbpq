/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.S;

import com.github.catvod.spider.merge.R0.e;
import com.github.catvod.spider.merge.i0.m;
import java.util.Calendar;
import java.util.List;

public final class b
extends Enum<b> {
    private static final b[] d = new b[]{new b("NORMAL", 64, 32), new b("SUPER_VIP", 500, 6), new b("EXP_SVIP", 400, 8)};
    private String a;
    private Integer b;
    private Integer c;

    private b(String string2, Integer n3, Integer n4) {
        this.a = string2;
        this.b = n3;
        this.c = n4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Integer b(String string) {
        int n2;
        b[] bArray = com.github.catvod.spider.merge.S.b.values();
        int n3 = bArray.length;
        int n4 = 0;
        for (n2 = 0; n2 < n3; ++n2) {
            b b2;
            block5: {
                block4: {
                    b2 = bArray[n2];
                    if (!e.a(string, b2.a)) continue;
                    List<String> list = m.a;
                    n3 = Calendar.getInstance().get(11);
                    if (n3 >= 18) break block4;
                    n2 = n4;
                    if (n3 >= 6) break block5;
                }
                n2 = 1;
            }
            if (n2 == 0 || !"EXP_SVIP".equals(string)) return b2.b;
            n2 = b2.b / 2;
            return n2;
        }
        n2 = 30;
        return n2;
    }

    public static Integer e(String string) {
        for (b b2 : com.github.catvod.spider.merge.S.b.values()) {
            if (!e.a(string, b2.a)) continue;
            return b2.c;
        }
        return 30;
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    public static b[] values() {
        return (b[])d.clone();
    }
}

