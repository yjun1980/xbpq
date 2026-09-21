/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.v1;

import com.github.catvod.spider.merge.F0.e;
import com.github.catvod.spider.merge.K1.c;
import java.util.function.Function;

public final class a
implements Function {
    public final int a;
    public final String b;

    public /* synthetic */ a(String string, int n2) {
        this.a = n2;
        this.b = string;
    }

    public final Object apply(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                String string = this.b;
                return ((e)object).g(string).i("url", "");
            }
        }
        String string = this.b;
        object = (c)object;
        int n2 = com.github.catvod.spider.merge.A1.a.e;
        return new com.github.catvod.spider.merge.k1.c(String.format(string, ((c)object).c()), ((c)object).a(), ((c)object).d(), ((c)object).b());
    }
}

