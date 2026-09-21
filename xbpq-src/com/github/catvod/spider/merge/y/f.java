/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.D.J;
import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.h0;
import com.github.catvod.spider.merge.D.i0;
import com.github.catvod.spider.merge.y.a;
import java.util.ArrayList;
import java.util.List;

public final class f
implements J {
    private String a;
    private final List<Object> b = new ArrayList<Object>();

    public f() {
    }

    public f(String string) {
        this.a = string;
    }

    @Override
    public final void a(L l2, int n2) {
        h0 h02 = l2.j;
        int n3 = i0.x.a;
        if ((n2 & n3) != 0 || h02.f(n3)) {
            h02.write("/**/");
        }
        h02.write(this.a);
        h02.write(40);
        for (n2 = 0; n2 < ((ArrayList)this.b).size(); ++n2) {
            if (n2 != 0) {
                h02.write(44);
            }
            l2.u(((ArrayList)this.b).get(n2));
        }
        h02.write(41);
    }

    public final void b(Object object) {
        ((ArrayList)this.b).add(object);
    }

    public final String toString() {
        return com.github.catvod.spider.merge.y.a.m(this);
    }
}

