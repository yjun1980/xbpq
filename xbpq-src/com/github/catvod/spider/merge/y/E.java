/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.y.A;
import com.github.catvod.spider.merge.y.N;
import java.util.regex.Pattern;

final class E
extends A {
    private final Pattern e;

    public E(String string, boolean bl, Pattern pattern) {
        super(string, bl);
        this.e = pattern;
    }

    @Override
    public final boolean a(N object, Object object2, Object object3, Object object4) {
        if ((object = this.b((N)object, object2, object4)) == null) {
            return false;
        }
        object = object.toString();
        return this.e.matcher((CharSequence)object).matches();
    }
}

