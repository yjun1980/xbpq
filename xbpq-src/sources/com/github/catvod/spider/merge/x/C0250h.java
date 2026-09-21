package com.github.catvod.spider.merge.x;

import com.github.catvod.spider.merge.cYh;
import java.io.Serializable;

/* renamed from: com.github.catvod.spider.merge.x.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0250h<T> implements InterfaceC0245c<T>, Serializable {
    private com.github.catvod.spider.merge.D.a<? extends T> c;
    private volatile Object d = C0251i.a;
    private final Object e = this;

    public C0250h(com.github.catvod.spider.merge.D.a aVar) {
        this.c = aVar;
    }

    @Override // com.github.catvod.spider.merge.x.InterfaceC0245c
    public final T getValue() {
        T t;
        T t2 = (T) this.d;
        C0251i c0251i = C0251i.a;
        if (t2 != c0251i) {
            return t2;
        }
        synchronized (this.e) {
            t = (T) this.d;
            if (t == c0251i) {
                com.github.catvod.spider.merge.D.a<? extends T> aVar = this.c;
                com.github.catvod.spider.merge.E.f.b(aVar);
                aVar.a();
                this.d = null;
                this.c = null;
                t = null;
            }
        }
        return t;
    }

    public final String toString() {
        return this.d != C0251i.a ? String.valueOf(getValue()) : cYh.d("2B313B28772C063C343477340824613839331339203D3E2002346128322E49");
    }
}
