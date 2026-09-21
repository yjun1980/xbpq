/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.mI;

import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.by.a;
import com.github.catvod.spider.merge.by.e;
import com.github.catvod.spider.merge.by.f;
import com.github.catvod.spider.merge.by.g;
import com.github.catvod.spider.merge.by.h;
import com.github.catvod.spider.merge.by.j;
import com.github.catvod.spider.merge.by.l;
import com.github.catvod.spider.merge.by.n;
import com.github.catvod.spider.merge.by.o;
import com.github.catvod.spider.merge.by.p;
import com.github.catvod.spider.merge.by.q;
import com.github.catvod.spider.merge.by.r;
import com.github.catvod.spider.merge.by.s;
import com.github.catvod.spider.merge.by.t;
import com.github.catvod.spider.merge.by.u;
import com.github.catvod.spider.merge.by.w;
import com.github.catvod.spider.merge.mI.c;
import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.c0.b;
import com.github.catvod.spider.merge.xc.d0.k;
import com.github.catvod.spider.merge.xc.d0.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class d
implements com.github.catvod.spider.merge.xc.p0.c,
c {
    public static final Map b;
    public final Class a;

    static {
        int n2 = 0;
        Object object2 = Arrays.asList(a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, com.github.catvod.spider.merge.by.v.class, w.class, com.github.catvod.spider.merge.by.b.class, com.github.catvod.spider.merge.by.c.class, com.github.catvod.spider.merge.by.d.class, e.class, f.class, g.class, h.class, com.github.catvod.spider.merge.by.i.class, j.class, com.github.catvod.spider.merge.by.k.class, com.github.catvod.spider.merge.by.m.class, n.class, o.class);
        i.d(object2, "asList(...)");
        Object object3 = new ArrayList<b>(k.H(object2));
        Iterator object42 = object2.iterator();
        while (object42.hasNext()) {
            object2 = object42.next();
            if (n2 >= 0) {
                ((ArrayList)object3).add(new b((Class)object2, n2));
                ++n2;
                continue;
            }
            throw new ArithmeticException("Index overflow has happened.");
        }
        b = v.W(object3);
        HashMap hashMap = m.k("boolean", "kotlin.Boolean", "char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        object2 = new HashMap();
        ((HashMap)object2).put("java.lang.Boolean", "kotlin.Boolean");
        ((HashMap)object2).put("java.lang.Character", "kotlin.Char");
        ((HashMap)object2).put("java.lang.Byte", "kotlin.Byte");
        ((HashMap)object2).put("java.lang.Short", "kotlin.Short");
        ((HashMap)object2).put("java.lang.Integer", "kotlin.Int");
        ((HashMap)object2).put("java.lang.Float", "kotlin.Float");
        ((HashMap)object2).put("java.lang.Long", "kotlin.Long");
        ((HashMap)object2).put("java.lang.Double", "kotlin.Double");
        object3 = new HashMap();
        ((HashMap)object3).put("java.lang.Object", "kotlin.Any");
        ((HashMap)object3).put("java.lang.String", "kotlin.String");
        ((HashMap)object3).put("java.lang.CharSequence", "kotlin.CharSequence");
        ((HashMap)object3).put("java.lang.Throwable", "kotlin.Throwable");
        ((HashMap)object3).put("java.lang.Cloneable", "kotlin.Cloneable");
        ((HashMap)object3).put("java.lang.Number", "kotlin.Number");
        ((HashMap)object3).put("java.lang.Comparable", "kotlin.Comparable");
        ((HashMap)object3).put("java.lang.Enum", "kotlin.Enum");
        ((HashMap)object3).put("java.lang.annotation.Annotation", "kotlin.Annotation");
        ((HashMap)object3).put("java.lang.Iterable", "kotlin.collections.Iterable");
        ((HashMap)object3).put("java.util.Iterator", "kotlin.collections.Iterator");
        ((HashMap)object3).put("java.util.Collection", "kotlin.collections.Collection");
        ((HashMap)object3).put("java.util.List", "kotlin.collections.List");
        ((HashMap)object3).put("java.util.Set", "kotlin.collections.Set");
        ((HashMap)object3).put("java.util.ListIterator", "kotlin.collections.ListIterator");
        ((HashMap)object3).put("java.util.Map", "kotlin.collections.Map");
        ((HashMap)object3).put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        ((HashMap)object3).put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        ((HashMap)object3).put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        ((HashMap)object3).putAll(hashMap);
        ((HashMap)object3).putAll(object2);
        object2 = hashMap.values();
        i.d(object2, "<get-values>(...)");
        Iterator iterator = object2.iterator();
        while (iterator.hasNext()) {
            object2 = (String)iterator.next();
            StringBuilder stringBuilder = new StringBuilder("kotlin.jvm.internal.");
            i.b(object2);
            stringBuilder.append(com.github.catvod.spider.merge.xc.r0.e.b0(object2, '.', (String)object2));
            stringBuilder.append("CompanionObject");
            ((HashMap)object3).put(stringBuilder.toString(), ((String)object2).concat(".Companion"));
        }
        for (Map.Entry entry : b.entrySet()) {
            Class clazz = (Class)entry.getKey();
            n2 = ((Number)entry.getValue()).intValue();
            String string = clazz.getName();
            StringBuilder stringBuilder = new StringBuilder("kotlin.Function");
            stringBuilder.append(n2);
            ((HashMap)object3).put(string, stringBuilder.toString());
        }
        object2 = new LinkedHashMap(v.S(((HashMap)object3).size()));
        for (Map.Entry entry : ((HashMap)object3).entrySet()) {
            Object k2 = entry.getKey();
            String string = (String)entry.getValue();
            object2.put(k2, com.github.catvod.spider.merge.xc.r0.e.b0(string, '.', string));
        }
    }

    public d(Class clazz) {
        i.e(clazz, "jClass");
        this.a = clazz;
    }

    @Override
    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object object) {
        boolean bl = object instanceof d && com.github.catvod.spider.merge.xc.D0.b.n(this).equals(com.github.catvod.spider.merge.xc.D0.b.n((com.github.catvod.spider.merge.xc.p0.c)object));
        return bl;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.xc.D0.b.n(this).hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a.toString());
        stringBuilder.append(" (Kotlin reflection is not available)");
        return stringBuilder.toString();
    }
}

