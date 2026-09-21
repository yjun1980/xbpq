/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.e0;

import com.github.catvod.spider.merge.by.p;
import com.github.catvod.spider.merge.xc.e0.c;
import com.github.catvod.spider.merge.xc.e0.e;
import com.github.catvod.spider.merge.xc.e0.f;
import com.github.catvod.spider.merge.xc.e0.g;
import com.github.catvod.spider.merge.xc.e0.h;
import com.github.catvod.spider.merge.xc.e0.i;
import com.github.catvod.spider.merge.xc.e0.j;

public final class b
extends com.github.catvod.spider.merge.mI.j
implements p {
    public static final b b = new b(0);
    public static final b c = new b(1);
    public final int a;

    public /* synthetic */ b(int n2) {
        this.a = n2;
        super(2);
    }

    @Override
    public final Object invoke(Object object, Object object2) {
        switch (this.a) {
            default: {
                i i2 = (i)object;
                object = (g)object2;
                com.github.catvod.spider.merge.mI.i.e(i2, "acc");
                com.github.catvod.spider.merge.mI.i.e(object, "element");
                i i4 = i2.e(object.getKey());
                i2 = j.a;
                if (i4 != i2) {
                    Object object3 = e.a;
                    object2 = (f)i4.b((h)object3);
                    object = object2 == null ? new c((g)object, i4) : ((object3 = i4.e((h)object3)) == i2 ? new c((g)object2, (i)object) : new c((g)object2, new c((g)object, (i)object3)));
                }
                return object;
            }
            case 0: 
        }
        object = (String)object;
        object2 = (g)object2;
        com.github.catvod.spider.merge.mI.i.e(object, "acc");
        com.github.catvod.spider.merge.mI.i.e(object2, "element");
        if (((String)object).length() == 0) {
            object = object2.toString();
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object);
            stringBuilder.append(", ");
            stringBuilder.append(object2);
            object = stringBuilder.toString();
        }
        return object;
    }
}

