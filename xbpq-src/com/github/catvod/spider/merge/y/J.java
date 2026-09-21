/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.y.A;
import com.github.catvod.spider.merge.y.N;

final class J
extends A {
    private final String e;
    private final int f;

    public J(String string, boolean bl, String string2, int n2) {
        super(string, bl);
        this.e = string2;
        this.f = n2;
    }

    @Override
    public final boolean a(N object, Object object2, Object object3, Object object4) {
        object = this.b((N)object, object2, object4);
        int n2 = this.f;
        boolean bl = true;
        boolean bl2 = true;
        boolean bl3 = true;
        boolean bl4 = true;
        if (n2 == 1) {
            return this.e.equals(object);
        }
        if (n2 == 2) {
            return this.e.equals(object) ^ true;
        }
        if (object == null) {
            return false;
        }
        int n3 = this.e.compareTo(object.toString());
        n2 = this.f;
        if (n2 == 4) {
            bl2 = n3 <= 0 ? bl4 : false;
            return bl2;
        }
        if (n2 == 3) {
            bl2 = n3 < 0 ? bl : false;
            return bl2;
        }
        if (n2 == 6) {
            if (n3 < 0) {
                bl2 = false;
            }
            return bl2;
        }
        if (n2 == 5) {
            bl2 = n3 > 0 ? bl3 : false;
            return bl2;
        }
        return false;
    }
}

