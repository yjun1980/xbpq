package com.github.catvod.spider.merge.p0;

import com.github.catvod.spider.merge.cYh;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;

/* loaded from: classes.dex */
public final class c implements com.github.catvod.spider.merge.n0.b {
    private final String c;
    private volatile com.github.catvod.spider.merge.n0.b d;
    private Boolean e;
    private Method f;
    private com.github.catvod.spider.merge.o0.a g;
    private Queue<com.github.catvod.spider.merge.o0.c> h;
    private final boolean i;

    public c(String str, Queue<com.github.catvod.spider.merge.o0.c> queue, boolean z) {
        this.c = str;
        this.h = queue;
        this.i = z;
    }

    @Override // com.github.catvod.spider.merge.n0.b
    public final void a(String str, Throwable th) {
        com.github.catvod.spider.merge.n0.b bVar;
        if (this.d != null) {
            bVar = this.d;
        } else if (this.i) {
            bVar = b.c;
        } else {
            if (this.g == null) {
                this.g = new com.github.catvod.spider.merge.o0.a(this, this.h);
            }
            bVar = this.g;
        }
        bVar.a(str, th);
    }

    @Override // com.github.catvod.spider.merge.n0.b
    public final String b() {
        return this.c;
    }

    public final boolean c() {
        Boolean bool = this.e;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f = this.d.getClass().getMethod(cYh.d("0B3F26"), com.github.catvod.spider.merge.o0.b.class);
            this.e = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.e = Boolean.FALSE;
        }
        return this.e.booleanValue();
    }

    public final boolean d() {
        return this.d instanceof b;
    }

    public final boolean e() {
        return this.d == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && c.class == obj.getClass() && this.c.equals(((c) obj).c);
    }

    public final void f(com.github.catvod.spider.merge.o0.b bVar) {
        if (c()) {
            try {
                this.f.invoke(this.d, bVar);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    public final void g(com.github.catvod.spider.merge.n0.b bVar) {
        this.d = bVar;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
