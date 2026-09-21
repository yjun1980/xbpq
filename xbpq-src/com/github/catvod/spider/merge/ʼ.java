/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

public class \u02bc {
    static int \u037f(CharSequence charSequence, CharSequence charSequence2, int n2) {
        if (charSequence instanceof String) {
            return ((String)charSequence).indexOf(charSequence2.toString(), n2);
        }
        if (charSequence instanceof StringBuilder) {
            return ((StringBuilder)charSequence).indexOf(charSequence2.toString(), n2);
        }
        if (charSequence instanceof StringBuffer) {
            return ((StringBuffer)charSequence).indexOf(charSequence2.toString(), n2);
        }
        return charSequence.toString().indexOf(charSequence2.toString(), n2);
    }

    static boolean \u0528(CharSequence charSequence, boolean bl, int n2, CharSequence charSequence2, int n3, int n4) {
        if (charSequence instanceof String && charSequence2 instanceof String) {
            return ((String)charSequence).regionMatches(bl, n2, (String)charSequence2, n3, n4);
        }
        int n5 = charSequence.length();
        int n6 = charSequence2.length();
        if (n2 >= 0 && n3 >= 0 && n4 >= 0 && n5 - n2 >= n4) {
            n5 = n2;
            n2 = n3;
            int n7 = n4;
            if (n6 - n3 >= n4) {
                while (n7 > 0) {
                    char c2;
                    char c3 = charSequence.charAt(n5);
                    if (c3 != (c2 = charSequence2.charAt(n2))) {
                        if (!bl) {
                            return false;
                        }
                        if ((c3 = Character.toUpperCase(c3)) != (c2 = Character.toUpperCase(c2)) && Character.toLowerCase(c3) != Character.toLowerCase(c2)) {
                            return false;
                        }
                    }
                    ++n5;
                    --n7;
                    ++n2;
                }
                return true;
            }
        }
        return false;
    }
}

