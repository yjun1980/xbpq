/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlinx.coroutines.b
 */
package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.L.h;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.j.l;
import com.github.catvod.spider.merge.x.g;
import com.github.catvod.spider.merge.z.e;
import com.github.catvod.spider.merge.z.k;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class b<T>
extends kotlinx.coroutines.b<T>
implements e<T> {
    private volatile Object _reusableCancellableContinuation;

    static {
        AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, cYh.d("38222424243B053C2412363404352D3D36380B35023E392E0E3E34302333083E"));
    }

    @Override
    public final k a() {
        throw null;
    }

    public final e<T> b() {
        return this;
    }

    public final String toString() {
        Object object;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(cYh.d("23393221362E0438243514350924283F223B13392E3F0C"));
        stringBuilder.append((Object)null);
        stringBuilder.append(cYh.d("4B70"));
        try {
            object = new StringBuilder();
            ((StringBuilder)object).append((Object)null);
            ((StringBuilder)object).append('@');
            ((StringBuilder)object).append(h.d(null));
            object = ((StringBuilder)object).toString();
        }
        catch (Throwable throwable) {
            object = l.a(throwable);
        }
        if (g.a(object) == null) {
            stringBuilder.append((String)object);
            stringBuilder.append(']');
            return stringBuilder.toString();
        }
        throw null;
    }
}

