/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.y.A;
import com.github.catvod.spider.merge.y.N;
import java.util.regex.Pattern;

final class F
extends A {
    private final Pattern e;
    private final boolean f;

    public F(String string, boolean bl, String string2, boolean bl2) {
        super(string, bl);
        this.e = Pattern.compile(string2);
        this.f = bl2;
    }

    @Override
    public final boolean a(N object, Object object2, Object object3, Object object4) {
        boolean bl;
        if ((object = this.b((N)object, object2, object4)) == null) {
            return false;
        }
        object = object.toString();
        boolean bl2 = bl = this.e.matcher((CharSequence)object).matches();
        if (this.f) {
            bl2 = bl ^ true;
        }
        return bl2;
    }
}

