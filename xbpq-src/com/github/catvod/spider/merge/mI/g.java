/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.mI;

import com.github.catvod.spider.merge.mI.b;
import com.github.catvod.spider.merge.mI.f;
import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.mI.m;
import com.github.catvod.spider.merge.xc.k0.a;
import com.github.catvod.spider.merge.xc.p0.e;

public abstract class g
extends b
implements f,
e {
    private final int arity;
    private final int flags;

    public g(Object object, Class clazz, String string, String string2) {
        super(object, clazz, string, string2, false);
        this.arity = 1;
        this.flags = 0;
    }

    @Override
    public com.github.catvod.spider.merge.xc.p0.b computeReflected() {
        m.a.getClass();
        return this;
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (object == this) {
            return true;
        }
        if (object instanceof g) {
            object = (g)object;
            if (!(this.getName().equals(((b)object).getName()) && this.getSignature().equals(((b)object).getSignature()) && this.flags == ((g)object).flags && this.arity == ((g)object).arity && i.a(this.getBoundReceiver(), ((b)object).getBoundReceiver()) && i.a(this.getOwner(), ((b)object).getOwner()))) {
                bl = false;
            }
            return bl;
        }
        if (object instanceof e) {
            return object.equals(this.compute());
        }
        return false;
    }

    @Override
    public int getArity() {
        return this.arity;
    }

    @Override
    public e getReflected() {
        com.github.catvod.spider.merge.xc.p0.b b2 = this.compute();
        if (b2 != this) {
            return (e)b2;
        }
        throw new a();
    }

    public int hashCode() {
        int n2 = this.getOwner() == null ? 0 : this.getOwner().hashCode() * 31;
        int n3 = this.getName().hashCode();
        return this.getSignature().hashCode() + (n3 + n2) * 31;
    }

    @Override
    public boolean isExternal() {
        return this.getReflected().isExternal();
    }

    @Override
    public boolean isInfix() {
        return this.getReflected().isInfix();
    }

    @Override
    public boolean isInline() {
        return this.getReflected().isInline();
    }

    @Override
    public boolean isOperator() {
        return this.getReflected().isOperator();
    }

    @Override
    public boolean isSuspend() {
        return this.getReflected().isSuspend();
    }

    public String toString() {
        Object object = this.compute();
        if (object != this) {
            return object.toString();
        }
        if ("<init>".equals(this.getName())) {
            object = "constructor (Kotlin reflection is not available)";
        } else {
            object = new StringBuilder("function ");
            ((StringBuilder)object).append(this.getName());
            ((StringBuilder)object).append(" (Kotlin reflection is not available)");
            object = ((StringBuilder)object).toString();
        }
        return object;
    }
}

