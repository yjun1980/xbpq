/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u013a;
import com.github.catvod.spider.merge.\u01d0;
import com.github.catvod.spider.merge.\u02d0;
import com.github.catvod.spider.merge.\u0582;

public class \u012b
extends \u02d0 {
    public \u012b(String string) {
        this.\u052a = string;
    }

    @Override
    public String toString() {
        return this.\u078b();
    }

    @Override
    public String \u0789() {
        return SOY.d("59313E1B19121426");
    }

    @Override
    void \u078d(Appendable appendable, int n2, \u01d0.\u037f \u03f3) {
        \u0582 \u05822;
        if (\u03f3.\u052f() && (this.\u079d() == 0 && (\u05822 = this.\u0528) instanceof \u013a && ((\u013a)\u05822).\u08b7().\u0528() || \u03f3.\u052d())) {
            this.\u0787(appendable, n2, \u03f3);
        }
        appendable.append(SOY.d("46737C5B")).append(this.\u07a3()).append(SOY.d("577F6F"));
    }

    @Override
    void \u078e(Appendable appendable, int n2, \u01d0.\u037f \u03f3) {
    }

    public \u012b \u07a2() {
        return (\u012b)super.\u0620();
    }

    public String \u07a3() {
        return this.\u079f();
    }
}

