/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u0792;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class \u078f {
    public static final \u078f \u037f;
    public static final List \u0528;
    public static final Map \u0529;
    public BigInteger \u052a;
    public BigInteger \u052b;
    public BigInteger \u052c;
    public BigInteger \u052d;
    public \u0792 \u052e;
    public String \u052f;
    public long[] \u058f;

    static {
        Object object = new \u078f(BigInteger.ZERO, BigInteger.valueOf(7L), new BigInteger(SOY.d("1C34371012111C34371012111C34371012111C34371012111C34371012111C34371012111C34371012111C34371012111C34371012111C37371012111C316310"), 16), new BigInteger(SOY.d("1C34371012111C34371012111C34371012111C34371012111C34371012111C37331715121E31344015114E6A304647151834354441124231354647414E636547"), 16), new BigInteger(SOY.d("4D6B331342414D37374F10141830301541421B6267444D421937694144154A6561444D151C31351446131937634E104E4F6B37444C464F306040124F4B65684E"), 16), new BigInteger(SOY.d("4E6A621710164D65634015441966674341131B66371412144A376047444F1B6A371245401866654E154142676442454E4331654110474234371445471E66334E"), 16), SOY.d("0937320646424C3960"), new long[]{1L, 3L, 132L, 0L, 10L});
        \u037f = object;
        Object object2 = new ArrayList<\u078f>();
        \u0528 = object2;
        \u0529 = new HashMap();
        object2.add(object);
        object = object2.iterator();
        while (object.hasNext()) {
            object2 = (\u078f)object.next();
            \u0529.put(Arrays.hashCode(((\u078f)object2).\u058f), object2);
        }
    }

    public \u078f(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, String string, long[] lArray) {
        this.\u052a = bigInteger;
        this.\u052b = bigInteger2;
        this.\u052c = bigInteger3;
        this.\u052d = bigInteger4;
        this.\u052e = new \u0792(bigInteger5, bigInteger6);
        this.\u052f = string;
        this.\u058f = lArray;
    }

    public int \u037f() {
        return (this.\u052d.toString(16).length() + 1) / 2;
    }
}

