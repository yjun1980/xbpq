/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.t0;

import com.github.catvod.spider.merge.by.l;
import com.github.catvod.spider.merge.mI.i;
import java.lang.reflect.Constructor;

public final class j
extends com.github.catvod.spider.merge.mI.j
implements l {
    public final int a;
    public final Constructor b;

    public /* synthetic */ j(Constructor constructor, int n2) {
        this.a = n2;
        this.b = constructor;
        super(1);
    }

    @Override
    public final Object invoke(Object object) {
        Object object2 = this.b;
        switch (this.a) {
            default: {
                object = (Throwable)object;
                object2 = ((Constructor)object2).newInstance(null);
                i.c(object2, "null cannot be cast to non-null type kotlin.Throwable");
                object2 = (Throwable)object2;
                ((Throwable)object2).initCause((Throwable)object);
                return object2;
            }
            case 2: {
                object = ((Constructor)object2).newInstance((Throwable)object);
                i.c(object, "null cannot be cast to non-null type kotlin.Throwable");
                return (Throwable)object;
            }
            case 1: {
                object = (Throwable)object;
                object2 = ((Constructor)object2).newInstance(((Throwable)object).getMessage());
                i.c(object2, "null cannot be cast to non-null type kotlin.Throwable");
                object2 = (Throwable)object2;
                ((Throwable)object2).initCause((Throwable)object);
                return object2;
            }
            case 0: 
        }
        object = (Throwable)object;
        object = ((Constructor)object2).newInstance(((Throwable)object).getMessage(), object);
        i.c(object, "null cannot be cast to non-null type kotlin.Throwable");
        return (Throwable)object;
    }
}

