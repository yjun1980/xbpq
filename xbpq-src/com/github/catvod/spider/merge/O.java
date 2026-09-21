/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.cz;
import java.util.ArrayList;

public class O
extends ArrayList<cz> {
    private final int S;
    private final int l8;

    O(int n2, int n3) {
        super(n2);
        this.l8 = n2;
        this.S = n3;
    }

    public static O S() {
        return new O(0, 0);
    }

    boolean l8() {
        boolean bl = this.size() < this.S;
        return bl;
    }
}

