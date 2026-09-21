/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.P;
import com.github.catvod.spider.merge.xc.G0.a;
import com.github.catvod.spider.merge.xc.G0.g1;

public final class v0
extends g1 {
    @Override
    public final void d(P p2, a object) {
        String string = ((a)object).f(false);
        if (string.length() > 0) {
            p2.k.i(string);
        } else {
            p2.k.j = true;
        }
        char c2 = ((a)object).e();
        if (c2 != '\u0000') {
            if (c2 != '\"') {
                if (c2 != '&') {
                    if (c2 != '\uffff') {
                        p2.k.h(c2);
                    } else {
                        p2.l(this);
                        p2.o(g1.a);
                    }
                } else {
                    object = p2.b(Character.valueOf('\"'), true);
                    if (object != null) {
                        p2.k.j((int[])object);
                    } else {
                        p2.k.h('&');
                    }
                }
            } else {
                p2.o(g1.O);
            }
        } else {
            p2.m(this);
            p2.k.h('\ufffd');
        }
    }
}

