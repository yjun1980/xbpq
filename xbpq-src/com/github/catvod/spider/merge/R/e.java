/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.R;

import com.github.catvod.spider.merge.N.a;
import com.github.catvod.spider.merge.Q.D;
import com.github.catvod.spider.merge.Q.f;
import com.github.catvod.spider.merge.R.d;
import com.github.catvod.spider.merge.cYh;
import java.util.Arrays;

public final class e {
    public int a = -1;
    public f b;
    public e[] c;
    public boolean d;
    public int e;
    public D f;
    public boolean g;
    public d[] h;

    public e() {
        this.b = new f(true);
        this.d = false;
    }

    public e(f f2) {
        new f(true);
        this.d = false;
        this.b = f2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof e)) {
            return false;
        }
        object = (e)object;
        return this.b.equals(((e)object).b);
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.N.a.b(com.github.catvod.spider.merge.N.a.o(7, this.b.hashCode()), 1);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append(cYh.d("5D"));
        stringBuilder.append(this.b);
        if (this.d) {
            stringBuilder.append(cYh.d("5A6E"));
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

