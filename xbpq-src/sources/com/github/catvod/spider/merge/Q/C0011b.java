package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.cYh;

/* renamed from: com.github.catvod.spider.merge.Q.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0011b {
    public final AbstractC0022m a;
    public final int b;
    public X c;
    public int d;
    public final l0 e;

    public C0011b(C0011b c0011b, AbstractC0022m abstractC0022m, X x, l0 l0Var) {
        this.a = abstractC0022m;
        this.b = c0011b.b;
        this.c = x;
        this.e = l0Var;
        this.d = c0011b.d;
    }

    public C0011b(AbstractC0022m abstractC0022m, int i, X x, l0 l0Var) {
        this.a = abstractC0022m;
        this.b = i;
        this.c = x;
        this.e = l0Var;
    }

    public boolean a(C0011b c0011b) {
        X x;
        X x2;
        if (this == c0011b) {
            return true;
        }
        return c0011b != null && this.a.b == c0011b.a.b && this.b == c0011b.b && ((x = this.c) == (x2 = c0011b.c) || (x != null && x.equals(x2))) && this.e.equals(c0011b.e) && c() == c0011b.c();
    }

    public final int b() {
        return this.d & (-1073741825);
    }

    public final boolean c() {
        return (this.d & 1073741824) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0011b) {
            return a((C0011b) obj);
        }
        return false;
    }

    public int hashCode() {
        return com.github.catvod.spider.merge.N.a.b(com.github.catvod.spider.merge.N.a.p(com.github.catvod.spider.merge.N.a.p(com.github.catvod.spider.merge.N.a.o(com.github.catvod.spider.merge.N.a.o(7, this.a.b), this.b), this.c), this.e), 4);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.a);
        String d = cYh.d("4B");
        sb.append(d);
        sb.append(this.b);
        if (this.c != null) {
            sb.append(cYh.d("4B0B"));
            sb.append(this.c.toString());
            sb.append(cYh.d("3A"));
        }
        l0 l0Var = this.e;
        if (l0Var != null && l0Var != l0.c) {
            sb.append(d);
            sb.append(this.e);
        }
        if (b() > 0) {
            sb.append(cYh.d("4B25316C"));
            sb.append(b());
        }
        sb.append(')');
        return sb.toString();
    }
}
