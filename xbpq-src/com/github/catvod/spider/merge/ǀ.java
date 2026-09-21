/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u0155;
import com.github.catvod.spider.merge.\u02d1;
import com.github.catvod.spider.merge.\u04af;
import com.github.catvod.spider.merge.\u07d9;
import com.github.catvod.spider.merge.\u07e0;
import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class \u01c0
implements \u07d9 {
    private static Pattern \u037f = Pattern.compile(SOY.d("26367B2A5A4826367A"));

    @Override
    public String name() {
        return SOY.d("14273C");
    }

    @Override
    public \u07e0 \u037f(\u0155 object) {
        object = \u02d1.\u0780(\u04af.\u0528(SOY.d("1B3E3D22110F0E")).\u037f((\u0155)object).\u052b(), "");
        if (((Matcher)(object = \u037f.matcher((CharSequence)object))).find()) {
            return \u07e0.\u058f(new BigDecimal(((Matcher)object).group()).doubleValue());
        }
        return \u07e0.\u058f(null);
    }
}

