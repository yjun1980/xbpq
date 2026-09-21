/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.v;

import com.github.catvod.spider.merge.v.b;
import com.github.catvod.spider.merge.v.d;

public final class c
extends Enum<c> {
    private static final c[] $VALUES;
    public static final /* enum */ c ON_ANY;
    public static final /* enum */ c ON_CREATE;
    public static final /* enum */ c ON_DESTROY;
    public static final /* enum */ c ON_PAUSE;
    public static final /* enum */ c ON_RESUME;
    public static final /* enum */ c ON_START;
    public static final /* enum */ c ON_STOP;

    static {
        c c2;
        c c3;
        c c4;
        c c5;
        c c6;
        c c7;
        c c8;
        ON_CREATE = c8 = new c();
        ON_START = c7 = new c();
        ON_RESUME = c6 = new c();
        ON_PAUSE = c5 = new c();
        ON_STOP = c4 = new c();
        ON_DESTROY = c3 = new c();
        ON_ANY = c2 = new c();
        $VALUES = new c[]{c8, c7, c6, c5, c4, c3, c2};
    }

    public static c e(d d2) {
        int n2 = d2.ordinal();
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    return null;
                }
                return ON_RESUME;
            }
            return ON_START;
        }
        return ON_CREATE;
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    public final d b() {
        switch (b.b[this.ordinal()]) {
            default: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((Object)this);
                stringBuilder.append(" has no target state");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            case 6: {
                return d.a;
            }
            case 5: {
                return d.e;
            }
            case 3: 
            case 4: {
                return d.d;
            }
            case 1: 
            case 2: 
        }
        return d.c;
    }
}

