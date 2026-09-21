/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u01d0;
import com.github.catvod.spider.merge.\u0457;
import com.github.catvod.spider.merge.\u07ca;
import com.github.catvod.spider.merge.\u097d;
import com.github.catvod.spider.merge.\u0f6a;
import java.io.StringReader;

public class \u0371 {
    private \u0f6a \u037f;
    private \u0457 \u0528;
    private \u097d \u0529;

    public \u0371(\u0f6a \u0f6a2) {
        this.\u037f = \u0f6a2;
        this.\u0529 = \u0f6a2.\u0528();
        this.\u0528 = \u0457.\u0528();
    }

    public static \u0371 \u0529() {
        return new \u0371(new \u07ca());
    }

    public static \u01d0 \u052b(String string, String string2) {
        \u07ca \u07ca2 = new \u07ca();
        return \u07ca2.\u052c(new StringReader(string), string2, new \u0371(\u07ca2));
    }

    public \u0457 \u037f() {
        return this.\u0528;
    }

    public \u0f6a \u0528() {
        return this.\u037f;
    }

    public boolean \u052a(String string) {
        return this.\u0528().\u052b(string);
    }

    public \u097d \u052c() {
        return this.\u0529;
    }
}

