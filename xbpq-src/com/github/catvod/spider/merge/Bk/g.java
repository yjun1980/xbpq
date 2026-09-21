/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Bk;

import com.github.catvod.spider.merge.Bk.f;
import com.github.catvod.spider.merge.Bk.h;

public final class g
extends Enum {
    private static final g[] $VALUES;
    public static final /* enum */ g ON_ANY;
    public static final /* enum */ g ON_CREATE;
    public static final /* enum */ g ON_DESTROY;
    public static final /* enum */ g ON_PAUSE;
    public static final /* enum */ g ON_RESUME;
    public static final /* enum */ g ON_START;
    public static final /* enum */ g ON_STOP;

    static {
        g g2;
        g g3;
        g g4;
        g g5;
        g g6;
        g g7;
        g g8;
        ON_CREATE = g8 = new g("ON_CREATE", 0);
        ON_START = g7 = new g("ON_START", 1);
        ON_RESUME = g6 = new g("ON_RESUME", 2);
        ON_PAUSE = g5 = new g("ON_PAUSE", 3);
        ON_STOP = g4 = new g("ON_STOP", 4);
        ON_DESTROY = g3 = new g("ON_DESTROY", 5);
        ON_ANY = g2 = new g("ON_ANY", 6);
        $VALUES = new g[]{g8, g7, g6, g5, g4, g3, g2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public g() {
        void var2_-1;
        void var1_-1;
    }

    public static g valueOf(String string) {
        return Enum.valueOf(g.class, string);
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }

    public final h a() {
        switch (f.b[this.ordinal()]) {
            default: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((Object)this);
                stringBuilder.append(" has no target state");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            case 6: {
                return h.a;
            }
            case 5: {
                return h.e;
            }
            case 3: 
            case 4: {
                return h.d;
            }
            case 1: 
            case 2: 
        }
        return h.c;
    }
}

