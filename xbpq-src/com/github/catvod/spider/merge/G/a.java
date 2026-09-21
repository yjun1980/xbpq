/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  springfox.documentation.spring.web.json.Json
 */
package com.github.catvod.spider.merge.G;

import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.X;
import java.lang.reflect.Type;
import springfox.documentation.spring.web.json.Json;

public final class a
implements X {
    public static final a a = new a();

    @Override
    public final void d(L l2, Object object, Object object2, Type type, int n2) {
        l2.j.write(((Json)object).value());
    }
}

