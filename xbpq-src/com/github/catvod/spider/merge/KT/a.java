/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.KT;

import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.mI.i;
import java.util.LinkedHashMap;
import java.util.Map;

public final class a {
    public final String a;
    public final String b;
    public final Map c;
    public final Map d;
    public final String e;
    public final Map f;

    public a(String string, String string2, Map map, LinkedHashMap linkedHashMap, String string3, Map map2) {
        i.e(string, "method");
        i.e(string2, "path");
        i.e(map, "queryParams");
        this.a = string;
        this.b = string2;
        this.c = map;
        this.d = linkedHashMap;
        this.e = string3;
        this.f = map2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof a)) {
            return false;
        }
        a a2 = (a)object;
        object = a2.a;
        if (!i.a(this.a, object)) {
            return false;
        }
        if (!i.a(this.b, a2.b)) {
            return false;
        }
        if (!i.a(this.c, a2.c)) {
            return false;
        }
        if (!i.a(this.d, a2.d)) {
            return false;
        }
        if (!i.a(this.e, a2.e)) {
            return false;
        }
        return i.a(this.f, a2.f);
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        int n3 = m.a(this.b, n2 * 31, 31);
        int n4 = ((Object)this.c).hashCode();
        n2 = ((Object)this.d).hashCode();
        n2 = m.a(this.e, (n2 + (n4 + n3) * 31) * 31, 31);
        return ((Object)this.f).hashCode() + n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Request(method=");
        stringBuilder.append(this.a);
        stringBuilder.append(", path=");
        stringBuilder.append(this.b);
        stringBuilder.append(", queryParams=");
        stringBuilder.append(this.c);
        stringBuilder.append(", headers=");
        stringBuilder.append(this.d);
        stringBuilder.append(", body=");
        stringBuilder.append(this.e);
        stringBuilder.append(", bodyParams=");
        stringBuilder.append(this.f);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

