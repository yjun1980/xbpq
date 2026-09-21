/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.xc.s0.E;
import com.github.catvod.spider.merge.xc.s0.W;
import com.github.catvod.spider.merge.xc.s0.n0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class k0
implements W {
    public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(k0.class, "_isCompleting$volatile");
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(k0.class, Object.class, "_rootCause$volatile");
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(k0.class, Object.class, "_exceptionsHolder$volatile");
    private volatile Object _exceptionsHolder$volatile;
    private volatile int _isCompleting$volatile;
    private volatile Object _rootCause$volatile;
    public final n0 a;

    public k0(n0 n02, Throwable throwable) {
        this.a = n02;
        this._isCompleting$volatile = 0;
        this._rootCause$volatile = throwable;
    }

    @Override
    public final boolean a() {
        boolean bl = this.c() == null;
        return bl;
    }

    public final void b(Throwable serializable) {
        Throwable throwable;
        block9: {
            block7: {
                block8: {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
                    block6: {
                        throwable = this.c();
                        if (throwable == null) {
                            c.set(this, serializable);
                            return;
                        }
                        if (serializable == throwable) {
                            return;
                        }
                        atomicReferenceFieldUpdater = d;
                        throwable = atomicReferenceFieldUpdater.get(this);
                        if (throwable != null) break block6;
                        atomicReferenceFieldUpdater.set(this, serializable);
                        break block7;
                    }
                    if (!(throwable instanceof Throwable)) break block8;
                    if (serializable == throwable) {
                        return;
                    }
                    ArrayList<Serializable> arrayList = new ArrayList<Serializable>(4);
                    arrayList.add(throwable);
                    arrayList.add(serializable);
                    atomicReferenceFieldUpdater.set(this, arrayList);
                    break block7;
                }
                if (!(throwable instanceof ArrayList)) break block9;
                ((ArrayList)((Object)throwable)).add(serializable);
            }
            return;
        }
        serializable = new StringBuilder("State is ");
        ((StringBuilder)serializable).append(throwable);
        throw new IllegalStateException(((StringBuilder)serializable).toString().toString());
    }

    public final Throwable c() {
        return (Throwable)c.get(this);
    }

    public final boolean d() {
        boolean bl = this.c() != null;
        return bl;
    }

    @Override
    public final n0 e() {
        return this.a;
    }

    public final boolean f() {
        boolean bl = b.get(this) != 0;
        return bl;
    }

    public final ArrayList g(Throwable serializable) {
        Object object;
        block8: {
            ArrayList arrayList;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            block6: {
                block7: {
                    block5: {
                        atomicReferenceFieldUpdater = d;
                        object = atomicReferenceFieldUpdater.get(this);
                        if (object != null) break block5;
                        arrayList = new ArrayList(4);
                        break block6;
                    }
                    if (!(object instanceof Throwable)) break block7;
                    arrayList = new ArrayList(4);
                    arrayList.add(object);
                    break block6;
                }
                if (!(object instanceof ArrayList)) break block8;
                arrayList = (ArrayList)object;
            }
            object = this.c();
            if (object != null) {
                arrayList.add(0, object);
            }
            if (serializable != null && !serializable.equals(object)) {
                arrayList.add(serializable);
            }
            atomicReferenceFieldUpdater.set(this, E.g);
            return arrayList;
        }
        serializable = new StringBuilder("State is ");
        ((StringBuilder)serializable).append(object);
        throw new IllegalStateException(((StringBuilder)serializable).toString().toString());
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Finishing[cancelling=");
        stringBuilder.append(this.d());
        stringBuilder.append(", completing=");
        stringBuilder.append(this.f());
        stringBuilder.append(", rootCause=");
        stringBuilder.append(this.c());
        stringBuilder.append(", exceptions=");
        stringBuilder.append(d.get(this));
        stringBuilder.append(", list=");
        stringBuilder.append(this.a);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

