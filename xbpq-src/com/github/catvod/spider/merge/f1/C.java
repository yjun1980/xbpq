/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.a;
import java.util.Objects;

public final class C {
    private String a;
    private String b;

    C(a a2, String string) {
        Objects.requireNonNull(a2);
        this.a = a2.v();
        this.b = string;
    }

    C(a a2, String string, Object ... objectArray) {
        Objects.requireNonNull(a2);
        this.a = a2.v();
        this.b = String.format(string, objectArray);
    }

    public final String toString() {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("<");
        stringBuilder.append(this.a);
        stringBuilder.append(">: ");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}

