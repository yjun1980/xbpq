/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.j0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.h0.b;
import com.github.catvod.spider.merge.h0.d;
import com.github.catvod.spider.merge.h0.e;
import java.util.LinkedList;
import java.util.List;

public final class g
implements b {
    @Override
    public final String a() {
        return cYh.d("093F35");
    }

    @Override
    public final e b(d object, List<e> list) {
        object = (LinkedList)list;
        if (((LinkedList)object).size() == 1) {
            return new e(((e)((LinkedList)object).get(0)).a() ^ true);
        }
        throw new com.github.catvod.spider.merge.x.b(cYh.d("0222333E257A173133303A7A0E3E613F382E4F322E3E3B734736343F342E0E3F2F7F07360231323477390F35223A79"));
    }
}

