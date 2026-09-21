/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.HR;

import com.github.catvod.spider.merge.HR.n;
import com.github.catvod.spider.merge.xc.E0.b;
import com.github.catvod.spider.merge.xc.F0.j;
import com.github.catvod.spider.merge.xc.F0.l;
import java.util.regex.Pattern;

public final class m
extends n {
    public final int a;
    public final Pattern b;

    public /* synthetic */ m(Pattern pattern, int n2) {
        this.a = n2;
        this.b = pattern;
    }

    @Override
    public final boolean a(l object, l l2) {
        switch (this.a) {
            default: {
                l2.getClass();
                object = com.github.catvod.spider.merge.xc.E0.b.b();
                com.github.catvod.spider.merge.xc.D0.b.O(new j(0, object), l2);
                object = com.github.catvod.spider.merge.xc.E0.b.g((StringBuilder)object);
                return this.b.matcher((CharSequence)object).find();
            }
            case 2: {
                return this.b.matcher(l2.P()).find();
            }
            case 1: {
                return this.b.matcher(l2.I()).find();
            }
            case 0: 
        }
        return this.b.matcher(l2.O()).find();
    }

    public final String toString() {
        switch (this.a) {
            default: {
                StringBuilder stringBuilder = new StringBuilder(":matchesWholeText(");
                stringBuilder.append(this.b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
            case 2: {
                StringBuilder stringBuilder = new StringBuilder(":matchesWholeOwnText(");
                stringBuilder.append(this.b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
            case 1: {
                StringBuilder stringBuilder = new StringBuilder(":matchesOwn(");
                stringBuilder.append(this.b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
            case 0: 
        }
        StringBuilder stringBuilder = new StringBuilder(":matches(");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

