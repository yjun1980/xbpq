/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.g0;

import com.github.catvod.spider.merge.UY.h;
import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.g0.d;
import com.github.catvod.spider.merge.xc.g0.e;
import com.github.catvod.spider.merge.xc.g0.f;
import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class a
implements com.github.catvod.spider.merge.xc.e0.d,
d,
Serializable {
    private final com.github.catvod.spider.merge.xc.e0.d completion;

    public a(com.github.catvod.spider.merge.xc.e0.d d2) {
        this.completion = d2;
    }

    public com.github.catvod.spider.merge.xc.e0.d create(com.github.catvod.spider.merge.xc.e0.d d2) {
        i.e(d2, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public com.github.catvod.spider.merge.xc.e0.d create(Object object, com.github.catvod.spider.merge.xc.e0.d d2) {
        i.e(d2, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override
    public d getCallerFrame() {
        Object object = this.completion;
        object = object instanceof d ? (d)object : null;
        return object;
    }

    public final com.github.catvod.spider.merge.xc.e0.d getCompletion() {
        return this.completion;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public StackTraceElement getStackTraceElement() {
        int n2;
        int n3;
        Object var5_5;
        Object object;
        e e2;
        block17: {
            block16: {
                e2 = this.getClass().getAnnotation(e.class);
                object = null;
                var5_5 = null;
                if (e2 == null) {
                    return object;
                }
                n3 = e2.v();
                if (n3 > 1) {
                    object = new StringBuilder("Debug metadata version mismatch. Expected: 1, got ");
                    ((StringBuilder)object).append(n3);
                    ((StringBuilder)object).append(". Please update the Kotlin standard library.");
                    throw new IllegalStateException(((StringBuilder)object).toString().toString());
                }
                n2 = -1;
                try {
                    object = this.getClass().getDeclaredField("label");
                    ((AccessibleObject)object).setAccessible(true);
                    object = ((Field)object).get(this);
                    object = object instanceof Integer ? (Integer)object : null;
                }
                catch (Exception exception) {
                    break block16;
                }
                n3 = object != null ? (Integer)object : 0;
                --n3;
                break block17;
            }
            n3 = -1;
        }
        n3 = n3 < 0 ? n2 : e2.l()[n3];
        Object object2 = f.b;
        Object object3 = f.a;
        object = object2;
        if (object2 == null) {
            try {
                Method method = Class.class.getDeclaredMethod("getModule", null);
                object2 = this.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null);
                Method method2 = this.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null);
                f.b = object = new h(method, object2, method2);
            }
            catch (Exception exception) {
                f.b = object3;
                object = object3;
            }
        }
        if (object == object3) {
            object = var5_5;
        } else {
            object3 = (Method)((h)object).a;
            object3 = object3 != null ? ((Method)object3).invoke(this.getClass(), null) : null;
            if (object3 == null) {
                object = var5_5;
            } else {
                object2 = (Method)((h)object).b;
                object3 = object2 != null ? ((Method)object2).invoke(object3, null) : null;
                if (object3 == null) {
                    object = var5_5;
                } else {
                    object = (Method)((h)object).c;
                    object3 = object != null ? ((Method)object).invoke(object3, null) : null;
                    object = var5_5;
                    if (object3 instanceof String) {
                        object = (String)object3;
                    }
                }
            }
        }
        if (object == null) {
            object = e2.c();
            return new StackTraceElement((String)object, e2.m(), e2.f(), n3);
        } else {
            object3 = new StringBuilder();
            ((StringBuilder)object3).append((String)object);
            ((StringBuilder)object3).append('/');
            ((StringBuilder)object3).append(e2.c());
            object = ((StringBuilder)object3).toString();
        }
        return new StackTraceElement((String)object, e2.m(), e2.f(), n3);
    }

    public abstract Object invokeSuspend(Object var1);

    public void releaseIntercepted() {
    }

    @Override
    public final void resumeWith(Object object) {
        com.github.catvod.spider.merge.xc.e0.d d2 = this;
        do {
            a a2 = d2;
            d2 = a2.completion;
            i.b(d2);
            try {
                Object object2 = a2.invokeSuspend(object);
                com.github.catvod.spider.merge.xc.f0.a a3 = com.github.catvod.spider.merge.xc.f0.a.a;
                object = object2;
                if (object2 == a3) {
                    return;
                }
            }
            catch (Throwable throwable) {
                object = com.github.catvod.spider.merge.xc.a.a.h(throwable);
            }
            a2.releaseIntercepted();
        } while (d2 instanceof a);
        d2.resumeWith(object);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Continuation at ");
        Object object = this.getStackTraceElement();
        if (object == null) {
            object = this.getClass().getName();
        }
        stringBuilder.append(object);
        return stringBuilder.toString();
    }
}

