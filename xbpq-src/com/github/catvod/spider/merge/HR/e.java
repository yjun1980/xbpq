/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.HR;

import com.github.catvod.spider.merge.HR.d;
import com.github.catvod.spider.merge.HR.n;
import com.github.catvod.spider.merge.xc.D0.b;
import com.github.catvod.spider.merge.xc.F0.h;
import com.github.catvod.spider.merge.xc.F0.i;
import com.github.catvod.spider.merge.xc.F0.l;
import com.github.catvod.spider.merge.xc.F0.q;
import com.github.catvod.spider.merge.xc.F0.r;
import com.github.catvod.spider.merge.xc.F0.s;
import com.github.catvod.spider.merge.xc.G0.D;
import com.github.catvod.spider.merge.xc.G0.E;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public final class e
extends n {
    public final int a;

    public /* synthetic */ e(int n2) {
        this.a = n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean a(l object, l object2) {
        switch (this.a) {
            default: {
                if (object != object2) return false;
                return true;
            }
            case 7: {
                Object object32;
                boolean bl = object2 instanceof r;
                boolean bl2 = true;
                if (bl) return bl2;
                object2.getClass();
                Cloneable cloneable = new ArrayList<s>();
                for (Object object32 : ((l)object2).f) {
                    if (!(object32 instanceof s)) continue;
                    ((ArrayList)cloneable).add((s)object32);
                }
                object32 = Collections.unmodifiableList(cloneable).iterator();
                while (true) {
                    bl = object32.hasNext();
                    bl2 = false;
                    if (!bl) return false;
                    s s2 = (s)object32.next();
                    r r2 = new r(E.a(((l)object2).d.a, D.d), ((l)object2).e(), ((l)object2).d());
                    s2.getClass();
                    b.A(s2.a);
                    object = s2.a;
                    object.getClass();
                    if (s2.a == object) {
                        bl2 = true;
                    }
                    b.r(bl2);
                    cloneable = r2.a;
                    if (cloneable != null) {
                        ((q)cloneable).v(r2);
                    }
                    int n2 = s2.b;
                    ((q)object).j().set(n2, r2);
                    r2.a = object;
                    r2.b = n2;
                    s2.a = null;
                    r2.y(s2);
                }
            }
            case 6: {
                boolean bl = object instanceof h;
                boolean bl3 = false;
                Object object4 = object;
                if (bl) {
                    object4 = (l)((l)object).A().get(0);
                }
                if (object2 != object4) return bl3;
                return true;
            }
            case 5: {
                boolean bl;
                object = (l)((q)object2).a;
                boolean bl4 = bl = false;
                if (object == null) return bl4;
                if (object instanceof h) {
                    return bl;
                }
                object = ((AbstractCollection)new d(((l)object).A())).iterator();
                int n3 = 0;
                while (object.hasNext()) {
                    if (!((l)object.next()).d.equals(((l)object2).d)) continue;
                    ++n3;
                }
                bl4 = bl;
                if (n3 != true) return bl4;
                return true;
            }
            case 4: {
                boolean bl;
                object = ((q)object2).a;
                Iterator iterator = (l)object;
                boolean bl5 = bl = false;
                if (iterator == null) return bl5;
                bl5 = bl;
                if (iterator instanceof h) return bl5;
                if (object == null) {
                    object = new d(0);
                } else {
                    iterator = ((l)object).A();
                    object = new d(iterator.size() - 1);
                    iterator = iterator.iterator();
                    while (iterator.hasNext()) {
                        l l2 = (l)iterator.next();
                        if (l2 == object2) continue;
                        ((AbstractCollection)object).add(l2);
                    }
                }
                bl5 = bl;
                if (!((AbstractCollection)object).isEmpty()) return bl5;
                return true;
            }
            case 3: {
                object = (l)((q)object2).a;
                if (object == null) return false;
                if (object instanceof h) return false;
                int n4 = ((l)object2).E();
                int n5 = ((AbstractCollection)new d(((l)object).A())).size();
                boolean bl = true;
                if (n4 != n5 - 1) return false;
                return bl;
            }
            case 2: {
                object = (l)((q)object2).a;
                if (object == null) return false;
                if (object instanceof h) return false;
                if (((l)object2).E() != 0) return false;
                return true;
            }
            case 1: {
                if (((l)object2).f() == 0) {
                    object = q.c;
                } else {
                    object2 = ((l)object2).j();
                    object = new ArrayList(object2.size());
                    ((ArrayList)object).addAll(object2);
                    object = Collections.unmodifiableList(object);
                }
                object = object.iterator();
                do {
                    if (!object.hasNext()) return true;
                } while ((object2 = (q)object.next()) instanceof com.github.catvod.spider.merge.xc.F0.e || object2 instanceof i);
                return false;
            }
            case 0: 
        }
        return true;
    }

    public String toString() {
        switch (this.a) {
            default: {
                return super.toString();
            }
            case 7: {
                return ":matchText";
            }
            case 6: {
                return ":root";
            }
            case 5: {
                return ":only-of-type";
            }
            case 4: {
                return ":only-child";
            }
            case 3: {
                return ":last-child";
            }
            case 2: {
                return ":first-child";
            }
            case 1: {
                return ":empty";
            }
            case 0: 
        }
        return "*";
    }
}

