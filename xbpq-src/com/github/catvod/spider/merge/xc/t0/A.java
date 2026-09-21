/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.t0;

import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.a.a;
import com.github.catvod.spider.merge.xc.c0.b;
import com.github.catvod.spider.merge.xc.c0.c;
import com.github.catvod.spider.merge.xc.g0.d;
import com.github.catvod.spider.merge.xc.r0.m;
import com.github.catvod.spider.merge.xc.s0.D;
import com.github.catvod.spider.merge.xc.s0.d0;
import com.github.catvod.spider.merge.xc.s0.s;
import com.github.catvod.spider.merge.xc.t0.l;
import java.io.Serializable;
import java.util.ArrayDeque;

public abstract class A {
    public static final StackTraceElement a;
    public static final String b;

    static {
        Serializable serializable = new Exception();
        Object object = a.class.getSimpleName();
        serializable = ((Throwable)serializable).getStackTrace()[0];
        a = new StackTraceElement("_COROUTINE.".concat((String)object), "_", ((StackTraceElement)serializable).getFileName(), ((StackTraceElement)serializable).getLineNumber());
        try {
            object = com.github.catvod.spider.merge.xc.g0.a.class.getCanonicalName();
        }
        catch (Throwable throwable) {
            object = com.github.catvod.spider.merge.xc.a.a.h(throwable);
        }
        if (com.github.catvod.spider.merge.xc.c0.d.a(object) != null) {
            object = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        b = (String)object;
        try {
            object = A.class.getCanonicalName();
        }
        catch (Throwable throwable) {
            object = com.github.catvod.spider.merge.xc.a.a.h(throwable);
        }
        if (com.github.catvod.spider.merge.xc.c0.d.a(object) != null) {
            object = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        object = (String)object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final Throwable a(Throwable object, d object2) {
        Object object3;
        Serializable serializable;
        int n2;
        int n3;
        Object object4;
        int n4;
        Object object5;
        block25: {
            object5 = ((Throwable)object).getCause();
            n4 = 0;
            if (object5 != null && object5.getClass().equals(object.getClass())) {
                object4 = ((Throwable)object).getStackTrace();
                n3 = ((StackTraceElement[])object4).length;
                for (n2 = 0; n2 < n3; ++n2) {
                    if (!m.L(object4[n2].getClassName(), "_COROUTINE")) continue;
                    object4 = new b(object5, object4);
                    break block25;
                }
                object4 = new b(object, new StackTraceElement[0]);
            } else {
                object4 = new b(object, new StackTraceElement[0]);
            }
        }
        Throwable throwable = (Throwable)((b)object4).a;
        StackTraceElement[] stackTraceElementArray = (StackTraceElement[])((b)object4).b;
        n2 = l.a;
        if (throwable instanceof s) {
            object5 = null;
            try {
                serializable = (d0)((s)((Object)throwable));
                serializable.getClass();
                if (D.a) {
                    object3 = ((Throwable)serializable).getMessage();
                    i.b(object3);
                    object4 = new d0((String)object3, (Throwable)serializable, ((d0)serializable).a);
                } else {
                    object4 = null;
                }
            }
            catch (Throwable throwable2) {
                object4 = com.github.catvod.spider.merge.xc.a.a.h(throwable2);
            }
            if (object4 instanceof c) {
                object4 = object5;
            }
            object4 = (Throwable)object4;
        } else {
            object4 = throwable.getClass();
            object4 = (Throwable)l.b.a((Class)object4).invoke(throwable);
        }
        if (object4 == null) return object;
        serializable = new ArrayDeque();
        object3 = object2.getStackTraceElement();
        object5 = object2;
        if (object3 != null) {
            ((ArrayDeque)serializable).add(object3);
            object5 = object2;
        }
        while (true) {
            if ((object2 = object5.getCallerFrame()) == null) {
                block27: {
                    if (((ArrayDeque)serializable).isEmpty()) return object;
                    if (throwable != object) {
                        block26: {
                            n3 = stackTraceElementArray.length;
                            for (n2 = 0; n2 < n3; ++n2) {
                                if (!m.L(stackTraceElementArray[n2].getClassName(), "_COROUTINE")) {
                                    continue;
                                }
                                break block26;
                            }
                            n2 = -1;
                        }
                        n3 = n2 + 1;
                        n2 = stackTraceElementArray.length - 1;
                        if (n3 <= n2) {
                            while (true) {
                                object = stackTraceElementArray[n2];
                                object2 = (StackTraceElement)((ArrayDeque)serializable).getLast();
                                if (((StackTraceElement)object).getLineNumber() == ((StackTraceElement)object2).getLineNumber() && i.a(((StackTraceElement)object).getMethodName(), ((StackTraceElement)object2).getMethodName()) && i.a(((StackTraceElement)object).getFileName(), ((StackTraceElement)object2).getFileName()) && i.a(((StackTraceElement)object).getClassName(), ((StackTraceElement)object2).getClassName())) {
                                    ((ArrayDeque)serializable).removeLast();
                                }
                                ((ArrayDeque)serializable).addFirst(stackTraceElementArray[n2]);
                                if (n2 == n3) break;
                                --n2;
                            }
                        }
                    }
                    ((ArrayDeque)serializable).addFirst(a);
                    object2 = throwable.getStackTrace();
                    n3 = ((Object)object2).length;
                    for (n2 = 0; n2 < n3; ++n2) {
                        object = ((StackTraceElement)object2[n2]).getClassName();
                        if (!i.a(b, object)) {
                            continue;
                        }
                        break block27;
                    }
                    n2 = -1;
                }
                if (n2 == -1) {
                    ((Throwable)object4).setStackTrace(((ArrayDeque)serializable).toArray(new StackTraceElement[0]));
                    return object4;
                } else {
                    object = new StackTraceElement[((ArrayDeque)serializable).size() + n2];
                    for (n3 = 0; n3 < n2; ++n3) {
                        object[n3] = object2[n3];
                    }
                    object2 = ((ArrayDeque)serializable).iterator();
                    n3 = n4;
                    while (object2.hasNext()) {
                        object[n3 + n2] = (StackTraceElement)object2.next();
                        ++n3;
                    }
                    ((Throwable)object4).setStackTrace((StackTraceElement[])object);
                }
                return object4;
            }
            object3 = object2.getStackTraceElement();
            object5 = object2;
            if (object3 == null) continue;
            ((ArrayDeque)serializable).add(object3);
            object5 = object2;
        }
    }

    public static final Throwable b(Throwable throwable) {
        Throwable throwable2 = throwable.getCause();
        if (throwable2 != null && throwable2.getClass().equals(throwable.getClass())) {
            StackTraceElement[] stackTraceElementArray = throwable.getStackTrace();
            int n2 = stackTraceElementArray.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (!m.L(stackTraceElementArray[i2].getClassName(), "_COROUTINE")) continue;
                return throwable2;
            }
        }
        return throwable;
    }
}

