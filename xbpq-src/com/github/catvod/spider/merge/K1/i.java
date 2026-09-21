/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.K1;

import com.github.catvod.spider.merge.I.r;
import java.io.Serializable;
import java.util.Objects;

public final class i<F extends Serializable, S extends Serializable>
implements Serializable {
    private F a;
    private S b;

    public i(F f2, S s2) {
        this.a = f2;
        this.b = s2;
    }

    public final F a() {
        return this.a;
    }

    public final S b() {
        return this.b;
    }

    public final boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (object != null && i.class == object.getClass()) {
            object = (i)object;
            if (!Objects.equals(this.a, ((i)object).a) || !Objects.equals(this.b, ((i)object).b)) {
                bl = false;
            }
            return bl;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return r.b("{", String.valueOf(this.a), ", ", String.valueOf(this.b), "}");
    }
}

