/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.l1;

import com.github.catvod.spider.merge.k1.g;
import com.github.catvod.spider.merge.l1.a;
import com.github.catvod.spider.merge.l1.b;

public final class c
extends g<a, b> {
    public c(int n2) {
        super(n2);
    }

    public final a h(b b2) {
        a a2 = new a(this.g(), b2.g(), b2.getName());
        try {
            b2.p();
        }
        catch (Exception exception) {
            this.b(exception);
        }
        try {
            b2.d();
        }
        catch (Exception exception) {
            this.b(exception);
        }
        try {
            a2.f(b2.s());
        }
        catch (Exception exception) {
            this.b(exception);
        }
        try {
            b2.getDescription();
        }
        catch (Exception exception) {
            this.b(exception);
        }
        try {
            b2.f();
        }
        catch (Exception exception) {
            this.b(exception);
        }
        return a2;
    }
}

