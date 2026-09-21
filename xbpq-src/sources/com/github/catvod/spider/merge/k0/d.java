package com.github.catvod.spider.merge.k0;

import com.github.catvod.spider.merge.U.h;
import com.github.catvod.spider.merge.cYh;
import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class d implements com.github.catvod.spider.merge.h0.c {
    private static Pattern a = Pattern.compile(cYh.d("3B346B0D79653B346A"));

    @Override // com.github.catvod.spider.merge.h0.c
    public final String a() {
        return cYh.d("09252C");
    }

    @Override // com.github.catvod.spider.merge.h0.c
    public final com.github.catvod.spider.merge.h0.e b(com.github.catvod.spider.merge.h0.d dVar) {
        Matcher matcher = a.matcher(h.e(com.github.catvod.spider.merge.m0.a.b(cYh.d("063C2D05322213")).b(dVar).e(), ""));
        return matcher.find() ? new com.github.catvod.spider.merge.h0.e(Double.valueOf(new BigDecimal(matcher.group()).doubleValue())) : new com.github.catvod.spider.merge.h0.e(null);
    }
}
