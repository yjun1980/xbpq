/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.L;

import com.github.catvod.spider.merge.L.e;
import com.github.catvod.spider.merge.L.h;
import com.github.catvod.spider.merge.L.j;
import com.github.catvod.spider.merge.N.f;
import com.github.catvod.spider.merge.cYh;

public abstract class t
extends e {
    public abstract t c();

    protected final String d() {
        int n2 = j.a;
        t t2 = f.a;
        if (this == t2) {
            return cYh.d("23393221362E0438242324742A31283F");
        }
        try {
            t2 = t2.c();
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            t2 = null;
        }
        if (this == t2) {
            return cYh.d("23393221362E0438242324742A31283F79330A3D24353E3B1335");
        }
        return null;
    }

    @Override
    public String toString() {
        CharSequence charSequence = this.d();
        if (charSequence == null) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(this.getClass().getSimpleName());
            ((StringBuilder)charSequence).append('@');
            ((StringBuilder)charSequence).append(h.d(this));
            charSequence = ((StringBuilder)charSequence).toString();
        }
        return charSequence;
    }
}

