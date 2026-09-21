/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D1;

import java.net.URL;
import java.util.function.Predicate;

public final class u
implements Predicate {
    public final URL a;

    public /* synthetic */ u(URL uRL) {
        this.a = uRL;
    }

    public final boolean test(Object object) {
        URL uRL = this.a;
        object = (String)object;
        return uRL.getHost().startsWith((String)object);
    }
}

