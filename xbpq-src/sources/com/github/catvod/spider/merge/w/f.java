package com.github.catvod.spider.merge.w;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.v.C0237a;
import com.github.catvod.spider.merge.v.C0241e;
import com.github.catvod.spider.merge.v.EnumC0238b;

/* loaded from: classes.dex */
public final class f {
    private EnumC0238b a;
    private int b;
    private C0241e c;
    private int d = -1;
    private b e;

    public final b a() {
        return this.e;
    }

    public final void b(int i) {
        this.b = i;
    }

    public final void c(int i) {
        this.d = i;
    }

    public final void d(b bVar) {
        this.e = bVar;
    }

    public final void e(EnumC0238b enumC0238b) {
        this.a = enumC0238b;
    }

    public final void f(C0241e c0241e) {
        this.c = c0241e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append(cYh.d("5B6C4B"));
        sb.append(cYh.d("473D2E35326047"));
        sb.append(this.a);
        sb.append(cYh.d("6D7024321B3F11352D6B77"));
        sb.append(C0237a.b(this.b));
        sb.append(cYh.d("6D70373425290E3F2F6B77"));
        sb.append(this.c);
        sb.append(cYh.d("6D702C302431373135253228096A61"));
        sb.append(this.d);
        if (this.e == null) {
            sb.append(cYh.d("6D702C3023280E287B71392F0B3C4B"));
        } else {
            sb.append(cYh.d("6D702C3023280E287B5B"));
            sb.append(this.e);
        }
        sb.append(cYh.d("596E4B"));
        return sb.toString();
    }
}
