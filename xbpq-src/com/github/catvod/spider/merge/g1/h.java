/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g1;

import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.g1.N;

public final class h
extends N {
    public final int a;

    public /* synthetic */ h(int n2) {
        this.a = n2;
    }

    @Override
    public final boolean a(m m2, m m3) {
        boolean bl;
        int n2 = this.a;
        boolean bl2 = true;
        boolean bl3 = bl = true;
        switch (n2) {
            default: {
                break;
            }
            case 1: {
                m2 = m3.i0();
                bl3 = m2 != null && !(m2 instanceof com.github.catvod.spider.merge.e1.h) && m3.W() == 0 ? bl : false;
            }
            case 0: {
                return bl3;
            }
        }
        m m4 = m2;
        if (m2 instanceof com.github.catvod.spider.merge.e1.h) {
            m4 = m2.R();
        }
        bl3 = m3 == m4 ? bl2 : false;
        return bl3;
    }

    public final String toString() {
        switch (this.a) {
            default: {
                return ":root";
            }
            case 1: {
                return ":first-child";
            }
            case 0: 
        }
        return "*";
    }
}

