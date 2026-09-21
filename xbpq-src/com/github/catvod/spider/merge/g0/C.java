/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g0;

import com.github.catvod.spider.Youtube;
import com.github.catvod.spider.merge.B0.c;
import java.util.function.Function;

public final class C
implements Function {
    public final Youtube a;
    public final String b;
    public final String c;

    public /* synthetic */ C(Youtube youtube, String string) {
        this.a = youtube;
        this.b = "token";
        this.c = string;
    }

    public final Object apply(Object object) {
        return Youtube.o(this.a, this.b, this.c, (c)object);
    }
}

