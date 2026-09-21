/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.s1;

import com.github.catvod.spider.merge.B.e;
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
                object = (c)object;
                return new com.github.catvod.spider.merge.k1.c(e.c(string, ((c)object).c()), ((c)object).a(), ((c)object).d(), ((c)object).b());
            }
        }
        String string = this.b;
        object = (com.github.catvod.spider.merge.F0.e)object;
        return new com.github.catvod.spider.merge.k1.c(e.c(string, ((com.github.catvod.spider.merge.F0.e)object).i("path", null)), -1, ((com.github.catvod.spider.merge.F0.e)object).e("width", -1), 4);
    }
}

