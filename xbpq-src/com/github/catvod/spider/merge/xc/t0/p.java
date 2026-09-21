/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.t0;

import com.github.catvod.spider.merge.mI.b;
import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.mI.m;
import com.github.catvod.spider.merge.xc.k0.a;
import com.github.catvod.spider.merge.xc.p0.f;
import com.github.catvod.spider.merge.xc.s0.E;

public final class p
extends b
implements f,
com.github.catvod.spider.merge.by.a {
    public final boolean a;

    public p(Object object) {
        super(object, E.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
        this.a = false;
    }

    @Override
    public final Object a() {
        return this.b();
    }

    public final String b() {
        return this.receiver.getClass().getSimpleName();
    }

    @Override
    public final com.github.catvod.spider.merge.xc.p0.b compute() {
        com.github.catvod.spider.merge.xc.p0.b b2 = this.a ? this : super.compute();
        return b2;
    }

    @Override
    public final com.github.catvod.spider.merge.xc.p0.b computeReflected() {
        m.a.getClass();
        return this;
    }

    public final boolean equals(Object object) {
        boolean bl = true;
        if (object == this) {
            return true;
        }
        if (object instanceof p) {
            object = (p)object;
            if (!(this.getOwner().equals(((b)object).getOwner()) && this.getName().equals(((b)object).getName()) && this.getSignature().equals(((b)object).getSignature()) && i.a(this.getBoundReceiver(), ((b)object).getBoundReceiver()))) {
                bl = false;
            }
            return bl;
        }
        if (object instanceof f) {
            return object.equals(this.compute());
        }
        return false;
    }

    @Override
    public final com.github.catvod.spider.merge.xc.p0.b getReflected() {
        if (!this.a) {
            com.github.catvod.spider.merge.xc.p0.b b2 = this.compute();
            if (b2 != this) {
                return (f)b2;
            }
            throw new a();
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
    }

    public final int hashCode() {
        int n2 = this.getOwner().hashCode();
        int n3 = this.getName().hashCode();
        return this.getSignature().hashCode() + (n3 + n2 * 31) * 31;
    }

    public final String toString() {
        Object object = this.compute();
        if (object != this) {
            return object.toString();
        }
        object = new StringBuilder("property ");
        ((StringBuilder)object).append(this.getName());
        ((StringBuilder)object).append(" (Kotlin reflection is not available)");
        return ((StringBuilder)object).toString();
    }
}

