/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.j0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.h0.b;
import com.github.catvod.spider.merge.h0.d;
import com.github.catvod.spider.merge.h0.e;
import java.util.List;

public final class a
implements b {
    @Override
    public final String a() {
        return cYh.d("043F2F32362E");
    }

    @Override
    public final e b(d object, List<e> object2) {
        object = new StringBuilder();
        object2 = object2.iterator();
        while (object2.hasNext()) {
            ((StringBuilder)object).append(((e)object2.next()).g());
        }
        return new e(((StringBuilder)object).toString());
    }
}

