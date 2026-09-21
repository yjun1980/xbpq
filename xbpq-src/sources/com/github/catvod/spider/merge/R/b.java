package com.github.catvod.spider.merge.R;

import com.github.catvod.spider.merge.P.I;
import com.github.catvod.spider.merge.Q.AbstractC0030v;
import com.github.catvod.spider.merge.Q.C0015f;
import com.github.catvod.spider.merge.Q.p0;
import com.github.catvod.spider.merge.cYh;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class b {
    public final Map<e, e> a = new HashMap();
    public volatile e b;
    public final int c;
    public final AbstractC0030v d;
    private final boolean e;

    public b(AbstractC0030v abstractC0030v, int i) {
        this.d = abstractC0030v;
        this.c = i;
        boolean z = true;
        if ((abstractC0030v instanceof p0) && ((p0) abstractC0030v).j) {
            e eVar = new e(new C0015f(true));
            eVar.c = new e[0];
            eVar.d = false;
            eVar.g = false;
            this.b = eVar;
        } else {
            z = false;
        }
        this.e = z;
    }

    public final e a(int i) {
        if (!this.e) {
            throw new IllegalStateException(cYh.d("283E2D28772A15352234333F09332471131C2623613C362347332E3F233B0E3E6130772A15352234333F09332471242E06223571242E0624247F"));
        }
        if (i < 0 || i >= this.b.c.length) {
            return null;
        }
        return this.b.c[i];
    }

    public final boolean b() {
        return this.e;
    }

    public final void c(int i, e eVar) {
        if (!this.e) {
            throw new IllegalStateException(cYh.d("283E2D28772A15352234333F09332471131C2623613C362347332E3F233B0E3E6130772A15352234333F09332471242E06223571242E0624247F"));
        }
        if (i < 0) {
            return;
        }
        synchronized (this.b) {
            if (i >= this.b.c.length) {
                this.b.c = (e[]) Arrays.copyOf(this.b.c, i + 1);
            }
            this.b.c[i] = eVar;
        }
    }

    public final String toString() {
        return this.b == null ? "" : new c(this, I.e).toString();
    }
}
