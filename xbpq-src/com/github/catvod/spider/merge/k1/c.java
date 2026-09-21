/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.k1;

import com.github.catvod.spider.merge.B.h;
import java.io.Serializable;

public final class c
implements Serializable {
    private final String a;
    private final int b;
    private final int c;
    private final int d;

    public c(String string, int n2, int n3, int n4) {
        this.a = string;
        this.b = n2;
        this.c = n3;
        if (n4 != 0) {
            this.d = n4;
            return;
        }
        throw new NullPointerException("estimatedResolutionLevel is null");
    }

    public final String a() {
        return this.a;
    }

    public final String toString() {
        String string = this.a;
        int n2 = this.b;
        int n3 = this.c;
        String string2 = h.f(this.d);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Image {url=");
        stringBuilder.append(string);
        stringBuilder.append(", height=");
        stringBuilder.append(n2);
        stringBuilder.append(", width=");
        stringBuilder.append(n3);
        stringBuilder.append(", estimatedResolutionLevel=");
        stringBuilder.append(string2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

