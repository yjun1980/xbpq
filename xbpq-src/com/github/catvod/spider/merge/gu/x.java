/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.gu;

import com.github.catvod.spider.merge.Lc.b;
import com.github.catvod.spider.merge.Lc.c;
import com.github.catvod.spider.merge.Lc.f;
import com.github.catvod.spider.merge.gu.C;
import com.github.catvod.spider.merge.gu.D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class x
extends C {
    public List<b> d;
    public D e;
    public D f;

    public x() {
    }

    public x(x x2, int n2) {
        super(x2, n2);
    }

    @Override
    public final b b(int n2) {
        List<b> list = this.d;
        list = list != null && n2 >= 0 && n2 < ((ArrayList)list).size() ? (b)((ArrayList)this.d).get(n2) : null;
        return list;
    }

    @Override
    public final int d() {
        List<b> list = this.d;
        int n2 = list != null ? ((ArrayList)list).size() : 0;
        return n2;
    }

    public final <T extends b> T h(T t2) {
        if (this.d == null) {
            this.d = new ArrayList<b>();
        }
        ((ArrayList)this.d).add(t2);
        return t2;
    }

    public void i(c c2) {
    }

    public void j(c c2) {
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public final x k(Class object) {
        List<b> list = this.d;
        if (list != null && ((ArrayList)list).size() > 0) {
            for (b b2 : this.d) {
                if (!((Class)object).isInstance(b2)) continue;
                object = (b)((Class)object).cast(b2);
                break;
            }
        } else {
            object = null;
        }
        return (x)object;
    }

    public final <T extends x> List<T> l(Class<? extends T> clazz) {
        List<b> list = this.d;
        if (list == null) {
            return Collections.emptyList();
        }
        List<b> list2 = null;
        for (b b2 : list) {
            if (!clazz.isInstance(b2)) continue;
            list = list2;
            if (list2 == null) {
                list = new ArrayList<b>();
            }
            list.add((b)clazz.cast(b2));
            list2 = list;
        }
        if (list2 == null) {
            return Collections.emptyList();
        }
        return list2;
    }

    public final f m(int n2) {
        List<b> list = this.d;
        if (list != null && ((ArrayList)list).size() > 0) {
            for (b b2 : this.d) {
                if (!(b2 instanceof f) || (b2 = (f)b2).a().e() != n2) continue;
                return b2;
            }
        }
        return null;
    }
}

