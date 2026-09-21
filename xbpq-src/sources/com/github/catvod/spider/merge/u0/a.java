package com.github.catvod.spider.merge.u0;

import com.github.catvod.spider.merge.E.f;
import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
public final class a {
    private final String a;
    private final Object b;
    private final boolean c;

    public a(String str, Object obj) {
        f.e(str, cYh.d("0C3538"));
        this.a = str;
        this.b = obj;
        this.c = false;
    }

    public final String a() {
        return this.a;
    }

    public final Object b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            return f.a(((a) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
