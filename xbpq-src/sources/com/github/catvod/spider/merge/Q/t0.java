package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.cYh;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public abstract class t0 {
    public AbstractC0022m a;

    static {
        Collections.unmodifiableList(Arrays.asList(cYh.d("2E1E17101B1323"), cYh.d("220012181B1529"), cYh.d("35110F1612"), cYh.d("35050D14"), cYh.d("370204151E19260404"), cYh.d("26040E1C"), cYh.d("261315181814"), cYh.d("341515"), cYh.d("291F150E041F33"), cYh.d("30190D15141B3514"), cYh.d("37020412121E221E0214")));
        Collections.unmodifiableMap(new s0());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public t0(AbstractC0022m abstractC0022m) {
        if (abstractC0022m == null) {
            throw new NullPointerException(cYh.d("13313336322E4733203F3935137023347734123C2D7F"));
        }
        this.a = abstractC0022m;
    }

    public abstract int a();

    public boolean b() {
        return this instanceof C0024o;
    }

    public com.github.catvod.spider.merge.S.j c() {
        return null;
    }

    public abstract boolean d(int i, int i2);
}
