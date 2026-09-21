/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u0623;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class \u02ce {
    private static final Pattern \u037f = Pattern.compile(SOY.d("247A6E4C5C48137B163B205E457A0A5D592A536D792A102B1E6D78495C4D457A0D122813457B784950"));
    private static final TimeZone \u0528 = new \u0623(false, 0, 0);

    public static TimeZone \u037f() {
        return \u0528;
    }

    public static TimeZone \u0528(String object) {
        if (!SOY.d("20").equals(object) && !SOY.d("2F0612").equals(object)) {
            if (((Matcher)(object = \u037f.matcher((CharSequence)object))).matches()) {
                int n2 = \u02ce.\u0529(((Matcher)object).group(2));
                int n3 = \u02ce.\u0529(((Matcher)object).group(4));
                if (n2 == 0 && n3 == 0) {
                    return \u0528;
                }
                return new \u0623(\u02ce.\u052a(((Matcher)object).group(1)), n2, n3);
            }
            return null;
        }
        return \u0528;
    }

    private static int \u0529(String string) {
        int n2 = string != null ? Integer.parseInt(string) : 0;
        return n2;
    }

    private static boolean \u052a(String string) {
        boolean bl;
        boolean bl2 = bl = false;
        if (string != null) {
            bl2 = bl;
            if (string.charAt(0) == '-') {
                bl2 = true;
            }
        }
        return bl2;
    }
}

