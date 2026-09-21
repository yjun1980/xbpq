/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.O;
import com.github.catvod.spider.merge.g9;
import com.github.catvod.spider.merge.gx;
import com.github.catvod.spider.merge.rO;
import com.github.catvod.spider.merge.xU;
import java.io.StringReader;

public class B8 {
    private O S;
    private rO T4;
    private gx l8;

    public B8(gx gx2) {
        this.l8 = gx2;
        this.T4 = gx2.S();
        this.S = O.S();
    }

    public static B8 S() {
        return new B8(new xU());
    }

    public static g9 T4(String string, String string2) {
        xU xU2 = new xU();
        return xU2.OL(new StringReader(string), string2, new B8(xU2));
    }

    public rO b() {
        return this.T4;
    }

    public O l8() {
        return this.S;
    }
}

