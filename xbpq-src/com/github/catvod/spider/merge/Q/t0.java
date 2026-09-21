/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.Q.m;
import com.github.catvod.spider.merge.Q.o;
import com.github.catvod.spider.merge.Q.s0;
import com.github.catvod.spider.merge.S.j;
import com.github.catvod.spider.merge.cYh;
import java.util.Arrays;
import java.util.Collections;

public abstract class t0 {
    public m a;

    static {
        Collections.unmodifiableList(Arrays.asList(cYh.d("2E1E17101B1323"), cYh.d("220012181B1529"), cYh.d("35110F1612"), cYh.d("35050D14"), cYh.d("370204151E19260404"), cYh.d("26040E1C"), cYh.d("261315181814"), cYh.d("341515"), cYh.d("291F150E041F33"), cYh.d("30190D15141B3514"), cYh.d("37020412121E221E0214")));
        Collections.unmodifiableMap(new s0());
    }

    protected t0(m m2) {
        if (m2 != null) {
            this.a = m2;
            return;
        }
        throw new NullPointerException(cYh.d("13313336322E4733203F3935137023347734123C2D7F"));
    }

    public abstract int a();

    public boolean b() {
        return this instanceof o;
    }

    public j c() {
        return null;
    }

    public abstract boolean d(int var1, int var2);
}

