/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.X;
import com.github.catvod.spider.merge.D.h0;
import com.github.catvod.spider.merge.D.i0;
import com.github.catvod.spider.merge.y.d;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public final class A
implements X {
    public static final A b = new A();
    private final Member a;

    public A() {
        this.a = null;
    }

    public A(Member member) {
        this.a = member;
    }

    @Override
    public final void d(L object, Object object2, Object object3, Type type, int n2) {
        object3 = this.a;
        if (object3 == null) {
            object3 = ((L)object).j;
            if ((object2 = (Enum)object2) == null) {
                ((h0)object3).s();
            } else {
                object = null;
                if (((h0)object3).k && !((h0)object3).l) {
                    object = ((Enum)object2).name();
                } else if (((h0)object3).l) {
                    object = ((Enum)object2).toString();
                }
                if (object != null) {
                    n2 = ((h0)object3).g(i0.c) ? 39 : 34;
                    ((h0)object3).write(n2);
                    ((h0)object3).write((String)object);
                    ((h0)object3).write(n2);
                } else {
                    ((h0)object3).q(((Enum)object2).ordinal());
                }
            }
            return;
        }
        try {
            object2 = object3 instanceof Field ? ((Field)object3).get(object2) : ((Method)object3).invoke(object2, new Object[0]);
            ((L)object).u(object2);
            return;
        }
        catch (Exception exception) {
            throw new d("getEnumValue error", exception);
        }
    }
}

