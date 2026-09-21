/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.k0;

import com.github.catvod.spider.merge.U.h;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.h0.c;
import com.github.catvod.spider.merge.h0.e;
import com.github.catvod.spider.merge.m0.a;
import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class d
implements c {
    private static Pattern a = Pattern.compile(cYh.d("3B346B0D79653B346A"));

    @Override
    public final String a() {
        return cYh.d("09252C");
    }

    @Override
    public final e b(com.github.catvod.spider.merge.h0.d object) {
        object = h.e(com.github.catvod.spider.merge.m0.a.b(cYh.d("063C2D05322213")).b((com.github.catvod.spider.merge.h0.d)object).e(), "");
        if (((Matcher)(object = a.matcher((CharSequence)object))).find()) {
            return new e(new BigDecimal(((Matcher)object).group()).doubleValue());
        }
        return new e(null);
    }
}

