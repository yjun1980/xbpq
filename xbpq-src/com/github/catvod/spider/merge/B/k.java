/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.B;

import java.lang.reflect.Type;

public final class k {
    public Object a;
    public final k b;
    public final Object c;
    public final int d;
    public Type e;
    private transient String f;

    public k(k k2, Object object, Object object2) {
        this.b = k2;
        this.a = object;
        this.c = object2;
        int n2 = k2 == null ? 0 : k2.d + 1;
        this.d = n2;
    }

    public final String toString() {
        if (this.f == null) {
            CharSequence charSequence;
            if (this.b == null) {
                charSequence = "$";
            } else {
                if (this.c instanceof Integer) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(this.b.toString());
                    ((StringBuilder)charSequence).append("[");
                    ((StringBuilder)charSequence).append(this.c);
                    ((StringBuilder)charSequence).append("]");
                } else {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(this.b.toString());
                    ((StringBuilder)charSequence).append(".");
                    ((StringBuilder)charSequence).append(this.c);
                }
                charSequence = ((StringBuilder)charSequence).toString();
            }
            this.f = charSequence;
        }
        return this.f;
    }
}

