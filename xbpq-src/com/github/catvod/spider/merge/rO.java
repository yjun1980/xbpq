/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.Rz;
import com.github.catvod.spider.merge.kA;

public class rO {
    public static final rO S;
    public static final rO l8;
    private final boolean T4;
    private final boolean b;

    static {
        l8 = new rO(false, false);
        S = new rO(true, true);
    }

    public rO(boolean bl, boolean bl2) {
        this.T4 = bl;
        this.b = bl2;
    }

    public boolean OL() {
        return this.T4;
    }

    Rz S(Rz rz) {
        if (rz != null && !this.b) {
            rz.Q();
        }
        return rz;
    }

    public String T4(String string) {
        String string2;
        string = string2 = string.trim();
        if (!this.T4) {
            string = kA.l8(string2);
        }
        return string;
    }

    public boolean b() {
        return this.b;
    }

    public String l8(String string) {
        String string2;
        string = string2 = string.trim();
        if (!this.b) {
            string = kA.l8(string2);
        }
        return string;
    }
}

