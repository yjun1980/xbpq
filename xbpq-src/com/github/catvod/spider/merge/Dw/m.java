/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Dw;

import com.github.catvod.spider.merge.Dw.i;
import com.github.catvod.spider.merge.Dw.l;
import com.github.catvod.spider.merge.Nx.D;
import com.github.catvod.spider.merge.Nx.f;
import java.util.Arrays;

public final class m {
    public int a = -1;
    public f b;
    public m[] c;
    public boolean d;
    public int e;
    public D f;
    public boolean g;
    public l[] h;

    public m() {
        this.b = new f(true);
        this.d = false;
    }

    public m(f f2) {
        new f(true);
        this.d = false;
        this.b = f2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof m)) {
            return false;
        }
        object = (m)object;
        return this.b.equals(((m)object).b);
    }

    public final int hashCode() {
        return i.b(i.o(7, this.b.hashCode()), 1);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append(":");
        stringBuilder.append(this.b);
        if (this.d) {
            stringBuilder.append("=>");
            Object[] objectArray = this.h;
            if (objectArray != null) {
                stringBuilder.append(Arrays.toString(objectArray));
            } else {
                stringBuilder.append(this.e);
            }
        }
        return stringBuilder.toString();
    }
}

