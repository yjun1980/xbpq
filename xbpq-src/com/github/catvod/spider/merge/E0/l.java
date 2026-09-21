/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.N;
import com.github.catvod.spider.merge.E0.h;
import com.github.catvod.spider.merge.E0.j;
import com.github.catvod.spider.merge.E0.n;
import java.util.Iterator;
import java.util.Objects;

class l
extends n {
    protected final byte[] d;

    l(byte[] byArray) {
        Objects.requireNonNull(byArray);
        this.d = byArray;
    }

    @Override
    public byte a(int n2) {
        return this.d[n2];
    }

    @Override
    public final boolean equals(Object object) {
        boolean bl = true;
        if (object == this) {
            return true;
        }
        if (!(object instanceof n)) {
            return false;
        }
        if (this.size() != ((n)object).size()) {
            return false;
        }
        if (this.size() == 0) {
            return true;
        }
        if (object instanceof l) {
            object = (l)object;
            int n2 = this.i();
            int n3 = ((n)object).i();
            if (n2 != 0 && n3 != 0 && n2 != n3) {
                return false;
            }
            int n4 = this.size();
            if (n4 <= ((l)object).size()) {
                if (0 + n4 <= ((l)object).size()) {
                    boolean bl2;
                    byte[] byArray = this.d;
                    byte[] byArray2 = ((l)object).d;
                    int n5 = this.k();
                    n3 = this.k();
                    n2 = ((l)object).k() + 0;
                    while (true) {
                        bl2 = bl;
                        if (n3 >= n5 + n4) break;
                        if (byArray[n3] != byArray2[n2]) {
                            bl2 = false;
                            break;
                        }
                        ++n3;
                        ++n2;
                    }
                    return bl2;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Ran off end of other: ");
                stringBuilder.append(0);
                stringBuilder.append(", ");
                stringBuilder.append(n4);
                stringBuilder.append(", ");
                stringBuilder.append(((l)object).size());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Length too large: ");
            ((StringBuilder)object).append(n4);
            ((StringBuilder)object).append(this.size());
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
        return object.equals(this);
    }

    @Override
    byte f(int n2) {
        return this.d[n2];
    }

    @Override
    protected final int g(int n2, int n3) {
        byte[] byArray = this.d;
        int n4 = this.k() + 0;
        byte[] byArray2 = N.b;
        int n5 = n4;
        int n6 = n2;
        for (n2 = n5; n2 < n4 + n3; ++n2) {
            n6 = n6 * 31 + byArray[n2];
        }
        return n6;
    }

    @Override
    public final Iterator iterator() {
        return new h(this);
    }

    @Override
    public final n j(int n2) {
        if ((n2 = n.c(0, n2, this.size())) == 0) {
            return n.b;
        }
        return new j(this.d, this.k() + 0, n2);
    }

    protected int k() {
        return 0;
    }

    @Override
    public int size() {
        return this.d.length;
    }
}

