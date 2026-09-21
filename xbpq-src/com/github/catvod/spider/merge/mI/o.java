/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.mI;

import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.by.l;
import com.github.catvod.spider.merge.by.p;
import com.github.catvod.spider.merge.by.r;
import com.github.catvod.spider.merge.mI.f;
import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.c0.a;

public abstract class o {
    public static void a(Object object) {
        int n2;
        if (!(object == null || object instanceof a && (n2 = object instanceof f ? ((f)object).getArity() : (object instanceof com.github.catvod.spider.merge.by.a ? 0 : (object instanceof l ? 1 : (object instanceof p ? 2 : (object instanceof r ? 4 : -1))))) == 2)) {
            o.b(object, "kotlin.jvm.functions.Function2");
            throw null;
        }
    }

    public static void b(Object object, String string) {
        object = object == null ? "null" : object.getClass().getName();
        object = new ClassCastException(m.g((String)object, " cannot be cast to ", string));
        i.f((RuntimeException)object, o.class.getName());
        throw object;
    }
}

