/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.p1;

import com.github.catvod.spider.merge.p1.e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a
implements Serializable {
    public static final a b = new a(e.c.a());
    private final String a;

    public a(String string) {
        this.a = string;
    }

    public static List<a> b(String ... stringArray) {
        ArrayList<a> arrayList = new ArrayList<a>();
        int n2 = stringArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            arrayList.add(new a(stringArray[i2]));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof a)) {
            return false;
        }
        object = (a)object;
        return this.a.equals(((a)object).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}

