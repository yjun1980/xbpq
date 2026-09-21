/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.t;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.t.a;
import com.github.catvod.spider.merge.t.b;
import java.util.ArrayList;
import java.util.List;

public final class c {
    private final a a;
    private final List<b> b;

    public c(a a2) {
        this.a = a2;
        ArrayList<b> arrayList = new ArrayList<b>();
        this.b = arrayList;
        arrayList.add(new b(a2, new int[]{1}));
    }

    public final void a(int[] object, int n2) {
        if (n2 != 0) {
            int n3 = ((int[])object).length - n2;
            if (n3 > 0) {
                Object object2;
                int n4;
                Object object3;
                if (n2 >= ((ArrayList)this.b).size()) {
                    object3 = this.b;
                    object3 = (b)((ArrayList)object3).get(((ArrayList)object3).size() - 1);
                    for (n4 = ((ArrayList)this.b).size(); n4 <= n2; ++n4) {
                        object2 = this.a;
                        object3 = ((b)object3).f(new b((a)object2, new int[]{1, ((a)object2).b(((a)object2).c() + (n4 - 1))}));
                        ((ArrayList)this.b).add((b)object3);
                    }
                }
                object3 = (b)((ArrayList)this.b).get(n2);
                object2 = new int[n3];
                System.arraycopy(object, 0, object2, 0, n3);
                object3 = new b(this.a, (int[])object2).g(n2, 1).b((b)object3)[1].d();
                n4 = n2 - ((Object)object3).length;
                for (n2 = 0; n2 < n4; ++n2) {
                    object[n3 + n2] = 0;
                }
                System.arraycopy(object3, 0, object, n3 + n4, ((Object)object3).length);
                return;
            }
            throw new IllegalArgumentException(cYh.d("293F6135362E06702328233F14703123382C0E342435"));
        }
        object = new IllegalArgumentException(cYh.d("293F61342528082261323828153522253E3509702328233F14"));
        throw object;
    }
}

