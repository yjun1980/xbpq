/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.Q.m;
import com.github.catvod.spider.merge.Q.t0;
import com.github.catvod.spider.merge.S.j;

public class m0
extends t0 {
    public final j b;

    public m0(m object, j j2) {
        super((m)object);
        object = j2;
        if (j2 == null) {
            object = new j(new int[0]);
            ((j)object).a(0);
        }
        this.b = object;
    }

    @Override
    public int a() {
        return 7;
    }

    @Override
    public final j c() {
        return this.b;
    }

    @Override
    public boolean d(int n2, int n3) {
        return this.b.d(n2);
    }

    public String toString() {
        return this.b.toString();
    }
}

