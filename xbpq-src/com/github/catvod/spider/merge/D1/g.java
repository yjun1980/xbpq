/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D1;

import com.github.catvod.spider.merge.D1.A;
import com.github.catvod.spider.merge.D1.k;
import com.github.catvod.spider.merge.F0.e;
import com.github.catvod.spider.merge.k1.c;
import java.util.function.Function;

public final class g
implements Function {
    public static final g b = new g(0);
    public static final g c = new g(1);
    public final int a;

    public /* synthetic */ g(int n2) {
        this.a = n2;
    }

    public final Object apply(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                return k.b((String)object);
            }
        }
        object = (e)object;
        int n2 = A.j;
        int n3 = ((e)object).e("height", -1);
        String string = A.g(((e)object).i("url", null));
        int n4 = ((e)object).e("width", -1);
        n2 = n3 <= 0 ? 4 : (n3 < 175 ? 3 : (n3 < 720 ? 2 : 1));
        return new c(string, n3, n4, n2);
    }
}

