package com.github.catvod.spider.merge.R;

import com.github.catvod.spider.merge.Q.C0015f;
import com.github.catvod.spider.merge.Q.D;
import com.github.catvod.spider.merge.cYh;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e {
    public int a;
    public C0015f b;
    public e[] c;
    public boolean d;
    public int e;
    public D f;
    public boolean g;
    public d[] h;

    public e() {
        this.a = -1;
        this.b = new C0015f(true);
        this.d = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.b.equals(((e) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.N.a.b(com.github.catvod.spider.merge.N.a.o(7, this.b.hashCode()), 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(cYh.d("5D"));
        sb.append(this.b);
        if (this.d) {
            sb.append(cYh.d("5A6E"));
            d[] dVarArr = this.h;
            if (dVarArr != null) {
                sb.append(Arrays.toString(dVarArr));
            } else {
                sb.append(this.e);
            }
        }
        return sb.toString();
    }

    public e(C0015f c0015f) {
        this.a = -1;
        new C0015f(true);
        this.d = false;
        this.b = c0015f;
    }
}
