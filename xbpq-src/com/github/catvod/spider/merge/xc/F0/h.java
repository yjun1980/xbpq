/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.F0;

import com.github.catvod.spider.merge.HR.f;
import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.xc.E0.b;
import com.github.catvod.spider.merge.xc.F0.g;
import com.github.catvod.spider.merge.xc.F0.l;
import com.github.catvod.spider.merge.xc.F0.q;
import com.github.catvod.spider.merge.xc.G0.D;
import com.github.catvod.spider.merge.xc.G0.E;
import com.github.catvod.spider.merge.xc.a.a;

public final class h
extends l {
    public static final f m = new f("title", 9, false);
    public g j = new g();
    public A k = new A(new com.github.catvod.spider.merge.xc.G0.b());
    public int l = 1;

    public h(String string) {
        super(E.a("#root", D.c), string, null);
    }

    @Override
    public final l B() {
        h h2 = (h)super.B();
        h2.j = this.j.a();
        return h2;
    }

    public final l Q() {
        l l22;
        for (l l22 : this.A()) {
            if (!l22.d.b.equals("html")) continue;
            return l22;
        }
        com.github.catvod.spider.merge.xc.a.a.r(this);
        l22 = new l(E.a("html", D.c), this.e(), null);
        this.y(l22);
        return l22;
    }

    public final String R() {
        Object object3;
        Object object2;
        block3: {
            object2 = this.Q();
            for (Object object3 : ((l)object2).A()) {
                if (!((l)object3).d.b.equals("head")) continue;
                break block3;
            }
            com.github.catvod.spider.merge.xc.a.a.r((q)object2);
            object3 = new l(E.a("head", D.c), ((l)object2).e(), null);
            ((q)object2).b(0, new q[]{object3});
        }
        object3 = new com.github.catvod.spider.merge.UY.h(m).e((l)object3, (l)object3);
        if (object3 != null) {
            object3 = ((l)object3).O();
            object2 = com.github.catvod.spider.merge.xc.E0.b.b();
            com.github.catvod.spider.merge.xc.E0.b.a((StringBuilder)object2, (String)object3, false);
            object3 = com.github.catvod.spider.merge.xc.E0.b.g((StringBuilder)object2).trim();
        } else {
            object3 = "";
        }
        return object3;
    }

    @Override
    public final Object clone() {
        h h2 = (h)super.B();
        h2.j = this.j.a();
        return h2;
    }

    @Override
    public final q g() {
        h h2 = (h)super.B();
        h2.j = this.j.a();
        return h2;
    }

    @Override
    public final String o() {
        return "#document";
    }

    @Override
    public final String p() {
        return this.G();
    }
}

