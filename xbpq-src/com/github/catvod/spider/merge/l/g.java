/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.l;

import com.github.catvod.spider.merge.l.m;

public abstract class g {
    protected g() {
    }

    public int a(CharSequence charSequence, int n2) {
        int n3 = charSequence.length();
        m.d(n2, n3);
        while (n2 < n3) {
            if (this.b(charSequence.charAt(n2))) {
                return n2;
            }
            ++n2;
        }
        return -1;
    }

    public abstract boolean b(char var1);
}

