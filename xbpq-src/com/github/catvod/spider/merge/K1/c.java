/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.K1;

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

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.d;
    }

    public final String c() {
        return this.a;
    }

    public final int d() {
        return this.c;
    }

    public final String toString() {
        String string = this.a;
        int n2 = this.b;
        int n3 = this.c;
        String string2 = h.f(this.d);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ImageSuffix {suffix=");
        stringBuilder.append(string);
        stringBuilder.append(", height=");
        stringBuilder.append(n2);
        stringBuilder.append(", width=");
        stringBuilder.append(n3);
        stringBuilder.append(", resolutionLevel=");
        stringBuilder.append(string2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

