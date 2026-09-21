/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u02cb;
import com.github.catvod.spider.merge.\u079f;
import com.github.catvod.spider.merge.\u0824;
import com.github.catvod.spider.merge.\u0864;
import com.github.catvod.spider.merge.\u086a;
import com.github.catvod.spider.merge.\u08ac;
import java.util.Locale;

public class \u0865
extends \u086a {
    private final int \u052c;
    private final \u08ac \u052d;

    public \u0865(\u0864 \u08642, \u079f \u079f2, int n2, \u08ac \u08ac2) {
        super(\u08642, \u079f2, null);
        this.\u052c = n2;
        this.\u052d = \u08ac2;
    }

    @Override
    public String toString() {
        Object object;
        int n2 = this.\u052c;
        if (n2 >= 0 && n2 < this.\u052c().size()) {
            object = this.\u052c();
            n2 = this.\u052c;
            object = \u0824.\u037f(object.\u052e(\u02cb.\u0529(n2, n2)), false);
        } else {
            object = "";
        }
        Locale locale = Locale.getDefault();
        String string = \u0865.class.getSimpleName();
        return String.format(locale, SOY.d("5F21795151045D7B"), string, object);
    }

    public \u079f \u052c() {
        return (\u079f)super.\u0528();
    }
}

