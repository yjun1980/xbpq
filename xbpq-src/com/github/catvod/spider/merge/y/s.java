/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.y.A;
import com.github.catvod.spider.merge.y.N;

final class s
extends A {
    private final String e;
    private final String f;
    private final String[] g;
    private final int h;
    private final boolean i;

    public s(String string, boolean bl, String string2, String string3, String[] stringArray, boolean bl2) {
        super(string, bl);
        this.e = string2;
        this.f = string3;
        this.g = stringArray;
        this.i = bl2;
        int n2 = 0;
        int n3 = string2 != null ? string2.length() + 0 : 0;
        int n4 = n3;
        if (string3 != null) {
            n4 = n3 + string3.length();
        }
        n3 = n4;
        if (stringArray != null) {
            int n5 = stringArray.length;
            while (true) {
                n3 = n4;
                if (n2 >= n5) break;
                n4 += stringArray[n2].length();
                ++n2;
            }
        }
        this.h = n3;
    }

    @Override
    public final boolean a(N object, Object object2, Object object3, Object object4) {
        int n2;
        object = this.b((N)object, object2, object4);
        int n3 = 0;
        if (object == null) {
            return false;
        }
        if (((String)(object = object.toString())).length() < this.h) {
            return this.i;
        }
        object2 = this.e;
        if (object2 != null) {
            if (!((String)object).startsWith((String)object2)) {
                return this.i;
            }
            n2 = this.e.length() + 0;
        } else {
            n2 = 0;
        }
        object2 = this.g;
        if (object2 != null) {
            int n4 = ((String[])object2).length;
            int n5 = n2;
            for (n2 = n3; n2 < n4; ++n2) {
                object3 = object2[n2];
                if ((n5 = ((String)object).indexOf((String)object3, n5)) == -1) {
                    return this.i;
                }
                n5 += ((String)object3).length();
            }
        }
        if ((object2 = this.f) != null && !((String)object).endsWith((String)object2)) {
            return this.i;
        }
        return this.i ^ true;
    }
}

