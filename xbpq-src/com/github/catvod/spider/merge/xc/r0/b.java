/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.r0;

import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.a.a;
import com.github.catvod.spider.merge.xc.o0.d;
import com.github.catvod.spider.merge.xc.r0.c;
import com.github.catvod.spider.merge.xc.r0.e;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class b
implements Iterator,
com.github.catvod.spider.merge.xc.n0.a {
    public int a;
    public int b;
    public int c;
    public d d;
    public int e;
    public final c f;

    public b(c c2) {
        int n2;
        this.f = c2;
        this.a = -1;
        this.b = n2 = com.github.catvod.spider.merge.xc.a.a.f(c2.b, 0, c2.a.length());
        this.c = n2;
    }

    /*
     * Unable to fully structure code
     */
    public final void a() {
        block6: {
            block7: {
                block5: {
                    var3_1 = this.c;
                    var1_2 = 0;
                    if (var3_1 >= 0) break block5;
                    this.a = 0;
                    this.d = null;
                    break block6;
                }
                var6_3 = this.f;
                var4_4 = var6_3.c;
                var5_5 = var6_3.a;
                if (var4_4 <= 0) break block7;
                this.e = var2_6 = this.e + 1;
                if (var2_6 >= var4_4) ** GOTO lbl-1000
            }
            if (var3_1 > var5_5.length()) lbl-1000:
            // 2 sources

            {
                this.d = new d(this.b, com.github.catvod.spider.merge.xc.r0.e.N((CharSequence)var5_5));
                this.c = -1;
            } else {
                var2_6 = this.c;
                var6_3 = (com.github.catvod.spider.merge.xc.c0.b)var6_3.d.invoke(var5_5, var2_6);
                if (var6_3 == null) {
                    this.d = new d(this.b, com.github.catvod.spider.merge.xc.r0.e.N((CharSequence)var5_5));
                    this.c = -1;
                } else {
                    var3_1 = ((Number)var6_3.a).intValue();
                    var2_6 = ((Number)var6_3.b).intValue();
                    var4_4 = this.b;
                    var5_5 = var3_1 <= -2147483648 ? com.github.catvod.spider.merge.xc.o0.d.d : new d(var4_4, var3_1 - 1);
                    this.d = var5_5;
                    this.b = var3_1 += var2_6;
                    if (var2_6 == 0) {
                        var1_2 = 1;
                    }
                    this.c = var3_1 + var1_2;
                }
            }
            this.a = 1;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.a == -1) {
            this.a();
        }
        int n2 = this.a;
        boolean bl = true;
        if (n2 != 1) {
            bl = false;
        }
        return bl;
    }

    public final Object next() {
        if (this.a == -1) {
            this.a();
        }
        if (this.a != 0) {
            d d2 = this.d;
            i.c(d2, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.d = null;
            this.a = -1;
            return d2;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

