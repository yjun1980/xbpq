/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.r0;

import com.github.catvod.spider.merge.UY.D;
import com.github.catvod.spider.merge.xc.d0.e;
import java.util.regex.Matcher;

public final class d
extends e {
    public final D a;

    public d(D d2) {
        this.a = d2;
    }

    @Override
    public final int a() {
        return ((Matcher)this.a.a).groupCount() + 1;
    }

    public final Object get(int n2) {
        String string;
        String string2 = string = ((Matcher)this.a.a).group(n2);
        if (string == null) {
            string2 = "";
        }
        return string2;
    }
}

