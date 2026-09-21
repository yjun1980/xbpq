/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H1;

import com.github.catvod.spider.merge.H1.c;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.K1.p;
import java.io.Serializable;
import java.util.Objects;

public final class d
implements Serializable {
    public static final d c = new d("", com.github.catvod.spider.merge.H1.c.c);
    private final String a;
    private final c b;

    public d(String string, c c2) {
        Objects.requireNonNull(string);
        this.a = string;
        this.b = c2;
    }

    public static d b(String string, c c2) {
        if (p.j(string)) {
            return c;
        }
        return new d(string, c2);
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (object != null && d.class == object.getClass()) {
            object = (d)object;
            if (this.b != ((d)object).b || !Objects.equals(this.a, ((d)object).a)) {
                bl = false;
            }
            return bl;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return r.b("Description[content=", this.a, ", type=", String.valueOf((Object)this.b), "]");
    }
}

