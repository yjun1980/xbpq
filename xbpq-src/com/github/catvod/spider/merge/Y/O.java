/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.Y.Q;
import com.github.catvod.spider.merge.cYh;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class O {
    private static final Pattern a = Pattern.compile(cYh.d("39787E6B7F650E79061C037358781A7A7A074E6F690D3306036F686E7F6058781D350B3E5879686E73"));
    private static final TimeZone b = new Q(false, 0, 0);
    public static final int c = 0;

    public static TimeZone a(String object) {
        if (!cYh.d("3D").equals(object) && !cYh.d("320402").equals(object)) {
            if (((Matcher)(object = a.matcher((CharSequence)object))).matches()) {
                String string = ((Matcher)object).group(2);
                boolean bl = false;
                int n2 = string != null ? Integer.parseInt(string) : 0;
                string = ((Matcher)object).group(4);
                int n3 = string != null ? Integer.parseInt(string) : 0;
                if (n2 == 0 && n3 == 0) {
                    return b;
                }
                object = ((Matcher)object).group(1);
                boolean bl2 = bl;
                if (object != null) {
                    bl2 = bl;
                    if (((String)object).charAt(0) == '-') {
                        bl2 = true;
                    }
                }
                return new Q(bl2, n2, n3);
            }
            return null;
        }
        return b;
    }
}

