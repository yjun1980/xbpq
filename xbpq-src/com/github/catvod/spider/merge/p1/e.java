/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.p1;

import com.github.catvod.spider.merge.I.s;
import com.github.catvod.spider.merge.K1.g;
import com.github.catvod.spider.merge.p1.c;
import com.github.catvod.spider.merge.p1.d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class e
implements Serializable {
    public static final e c = new e("en", "GB");
    private final String a;
    private final String b;

    public e(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    public static List<e> d(String ... stringArray) {
        ArrayList<e> arrayList = new ArrayList<e>();
        for (String string : stringArray) {
            arrayList.add((e)g.a(string).map(com.github.catvod.spider.merge.p1.c.a).orElseThrow(new d(string)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final String a() {
        String string;
        String string2 = string = this.b;
        if (string == null) {
            string2 = "";
        }
        return string2;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        String string = this.a;
        String string2 = this.b;
        string2 = string2 == null ? "" : com.github.catvod.spider.merge.B.e.c("-", string2);
        return com.github.catvod.spider.merge.B.e.c(string, string2);
    }

    public final boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (!(object instanceof e)) {
            return false;
        }
        object = (e)object;
        if (!this.a.equals(((e)object).a) || !Objects.equals(this.b, ((e)object).b)) {
            bl = false;
        }
        return bl;
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        return Objects.hashCode(this.b) + n2 * 31;
    }

    public final String toString() {
        return s.a("Localization[", this.c(), "]");
    }
}

