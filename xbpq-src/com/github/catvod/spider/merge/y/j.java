/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.y.N;
import com.github.catvod.spider.merge.y.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class j
implements i {
    private boolean a;
    private List<i> b;

    public j(i i2, i i4, boolean bl) {
        ArrayList<i> arrayList = new ArrayList<i>(2);
        this.b = arrayList;
        arrayList.add(i2);
        ((ArrayList)this.b).add(i4);
        this.a = bl;
    }

    @Override
    public final boolean a(N n2, Object object, Object object2, Object object3) {
        if (this.a) {
            Iterator iterator = ((ArrayList)this.b).iterator();
            while (iterator.hasNext()) {
                if (((i)iterator.next()).a(n2, object, object2, object3)) continue;
                return false;
            }
            return true;
        }
        Iterator iterator = ((ArrayList)this.b).iterator();
        while (iterator.hasNext()) {
            if (!((i)iterator.next()).a(n2, object, object2, object3)) continue;
            return true;
        }
        return false;
    }
}

