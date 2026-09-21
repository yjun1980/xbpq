/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.z;

import com.github.catvod.spider.merge.D.c;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.z.d;
import com.github.catvod.spider.merge.z.f;
import com.github.catvod.spider.merge.z.g;
import com.github.catvod.spider.merge.z.h;
import com.github.catvod.spider.merge.z.k;
import com.github.catvod.spider.merge.z.l;

final class j
extends com.github.catvod.spider.merge.E.g
implements c<k, h, k> {
    public static final j c = new j();

    j() {
    }

    @Override
    public final Object b(Object object, Object object2) {
        block0: {
            Object object3 = (k)object;
            object = (h)object2;
            com.github.catvod.spider.merge.E.f.e(object3, cYh.d("063322"));
            com.github.catvod.spider.merge.E.f.e(object, cYh.d("023C243C323413"));
            k k2 = object3.minusKey(object.getKey());
            object2 = l.c;
            if (k2 == object2) break block0;
            object3 = g.a;
            f f2 = f.a;
            object3 = k2.get(f2);
            object = object3 == null ? new d(k2, (h)object) : ((k2 = k2.minusKey(f2)) == object2 ? new d((k)object, (h)object3) : new d(new d(k2, (h)object), (h)object3));
        }
        return object;
    }
}

