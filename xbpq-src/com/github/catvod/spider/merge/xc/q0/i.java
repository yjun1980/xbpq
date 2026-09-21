/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.q0;

import com.github.catvod.spider.merge.by.p;
import com.github.catvod.spider.merge.xc.a.a;
import com.github.catvod.spider.merge.xc.q0.e;
import com.github.catvod.spider.merge.xc.q0.f;
import java.util.Iterator;

public final class i
implements e {
    public final int a;
    public final Object b;

    public /* synthetic */ i(int n2, Object object) {
        this.a = n2;
        this.b = object;
    }

    @Override
    public final Iterator iterator() {
        switch (this.a) {
            default: {
                return (Iterator)this.b;
            }
            case 0: 
        }
        p p2 = (p)this.b;
        com.github.catvod.spider.merge.mI.i.e(p2, "block");
        f f2 = new f();
        f2.d = com.github.catvod.spider.merge.xc.a.a.g(f2, p2, f2);
        return f2;
    }
}

