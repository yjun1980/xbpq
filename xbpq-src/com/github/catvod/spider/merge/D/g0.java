/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.O;
import com.github.catvod.spider.merge.D.V;
import com.github.catvod.spider.merge.D.Z;
import com.github.catvod.spider.merge.D.a0;
import com.github.catvod.spider.merge.D.d;
import com.github.catvod.spider.merge.D.f0;
import com.github.catvod.spider.merge.D.i0;
import com.github.catvod.spider.merge.D.k;
import com.github.catvod.spider.merge.D.l;
import com.github.catvod.spider.merge.D.l0;
import com.github.catvod.spider.merge.D.x;
import com.github.catvod.spider.merge.y.a;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public abstract class g0 {
    protected List<l> a = null;
    protected List<d> b = null;
    protected List<Z> c = null;
    protected List<l0> d = null;
    protected List<V> e = null;
    protected List<a0> f = null;
    protected List<O> g = null;
    protected List<x> h = null;

    public final void c(f0 f02) {
        if (f02 == null) {
            return;
        }
        if (f02 instanceof a0) {
            if (this.f == null) {
                this.f = new ArrayList<a0>();
            }
            ((ArrayList)this.f).add((a0)f02);
        }
        if (f02 instanceof V) {
            if (this.e == null) {
                this.e = new ArrayList<V>();
            }
            ((ArrayList)this.e).add((V)f02);
        }
        if (f02 instanceof l0) {
            if (this.d == null) {
                this.d = new ArrayList<l0>();
            }
            ((ArrayList)this.d).add((l0)f02);
        }
        if (f02 instanceof x) {
            if (this.h == null) {
                this.h = new ArrayList<x>();
            }
            ((ArrayList)this.h).add((x)f02);
        }
        if (f02 instanceof Z) {
            if (this.c == null) {
                this.c = new ArrayList<Z>();
            }
            ((ArrayList)this.c).add((Z)f02);
        }
        if (f02 instanceof l) {
            if (this.a == null) {
                this.a = new ArrayList<l>();
            }
            ((ArrayList)this.a).add((l)f02);
        }
        if (f02 instanceof d) {
            if (this.b == null) {
                this.b = new ArrayList<d>();
            }
            ((ArrayList)this.b).add((d)f02);
        }
        if (f02 instanceof O) {
            if (this.g == null) {
                this.g = new ArrayList<O>();
            }
            ((ArrayList)this.g).add((O)f02);
        }
    }

    public final boolean e(L object, Object object2, String string, Object object3) {
        object = ((g0)object).c;
        if (object != null) {
            object = ((ArrayList)object).iterator();
            while (object.hasNext()) {
                if (((Z)object.next()).c()) continue;
                return false;
            }
        }
        if ((object = this.c) != null) {
            object = ((ArrayList)object).iterator();
            while (object.hasNext()) {
                if (((Z)object.next()).c()) continue;
                return false;
            }
        }
        return true;
    }

    public final boolean f(L object, Object object2, String string) {
        object = ((g0)object).f;
        if (object != null) {
            object = ((ArrayList)object).iterator();
            while (object.hasNext()) {
                if (((a0)object.next()).e()) continue;
                return false;
            }
        }
        if ((object = this.f) != null) {
            object = ((ArrayList)object).iterator();
            while (object.hasNext()) {
                if (((a0)object.next()).e()) continue;
                return false;
            }
        }
        return true;
    }

    protected final String g(L object, Object object2, String iterator, Object object3) {
        object2 = ((g0)object).e;
        object = iterator;
        if (object2 != null) {
            object2 = ((ArrayList)object2).iterator();
            object = iterator;
            while (object2.hasNext()) {
                object = ((V)object2.next()).b();
            }
        }
        iterator = this.e;
        object2 = object;
        if (iterator != null) {
            iterator = ((ArrayList)((Object)iterator)).iterator();
            while (true) {
                object2 = object;
                if (!iterator.hasNext()) break;
                object = ((V)iterator.next()).b();
            }
        }
        return object2;
    }

    protected final Object h(L object, k list, Object object2, String list2, Object object3, int n2) {
        object2 = object3;
        if (object3 != null) {
            boolean bl;
            int n3 = ((L)object).j.c;
            object2 = i0.z;
            if (!i0.b(n3, n2, (i0)((Object)object2)) && (list == null || (((k)((Object)list)).a() & ((i0)((Object)object2)).a) == 0) || !(bl = object3 instanceof Number) && !(object3 instanceof Boolean)) {
                object2 = object3;
                if (list != null) {
                    object2 = object3;
                    if (((k)((Object)list)).c()) {
                        object2 = com.github.catvod.spider.merge.y.a.f((String)object3);
                    }
                }
            } else {
                list2 = null;
                object2 = list2;
                if (bl) {
                    object2 = list2;
                    if (list != null) {
                        object2 = ((k)((Object)list)).b();
                    }
                }
                object2 = object2 != null ? new DecimalFormat((String)object2).format(object3) : object3.toString();
            }
        }
        list = ((g0)object).d;
        list2 = object2;
        if (list != null) {
            list = ((ArrayList)list).iterator();
            while (true) {
                list2 = object2;
                if (!list.hasNext()) break;
                object2 = ((l0)list.next()).d();
            }
        }
        object2 = this.d;
        list = list2;
        if (object2 != null) {
            object2 = ((ArrayList)object2).iterator();
            list = list2;
            while (object2.hasNext()) {
                list = ((l0)object2.next()).d();
            }
        }
        object2 = ((g0)object).h;
        object = list;
        if (object2 != null) {
            object2 = ((ArrayList)object2).iterator();
            object = list;
            while (object2.hasNext()) {
                object = ((x)object2.next()).b();
            }
        }
        object2 = this.h;
        list = object;
        if (object2 != null) {
            object2 = ((ArrayList)object2).iterator();
            while (true) {
                list = object;
                if (!object2.hasNext()) break;
                object = ((x)object2.next()).b();
            }
        }
        return list;
    }
}

