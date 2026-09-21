/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u02c9;
import com.github.catvod.spider.merge.\u02cb;
import com.github.catvod.spider.merge.\u079f;
import com.github.catvod.spider.merge.\u07a3;
import com.github.catvod.spider.merge.\u08a4;
import com.github.catvod.spider.merge.\u08a5;

public class \u07a4
implements \u08a4<\u07a3> {
    public static final \u08a4<\u07a3> \u037f = new \u07a4();
    protected final boolean \u0528;

    public \u07a4() {
        this(false);
    }

    public \u07a4(boolean bl) {
        this.\u0528 = bl;
    }

    public \u07a3 \u0528(\u02c9<\u08a5, \u079f> \u02c92, int n2, String string, int n3, int n4, int n5, int n6, int n7) {
        \u07a3 \u07a32 = new \u07a3(\u02c92, n2, n3, n4, n5);
        \u07a32.\u052f(n6);
        \u07a32.\u052e(n7);
        if (string != null) {
            \u07a32.\u058f(string);
        } else if (this.\u0528 && (\u02c92 = \u02c92.\u0528) != null) {
            \u07a32.\u058f(((\u079f)((Object)\u02c92)).\u052e(\u02cb.\u0529(n4, n5)));
        }
        return \u07a32;
    }
}

