/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u0131;
import com.github.catvod.spider.merge.\u013a;
import com.github.catvod.spider.merge.\u01d0;
import com.github.catvod.spider.merge.\u02d0;
import com.github.catvod.spider.merge.\u0582;
import com.github.catvod.spider.merge.\u05d5;

public class \u0140
extends \u02d0 {
    public \u0140(String string) {
        this.\u052a = string;
    }

    static boolean \u07a5(StringBuilder stringBuilder) {
        int n2 = stringBuilder.length();
        boolean bl = true;
        if (n2 == 0 || stringBuilder.charAt(stringBuilder.length() - 1) != ' ') {
            bl = false;
        }
        return bl;
    }

    @Override
    public String toString() {
        return this.\u078b();
    }

    @Override
    public String \u0789() {
        return SOY.d("5926340E00");
    }

    @Override
    void \u078d(Appendable appendable, int n2, \u01d0.\u037f \u03f3) {
        \u0582 \u05822;
        boolean bl = \u03f3.\u052f();
        if (bl && (this.\u079d() == 0 && (\u05822 = this.\u0528) instanceof \u013a && ((\u013a)\u05822).\u08b7().\u0528() && !this.\u07a4() || \u03f3.\u052d() && this.\u079e().size() > 0 && !this.\u07a4())) {
            this.\u0787(appendable, n2, \u03f3);
        }
        boolean bl2 = bl && !\u013a.\u08af(this.\u0528);
        bl = bl && this.\u0528 instanceof \u01d0;
        \u05d5.\u052b(appendable, this.\u079f(), \u03f3, false, bl2, bl);
    }

    @Override
    void \u078e(Appendable appendable, int n2, \u01d0.\u037f \u03f3) {
    }

    public \u0140 \u07a2() {
        return (\u0140)super.\u0620();
    }

    public String \u07a3() {
        return this.\u079f();
    }

    public boolean \u07a4() {
        return \u0131.\u052c(this.\u079f());
    }
}

