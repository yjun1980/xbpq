/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.A;

import com.github.catvod.spider.merge.A.a;
import com.github.catvod.spider.merge.E.f;
import com.github.catvod.spider.merge.F.c;
import com.github.catvod.spider.merge.F.e;
import com.github.catvod.spider.merge.cYh;
import java.lang.reflect.Method;

public class b {
    public void a(Throwable throwable, Throwable throwable2) {
        f.e(throwable, cYh.d("0431342232"));
        f.e(throwable2, cYh.d("02282234272E0E3F2F"));
        Method method = a.a;
        if (method != null) {
            method.invoke(throwable, throwable2);
        }
    }

    public e b() {
        return new c();
    }
}

