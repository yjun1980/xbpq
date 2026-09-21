/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.s0.D;
import com.github.catvod.spider.merge.xc.s0.W;
import com.github.catvod.spider.merge.xc.s0.h0;
import com.github.catvod.spider.merge.xc.t0.q;

public final class n0
extends q
implements W {
    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final n0 e() {
        return this;
    }

    @Override
    public final boolean j() {
        return false;
    }

    public final String k(String object) {
        StringBuilder stringBuilder = m.i("List{", (String)object, "}[");
        object = this.h();
        i.c(object, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        object = (q)object;
        boolean bl = true;
        while (!object.equals(this)) {
            boolean bl2 = bl;
            if (object instanceof h0) {
                h0 h02 = (h0)object;
                if (bl) {
                    bl = false;
                } else {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(h02);
                bl2 = bl;
            }
            object = ((q)object).i();
            bl = bl2;
        }
        stringBuilder.append("]");
        object = stringBuilder.toString();
        i.d(object, "toString(...)");
        return object;
    }

    @Override
    public final String toString() {
        String string = D.a ? this.k("Active") : super.toString();
        return string;
    }
}

