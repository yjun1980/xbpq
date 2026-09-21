/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.A0;
import com.github.catvod.spider.merge.E0.x0;
import com.github.catvod.spider.merge.E0.y;
import java.util.Iterator;

final class w0
extends A0<y<Object>, Object> {
    w0() {
        super(null);
    }

    @Override
    public final void m() {
        if (!this.l()) {
            for (int i2 = 0; i2 < this.i(); ++i2) {
                ((y)((x0)this.h(i2)).getKey()).a();
            }
            Iterator iterator = this.j().iterator();
            while (iterator.hasNext()) {
                ((y)iterator.next().getKey()).a();
            }
        }
        super.m();
    }
}

