/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u079d;
import com.github.catvod.spider.merge.\u086a;
import com.github.catvod.spider.merge.\u08a0;
import java.io.PrintStream;

public class \u07b1
extends \u079d {
    public static final \u07b1 \u037f = new \u07b1();

    @Override
    public void \u0529(\u08a0<?, ?> object, Object object2, int n2, int n3, String string, \u086a \u086a2) {
        object2 = System.err;
        object = new StringBuilder();
        ((StringBuilder)object).append(SOY.d("163B3F1354"));
        ((StringBuilder)object).append(n2);
        ((StringBuilder)object).append(SOY.d("40"));
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append(SOY.d("5A"));
        ((StringBuilder)object).append(string);
        ((PrintStream)object2).println(((StringBuilder)object).toString());
    }
}

