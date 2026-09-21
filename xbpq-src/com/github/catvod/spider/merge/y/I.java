/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.y.A;
import com.github.catvod.spider.merge.y.N;

final class I
extends A {
    private final String[] e;
    private final boolean f;

    public I(String string, boolean bl, String[] stringArray, boolean bl2) {
        super(string, bl);
        this.e = stringArray;
        this.f = bl2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean a(N object, Object object2, Object stringArray, Object object3) {
        void var4_6;
        object = this.b((N)object, object2, var4_6);
        String[] stringArray2 = this.e;
        int n2 = stringArray2.length;
        int n3 = 0;
        while (n3 < n2) {
            String string = stringArray2[n3];
            if (string == object) {
                return this.f ^ true;
            }
            if (string != null && string.equals(object)) {
                return this.f ^ true;
            }
            ++n3;
        }
        return this.f;
    }
}

