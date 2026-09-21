/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.by.p;
import com.github.catvod.spider.merge.mI.o;
import com.github.catvod.spider.merge.xc.c0.f;
import com.github.catvod.spider.merge.xc.e0.d;
import com.github.catvod.spider.merge.xc.e0.h;
import com.github.catvod.spider.merge.xc.e0.i;
import com.github.catvod.spider.merge.xc.s0.A;
import com.github.catvod.spider.merge.xc.s0.B;
import com.github.catvod.spider.merge.xc.s0.C;
import com.github.catvod.spider.merge.xc.s0.D;
import com.github.catvod.spider.merge.xc.s0.E;
import com.github.catvod.spider.merge.xc.s0.c0;
import com.github.catvod.spider.merge.xc.s0.m0;
import com.github.catvod.spider.merge.xc.s0.q;
import com.github.catvod.spider.merge.xc.s0.x;
import com.github.catvod.spider.merge.xc.s0.z;

public abstract class a
extends m0
implements d,
B {
    public final i c;

    public a(i i2, boolean bl) {
        super(bl);
        this.u((c0)i2.b(x.b));
        this.c = i2.f(this);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void F(C object, a object2, p p2) {
        int n2 = ((Enum)object).ordinal();
        object = f.a;
        if (n2 != 0) {
            Throwable throwable222222;
            if (n2 == 1) return;
            if (n2 == 2) {
                com.github.catvod.spider.merge.xc.a.a.m(com.github.catvod.spider.merge.xc.a.a.g(this, p2, object2)).resumeWith(object);
                return;
            }
            if (n2 != 3) throw new com.github.catvod.spider.merge.xc.C0.a();
            object = this.c;
            Object object3 = com.github.catvod.spider.merge.xc.t0.a.k((i)object, null);
            {
                catch (Throwable throwable222222) {}
            }
            o.a(p2);
            object2 = p2.invoke(object2, this);
            com.github.catvod.spider.merge.xc.t0.a.f((i)object, object3);
            if (object2 == com.github.catvod.spider.merge.xc.f0.a.a) return;
            this.resumeWith(object2);
            return;
            catch (Throwable throwable3) {
                com.github.catvod.spider.merge.xc.t0.a.f((i)object, object3);
                throw throwable3;
            }
            this.resumeWith(com.github.catvod.spider.merge.xc.a.a.h(throwable222222));
            return;
        }
        try {
            com.github.catvod.spider.merge.xc.t0.a.g(com.github.catvod.spider.merge.xc.a.a.m(com.github.catvod.spider.merge.xc.a.a.g(this, p2, object2)), null);
            return;
        }
        catch (Throwable throwable) {
            this.resumeWith(com.github.catvod.spider.merge.xc.a.a.h(throwable));
            throw throwable;
        }
    }

    @Override
    public final i d() {
        return this.c;
    }

    @Override
    public final i getContext() {
        return this.c;
    }

    @Override
    public final String l() {
        return this.getClass().getSimpleName().concat(" was cancelled");
    }

    @Override
    public final void resumeWith(Object object) {
        Object object2 = com.github.catvod.spider.merge.xc.c0.d.a(object);
        if (object2 != null) {
            object = new q((Throwable)object2, false);
        }
        do {
            if ((object2 = this.E(this.s(), object)) != E.c) continue;
            object2 = new StringBuilder("Job ");
            ((StringBuilder)object2).append(this);
            ((StringBuilder)object2).append(" is already complete or completing, but is being completed with ");
            ((StringBuilder)object2).append(object);
            String string = ((StringBuilder)object2).toString();
            boolean bl = object instanceof q;
            object2 = null;
            object = bl ? (q)object : null;
            if (object != null) {
                object2 = ((q)object).a;
            }
            throw new IllegalStateException(string, (Throwable)object2);
        } while (object2 == E.e);
        if (object2 == E.d) {
            return;
        }
        this.i();
    }

    @Override
    public final void t(com.github.catvod.spider.merge.xc.C0.a a2) {
        E.d(this.c, a2);
    }

    @Override
    public final String w() {
        boolean bl = D.a;
        CharSequence charSequence = null;
        if (bl) {
            Object object = z.c;
            i i2 = this.c;
            if ((object = (z)i2.b((h)object)) != null) {
                m.l(i2.b(A.b));
                charSequence = new StringBuilder("coroutine#");
                charSequence.append(((z)object).b);
                charSequence = charSequence.toString();
            }
        }
        if (charSequence == null) {
            return super.w();
        }
        charSequence = m.i("\"", charSequence, "\":");
        charSequence.append(super.w());
        return charSequence.toString();
    }

    @Override
    public final void z(Object object) {
        if (object instanceof q) {
            object = (q)object;
            Throwable throwable = ((q)object).a;
            object.getClass();
            q.b.get(object);
        }
    }
}

