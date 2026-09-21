/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.w;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.v.a;
import com.github.catvod.spider.merge.v.e;
import com.github.catvod.spider.merge.w.b;

public final class f {
    private com.github.catvod.spider.merge.v.b a;
    private int b;
    private e c;
    private int d = -1;
    private b e;

    public final b a() {
        return this.e;
    }

    public final void b(int n2) {
        this.b = n2;
    }

    public final void c(int n2) {
        this.d = n2;
    }

    public final void d(b b2) {
        this.e = b2;
    }

    public final void e(com.github.catvod.spider.merge.v.b b2) {
        this.a = b2;
    }

    public final void f(e e2) {
        this.c = e2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(200);
        stringBuilder.append(cYh.d("5B6C4B"));
        stringBuilder.append(cYh.d("473D2E35326047"));
        stringBuilder.append((Object)this.a);
        stringBuilder.append(cYh.d("6D7024321B3F11352D6B77"));
        stringBuilder.append(com.github.catvod.spider.merge.v.a.b(this.b));
        stringBuilder.append(cYh.d("6D70373425290E3F2F6B77"));
        stringBuilder.append(this.c);
        stringBuilder.append(cYh.d("6D702C302431373135253228096A61"));
        stringBuilder.append(this.d);
        if (this.e == null) {
            stringBuilder.append(cYh.d("6D702C3023280E287B71392F0B3C4B"));
        } else {
            stringBuilder.append(cYh.d("6D702C3023280E287B5B"));
            stringBuilder.append(this.e);
        }
        stringBuilder.append(cYh.d("596E4B"));
        return stringBuilder.toString();
    }
}

