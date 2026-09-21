/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H1;

import com.github.catvod.spider.merge.K1.p;
import com.github.catvod.spider.merge.k1.i;
import java.io.Serializable;
import java.util.List;

public abstract class f
implements Serializable {
    private final i a;
    private final String b;
    private final boolean c;
    private final int d;

    public f(String string, boolean bl, i i2, int n2) {
        this.b = string;
        this.c = bl;
        this.a = i2;
        this.d = n2;
    }

    public static boolean a(f f2, List<? extends f> object) {
        if (p.k(object)) {
            return false;
        }
        object = object.iterator();
        while (object.hasNext()) {
            if (!f2.b((f)object.next())) continue;
            return true;
        }
        return false;
    }

    public boolean b(f f2) {
        i i2;
        i i4;
        boolean bl = f2 != null && (i4 = this.a) != null && (i2 = f2.a) != null && i4.a == i2.a && this.d == f2.d && this.c == f2.c;
        return bl;
    }

    public final String c() {
        return this.b;
    }

    public final i d() {
        return this.a;
    }
}

