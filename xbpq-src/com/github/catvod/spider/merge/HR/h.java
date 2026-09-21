/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.HR;

import com.github.catvod.spider.merge.HR.n;
import com.github.catvod.spider.merge.xc.D0.b;
import com.github.catvod.spider.merge.xc.F0.l;
import java.util.regex.Pattern;

public final class h
extends n {
    public final String a;
    public final Pattern b;

    public h(String string, Pattern pattern) {
        this.a = com.github.catvod.spider.merge.xc.D0.b.x(string);
        this.b = pattern;
    }

    @Override
    public final boolean a(l object, l l2) {
        object = this.a;
        boolean bl = l2.k((String)object) && this.b.matcher(l2.c((String)object)).find();
        return bl;
    }

    public final String toString() {
        String string = this.b.toString();
        StringBuilder stringBuilder = new StringBuilder("[");
        stringBuilder.append(this.a);
        stringBuilder.append("~=");
        stringBuilder.append(string);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

