/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.B0;

import com.github.catvod.spider.merge.xc.B0.F;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class D {
    public static final Pattern a = Pattern.compile("^(?:(?i)GMT)?([+-])?(\\d\\d?)?(:?(\\d\\d?))?$");
    public static final F b = new F(0, 0, false);

    public static F a(String object) {
        boolean bl = "Z".equals(object);
        F f2 = b;
        if (!bl && !"UTC".equals(object)) {
            if (((Matcher)(object = a.matcher((CharSequence)object))).matches()) {
                String string = ((Matcher)object).group(2);
                boolean bl2 = false;
                int n2 = string != null ? Integer.parseInt(string) : 0;
                string = ((Matcher)object).group(4);
                int n3 = string != null ? Integer.parseInt(string) : 0;
                if (n2 == 0 && n3 == 0) {
                    return f2;
                }
                object = ((Matcher)object).group(1);
                bl = bl2;
                if (object != null) {
                    bl = bl2;
                    if (((String)object).charAt(0) == '-') {
                        bl = true;
                    }
                }
                return new F(n2, n3, bl);
            }
            return null;
        }
        return f2;
    }
}

