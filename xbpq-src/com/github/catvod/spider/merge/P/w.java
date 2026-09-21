/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.P;

import com.github.catvod.spider.merge.P.B;
import com.github.catvod.spider.merge.P.C;
import com.github.catvod.spider.merge.P.D;
import com.github.catvod.spider.merge.P.G;
import com.github.catvod.spider.merge.P.o;
import com.github.catvod.spider.merge.P.v;
import com.github.catvod.spider.merge.P.x;
import com.github.catvod.spider.merge.P.y;
import com.github.catvod.spider.merge.P.z;
import com.github.catvod.spider.merge.Q.S;
import com.github.catvod.spider.merge.Q.l;
import com.github.catvod.spider.merge.S.h;
import com.github.catvod.spider.merge.T.a;
import com.github.catvod.spider.merge.T.b;
import com.github.catvod.spider.merge.T.c;
import com.github.catvod.spider.merge.T.f;
import com.github.catvod.spider.merge.T.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

public abstract class w
extends B<D, S> {
    protected o d = new o();
    protected G e;
    protected final h f;
    protected x g;
    protected boolean h;
    private v i;
    protected List<c> j;
    protected boolean k;

    static {
        new WeakHashMap();
    }

    public w(G g2) {
        h h2;
        this.f = h2 = new h();
        h2.a(0);
        this.h = true;
        this.e = null;
        o o2 = this.d;
        o2.a = false;
        o2.c = null;
        o2.b = -1;
        this.g = null;
        this.k = false;
        this.u(this.i);
        this.i = null;
        h2.b();
        h2.a(0);
        h2 = this.b;
        if (h2 != null) {
            ((l)((Object)h2)).a();
        }
        this.e = g2;
    }

    @Override
    public final boolean j(int n2) {
        h h2 = this.f;
        boolean bl = n2 >= h2.c(h2.f() - 1);
        return bl;
    }

    public final D l() {
        D d2;
        block4: {
            Object object;
            block5: {
                d2 = this.q();
                if (d2.e() != -1) {
                    this.e.j();
                }
                boolean bl = (object = this.j) != null && !((ArrayList)object).isEmpty();
                if (!this.h && !bl) break block4;
                if (!this.d.a) break block5;
                x x2 = this.g;
                object = new a(d2);
                x2.getClass();
                x2.h(object);
                object = this.j;
                if (object == null) break block4;
                object = ((ArrayList)object).iterator();
                while (object.hasNext()) {
                    ((c)object.next()).a();
                }
                break block4;
            }
            Iterator iterator = this.g;
            object = new g(d2);
            iterator.getClass();
            ((x)((Object)iterator)).h(object);
            iterator = this.j;
            if (iterator != null) {
                iterator = ((ArrayList)((Object)iterator)).iterator();
                while (iterator.hasNext()) {
                    ((c)iterator.next()).b((f)object);
                }
            }
        }
        return d2;
    }

    public final void m(x x2) {
        x x3;
        List<b> list;
        if (this.h && (list = this.g) != x2 && (x3 = (x)((C)((Object)list)).a) != null) {
            list = x3.d;
            if (list != null) {
                ((ArrayList)list).remove(((ArrayList)list).size() - 1);
            }
            x3.h(x2);
        }
        this.g = x2;
    }

    public final void n(x object, int n2) {
        Object object2;
        this.k(n2);
        this.g = object;
        ((x)object).e = this.e.e(1);
        if (this.h) {
            object = this.g;
            object2 = (x)((C)object).a;
            if (object2 != null) {
                ((x)object2).h(object);
            }
        }
        if ((object = this.j) != null) {
            object2 = ((ArrayList)object).iterator();
            while (object2.hasNext()) {
                object = (c)object2.next();
                object.h(this.g);
                this.g.i((c)object);
            }
        }
    }

    public final void o() {
        D d2;
        Object object;
        if (this.k) {
            object = this.g;
            d2 = this.e.e(1);
        } else {
            object = this.g;
            d2 = this.e.e(-1);
        }
        ((x)object).f = d2;
        object = this.j;
        if (object != null) {
            for (int i2 = ((ArrayList)object).size() - 1; i2 >= 0; --i2) {
                object = (c)((ArrayList)this.j).get(i2);
                this.g.j((c)object);
                object.S(this.g);
            }
        }
        this.k(this.g.b);
        this.g = (x)this.g.a;
    }

    public final x p() {
        return this.g;
    }

    public final D q() {
        return this.e.e(1);
    }

    public final int r() {
        if (this.f.d()) {
            return -1;
        }
        h h2 = this.f;
        return h2.c(h2.f() - 1);
    }

    public final D s(int n2) {
        Object object = this.q();
        if (object.e() == n2) {
            if (n2 == -1) {
                this.k = true;
            }
            this.d.i();
            this.l();
        } else {
            D d2 = this.d.g(this);
            object = d2;
            if (this.h) {
                object = d2;
                if (d2.g() == -1) {
                    x x2 = this.g;
                    object = new a(d2);
                    x2.getClass();
                    x2.h(object);
                    object = d2;
                }
            }
        }
        return object;
    }

    public final void t(D d2, String string, z z2) {
        int n2 = d2.d();
        int n3 = d2.a();
        ((y)this.g()).a(this, d2, n2, n3, string, z2);
    }

    public final void u(c c2) {
        List<c> list = this.j;
        if (list != null && ((ArrayList)list).remove(c2) && ((ArrayList)this.j).isEmpty()) {
            this.j = null;
        }
    }

    public final void v(o o2) {
        this.d = o2;
    }
}

