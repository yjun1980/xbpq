package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.j.l;
import com.github.catvod.spider.merge.x.C0249g;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class b<T> extends kotlinx.coroutines.b<T> implements com.github.catvod.spider.merge.z.e<T> {
    private volatile Object _reusableCancellableContinuation;

    static {
        AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, cYh.d("38222424243B053C2412363404352D3D36380B35023E392E0E3E34302333083E"));
    }

    @Override // com.github.catvod.spider.merge.z.e
    public final com.github.catvod.spider.merge.z.k a() {
        throw null;
    }

    public final com.github.catvod.spider.merge.z.e<T> b() {
        return this;
    }

    public final String toString() {
        Object a;
        StringBuilder sb = new StringBuilder();
        sb.append(cYh.d("23393221362E0438243514350924283F223B13392E3F0C"));
        sb.append((Object) null);
        sb.append(cYh.d("4B70"));
        try {
            a = ((Object) null) + '@' + com.github.catvod.spider.merge.L.h.d(null);
        } catch (Throwable th) {
            a = l.a(th);
        }
        if (C0249g.a(a) == null) {
            sb.append((String) a);
            sb.append(']');
            return sb.toString();
        }
        throw null;
    }
}
