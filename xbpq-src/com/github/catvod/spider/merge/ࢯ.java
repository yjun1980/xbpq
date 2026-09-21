/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u08aa;
import com.github.catvod.spider.merge.\u08ac;
import com.github.catvod.spider.merge.\u08ae;
import com.github.catvod.spider.merge.\u1061;
import com.github.catvod.spider.merge.\u1065;
import com.github.catvod.spider.merge.\u1081;
import java.util.IdentityHashMap;
import java.util.UUID;

public abstract class \u08af {
    @Deprecated
    public static final int \u037f;
    @Deprecated
    public static final UUID \u0528;
    public static final \u1081 \u0529;
    public final \u08aa \u052a;
    protected final \u1065 \u052b;

    static {
        \u1081 \u10812;
        \u037f = \u08ae.\u037f;
        \u0528 = \u08ae.\u052d;
        \u0529 = \u10812 = new \u1081(new \u08ac());
        \u10812.\u037f = Integer.MAX_VALUE;
    }

    public \u08af(\u08aa \u08aa2, \u1065 \u10652) {
        this.\u052a = \u08aa2;
        this.\u052b = \u10652;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public \u1061 \u037f(\u1061 \u10612) {
        \u1065 \u10652 = this.\u052b;
        if (\u10652 == null) {
            return \u10612;
        }
        synchronized (\u10652) {
            IdentityHashMap<\u1061, \u1061> identityHashMap = new IdentityHashMap<\u1061, \u1061>();
            return \u1061.\u052c(\u10612, this.\u052b, identityHashMap);
        }
    }

    public abstract void \u0528();
}

