/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.W1;

import com.github.catvod.spider.merge.P1.f;
import com.github.catvod.spider.merge.W1.a;
import java.io.DataInputStream;
import java.util.Objects;

public final class b
extends a {
    private final byte[] c;
    private int d;

    public b(com.github.catvod.spider.merge.P1.a a2) {
        Objects.requireNonNull(a2);
        this.c = new byte[65531];
        this.d = 65531;
    }

    @Override
    public final void f() {
        int n2 = this.a;
        if ((0xFF000000 & n2) == 0) {
            try {
                int n3 = this.b;
                byte[] byArray = this.c;
                int n4 = this.d;
                this.d = n4 + 1;
                this.b = n3 << 8 | byArray[n4] & 0xFF;
                this.a = n2 << 8;
            }
            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                throw new f();
            }
        }
    }

    public final boolean g() {
        boolean bl = this.d == this.c.length && this.b == 0;
        return bl;
    }

    public final void h(DataInputStream dataInputStream, int n2) {
        if (n2 >= 5) {
            if (dataInputStream.readUnsignedByte() == 0) {
                int n3;
                this.b = dataInputStream.readInt();
                this.a = -1;
                byte[] byArray = this.c;
                this.d = n3 = byArray.length - (n2 -= 5);
                dataInputStream.readFully(byArray, n3, n2);
                return;
            }
            throw new f();
        }
        throw new f();
    }
}

